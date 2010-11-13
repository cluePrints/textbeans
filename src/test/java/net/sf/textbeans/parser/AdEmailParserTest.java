package net.sf.textbeans.parser;

import org.junit.Before;

public class AdEmailParserTest extends AbstractBindingParserTest{
	@Before
	public void before()
	{
		generateTmpBinding = true;
		name = "adEmailOrder";
	}
}
