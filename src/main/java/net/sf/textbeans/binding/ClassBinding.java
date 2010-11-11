package net.sf.textbeans.binding;

import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

public class ClassBinding {
	@XStreamAsAttribute
	private String name;
	@XStreamAsAttribute
	private String productionName;
	@XStreamAsAttribute
	private String ruleRhs;		// for clases like 'elements = elements element' 
	@XStreamImplicit
	private List<RuleElementToFieldBinding> fields = new LinkedList<RuleElementToFieldBinding>();
	
	public RuleElementToFieldBinding[] searchByRhsName(final String prodName)
	{
		return Iterators.toArray(Iterators.filter(fields.iterator(), new RhsNameEq(prodName)), RuleElementToFieldBinding.class);
	}

	public String getRuleRhs() {
		return ruleRhs;
	}

	public void setRuleRhs(String ruleRhs) {
		if (name != null)
			throw new IllegalStateException("Either class name or ruleRhs could be set.");
		this.ruleRhs = ruleRhs;
	}

	public static ClassBinding forClass(Class<?> className) {
		ClassBinding b = new ClassBinding();
		b.setClassName(className.getCanonicalName());
		return b;
	}
	public ClassBinding as(String prodName) {
		this.productionName = prodName;
		return this;
	}
	public void addField(String lhsName, String fieldName) {
		addField(new RuleElementToFieldBinding(lhsName, fieldName));
	}
	public void addField(RuleElementToFieldBinding b) {
		fields.add(b);
	}
	public String getProductionName() {
		return productionName;
	}
	public void setProductionName(String productionName) {
		this.productionName = productionName;
	}
	public String getClassName() {
		return name;
	}
	public void setClassName(String className) {
		if (ruleRhs != null)
			throw new IllegalStateException("Either class name or ruleRhs could be set.");

		this.name = className;
	}
	public List<RuleElementToFieldBinding> getFields() {
		return fields;
	}
	public void setFields(List<RuleElementToFieldBinding> fields) {
		this.fields = fields;
	}
}


class RhsNameEq implements Predicate<RuleElementToFieldBinding>
{
	private final String name;
	
	public RhsNameEq(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean apply(RuleElementToFieldBinding input) {
		String longName = input.getRhsElement();
		return longName.startsWith(name +".") || name.equals(longName);
	}
}