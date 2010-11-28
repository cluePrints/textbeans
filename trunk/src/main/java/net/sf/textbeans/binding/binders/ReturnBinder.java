package net.sf.textbeans.binding.binders;

import net.sf.textbeans.binding.decl.ReturnBinderDecl;
import net.sf.textbeans.binding.decl.RhsElementBinding;
import net.sf.textbeans.util.TypeConvertor;

public class ReturnBinder implements RhsBinder {
	TypeConvertor convertor = new TypeConvertor();

	@Override
	public Object bind(Object destination, RhsElementBinding binding,
			Object value) {
		ReturnBinderDecl decl = (ReturnBinderDecl) binding;
		if (decl.getValue() == null) {
			// <return ruleRhs="..."
			if (decl.getExpectedType() != null) {
				try {
					Class<?> clazz = Class.forName(decl.getExpectedType());
					value = convertor.convert(value, clazz);
				} catch (ClassNotFoundException ex) {
					throw new RuntimeException(ex);
				}
			}
			return value;
		} else if ("null".equals(decl.getValue())) {
			// <return value="null"/>
			return null;
		} else {
			throw new IllegalStateException("Wrong rule decl " + binding);
		}
	}
}
