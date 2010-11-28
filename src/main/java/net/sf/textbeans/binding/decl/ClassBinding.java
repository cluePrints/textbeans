package net.sf.textbeans.binding.decl;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias(value = "class")
public class ClassBinding {
	@XStreamAsAttribute
	private String name;
	@XStreamAsAttribute
	private String productionName;
	@XStreamAsAttribute
	private String ruleRhs; // for clases like 'elements = elements element'
	@XStreamAsAttribute
	private Integer returnPriority; // if instance of this class should be
									// considered as parsed hierarchy root
									// candidate
	@XStreamImplicit
	private List<RhsElementBinding> fields = new LinkedList<RhsElementBinding>();

	public RhsElementBinding[] searchByRhsName(final String prodName) {
		if (fields == null || fields.isEmpty())
			return new RhsElementBinding[0];
		return Iterators.toArray(
				Iterators.filter(fields.iterator(), new RhsNameEq(prodName)),
				RhsElementBinding.class);
	}

	public String getRuleRhs() {
		return ruleRhs;
	}

	public void setRuleRhs(String ruleRhs) {
		if (name != null)
			throw new IllegalStateException(
					"Either class name or ruleRhs could be set.");
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
		RuleElementToFieldBinding b = new RuleElementToFieldBinding(lhsName,
				fieldName);
		add(b);
	}

	public void add(RhsElementBinding b) {
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
			throw new IllegalStateException(
					"Either class name or ruleRhs could be set.");

		this.name = className;
	}

	public List<RhsElementBinding> getFields() {
		return fields;
	}

	public void setFields(List<RhsElementBinding> fields) {
		this.fields = fields;
	}

	public Integer getReturnPriority() {
		return returnPriority;
	}

	public void setReturnPriority(Integer returnPriority) {
		this.returnPriority = returnPriority;
	}
	
	public static Comparator<ClassBinding> PRIORITY_DESC = new Comparator<ClassBinding>() {
		public int compare(ClassBinding o1, ClassBinding o2) {
			return PRIORITY_ASC.compare(o2, o1);
		};
	};
	
	public static Comparator<ClassBinding> PRIORITY_ASC = new Comparator<ClassBinding>() {
		@Override
		public int compare(ClassBinding o1, ClassBinding o2) {
			if (o1.getReturnPriority() == null) {
				if (o2.getReturnPriority() == null) {
					return 0;
				} else {
					return -1;
				}
			} {
				if (o2.getReturnPriority() == null) {
					return 1;
				} else {
					return o1.getReturnPriority() - o2.getReturnPriority();
				}
			}
		}
	};
}

class RhsNameEq implements Predicate<RhsElementBinding> {
	private final String name;

	public RhsNameEq(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean apply(RhsElementBinding input) {
		String longName = input.getRhsElement();
		if (longName == null) {
			return name == null;
		} else {
			if (name == null) {
				return false;
			}
			return longName.startsWith(name + ".") || name.equals(longName);
		}
	}
}