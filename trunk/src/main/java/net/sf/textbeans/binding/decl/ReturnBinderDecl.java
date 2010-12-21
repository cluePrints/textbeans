package net.sf.textbeans.binding.decl;


import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias(value="return")
public class ReturnBinderDecl implements RhsElementBinding {
	@XStreamAsAttribute
	private String ruleRhs;
	@XStreamAsAttribute
	private String value;
	@XStreamAsAttribute
	private String as;

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
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getExpectedType() {
		return as;
	}

	public void setExpectedType(String as) {
		this.as = as;
	}

	@Override
	public String toString() {
		return "Return [ruleRhs=" + ruleRhs + ", value=" + value
				+ ", as=" + as + "]";
	}
	
}