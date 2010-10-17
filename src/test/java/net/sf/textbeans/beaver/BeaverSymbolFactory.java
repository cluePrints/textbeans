package net.sf.textbeans.beaver;

import net.sf.textbeans.internal.grammar.Token;
import net.sf.textbeans.internal.grammar.TokenType;
import beaver.Symbol;

public class BeaverSymbolFactory {
	public Symbol translate(Token t) {
		if (t != null) {
			return new Symbol(
					TokenType.getId(t.getType()).shortValue(),
					t.getStartInd(), 
					t.getStartInd()+t.getText().length(), 
					t);
		} else {
			return new Symbol(TokenType.getId(TokenType.EOF).shortValue(), TokenType.EOF);
		}
	}
}
