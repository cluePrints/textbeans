package net.sf.textbeans.parser;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.binders.MethodBinder;
import net.sf.textbeans.binding.binders.PropertyBinder;
import net.sf.textbeans.binding.binders.ReturnBinder;
import net.sf.textbeans.binding.binders.RhsBinder;
import net.sf.textbeans.binding.decl.ClassBinding;
import net.sf.textbeans.binding.decl.ReturnBinderDecl;
import net.sf.textbeans.binding.decl.Rhs2MethodBinding;
import net.sf.textbeans.binding.decl.RhsElementBinding;
import net.sf.textbeans.binding.decl.RuleElementToFieldBinding;
import net.sf.textbeans.parser.glr.GLRBranchFollowedListener;
import net.sf.textbeans.parser.glr.GLRBranchSpawnedListener;
import net.sf.textbeans.util.Cloner;
import net.sf.textbeans.util.Pair;
import net.sf.textbeans.util.XStreamCloner;

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

@SuppressWarnings({ "unchecked", "serial" })
class BindingListener implements
		ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl>,
		GLRBranchSpawnedListener,
		GLRBranchFollowedListener {
	final static Object NOT_FOUND = new Object();
	private Cloner cloner = new XStreamCloner();
	Binding binding;
	LinkedList<Pair<String, ? extends Object>> semanticStack = Lists
			.newLinkedList();

	private Map<Class<?>, ? extends RhsBinder> binders = new HashMap<Class<?>, RhsBinder>() {
		{
			put(RuleElementToFieldBinding.class, new PropertyBinder());
			put(Rhs2MethodBinding.class, new MethodBinder());
			put(ReturnBinderDecl.class, new ReturnBinder());
		}
	};

	public BindingListener(Binding binding) {
		super();
		this.binding = binding;
	}

	public void shift(TerminalDecl terminal) {
		DTOTerminalDecl dto = (DTOTerminalDecl) terminal;
		semanticStack.push(Pair.newOne(dto.getId(), dto.data.toString()));
	}

	public void reduce(ProductionDecl production) {
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
					if (dto == NOT_FOUND)
						continue;

					RhsBinder rhsBinder = binders.get(rhsBnd.getClass());
					obj = rhsBinder.bind(obj, rhsBnd, dto);
				}
			}

			semanticStack.push(Pair.newOne(production.getLeft().getId(), obj));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private Object applyTransBindings(ClassBinding classBnd, Object obj) {
		RhsElementBinding[] rhsBnds = classBnd.searchByRhsName(null);
		if (rhsBnds.length > 0) {
			for (RhsElementBinding rhsBnd : rhsBnds) {
				RhsBinder rhsBinder = binders.get(rhsBnd.getClass());
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
				throw new RuntimeException("Error while binding production "
						+ production + " to a class: " + prodClazz);
			}
		} else if (classBnd.getRuleRhs() != null) {
			obj = Iterables.getOnlyElement(reducedDtos.get(classBnd
					.getRuleRhs()));
		} else {
			throw new RuntimeException("Both could not be null");
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
			return Iterables.getOnlyElement(subContents, NOT_FOUND);
		}
		return Iterables.getOnlyElement(reducedDtos.get(path), NOT_FOUND);
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
}
