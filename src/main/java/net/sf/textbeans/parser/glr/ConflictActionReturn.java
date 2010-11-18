package net.sf.textbeans.parser.glr;

import java.util.Set;

import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.ActionReturn;

@SuppressWarnings("rawtypes")
public class ConflictActionReturn implements ActionReturn{
	public ConflictActionReturn(Set<Action> actions) {
		super();
		this.actions = actions;
	}

	Set<Action> actions;

	public Set<Action> getActions() {
		return actions;
	}

	public void setActions(Set<Action> actions) {
		this.actions = actions;
	}
}
