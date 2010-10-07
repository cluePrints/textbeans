package net.sf.textbeans.internal.grammar;

import java.io.File;
import java.io.FileReader;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Files;

public class CompileTokensTest {
	private static final File GRAMMAR = new File("src/test/java/net/sf/textbeans/internal/grammar/OneLineExample.tbg");
	private static final File TOKENS = new File("src/test/java/net/sf/textbeans/internal/grammar/OneLineExample.tokens");
	private static final File TEXT = new File("src/test/java/net/sf/textbeans/internal/grammar/OneLineExample.txt");

	@Test
	public void shouldTokenizeSomething() throws Exception
	{
		FileReader r = new FileReader(GRAMMAR);
		Compiler c = new Compiler();
		Collection<Tokenizer> tokenizers = c.generateTokenizers(r);
		Assert.assertEquals(3, tokenizers.size());
	}
	
	@Test
	public void shouldParseExpectedTokens() throws Exception
	{
		FileReader r = new FileReader(GRAMMAR);
		Compiler c = new Compiler();
		Collection<Tokenizer> tokenizers = c.generateTokenizers(r);
		
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
}
