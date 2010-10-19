package net.sf.textbeans.beaver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.sf.textbeans.internal.grammar.Compiler;
import net.sf.textbeans.internal.grammar.Lexer;
import net.sf.textbeans.internal.grammar.Token;
import net.sf.textbeans.internal.grammar.Tokenizer;
import net.sf.textbeans.util.Pair;

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
		File fileToParse = CompileTokensTest.TEXT;
		String grammarFile = CompileTokensTest.BEAVER_GRAMMAR.getAbsolutePath();
		RuntimeParserGenerator gen = new RuntimeParserGenerator();		
		Pair<RuntimeParser, Lexer> artifacts = gen.compile(grammarFile);
		
		List<Token> tokens = artifacts.v.tokenize(Files.toString(fileToParse, Charsets.UTF_8));
		Collections.sort(tokens, Token.START_POS_ASCENDING);
	
		artifacts.k.parse(new BeaverLexerAdapter(tokens));
	}
}
