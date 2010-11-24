package net.sf.textbeans.binding.io;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.decl.ClassBinding;
import net.sf.textbeans.binding.decl.Rhs2MethodBinding;
import net.sf.textbeans.binding.decl.RuleElementToFieldBinding;

import com.thoughtworks.xstream.XStream;

public class XStreamProvider {
	private final XStream xStream;
	{
		xStream = new XStream();
		xStream.aliasType("binding", Binding.class);
		xStream.aliasType("class", ClassBinding.class);
		xStream.aliasType("rule2Field", RuleElementToFieldBinding.class);
		xStream.aliasType("rule2Method", Rhs2MethodBinding.class);
		xStream.processAnnotations(Binding.class);
		xStream.processAnnotations(ClassBinding.class);
		xStream.processAnnotations(RuleElementToFieldBinding.class);
		xStream.processAnnotations(Rhs2MethodBinding.class);
	}
	public XStream getxStream() {
		return xStream;
	}
}
