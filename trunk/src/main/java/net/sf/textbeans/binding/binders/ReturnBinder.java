package net.sf.textbeans.binding.binders;

import net.sf.textbeans.binding.decl.ReturnBinderDecl;
import net.sf.textbeans.binding.decl.RhsElementBinding;

public class ReturnBinder implements RhsBinder {
	@Override
	public Object bind(Object destination, RhsElementBinding binding, Object value) {
		ReturnBinderDecl decl = (ReturnBinderDecl) binding;
		if (decl.getType() == null) {
			// <return ruleRhs="..."
			return value;
		} else if ("null".equals(decl.getType())) {
			// <return value="null"/>
			return null;
		} else {
			throw new IllegalStateException("Wrong rule decl "+binding);
		}
	}
}
