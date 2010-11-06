package net.sf.textbeans.parser;

import java.util.Map;

import fr.umlv.tatoo.cc.lexer.lexer.RuleDecl;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.cc.tools.tools.RuleInfo;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;
import fr.umlv.tatoo.runtime.lexer.LexerListener;

public class DTOParserForwarder implements LexerListener<RuleDecl, ReaderWrapper> {
	ReaderGrammarParser parser;
	
	DTOParserForwarder(ReaderGrammarParser parser) {
		this.parser = parser;
	}

	public void ruleVerified(RuleDecl rule, int size,
			ReaderWrapper buffer) {
		final Map<RuleDecl, RuleInfo> infoMap = parser.toolsFactory.getRuleInfoMap();
		TerminalDecl terminal = infoMap.get(rule).getTerminal();
		if (terminal != null) {
			parser.dataParser.push(new DTOTerminalDecl(buffer.view(), terminal));
		}

		buffer.discard();
	}
}
