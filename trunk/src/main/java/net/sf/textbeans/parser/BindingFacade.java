package net.sf.textbeans.parser;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.binders.MethodBinder;
import net.sf.textbeans.binding.binders.PropertyBinder;
import net.sf.textbeans.binding.binders.ReturnBinder;
import net.sf.textbeans.binding.binders.RhsBinder;
import net.sf.textbeans.binding.decl.ClassBinding;
import net.sf.textbeans.binding.decl.ReturnBinderDecl;
import net.sf.textbeans.binding.decl.Rhs2MethodBinding;
import net.sf.textbeans.binding.decl.RhsElementBinding;
import net.sf.textbeans.binding.decl.RuleElementToFieldBinding;
import net.sf.textbeans.util.Pair;

public class BindingFacade {
	@SuppressWarnings("serial")
	private static final Map<Class<?>, ? extends RhsBinder> binders = new HashMap<Class<?>, RhsBinder>() {
		{
			put(RuleElementToFieldBinding.class, new PropertyBinder());
			put(Rhs2MethodBinding.class, new MethodBinder());
			put(ReturnBinderDecl.class, new ReturnBinder());
		}
	};
	
	public RhsBinder getBinderFor(RhsElementBinding b)
	{
		return binders.get(b.getClass());
	}
	
	public Object lookForResultCandidate(LinkedList<Pair<String, ? extends Object>> semanticStack, Binding b)
	{
		List<ClassBinding> bindings = b.getBindings();
		Collections.sort(bindings, ClassBinding.PRIORITY_DESC);
		String resultName = null;
		for (ClassBinding bBnd : bindings) {
			if (bBnd.getReturnPriority() != null) {
				resultName = bBnd.getRuleRhs();
				break;
			}
		}
		if (resultName != null) {
			for (Pair<String, ? extends Object> elem : semanticStack) {
				if (resultName.equals(elem.k)) {
					return elem.v;
				}
			}
			return null;
		}
		return semanticStack.get(0).v;
	}
}
