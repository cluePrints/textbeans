package net.sf.textbeans.binding;

import java.util.LinkedList;
import java.util.List;

public class ClassBinding {
	private String productionName;
	private String className;
	private List<FieldBinding> fields = new LinkedList<FieldBinding>();
	public String getProductionName() {
		return productionName;
	}
	public void setProductionName(String productionName) {
		this.productionName = productionName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public List<FieldBinding> getFields() {
		return fields;
	}
	public void setFields(List<FieldBinding> fields) {
		this.fields = fields;
	}
}