package net.sf.textbeans.parser;

public class BindingParsingTest extends TatooTest {
	
	public BindingParsingTest(String name) {
		super(name);
	}
	
	@Override
	protected void compile(String dir, String name) throws Exception {
		String grammarFile = dir + name + ".ebnf";
		TextBindingParser p = new TextBindingParser().compile(grammarFile);
		String dataFile = dir + name + ".txt";
		p.parse(dataFile);
	}
}
