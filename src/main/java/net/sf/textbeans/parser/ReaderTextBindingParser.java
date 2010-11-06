package net.sf.textbeans.parser;

import java.io.Reader;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.BindingInfoReader;
import net.sf.textbeans.binding.XStreamBindingInfoReader;

public class ReaderTextBindingParser {
	private ReaderGrammarParser parser;
	private BindingInfoReader astDescReader = new XStreamBindingInfoReader();
	BindingListener bindingListener;
	public ReaderTextBindingParser compile(Reader grammar) {
		parser = new ReaderGrammarParser().compile(grammar);
		return this;
	}
	public ReaderTextBindingParser loadAstRules(Reader ast) {
		Binding binding = astDescReader.fromFile(ast);
		bindingListener = new BindingListener(binding);
		parser.lexerListener = new DTOParserForwarder(parser);
		parser.setParsingListener(bindingListener);
		return this;
	}
	public void parse(Reader name) {
		parser.parse(name);
	}
	
	public Object getResult()
	{		
		return bindingListener.semanticStack.get(0).v;
	}
}


