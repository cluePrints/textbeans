package net.sf.textbeans.binding.io;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.decl.ClassBinding;
import net.sf.textbeans.binding.decl.Rhs2MethodBinding;
import net.sf.textbeans.binding.decl.RuleElementToFieldBinding;
import net.sf.textbeans.binding.decl.ReturnBinderDecl;

import com.thoughtworks.xstream.XStream;

public class XStreamProvider {
	private final XStream xStream;
	{
		xStream = new XStream();
		xStream.processAnnotations(Binding.class);
		xStream.processAnnotations(ClassBinding.class);
		xStream.processAnnotations(RuleElementToFieldBinding.class);
		xStream.processAnnotations(Rhs2MethodBinding.class);
		xStream.processAnnotations(ReturnBinderDecl.class);
	}
	public XStream getxStream() {
		return xStream;
	}
}
