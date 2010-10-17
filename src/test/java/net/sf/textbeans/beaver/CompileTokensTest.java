package net.sf.textbeans.beaver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import net.sf.textbeans.internal.grammar.Compiler;
import net.sf.textbeans.internal.grammar.Lexer;
import net.sf.textbeans.internal.grammar.Token;
import net.sf.textbeans.internal.grammar.TokenType;
import net.sf.textbeans.internal.grammar.Tokenizer;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Files;

public class CompileTokensTest {
	private static final String ROOT = "src/test/java/net/sf/textbeans/";
	private static final File GRAMMAR = new File(ROOT+"beaver/OneLineExample.tbg");
	private static final File TOKENS = new File(ROOT+"beaver/OneLineExample.tokens");
	private static final File TEXT = new File(ROOT+"beaver/OneLineExample.txt");
	static final File BEAVER_GRAMMAR = new File(ROOT+"beaver/OneLineExample.beaver");

	@Test
	public void shouldTokenizeSomething() throws Exception
	{
		Collection<Tokenizer> tokenizers = tokenize();
		Assert.assertEquals(3, tokenizers.size());
	}

	private Collection<Tokenizer> tokenize() throws FileNotFoundException {
		FileReader r = new FileReader(GRAMMAR);
		Compiler c = new Compiler();
		Collection<Tokenizer> tokenizers = c.generateTokenizers(r);
		return tokenizers;
	}
	
	@Test
	public void shouldParseExpectedTokens() throws Exception
	{
		Collection<Tokenizer> tokenizers = tokenize();
		
		String text = Files.toString(TEXT, Charsets.UTF_8);
		Lexer l = new Lexer(tokenizers);
		List<Token> tokens = l.tokenize(text);
		Collections.sort(tokens, Token.START_POS_ASCENDING);
		String expected = Files.toString(TOKENS, Charsets.UTF_8);
		List<String> names = new LinkedList<String>();
		for (Token t : tokens) {
			TokenType type = t.getType();
			names.add(type.getName());
		}
		String actual = Joiner.on(' ').join(names);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test() throws Exception
	{
		/**/
		
		String text = Files.toString(TEXT, Charsets.UTF_8);
		Lexer l = new Lexer(tokenize());
		List<Token> tokens = l.tokenize(text);
		Collections.sort(tokens, Token.START_POS_ASCENDING);
		
		System.out.println("Tokens: "+tokens);
		
		BeaverLexerAdapter adapter = new BeaverLexerAdapter(tokens);
		TextbeansParser parser = new TextbeansParser();
		Object o = parser.parse(adapter);
		System.out.println(o);
		Assert.assertNotNull(o);
	}
}
