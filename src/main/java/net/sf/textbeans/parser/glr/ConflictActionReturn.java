package net.sf.textbeans.parser.glr;

import java.util.List;

import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.ActionReturn;

@SuppressWarnings("rawtypes")
public class ConflictActionReturn implements ActionReturn{
	public ConflictActionReturn(List<Action> actions) {
		super();
		this.actions = actions;
	}

	List<Action> actions;

	public List<Action> getActions() {
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
}
