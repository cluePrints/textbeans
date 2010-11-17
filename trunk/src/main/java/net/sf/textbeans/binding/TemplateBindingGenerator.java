package net.sf.textbeans.binding;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

import net.sf.textbeans.parser.BindingParser;

import fr.umlv.tatoo.cc.common.generator.Type;
import fr.umlv.tatoo.cc.parser.grammar.NonTerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.VariableDecl;

public class TemplateBindingGenerator {
	private Collection<? extends ProductionDecl> prods;
	private Map<VariableDecl, Type> typeMap;

	public TemplateBindingGenerator(Collection<? extends ProductionDecl> prods,
			Map<VariableDecl, Type> typeMap) {
		super();
		this.prods = prods;
		this.typeMap = typeMap;
	}

	public Binding createBindingTemplate() {
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
				cl.addField(rhs.getId(), rhs.getId());
			}
			unit.addClass(cl);
		}
		return unit;
	}

	public static void generateBindingTemplate(String name, BindingParser p)
			throws IOException {
			Map<VariableDecl, Type> types = p.getParser().getToolsFactory()
					.getVariableTypeMap();
			Collection<? extends ProductionDecl> prods = p.getParser()
					.getGrammarFactory().getAllProductions();
			TemplateBindingGenerator bGen = new TemplateBindingGenerator(prods, types);
			BindingInfoWriter xWr = new XStreamBindingInfoWriter();
			Writer wr = new FileWriter(new File(name + ".btmp.xml"));
			xWr.toFile(bGen.createBindingTemplate(), wr);
	}

}
