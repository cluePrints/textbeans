package net.sf.textbeans.parser;

import java.util.Map;

import fr.umlv.tatoo.cc.lexer.lexer.RuleDecl;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.cc.tools.tools.RuleInfo;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;
import fr.umlv.tatoo.runtime.lexer.LexerListener;

class SimpleParserForwarder implements LexerListener<RuleDecl, ReaderWrapper> {
	ReaderGrammarParser parser;

	SimpleParserForwarder(ReaderGrammarParser parser) {
		this.parser = parser;
	}

	public void ruleVerified(RuleDecl rule, int size, ReaderWrapper buffer) {
		final Map<RuleDecl, RuleInfo> infoMap = parser.getToolsFactory()
				.getRuleInfoMap();
		TerminalDecl terminal = infoMap.get(rule).getTerminal();
		if (terminal != null) {
			parser.dataParser.push(terminal);
		}

		buffer.discard();
	}
}