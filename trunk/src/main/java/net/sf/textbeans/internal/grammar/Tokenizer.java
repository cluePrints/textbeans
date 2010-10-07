package net.sf.textbeans.internal.grammar;

import java.util.Collection;

public interface Tokenizer {

	public abstract Collection<Token> tokenize(String wholeText);

}