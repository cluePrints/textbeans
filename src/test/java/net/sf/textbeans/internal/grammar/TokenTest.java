package net.sf.textbeans.internal.grammar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class TokenTest {
	@Test
	public void ensureComparatorOrderingAscending()
	{
		Token t = new Token(null, null, 3);
		Token t2 = new Token(null, null, 1);
		List<Token> lst = Arrays.asList(t, t2);
		Collections.sort(lst, Token.START_POS_ASCENDING);
		Assert.assertEquals(1, lst.get(0).getStartInd());
		Assert.assertEquals(3, lst.get(1).getStartInd());
	}
}
