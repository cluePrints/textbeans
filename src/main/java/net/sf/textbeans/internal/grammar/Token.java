package net.sf.textbeans.internal.grammar;

import java.util.Comparator;

public class Token {
	private final TokenType type;
	private final String text;
	private final int startInd;
	
	public static final Comparator<Token> START_POS_ASCENDING = new Comparator<Token>(){
		@Override
		public int compare(Token o1, Token o2) {
			return o1.getStartInd() - o2.getStartInd();
		}
	};
	
	public Token(TokenType type, String text, int startInd) {
		super();
		this.type = type;
		this.text = text;
		this.startInd = startInd;
	}
	
	public String getText() {
		return text;
	}
	
	public int getStartInd() {
		return startInd;
	}
	
	public TokenType getType() {
		return type;
	}

	@Override
	public String toString() {
		return type.getName();
	}
}
