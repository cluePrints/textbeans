package net.sf.textbeans.binding;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import net.sf.textbeans.util.TypeConvertor;

public class PropertyBinder implements RhsBinder {
	private TypeConvertor convertor = new TypeConvertor();

	@Override
	public void bind(Object destination, RhsElementBinding binding, Object value) {
		try {
			String name = ((RuleElementToFieldBinding) binding).getField();
			BeanInfo inf = Introspector.getBeanInfo(destination.getClass());
			for (PropertyDescriptor desc : inf.getPropertyDescriptors()) {
				if (name.equalsIgnoreCase(desc.getName())) {
					Class<?> propType = desc.getPropertyType();
					Object valueToSet = convertor.convert(value, propType);
					desc.getWriteMethod().invoke(destination, valueToSet);
				}
			}
		} catch (Exception ex) {
			throw new RuntimeException("Problem while trying to bind '"
					+ binding.getRhsElement()+"' to "+destination.getClass(), ex);
		}
	}
}
