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
		RuntimeParserGenerator gen = new RuntimeParserGenerator();
		RuntimeParser myParser = gen.compile(CompileTokensTest.BEAVER_GRAMMAR.getAbsolutePath());
		
		String text = Files.toString(CompileTokensTest.TEXT, Charsets.UTF_8);
		Lexer l = new Lexer(CompileTokensTest.tokenize());
		List<Token> tokens = l.tokenize(text);
		Collections.sort(tokens, Token.START_POS_ASCENDING);
		
		myParser.parse(new BeaverLexerAdapter(tokens));
	}
}
