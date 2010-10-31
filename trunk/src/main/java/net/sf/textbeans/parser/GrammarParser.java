package net.sf.textbeans.parser;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import fr.umlv.tatoo.cc.common.generator.Type;
import fr.umlv.tatoo.cc.lexer.charset.encoding.Encoding;
import fr.umlv.tatoo.cc.lexer.charset.encoding.UTF8Encoding;
import fr.umlv.tatoo.cc.lexer.lexer.RuleDecl;
import fr.umlv.tatoo.cc.lexer.lexer.RuleFactory;
import fr.umlv.tatoo.cc.main.main.EBNFParser;
import fr.umlv.tatoo.cc.parser.grammar.EBNFSupport;
import fr.umlv.tatoo.cc.parser.grammar.GrammarFactory;
import fr.umlv.tatoo.cc.parser.grammar.NonTerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.VersionDecl;
import fr.umlv.tatoo.cc.tools.tools.RuleInfo;
import fr.umlv.tatoo.cc.tools.tools.ToolsFactory;
import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;
import fr.umlv.tatoo.runtime.lexer.Lexer;
import fr.umlv.tatoo.runtime.lexer.LexerListener;
import fr.umlv.tatoo.runtime.parser.Parser;
import fr.umlv.tatoo.runtime.parser.ParserListener;

public class GrammarParser {
	Parser<TerminalDecl, NonTerminalDecl, ProductionDecl, VersionDecl> dataParser;
	private Encoding encoding = UTF8Encoding.getInstance();
	// lexer
	private RuleFactory ruleFactory = new RuleFactory();
	// parser
	private GrammarFactory grammarFactory = new GrammarFactory();
	private EBNFSupport ebnfSupport = new EBNFSupport(grammarFactory);

	// tools
	ToolsFactory toolsFactory = new ToolsFactory();
	private HashMap<String, Type> attributeMap = new HashMap<String, Type>();

	private DelegatingParserListener parserListener = new DelegatingParserListener();
	LexerListener<RuleDecl, ReaderWrapper> lexerListener = new SimpleParserForwarder(this);
	
	public GrammarParser compile(String grammarFileName) {
		try {
			GrammarParser p = this;
			File grammarFile = new File(grammarFileName);

			// ebnf
			EBNFParser textBeansGrammarParser = EBNFParser.createEBNFParser(
					p.ruleFactory, p.encoding, p.grammarFactory, p.ebnfSupport,
					p.toolsFactory, p.attributeMap);

			textBeansGrammarParser.parse(grammarFile);

			NonTerminalDecl start = p.grammarFactory.getStartNonTerminalSet()
					.iterator().next();

			VersionDecl version = p.grammarFactory.createVersion("DEFAULT",
					null);
			
			p.dataParser = RuntimeParserFactory.createRuntimeParser(
					p.grammarFactory, start, version, p.parserListener);
			return p;
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	public void parse(String dataFileName) {
		try {
			File dataFile = new File(dataFileName);
			ReaderWrapper emailReader = new ReaderWrapper(new FileReader(
					dataFile), new LocationTracker());

			Lexer<ReaderWrapper> lexer = RuntimeLexerFactory
					.createRuntimeLexer(ruleFactory, encoding, emailReader,
							lexerListener);
			lexer.run();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public void setParsingListener(ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> l) {
		parserListener.setDelegate(l);
	}
}

class DelegatingParserListener implements ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> {
	private ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl>  delegate = new NopParserListener();
	
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

class NopParserListener implements ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> {
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


class SimpleParserForwarder implements LexerListener<RuleDecl, ReaderWrapper> {
	GrammarParser parser;
	
	SimpleParserForwarder(GrammarParser parser) {
		this.parser = parser;
	}

	public void ruleVerified(RuleDecl rule, int size,
			ReaderWrapper buffer) {
		final Map<RuleDecl, RuleInfo> infoMap = parser.toolsFactory.getRuleInfoMap();
		TerminalDecl terminal = infoMap.get(rule).getTerminal();
		if (terminal != null) {
			System.out.println("Resolving " + rule + "-->" + terminal);
			parser.dataParser.push(terminal);
		}

		buffer.discard();
	}
}