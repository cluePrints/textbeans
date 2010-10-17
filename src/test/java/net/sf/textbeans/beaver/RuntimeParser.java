package net.sf.textbeans.beaver;

import beaver.Action;
import beaver.Parser;
import beaver.ParsingTables;
import beaver.Symbol;
import beaver.spec.Grammar;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "OneLineExample.beaver".
 */
public class RuntimeParser extends Parser {
	private BeaverActionWrapper actions;
	
	public RuntimeParser(Grammar grammar, String tables) {
		super(new ParsingTables(tables));
		actions = new BeaverActionWrapper(grammar);
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions.reduce(rule_num, _symbols, offset);
	}
}
