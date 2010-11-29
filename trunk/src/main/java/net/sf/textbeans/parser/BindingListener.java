package net.sf.textbeans.parser;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.binders.RhsBinder;
import net.sf.textbeans.binding.decl.ClassBinding;
import net.sf.textbeans.binding.decl.RhsElementBinding;
import net.sf.textbeans.parser.glr.GLRBranchFollowedListener;
import net.sf.textbeans.parser.glr.GLRBranchSpawnedListener;
import net.sf.textbeans.parser.glr.ObjectChangeHook;
import net.sf.textbeans.util.Cloner;
import net.sf.textbeans.util.Pair;
import net.sf.textbeans.util.XStreamCloner;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import fr.umlv.tatoo.cc.parser.grammar.NonTerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.VariableDecl;
import fr.umlv.tatoo.runtime.parser.ParserListener;

@SuppressWarnings({ "unchecked"})
class BindingListener implements
		ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl>,
		GLRBranchSpawnedListener,
		GLRBranchFollowedListener {
	@VisibleForTesting
	final static Object NOTHING = new Object();
	private Cloner cloner = new XStreamCloner();
	Binding binding;
	LinkedList<Pair<String, ? extends Object>> semanticStack = Lists
			.newLinkedList();
	private BindingFacade bindingFacade;
	private ObjectChangeHook hook = ObjectChangeHook.NONE;

	public BindingListener(Binding binding, BindingFacade bindingFacade) {
		super();
		this.binding = binding;
		this.bindingFacade = bindingFacade;
	}

	public void shift(TerminalDecl terminal) {
		DTOTerminalDecl dto = (DTOTerminalDecl) terminal;
		semanticStack.push(Pair.newOne(dto.getId(), dto.data.toString()));
	}

	public void reduce(ProductionDecl production) {
		System.out.println("Reduce "+production);
		try {
			List<? extends VariableDecl> ruleRhs = production.getRight();
			ClassBinding classBnd = binding.searchByProductionId(production
					.getId());

			// flush elements from stack to map(according to rhs num)
			ListMultimap<String, Object> reducedDtos = LinkedListMultimap
					.create();
			for (int i = 0; i < ruleRhs.size(); i++) {
				Pair<String, ? extends Object> pair = semanticStack.pop();
				reducedDtos.get(pair.k).add(0, pair.v);
			}

			// in any case we should push something on every shift as we'll pop
			// that numer of elements in any case
			if (classBnd == null) {
				semanticStack.push(Pair.newOne(production.getLeft().getId(),
						reducedDtos));
				return;
			}

			// get obj to bind production rhs stuff to
			Object obj = resolveProductionBinding(production, classBnd,
					reducedDtos);
			
			obj = applyTransBindings(classBnd, obj);

			// for each rhs name num try to get elem from map
			// we could have similarly named stuff at the right, so sort
			Set<String> rhsNames = Sets.newHashSet();
			for (VariableDecl rhsElem : ruleRhs) {
				String rhsName = rhsElem.getId();
				rhsNames.add(rhsName);
			}
			for (String rhsName : rhsNames) {
				RhsElementBinding[] rhsBnds = classBnd.searchByRhsName(rhsName);

				for (RhsElementBinding rhsBnd : rhsBnds) {
					Object dto = lookFor(reducedDtos, rhsBnd.getRhsElement());
					if (dto == NOTHING)
						continue;

					RhsBinder rhsBinder = bindingFacade.getBinderFor(rhsBnd);
					obj = rhsBinder.bind(obj, rhsBnd, dto);
				}
			}

			hook.onObjectChanged(obj);
			semanticStack.push(Pair.newOne(production.getLeft().getId(), obj));
		} catch (Exception ex) {
			if (ex instanceof RuntimeException) {
				throw (RuntimeException) ex;
			}
			throw new RuntimeException(ex);
		}
	}

	private Object applyTransBindings(ClassBinding classBnd, Object obj) {
		RhsElementBinding[] rhsBnds = classBnd.searchByRhsName(null);
		if (rhsBnds.length > 0) {
			for (RhsElementBinding rhsBnd : rhsBnds) {
				RhsBinder rhsBinder = bindingFacade.getBinderFor(rhsBnd);
				obj = rhsBinder.bind(obj, rhsBnd, null);
			}
		}
		return obj;
	}

	private Object resolveProductionBinding(ProductionDecl production,
			ClassBinding classBnd, ListMultimap<String, Object> reducedDtos)
			throws InstantiationException, IllegalAccessException {
		Object obj;
		if (classBnd.getClassName() != null) {
			Class<?> prodClazz = null;
			try {
				prodClazz = Class.forName(classBnd.getClassName());
				obj = prodClazz.newInstance();
			} catch (ClassNotFoundException ex) {
				throw new RuntimeException("Can't resolve class: "
						+ classBnd.getClassName() + " for a production: "
						+ production);
			}
		} else if (classBnd.getRuleRhs() != null) {
			obj = Iterables.getOnlyElement(reducedDtos.get(classBnd
					.getRuleRhs()));
		} else {
			obj = null;
		}
		return obj;
	}

	// TODO: resolve object properties in a way similar to map
	Object lookFor(ListMultimap<String, Object> reducedDtos, String path) {
		Iterator<String> splitPath = Splitter.on('.').split(path).iterator();
		if (splitPath.hasNext()) {
			String preffix = splitPath.next();
			String afterPreffix = null;
			if (splitPath.hasNext()) {
				afterPreffix = splitPath.next();
			}
			Integer pos = null;
			try {
				pos = Integer.valueOf(afterPreffix);
			} catch (Exception ex) {
				// ignore:)
			}
			List<Object> subContents = (List<Object>) reducedDtos.get(preffix);
			if (pos != null) {
				return subContents.get(pos);
			}
			if (afterPreffix != null) {
				ListMultimap<String, Object> subMap = (ListMultimap<String, Object>) Iterables
						.getOnlyElement(subContents);
				return lookFor(subMap, afterPreffix);
			}
			return Iterables.getOnlyElement(subContents, NOTHING);
		}
		return Iterables.getOnlyElement(reducedDtos.get(path), NOTHING);
	}

	public void accept(NonTerminalDecl nonTerminal) {
	}

	@Override
	public void onBranchFollowing(Object stateToLoad) {
		this.semanticStack = (LinkedList<Pair<String, ? extends Object>>) stateToLoad;
	}

	@Override
	public LinkedList<Pair<String, ? extends Object>> onBranchSpawned() {		
		LinkedList<Pair<String, ? extends Object>> c = cloner.clone(this.semanticStack);
		return c;
	}
	
	public LinkedList<Pair<String, ? extends Object>> getResultTree()
	{
		return semanticStack;
	}

	public void setHook(ObjectChangeHook hook) {
		this.hook = hook;
	}
}
