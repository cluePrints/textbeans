package net.sf.textbeans.parser;

import java.io.Reader;
import java.lang.reflect.Constructor;
import java.util.List;

import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.io.BindingInfoReader;
import net.sf.textbeans.binding.io.XStreamBindingInfoReader;
import net.sf.textbeans.parser.glr.DisambiguationStrategy;
import net.sf.textbeans.parser.glr.IGLRParser;
import net.sf.textbeans.parser.glr.MultiResult;
import net.sf.textbeans.parser.glr.ObjectChangeHook;
import net.sf.textbeans.util.Pair;

public class BindingParser {
	private SimpleParser parser;
	private BindingInfoReader astDescReader = new XStreamBindingInfoReader();
	private BindingListener bindingListener;
	private Binding binding;
	private BindingFacade bindingFacade = new BindingFacade();
	private DisambiguationStrategy disambiguatior = null;

	public BindingParser compile(Reader grammar) {
		parser = new SimpleParser().compile(grammar);
		return this;
	}

	public Binding loadAstRules(Reader ast) {
		binding = astDescReader.fromFile(ast);		
		bindingListener = new BindingListener(binding, bindingFacade);
		// TODO: interface here?
		if (parser.dataParser instanceof MultiResult) {
			IGLRParser p = (IGLRParser) parser.dataParser;
			p.setBranchFollowingListener(bindingListener);
			p.setBranchSpawnedListener(bindingListener);
		}
		DisambiguationStrategy disambiguator = resolve(binding.getDisambiguatorClass());
		setDisambiguatior(disambiguator);
		
		ObjectChangeHook prunner = resolve(binding.getPrunnerClass());
		setHook(prunner);
		
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

	public Object getResult() {
		if (parser.dataParser instanceof MultiResult) {
			List<List<Pair<String, ? extends Object>>> resultTrees = ((MultiResult) parser.dataParser)
					.getResultTrees();
			
			List<Pair<String, ? extends Object>> chosenTree;
			if (disambiguatior != null ) {
				chosenTree = disambiguatior.choose(resultTrees);
			} else {
				chosenTree = DisambiguationStrategy.SIMPLE.choose(resultTrees);
			}
			return bindingFacade.lookForResultCandidate(chosenTree, binding);
		} else {
			return bindingFacade.lookForResultCandidate(
					bindingListener.getResultTree(), binding);
		}
	}
	
	public Object getResults() {
		if (parser.dataParser instanceof MultiResult) {
			List<List<Pair<String, ? extends Object>>> resultTrees = ((MultiResult) parser.dataParser)
					.getResultTrees();
			return resultTrees;
		} else {
			return bindingFacade.lookForResultCandidate(
					bindingListener.getResultTree(), binding);
		}
	}

	public void setDisambiguatior(DisambiguationStrategy disambiguatior) {
		this.disambiguatior = disambiguatior;
	}

	public void setHook(ObjectChangeHook hook) {
		bindingListener.setHook(hook);
	}
	
	@SuppressWarnings("unchecked")
	private <T> T resolve(String clazzName) 
	{
		if (clazzName == null)
			return null;
		
		try {
			Class<T> clazz = (Class<T>) Class.forName(clazzName);
			Constructor<T> c = clazz.getConstructor();
			return c.newInstance();
		} catch (Exception ex) {
			throw new RuntimeException("Could not load class: "+clazzName);
		}
	}
}
