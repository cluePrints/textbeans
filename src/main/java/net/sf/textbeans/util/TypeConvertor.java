package net.sf.textbeans.util;

import java.lang.reflect.Constructor;
import java.util.Collection;

import com.google.common.primitives.Primitives;

public class TypeConvertor {
	// DTO -> String
	public Object convert(Object v, Class<?> expectedType) {
		try {
			if (v == null)
				return null;
			// TODO: primitives & null
			if (expectedType.isPrimitive()) {
				expectedType = Primitives.wrap(expectedType);
			}
			
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
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
