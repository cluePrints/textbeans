package net.sf.textbeans.parser.glr;

import java.util.Set;

import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.Parser;

public class LRConflictResolveAction<T, P, V>  extends Action<T,P,V> {
	private LRConflictResolveActionDecl decl;
	private Set<Action> actions;
	public LRConflictResolveAction(LRConflictResolveActionDecl decl, Set<Action> actions) {
		super();
		this.decl = decl;
		this.actions = actions;
	}

	@Override
	@SuppressWarnings({"rawtypes", "unchecked"}) 
	public <N> ConflictActionReturn doPerform(Parser<T, N, P, V> parser, T terminal) {
		ConflictActionReturn c = new ConflictActionReturn(actions);		
		return c;
	}

}