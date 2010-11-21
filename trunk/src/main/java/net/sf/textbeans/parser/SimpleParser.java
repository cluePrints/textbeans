package net.sf.textbeans.parser;

import java.io.Reader;
import java.util.HashMap;

import net.sf.textbeans.parser.glr.GLRParser;

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
import fr.umlv.tatoo.cc.tools.tools.ToolsFactory;
import fr.umlv.tatoo.runtime.buffer.impl.LocationTracker;
import fr.umlv.tatoo.runtime.buffer.impl.ReaderWrapper;
import fr.umlv.tatoo.runtime.lexer.Lexer;
import fr.umlv.tatoo.runtime.lexer.LexerListener;
import fr.umlv.tatoo.runtime.parser.Parser;
import fr.umlv.tatoo.runtime.parser.ParserListener;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.tools.builder.Builder;

public class SimpleParser {
	Parser<TerminalDecl, NonTerminalDecl, ProductionDecl, VersionDecl> dataParser;
	private Encoding encoding = UTF8Encoding.getInstance();
	// lexer
	private RuleFactory ruleFactory = new RuleFactory();
	// parser
	private GrammarFactory grammarFactory = new GrammarFactory();
	private EBNFSupport ebnfSupport = new EBNFSupport(grammarFactory);

	// tools
	private ToolsFactory toolsFactory = new ToolsFactory();
	private HashMap<String, Type> attributeMap = new HashMap<String, Type>();

	private DelegatingParserListener parserListener = new DelegatingParserListener();
	LexerListener<RuleDecl, ReaderWrapper> lexerListener = new SimpleParserForwarder(
			this);

	public SimpleParser compile(Reader grammarFileReader) {
		SimpleParser p = this;

		// ebnf
		EBNFParser textBeansGrammarParser = EBNFParser.createEBNFParser(
				p.ruleFactory, p.encoding, p.grammarFactory, p.ebnfSupport,
				p.toolsFactory, p.attributeMap);

		textBeansGrammarParser.parse(grammarFileReader);

		NonTerminalDecl start = p.grammarFactory.getStartNonTerminalSet()
				.iterator().next();

		VersionDecl version = p.grammarFactory.createVersion("DEFAULT", null);

		ParserTable<TerminalDecl, NonTerminalDecl, ProductionDecl, VersionDecl> parserTable = RuntimeParserFactory.createParserTable(grammarFactory);

		p.dataParser = Builder.parser(parserTable).listener(p.parserListener)
				.start(start).version(version).setFactory(GLRParser.FACTORY)
				.createParser();

		return p;
	}

	public void parse(Reader dataReader) {
		ReaderWrapper emailReader = new ReaderWrapper(dataReader,
				new LocationTracker());

		Lexer<ReaderWrapper> lexer = RuntimeLexerFactory.createRuntimeLexer(
				ruleFactory, encoding, emailReader, lexerListener);
		lexer.run();
	}

	public void setParsingListener(
			ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> l) {
		parserListener.setDelegate(l);
	}

	public GrammarFactory getGrammarFactory() {
		return grammarFactory;
	}

	public HashMap<String, Type> getAttributeMap() {
		return attributeMap;
	}

	public ToolsFactory getToolsFactory() {
		return toolsFactory;
	}
}
