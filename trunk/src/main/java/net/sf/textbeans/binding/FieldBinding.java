package net.sf.textbeans.binding;
public class FieldBinding {
	private String rhsElement;
	private String field;
	FieldBinding(String rhsElement, String field) {
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