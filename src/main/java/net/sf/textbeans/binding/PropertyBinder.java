package net.sf.textbeans.binding;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import net.sf.textbeans.util.TypeConvertor;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class PropertyBinder implements RhsBinder {
	private TypeConvertor convertor = new TypeConvertor();

	@Override
	public void bind(Object destination, RhsElementBinding binding, Object value) {
		try {
			String name = ((RuleElementToFieldBinding) binding).getField();
			BeanInfo inf = Introspector.getBeanInfo(destination.getClass());
			for (PropertyDescriptor desc : inf.getPropertyDescriptors()) {
				if (name.equalsIgnoreCase(desc.getName())) {
					Object propValue = desc.getReadMethod().invoke(destination);
					Class<?> propType = desc.getPropertyType();
					Object valueToSet = convertor.convert(value, propType);
					valueToSet = collectionConvert(valueToSet, propValue,
							propType);
					desc.getWriteMethod().invoke(destination, valueToSet);
				}
			}
		} catch (Exception ex) {
			throw new RuntimeException("Problem while trying to bind "
					+ binding.getRhsElement(), ex);
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
