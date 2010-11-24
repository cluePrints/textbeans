package net.sf.textbeans.parser;

import java.io.Reader;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.io.BindingInfoReader;
import net.sf.textbeans.binding.io.XStreamBindingInfoReader;
import net.sf.textbeans.parser.glr.IGLRParser;

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
		// TODO: interface here?
		if (parser.dataParser instanceof IGLRParser) {
			IGLRParser p = (IGLRParser) parser.dataParser;
			p.setBranchFollowingListener(bindingListener);
			p.setBranchSpawnedListener(bindingListener);
		}
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


