package net.sf.textbeans.binding.binders;

import net.sf.textbeans.binding.decl.RhsElementBinding;


public interface RhsBinder {
	Object bind(Object destination, RhsElementBinding binding, Object value);
}
