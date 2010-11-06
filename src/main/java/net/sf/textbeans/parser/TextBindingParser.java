package net.sf.textbeans.parser;


public class TextBindingParser {
	private ReaderTextBindingParser parser;

	public TextBindingParser compile(String grammar) {
		parser = new ReaderTextBindingParser();
		parser.compile(GrammarParser.fileToReader(grammar));
		return this;
	}

	public TextBindingParser loadAstRules(String ast) {
		parser.loadAstRules(GrammarParser.fileToReader(ast));
		return this;
	}

	public void parse(String name) {
		parser.parse(GrammarParser.fileToReader(name));
	}
	
	public Object getResult()
	{		
		return parser.getResult();
	}
}

