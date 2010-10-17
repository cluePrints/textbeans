package net.sf.textbeans.beaver;

import org.junit.Test;

import beaver.comp.ParserGenerator;
import beaver.comp.io.SrcReader;
import beaver.comp.run.Options;
import beaver.comp.util.Log;


public class GenGrammarTest {

	@Test
	public void testGen() throws Exception
	{
		SrcReader src = new SrcReader(CompileTokensTest.BEAVER_GRAMMAR);
		Options opt = new Options();
		opt.report_actions = true;
		Log log = new Log();
		ParserGenerator.compile(src, opt, log);
	}
}
