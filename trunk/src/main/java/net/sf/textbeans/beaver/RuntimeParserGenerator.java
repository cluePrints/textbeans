package net.sf.textbeans.beaver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;

import net.sf.textbeans.internal.grammar.Compiler;
import net.sf.textbeans.internal.grammar.Lexer;
import net.sf.textbeans.internal.grammar.Tokenizer;
import net.sf.textbeans.util.Pair;

import org.junit.Assert;

import beaver.comp.ParserGenerator;
import beaver.comp.io.SrcReader;
import beaver.comp.run.Options;
import beaver.comp.util.Log;
import beaver.spec.Grammar;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Collections2;

public class RuntimeParserGenerator {
	public RuntimeParser compile(Reader grammarIn) {
		try {
			SrcReader src = new SrcReader(grammarIn);
			Options opt = new Options();
			opt.no_compression = true;
			Log log = new Log();
			Grammar grammar = ParserGenerator.parseGrammar(src, log);
			ParserGenerator.CompiledParser parser = ParserGenerator.compile(
					grammar, opt, log);
			String tables = parser.encodeParsingTables();
			RuntimeParser myParser = new RuntimeParser(grammar, tables);
			return myParser;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public Pair<RuntimeParser, Lexer> compile(String grammarFile) {
		try {
			BufferedReader r = new BufferedReader(new FileReader(grammarFile));

			r = new BufferedReader(r);
			String line;
			boolean tokensDefinitionEnd;
			StringBuilder grammar = new StringBuilder();
			Assert.assertEquals("%tokens claus expected", "%tokens",
					r.readLine());
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
			Collection<Tokenizer> tokenizers = new Compiler()
					.generateTokenizers(new StringReader(grammar.toString()));
			Lexer l = new Lexer(tokenizers);
			grammarExt.append("%package \"net.sf.textbeans.beaver\";\n"
					+ "%class \"TextbeansParser\";\n\n");
			Collection<String> names = Collections2.transform(tokenizers,
					new Function<Tokenizer, String>() {
						public String apply(Tokenizer input) {
							return input.getName();
						};
					});

			grammarExt.append("%terminals ")
					.append(Joiner.on(", ").join(names)).append(";");
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

			System.out.println(grammarExt.toString());
			
			RuntimeParser myParser = compile(new StringReader(
					grammarExt.toString()));
			Pair<RuntimeParser, Lexer> artifacts = new Pair<RuntimeParser, Lexer>(
					myParser, l);
			return artifacts;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}
