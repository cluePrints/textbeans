package net.sf.textbeans.parser;

import java.io.File;
import java.io.FileReader;

import net.sf.textbeans.parser.BindingParser;
import net.sf.textbeans.util.Const;

public class BindingParsingTest extends TatooTest {
	
	public BindingParsingTest(String name) {
		super(name);
	}
	
	@Override
	protected void compile(String dir, String name) throws Exception {
		String grammarFile = dir + name + Const.EBNF_EXT;
		String rulesFile = dir + name + Const.BINDING_EXT;
		BindingParser p = new BindingParser().compile(new FileReader(grammarFile));
		if (new File(rulesFile).exists()) {
			p.loadAstRules(new FileReader(rulesFile));
		}		
		String dataFile = dir + name + Const.TEST_CASE_EXT;
		p.parse(new FileReader(dataFile));
	}
}
