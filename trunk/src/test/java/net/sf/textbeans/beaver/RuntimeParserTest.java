package net.sf.textbeans.beaver;

import java.util.Collections;
import java.util.List;

import net.sf.textbeans.internal.grammar.Lexer;
import net.sf.textbeans.internal.grammar.Token;

import org.junit.Test;

import beaver.comp.ParserGenerator;
import beaver.comp.io.SrcReader;
import beaver.comp.run.Options;
import beaver.comp.util.Log;
import beaver.spec.Grammar;

import com.google.common.base.Charsets;
import com.google.common.io.Files;


public class RuntimeParserTest {

	@Test
	public void testGen() throws Exception
	{
		// compile parser
		SrcReader src = new SrcReader(CompileTokensTest.BEAVER_GRAMMAR);
		Options opt = new Options();
		opt.no_compression = true;
		Log log = new Log();
		Grammar grammar = ParserGenerator.parseGrammar(src, log);
		ParserGenerator.CompiledParser parser = ParserGenerator.compile(grammar, opt, log);
		String tables = parser.encodeParsingTables();
		System.out.println(tables);
		RuntimeParser myParser = new RuntimeParser(grammar, tables);
		
		String text = Files.toString(CompileTokensTest.TEXT, Charsets.UTF_8);
		Lexer l = new Lexer(CompileTokensTest.tokenize());
		List<Token> tokens = l.tokenize(text);
		Collections.sort(tokens, Token.START_POS_ASCENDING);
		
		myParser.parse(new BeaverLexerAdapter(tokens));
		
		System.out.println("Tokens: "+tokens);
		
		BeaverLexerAdapter adapter = new BeaverLexerAdapter(tokens);
	}
}
