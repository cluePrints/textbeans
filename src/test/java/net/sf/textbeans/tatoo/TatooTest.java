package net.sf.textbeans.tatoo;

import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.collect.Lists;

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

@RunWith(Parameterized.class)
public class TatooTest {
	private String caseName;

	@Parameters
	public static Collection<Object[]> cases() {
		List<Object[]> cases = Lists.newLinkedList();
		cases.add(new Object[] { "multipleSimpleOrder" });
		cases.add(new Object[] { "simpleOrder" });

		cases.add(new Object[] { "adEmailOrder" });
		cases.add(new Object[] { "simpleEmailOrder" });
		cases.add(new Object[] { "simplerOrder" });
		cases.add(new Object[] { "simpleOrder" });
		cases.add(new Object[] { "simpleOrder2" });
		return cases;
	}

	@Test
	public void test() throws Exception {
		System.out.println("\n\n\n\n =======================\n" + caseName);
		compile(caseName);
	}

	private void compile(String name) throws Exception {
		compile("src/test/java/net/sf/textbeans/tatoo/", name);
	}

	private void compile(String dir, String name) throws Exception {
		File grammarFile = new File(dir + name + ".ebnf");
		File dataFile = new File(dir + name + ".txt");

		// lexer
		Encoding encoding = UTF8Encoding.getInstance();
		RuleFactory ruleFactory = new RuleFactory();

		// parser
		GrammarFactory grammarFactory = new GrammarFactory();
		EBNFSupport ebnfSupport = new EBNFSupport(grammarFactory);

		// tools
		ToolsFactory toolsFactory = new ToolsFactory();
		HashMap<String, Type> attributeMap = new HashMap<String, Type>();

		// ebnf
		EBNFParser textBeansGrammarParser = EBNFParser.createEBNFParser(
				ruleFactory, encoding, grammarFactory, ebnfSupport,
				toolsFactory, attributeMap);

		textBeansGrammarParser.parse(grammarFile);

		NonTerminalDecl start = grammarFactory.getStartNonTerminalSet()
				.iterator().next();

		VersionDecl version = grammarFactory.createVersion("DEFAULT", null);

		ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl> listener = new ParserListener<TerminalDecl, NonTerminalDecl, ProductionDecl>() {
			public void shift(TerminalDecl terminal) {
				System.out.println("shift " + terminal);
			}

			public void reduce(ProductionDecl production) {
				System.out.println("production " + production);
			}

			public void accept(NonTerminalDecl nonTerminal) {
				System.out.println("accept " + nonTerminal);
			}
		};

		Parser<TerminalDecl, NonTerminalDecl, ProductionDecl, VersionDecl> emailParser = RuntimeParserFactory
				.createRuntimeParser(grammarFactory, start, version, listener);

		ReaderWrapper emailReader = new ReaderWrapper(new FileReader(dataFile),
				new LocationTracker());

		LexerListener<RuleDecl, ReaderWrapper> listener2 = createLexerListener(
				emailParser, toolsFactory);

		Lexer<ReaderWrapper> lexer = RuntimeLexerFactory.createRuntimeLexer(
				ruleFactory, encoding, emailReader, listener2);
		lexer.run();

	}

	private LexerListener<RuleDecl, ReaderWrapper> createLexerListener(
			final Parser<TerminalDecl, NonTerminalDecl, ProductionDecl, VersionDecl> parser,
			ToolsFactory factory) {
		final Map<RuleDecl, RuleInfo> infoMap = factory.getRuleInfoMap();

		return new LexerListener<RuleDecl, ReaderWrapper>() {

			public void ruleVerified(RuleDecl rule, int size,
					ReaderWrapper buffer) {
				TerminalDecl terminal = infoMap.get(rule).getTerminal();
				System.out.println("Resolving " + rule + "-->" + terminal);
				if (terminal != null) {
					parser.push(terminal);
				}

				buffer.discard();
			}
		};
	}

	public TatooTest(String caseName) {
		super();
		this.caseName = caseName;
	}

}