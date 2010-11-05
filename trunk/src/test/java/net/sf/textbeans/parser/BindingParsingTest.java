package net.sf.textbeans.parser;

import java.io.File;

public class BindingParsingTest extends TatooTest {
	
	public BindingParsingTest(String name) {
		super(name);
	}
	
	@Override
	protected void compile(String dir, String name) throws Exception {
		String grammarFile = dir + name + ".ebnf";
		String rulesFile = dir + name + ".xml";
		TextBindingParser p = new TextBindingParser().compile(grammarFile);
		if (new File(rulesFile).exists()) {
			p.loadAstRules(rulesFile);
		}		
		String dataFile = dir + name + ".txt";
		p.parse(dataFile);
	}
}
