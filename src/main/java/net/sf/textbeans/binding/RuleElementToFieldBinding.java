package net.sf.textbeans.binding;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class RuleElementToFieldBinding {
	@XStreamAsAttribute
	private String rhsElement;
	@XStreamAsAttribute
	private String field;
	RuleElementToFieldBinding(String rhsElement, String field) {
		super();
		this.rhsElement = rhsElement;
		this.field = field;
	}
	public String getRhsElement() {
		return rhsElement;
	}
	public void setRhsElement(String rhsElement) {
		this.rhsElement = rhsElement;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}	
}