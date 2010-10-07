package net.sf.textbeans.internal.grammar;

import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.common.collect.Lists;

public class RegexTokenizer implements Tokenizer {
	private final TokenType tokenType;
	private final Pattern regex;
	public RegexTokenizer(TokenType tokenType, String regexStr) {
		this.tokenType = tokenType;
		regex = Pattern.compile(regexStr);
	}
	
	/* (non-Javadoc)
	 * @see net.sf.textbeans.internal.grammar.Tokenizer#tokenize(java.lang.String)
	 */
	@Override
	public Collection<Token> tokenize(String wholeText)
	{
		Matcher matcher = regex.matcher(wholeText);
		List<Token> result = Lists.newLinkedList();
		while (matcher.find()) {
			String text = matcher.group();
			int startInd = matcher.start();
			result.add(new Token(tokenType, text, startInd));
		}
		return result;
	}
}
