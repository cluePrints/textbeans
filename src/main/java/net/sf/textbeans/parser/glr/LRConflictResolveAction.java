package net.sf.textbeans.parser.glr;

import java.util.Set;

import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.Parser;

@SuppressWarnings("rawtypes") 
public class LRConflictResolveAction<T, P, V>  extends Action<T,P,V> {
	private Set<Action> actions;
	public LRConflictResolveAction(Set<Action> actions) {
		super();
		this.actions = actions;
	}

	@Override
	public <N> ConflictActionReturn doPerform(Parser<T, N, P, V> parser, T terminal) {
		ConflictActionReturn c = new ConflictActionReturn(actions);		
		return c;
	}

}