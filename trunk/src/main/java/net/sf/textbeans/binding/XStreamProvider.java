package net.sf.textbeans.binding;

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
