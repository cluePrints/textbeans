package net.sf.textbeans.internal.grammar;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.util.Collection;
import java.util.List;

import net.sf.textbeans.grammar.analysis.DepthFirstAdapter;
import net.sf.textbeans.grammar.lexer.LexerException;
import net.sf.textbeans.grammar.node.ATokenDeclaration;
import net.sf.textbeans.grammar.node.Start;
import net.sf.textbeans.grammar.node.Token;
import net.sf.textbeans.grammar.parser.ParserException;

import com.google.common.collect.Lists;

public class Compiler {
	public List<Tokenizer> generateTokenizers(Reader grammarSource) {
		try {
			net.sf.textbeans.grammar.lexer.Lexer lexer = new net.sf.textbeans.grammar.lexer.Lexer(new PushbackReader(grammarSource));
			net.sf.textbeans.grammar.parser.Parser p = new net.sf.textbeans.grammar.parser.Parser(lexer);
			Start root = p.parse();
			RulesGenerator gen = new RulesGenerator();
			root.apply(gen);
			return gen.getTokenizers();
		} catch (LexerException ex) {
			throw new RuntimeException(ex);

		} catch (ParserException ex) {
			throw new RuntimeException(ex);

		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}

class RulesGenerator extends DepthFirstAdapter {
	private List<Tokenizer> tokenizers = Lists.newLinkedList();
	
	@Override
	public void caseATokenDeclaration(ATokenDeclaration node) {
		String name = node.getIdentifier().getText();
		String regex = stripQuotes(node.getStringLiteral().getText());
		TokenType type = TokenType.getInstance(name);
		tokenizers.add(new RegexTokenizer(type, regex));
	}
	
	private String stripQuotes(String s)
	{
		return s.substring(1, s.length()-1);
	}
	public List<Tokenizer> getTokenizers() {
		return tokenizers;
	}
}