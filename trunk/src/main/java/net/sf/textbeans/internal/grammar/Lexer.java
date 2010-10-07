package net.sf.textbeans.internal.grammar;

import java.util.List;

import com.google.common.collect.Lists;

public class Lexer {
	private Iterable<Tokenizer> tokenizers;
	public Lexer(Iterable<Tokenizer> tokenizers) {
		super();
		this.tokenizers = tokenizers;
	}
	public List<Token> tokenize(String text) 
	{
		List<Token> result = Lists.newLinkedList();
		for (Tokenizer t : tokenizers) {
			result.addAll(t.tokenize(text));
		}
		return result;
 	}
}
