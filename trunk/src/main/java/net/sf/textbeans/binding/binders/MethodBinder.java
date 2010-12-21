package net.sf.textbeans.binding.binders;

import java.lang.reflect.Method;

import net.sf.textbeans.binding.decl.Rhs2MethodBinding;
import net.sf.textbeans.binding.decl.RhsElementBinding;
import net.sf.textbeans.util.TypeConvertor;

// TODO: multi-args methods support
public class MethodBinder implements RhsBinder {
	private TypeConvertor convertor = new TypeConvertor();

	@Override
	public Object bind(Object destination, RhsElementBinding binding, Object value) {
		boolean methodFound = false;
		try {
			String name = ((Rhs2MethodBinding) binding).getMethod();
			Method method = null;
			for (Method m : destination.getClass().getMethods()) {
				if (name.equals(m.getName())
						&& m.getParameterTypes().length == 1) {
					method = m;
					if (methodFound) {
						throw new RuntimeException("Duplicate method with same name and single param.");
					}
					methodFound = true;
				}
			}
			if (methodFound) {
				Class<?> type = method.getParameterTypes()[0];
				method.invoke(destination, convertor.convert(value, type));
			}
		} catch (Exception ex) {
			throw new RuntimeException("Problem while trying to bind "
					+ binding.getRhsElement(), ex);
		}
		if (!methodFound) {
			throw new RuntimeException("Method was not found for: "+binding);
		}
		return destination;
	}
}
