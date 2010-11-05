package net.sf.textbeans.parser;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.BindingInfoReader;
import net.sf.textbeans.binding.XStreamBindingInfoReader;

public class TextBindingParser {
	private GrammarParser parser;
	private BindingInfoReader astDescReader = new XStreamBindingInfoReader();
	BindingListener bindingListener;
	public TextBindingParser compile(String grammarFileName) {
		parser = new GrammarParser().compile(grammarFileName);
		return this;
	}
	public TextBindingParser loadAstRules(String fileName) {
		Binding binding = astDescReader.fromFile(fileName);
		bindingListener = new BindingListener(binding);
		parser.lexerListener = new DTOParserForwarder(parser);
		parser.setParsingListener(bindingListener);
		return this;
	}
	public void parse(String name) {
		parser.parse(name);
	}
	
	public Object getResult()
	{		
		return bindingListener.semanticStack.get(0).v;
	}
}

