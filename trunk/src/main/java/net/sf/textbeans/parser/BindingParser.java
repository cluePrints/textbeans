package net.sf.textbeans.parser;

import java.io.Reader;
import java.util.Collection;
import java.util.List;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.io.BindingInfoReader;
import net.sf.textbeans.binding.io.XStreamBindingInfoReader;
import net.sf.textbeans.parser.glr.IGLRParser;
import net.sf.textbeans.parser.glr.MultiResult;
import net.sf.textbeans.util.Pair;

public class BindingParser {
	private SimpleParser parser;
	private BindingInfoReader astDescReader = new XStreamBindingInfoReader();
	private BindingListener bindingListener;
	private Binding binding;
	private BindingFacade bindingFacade;
	public BindingParser compile(Reader grammar) {
		parser = new SimpleParser().compile(grammar);
		return this;
	}
	public Binding loadAstRules(Reader ast) {
		binding = astDescReader.fromFile(ast);
		bindingFacade = new BindingFacade();
		bindingListener = new BindingListener(binding, bindingFacade);
		// TODO: interface here?
		if (parser.dataParser instanceof MultiResult) {
			IGLRParser p = (IGLRParser) parser.dataParser;
			p.setBranchFollowingListener(bindingListener);
			p.setBranchSpawnedListener(bindingListener);
		}
		parser.lexerListener = new DTOParserForwarder(parser);
		parser.setParsingListener(bindingListener);
		return binding;
	}
	
	public SimpleParser getParser() {
		return parser;
	}
	public void parse(Reader name) {
		parser.parse(name);
	}
	
	public Object getResult()
	{		
		if (parser.dataParser instanceof MultiResult) {
			List<List<Pair<String, ? extends Object>>> resultTrees = ((MultiResult) parser.dataParser).getResultTrees();
			List<Pair<String, ? extends Object>> chosenTree = resultTrees.get(0);
			return bindingFacade.lookForResultCandidate(chosenTree, binding);
		} else {
			return bindingFacade.lookForResultCandidate(bindingListener.getResultTree(), binding);
		}
	}
}


