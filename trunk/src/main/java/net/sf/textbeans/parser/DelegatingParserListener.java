package net.sf.textbeans.parser;

import fr.umlv.tatoo.cc.parser.grammar.NonTerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.runtime.parser.ParserListener;

class DelegatingParserListener implements
		ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> {
	private ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> delegate = new NopParserListener();

	public void setDelegate(
			ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> delegate) {
		this.delegate = delegate;
	}

	public void shift(TerminalDecl terminal) {
		delegate.shift(terminal);
	}

	public void reduce(ProductionDecl production) {
		delegate.reduce(production);
	}

	public void accept(NonTerminalDecl nonTerminal) {
		delegate.accept(nonTerminal);
	}
}

class NopParserListener implements
		ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> {
	public void shift(TerminalDecl terminal) {
		System.out.println("shift " + terminal);
	}

	public void reduce(ProductionDecl production) {
		System.out.println("production " + production);
	}

	public void accept(NonTerminalDecl nonTerminal) {
		System.out.println("accept " + nonTerminal);
	}
}
