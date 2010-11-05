package net.sf.textbeans.parser;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.textbeans.binding.Binding;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import fr.umlv.tatoo.cc.parser.grammar.NonTerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.VariableDecl;
import fr.umlv.tatoo.runtime.parser.ParserListener;

class BindingListener implements ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> {
	Binding binding;
	LinkedList<DTOTerminalDecl> semanticStack = Lists.newLinkedList();

	public BindingListener(Binding binding) {
		super();
		this.binding = binding;
	}

	public void shift(TerminalDecl terminal) {
		DTOTerminalDecl dto = (DTOTerminalDecl) terminal;
		semanticStack.push(dto);
 		System.out.println("shift " + terminal);
	}

	public void reduce(ProductionDecl production) {
		List<? extends VariableDecl> reducedSymbols = production.getRight();
		System.out.println("production " + production);
	}

	public void accept(NonTerminalDecl nonTerminal) {
		System.out.println("accept " + nonTerminal);
	}
}
