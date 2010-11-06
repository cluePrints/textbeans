package net.sf.textbeans.parser;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.ClassBinding;
import net.sf.textbeans.binding.RuleElementToFieldBinding;
import net.sf.textbeans.util.Pair;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import fr.umlv.tatoo.cc.parser.grammar.NonTerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.VariableDecl;
import fr.umlv.tatoo.runtime.parser.ParserListener;

class BindingListener implements
		ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> {
	Binding binding;
	LinkedList<Pair<String, ? extends Object>> semanticStack = Lists.newLinkedList();

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
			ClassBinding classBnd = binding.searchByProductionId(production.getId());
			
			// in any case we should push something on every shift as we'll pop that numer of elements in any case
			if (classBnd == null || ruleRhs.size() == 0) {
				semanticStack.push(Pair.newOne(production.getId(), this));
				return;
			}
			
			// flush elements from stack to map(according to rhs num)
			Map<String, Object> reducedDtos = Maps.newHashMap();
			for (int i=0; i<ruleRhs.size(); i++) {
				Pair<String, ? extends Object> pair = semanticStack.pop();
				reducedDtos.put(pair.k, pair.v);
			}

			Class<?> prodClazz = Class.forName(classBnd.getClassName());
			Object obj = prodClazz.newInstance();
			
			// for each rhs num try to get elem from map
			for (VariableDecl rhsElem : ruleRhs) {
				Object dto = reducedDtos.get(rhsElem.getId());
				if (dto == null)
					continue;
				
				RuleElementToFieldBinding rhsBnd = classBnd.searchByRhsName(rhsElem.getId());
				if (rhsBnd == null)
					continue;
				
				setField(obj, rhsBnd.getField(), dto);
			}
			

			semanticStack.push(Pair.newOne(production.getLeft().getId(), obj));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public void accept(NonTerminalDecl nonTerminal) {
		System.out.println("accept " + nonTerminal);
	}

	private void setField(Object o, String name, Object valueToSetArg) throws Exception {
		BeanInfo inf = Introspector.getBeanInfo(o.getClass());
		for (PropertyDescriptor desc : inf.getPropertyDescriptors()) {
			if (name.equalsIgnoreCase(desc.getName())) {
				Object propValue = desc.getReadMethod().invoke(o);
				Class<?> propType = desc.getPropertyType();
				Object valueToSet = convert(valueToSetArg, propType);
				valueToSet = collectionConvert(valueToSet, propValue, propType);
				desc.getWriteMethod().invoke(o, valueToSet);
			}
		}
	}

	// DTO -> String 
	private Object convert(Object v, Class<?> expectedType) throws Exception {
		if (v == null)
			return null;
		// TODO: primitives & null
		
		// simple case
		if (expectedType.isAssignableFrom(v.getClass())) {
			return v;
		}
		
		// pray that it's what was declared in generic:)
		if (Collection.class.isAssignableFrom(expectedType)) {
			return v;
		}
		
		// simple conversion strategy
		Constructor<?> c = expectedType.getConstructor(v.getClass());
		return c.newInstance(v);
	}

	private Object collectionConvert(Object valueToSet, Object currValue, Class<?> propType)
			throws InstantiationException, IllegalAccessException {
		if (Collection.class.isAssignableFrom(propType)) {
			Collection<Object> newPropValue;
			if (currValue == null ) {
				newPropValue = initCollection(propType);
			} else {
				newPropValue = (Collection) currValue;
			}
			newPropValue.addAll(Collections.singleton(valueToSet));
			return newPropValue;
		}
		return valueToSet;
	}

	private Collection<Object> initCollection(Class<?> propType)
			throws InstantiationException, IllegalAccessException {
		Collection<Object> newPropValue;
		if (propType == List.class) {
			return Lists.newLinkedList();
		}
		if (propType == Set.class) {
			return Sets.newHashSet();
		}
		return (Collection) propType.newInstance();
	}
}
