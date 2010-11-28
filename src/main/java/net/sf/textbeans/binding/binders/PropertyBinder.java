package net.sf.textbeans.binding.binders;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

import net.sf.textbeans.binding.decl.RhsElementBinding;
import net.sf.textbeans.binding.decl.RuleElementToFieldBinding;
import net.sf.textbeans.util.TypeConvertor;

// TODO: report if trying to bind to not existing prop
public class PropertyBinder implements RhsBinder {
	private TypeConvertor convertor = new TypeConvertor();

	@Override
	public Object bind(Object destination, RhsElementBinding binding, Object value) {
		if (destination == null)
			return null;
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
		return destination;
	}
}
