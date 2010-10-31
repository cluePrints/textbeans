package net.sf.textbeans.parser;

import java.util.Map;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.BindingInfoReader;
import net.sf.textbeans.binding.XStreamBindingInfoReader;
import fr.umlv.tatoo.cc.lexer.lexer.RuleDecl;
import fr.umlv.tatoo.cc.parser.grammar.NonTerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.Priority;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.cc.tools.tools.RuleInfo;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;
import fr.umlv.tatoo.runtime.lexer.LexerListener;
import fr.umlv.tatoo.runtime.parser.ParserListener;

public class TextBindingParser {
	private GrammarParser parser;
	private BindingInfoReader astDescReader = new XStreamBindingInfoReader();
	public TextBindingParser compile(String grammarFileName) {
		parser = new GrammarParser().compile(grammarFileName);
		return this;
	}
	public TextBindingParser loadAstRules(String fileName) {
		Binding binding = astDescReader.fromFile(fileName);
		BindingListener l = new BindingListener(binding);
		parser.setParsingListener(l);
		return this;
	}
	public void parse(String name) {
		parser.parse(name);
	}
}

class BindingListener implements ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> {
	Binding binding;
	
	BindingListener(Binding binding) {
		super();
		this.binding = binding;
	}

	public void shift(TerminalDecl terminal) {
		DTOTerminalDecl dto = (DTOTerminalDecl) terminal;
 		System.out.println("shift " + terminal);
	}

	public void reduce(ProductionDecl production) {
		System.out.println("production " + production);
	}

	public void accept(NonTerminalDecl nonTerminal) {
		System.out.println("accept " + nonTerminal);
	}
}

class TrickyParserForwarder implements LexerListener<RuleDecl, ReaderWrapper> {
	GrammarParser parser;
	
	TrickyParserForwarder(GrammarParser parser) {
		this.parser = parser;
	}

	public void ruleVerified(RuleDecl rule, int size,
			ReaderWrapper buffer) {
		final Map<RuleDecl, RuleInfo> infoMap = parser.toolsFactory.getRuleInfoMap();
		TerminalDecl terminal = infoMap.get(rule).getTerminal();
		if (terminal != null) {
			System.out.println("Resolving " + rule + "-->" + terminal);
			parser.dataParser.push(new DTOTerminalDecl(buffer.view(), terminal));
		}

		buffer.discard();
	}
}

class DTOTerminalDecl extends TerminalDecl {
	final CharSequence data;
	final TerminalDecl decl;
	DTOTerminalDecl(CharSequence data, TerminalDecl decl) {
		super(null, null, false);
		this.data = data;
		this.decl = decl;
	}
	public String getId() {
		return decl.getId();
	}
	public Priority getPriority() {
		return decl.getPriority();
	}
	public boolean isBranching() {
		return decl.isBranching();
	}
	public boolean isTerminal() {
		return decl.isTerminal();
	}
	public void setAlias(String alias) {
		decl.setAlias(alias);
	}
	public String getAlias() {
		return decl.getAlias();
	}
	public String getName() {
		return decl.getName();
	}
	public String toString() {
		return decl.toString();
	}
	public int hashCode() {
		return decl.hashCode();
	}
	public boolean equals(Object obj) {
		return decl.equals(obj);
	}	
	
}