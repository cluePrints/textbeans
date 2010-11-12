package net.sf.textbeans.parser;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.ClassBinding;
import net.sf.textbeans.binding.RuleElementToFieldBinding;
import net.sf.textbeans.util.Pair;
import net.sf.textbeans.util.TypeConvertor;

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

@SuppressWarnings({ "unchecked", "rawtypes" })
class BindingListener implements
		ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> {
	Binding binding;
	LinkedList<Pair<String, ? extends Object>> semanticStack = Lists
			.newLinkedList();

	private TypeConvertor convertor = new TypeConvertor();

	public BindingListener(Binding binding) {
		super();
		this.binding = binding;
	}

	public void shift(TerminalDecl terminal) {
		DTOTerminalDecl dto = (DTOTerminalDecl) terminal;
		semanticStack.push(Pair.newOne(dto.getId(), dto.data.toString()));
		System.out.println("shift " + terminal);
	}

	public void reduce(ProductionDecl production) {
		try {
			System.out.println("production " + production);
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

			Object obj;
			if (classBnd.getClassName() != null) {
				Class<?> prodClazz = Class.forName(classBnd.getClassName());
				obj = prodClazz.newInstance();
			} else if (classBnd.getRuleRhs() != null) {
				obj = Iterables.getOnlyElement(reducedDtos.get(classBnd.getRuleRhs()));
			} else {
				throw new RuntimeException("Both could not be null");
			}

			// for each rhs name num try to get elem from map
			// we could have similarly named stuff at the right, so sort
			Set<String> rhsNames = Sets.newHashSet();
			for (VariableDecl rhsElem : ruleRhs) {
				String rhsName = rhsElem.getId();
				rhsNames.add(rhsName);
			}
			for (String rhsName : rhsNames) {
				RuleElementToFieldBinding[] rhsBnds = classBnd
						.searchByRhsName(rhsName);

				for (RuleElementToFieldBinding rhsBnd : rhsBnds) {
					Object dto = lookFor(reducedDtos, rhsBnd.getRhsElement());
					if (dto == null)
						continue;

					setField(obj, rhsBnd.getField(), dto);
				}
			}


			semanticStack.push(Pair.newOne(production.getLeft().getId(), obj));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

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
			return Iterables.getOnlyElement(subContents, null);
		}
		return Iterables.getOnlyElement(reducedDtos.get(path));
	}

	public void accept(NonTerminalDecl nonTerminal) {
		System.out.println("accept " + nonTerminal);
	}

	private void setField(Object o, String name, Object valueToSetArg)
			throws Exception {
		BeanInfo inf = Introspector.getBeanInfo(o.getClass());
		for (PropertyDescriptor desc : inf.getPropertyDescriptors()) {
			if (name.equalsIgnoreCase(desc.getName())) {
				Object propValue = desc.getReadMethod().invoke(o);
				Class<?> propType = desc.getPropertyType();
				Object valueToSet = convertor.convert(valueToSetArg, propType);
				valueToSet = collectionConvert(valueToSet, propValue, propType);
				desc.getWriteMethod().invoke(o, valueToSet);
			}
		}
	}

	private Object collectionConvert(Object valueToSet, Object currValue,
			Class<?> propType) throws InstantiationException,
			IllegalAccessException {
		if (Collection.class.isAssignableFrom(propType)) {
			Collection newPropValue;
			if (currValue == null) {
				newPropValue = initCollection(propType);
			} else {
				newPropValue = (Collection) currValue;
			}
			// TODO: Queue and other ordered stuff?
			newPropValue.add(valueToSet);
			return newPropValue;
		}
		return valueToSet;
	}

	private Collection<?> initCollection(Class<?> propType)
			throws InstantiationException, IllegalAccessException {
		if (propType == List.class) {
			return new LinkedList();
		}
		if (propType == Set.class) {
			return new TreeSet();
		}
		return (Collection) propType.newInstance();
	}
}
