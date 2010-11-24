package net.sf.textbeans.binding.decl;


import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class Rhs2MethodBinding implements RhsElementBinding {
	@XStreamAsAttribute
	private String ruleRhs;
	@XStreamAsAttribute
	private String method;

	public Rhs2MethodBinding(String rhsElement, String target) {
		super();
		this.ruleRhs = rhsElement;
		this.method = target;
	}
	
	public String getRhsElement() {
		return ruleRhs;
	}

	public void setRhsElement(String rhsElement) {
		this.ruleRhs = rhsElement;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
}