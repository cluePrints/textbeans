package net.sf.textbeans.binding;

import java.util.Collection;
import java.util.Map;

import fr.umlv.tatoo.cc.common.generator.Type;
import fr.umlv.tatoo.cc.parser.grammar.NonTerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.VariableDecl;

public class TemplateBindingGenerator {
	private Collection<? extends ProductionDecl> prods;	
	private Map<VariableDecl, Type> typeMap;
	public TemplateBindingGenerator(
			Collection<? extends ProductionDecl> prods,
			Map<VariableDecl, Type> typeMap) {
		super();
		this.prods = prods;
		this.typeMap = typeMap;
	}
	public Binding createBindingTemplate()
	{
		Binding unit = new Binding();
		for (ProductionDecl rule : prods) {
			ClassBinding cl = new ClassBinding();
			cl.setProductionName(rule.getId());
			cl.setClassName("?");
			NonTerminalDecl lhs = rule.getLeft();
			Type lhsType = typeMap.get(lhs);
			if (lhsType != null) {
				cl.setClassName(lhsType.getName());
			}
			for (VariableDecl rhs : rule.getRight()) {
				RuleElementToFieldBinding field = new RuleElementToFieldBinding(rhs.getId(), rhs.getId());
				cl.addField(field);
			}
			unit.addClass(cl);
		}
		return unit;
	}
}
