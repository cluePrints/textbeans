package net.sf.textbeans.internal.grammar;

import java.util.Collection;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

public class RegexTokenizerTest {
	private RegexTokenizer numberTokenizer = new RegexTokenizer(null, "[0-9]+");

	@Test
	public void shouldFindNoNumbersInAWord() {
		Collection<Token> tokens = numberTokenizer.tokenize("asd  fj  k a s dfasdf");
		Assert.assertEquals(0, tokens.size());
	}
	
	@Test
	public void shouldFindNoNumbersInEmptyStr() {
		Collection<Token> tokens = numberTokenizer.tokenize("");
		Assert.assertEquals(0, tokens.size());
	}

	@Test
	public void shouldFindNumbers() {
		Collection<Token> tokens = numberTokenizer.tokenize("091asdfj222kasdfasdf3");
		Iterator<Token> it = tokens.iterator();
		check(it, "091", 0);
		check(it, "222", 8);
		check(it, "3", 20);
	}
	
	private void check(Iterator<Token> it, String txt, int ind)
	{
		Token t = it.next();
		Assert.assertEquals(txt, t.getText());
		Assert.assertEquals(ind, t.getStartInd());
	}
}
