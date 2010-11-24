package net.sf.textbeans.binding.decl;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias(value="return")
public class ReturnBinderDecl implements RhsElementBinding {
	@XStreamAsAttribute
	private String ruleRhs;
	@XStreamAsAttribute
	private String value;

	public ReturnBinderDecl(String rhsElement, String target) {
		super();
		this.ruleRhs = rhsElement;
		this.value = target;
	}

	public String getRhsElement() {
		return ruleRhs;
	}

	public void setRhsElement(String rhsElement) {
		this.ruleRhs = rhsElement;
	}
	
	public String getType() {
		return value;
	}

	public void setType(String type) {
		this.value = type;
	}

	@Override
	public String toString() {
		return "ReturnBinderDecl [ruleRhs=" + ruleRhs + ", type=" + value + "]";
	}
}