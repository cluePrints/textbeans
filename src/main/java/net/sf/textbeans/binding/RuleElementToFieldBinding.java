package net.sf.textbeans.binding;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class RuleElementToFieldBinding {
	@XStreamAsAttribute
	private String ruleRhs;
	@XStreamAsAttribute
	private String field;
	RuleElementToFieldBinding(String rhsElement, String field) {
		super();
		this.ruleRhs = rhsElement;
		this.field = field;
	}
	public String getRhsElement() {
		return ruleRhs;
	}
	public void setRhsElement(String rhsElement) {
		this.ruleRhs = rhsElement;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}	
}