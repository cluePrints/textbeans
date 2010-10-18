package net.sf.textbeans.beaver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.sf.textbeans.internal.grammar.Compiler;
import net.sf.textbeans.internal.grammar.Lexer;
import net.sf.textbeans.internal.grammar.Token;
import net.sf.textbeans.internal.grammar.Tokenizer;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;
import com.google.common.io.Files;


public class RuntimeParserTest {

	@Test
	public void testGen() throws Exception
	{
		RuntimeParserGenerator gen = new RuntimeParserGenerator();
		BufferedReader r = new BufferedReader(new FileReader(CompileTokensTest.BEAVER_GRAMMAR.getAbsolutePath()));
		
		r = new BufferedReader(r);
		String line;
		boolean tokensDefinitionEnd;
		StringBuilder grammar = new StringBuilder();
		Assert.assertEquals("%tokens claus expected", "%tokens", r.readLine());
		do {
			line = r.readLine();
			tokensDefinitionEnd = line != null && line.matches("%.*");
			if (tokensDefinitionEnd) {
				if (line == null) {
					throw new IllegalStateException("unexpected EOF");
				}
			} else {
				grammar.append(line);
				grammar.append("\n");
			}
		} while (!tokensDefinitionEnd);
		
		StringBuilder grammarExt = new StringBuilder();
		Collection<Tokenizer> tokenizers = new Compiler().generateTokenizers(new StringReader(grammar.toString()));
		Lexer l = new Lexer(tokenizers);
		grammarExt.append(
				"%package \"net.sf.textbeans.beaver\";\n" +
				"%class \"TextbeansParser\";\n\n");
		Collection<String> names = Collections2.transform(tokenizers, new Function<Tokenizer, String>() {
			public String apply(Tokenizer input) {
				return input.getName();
			};
		});
		
		grammarExt.append("%terminals ").append(Joiner.on(", ").join(names)).append(";");
		List<Token> tokens = l.tokenize(Files.toString(CompileTokensTest.TEXT, Charsets.UTF_8));
		grammarExt.append("\n\n");
		grammarExt.append(line);
		grammarExt.append("\n\n");
		do {
			line = r.readLine();
			if (line == null) 
				break;

			grammarExt.append(line);
			grammarExt.append("\n");
		} while (line != null);
		
		Collections.sort(tokens, Token.START_POS_ASCENDING);
		
		RuntimeParser myParser = gen.compile(new StringReader(grammarExt.toString()));
		System.out.println(grammarExt.toString());
		System.out.println(tokens);
		myParser.parse(new BeaverLexerAdapter(tokens));
	}
}
