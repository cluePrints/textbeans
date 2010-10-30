package net.sf.textbeans.beaver;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

import net.sf.textbeans.internal.grammar.Token;
import beaver.Scanner;
import beaver.Symbol;

public class BeaverLexerAdapter extends Scanner{
	private final Iterator<Token> tokens;
	private Token lastToken;
	private BeaverSymbolFactory beaver = new BeaverSymbolFactory();
	public BeaverLexerAdapter(Collection<Token> tokens) {
		this.tokens = tokens.iterator();
	}
	
	@Override
	public Symbol nextToken() throws IOException, Exception {
		Token token;
		if (tokens.hasNext()) {
			int indAllowedSinceIncl = lastToken != null ? lastToken.getStartInd()+lastToken.getText().length() : 0;
			do {
				token = tokens.next(); 
			} while (token != null && token.getStartInd() < indAllowedSinceIncl);
			lastToken = token;
		} else {
			token = null;
		}
		System.out.println(token);
		return beaver.translate(token);
	}
}
