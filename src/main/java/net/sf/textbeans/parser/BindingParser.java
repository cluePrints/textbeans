package net.sf.textbeans.parser;

import java.io.Reader;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.BindingInfoReader;
import net.sf.textbeans.binding.XStreamBindingInfoReader;

public class BindingParser {
	private SimpleParser parser;
	private BindingInfoReader astDescReader = new XStreamBindingInfoReader();
	BindingListener bindingListener;
	public BindingParser compile(Reader grammar) {
		parser = new SimpleParser().compile(grammar);
		return this;
	}
	public BindingParser loadAstRules(Reader ast) {
		Binding binding = astDescReader.fromFile(ast);
		bindingListener = new BindingListener(binding);
		parser.lexerListener = new DTOParserForwarder(parser);
		parser.setParsingListener(bindingListener);
		return this;
	}
	
	public SimpleParser getParser() {
		return parser;
	}
	public void parse(Reader name) {
		parser.parse(name);
	}
	
	public Object getResult()
	{		
		return bindingListener.semanticStack.get(0).v;
	}
}


