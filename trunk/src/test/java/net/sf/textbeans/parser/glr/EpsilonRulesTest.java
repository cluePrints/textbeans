package net.sf.textbeans.parser.glr;

import java.io.File;
import java.io.FileReader;

import net.sf.textbeans.parser.BindingParser;
import net.sf.textbeans.parser.TatooTest;
import net.sf.textbeans.util.Const;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class EpsilonRulesTest{
	final String name = "EpsilonRules";
	final String dir = TatooTest.TEST_DIR+"/parser/glr/";
	
	@Test
	public void shouldReturnProperResult() throws Exception
	{
		String grammarFile = dir + name + Const.EBNF_EXT;
		String rulesFile = dir + name + Const.BINDING_EXT;
		BindingParser p = new BindingParser().compile(new FileReader(
				grammarFile));
		if (new File(rulesFile).exists()) {
			p.loadAstRules(new FileReader(rulesFile));
		}
		String dataFile = dir + name + Const.TEST_CASE_EXT;
		
		p.parse(new FileReader(dataFile));		
	}
}
