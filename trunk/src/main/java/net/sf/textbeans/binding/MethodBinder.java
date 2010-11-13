package net.sf.textbeans.binding;

import java.lang.reflect.Method;

import net.sf.textbeans.util.TypeConvertor;
// TODO: multi-args methods support
public class MethodBinder implements RhsBinder {
	private TypeConvertor convertor = new TypeConvertor();
	
	@Override
	public void bind(Object destination, RhsElementBinding binding, Object value) throws Exception{
		String name = ((Rhs2MethodBinding) binding).getMethod();
		Method method = null;
		for (Method m : destination.getClass().getMethods()) {
			if (name.equals(m.getName()) && m.getParameterTypes().length == 1) {
				method = m;
			}
		}
		Class<?> type = method.getParameterTypes()[0];
		method.invoke(destination, convertor.convert(value, type));
	}
}
