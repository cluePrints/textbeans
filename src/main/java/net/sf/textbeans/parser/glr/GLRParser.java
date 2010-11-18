package net.sf.textbeans.parser.glr;

import java.util.LinkedList;
import java.util.List;

import net.sf.textbeans.util.Memento;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.ActionReturn;
import fr.umlv.tatoo.runtime.parser.LookaheadMap;
import fr.umlv.tatoo.runtime.parser.Parser;
import fr.umlv.tatoo.runtime.parser.ParserErrorRecoveryPolicy;
import fr.umlv.tatoo.runtime.parser.ParserListener;
import fr.umlv.tatoo.runtime.parser.ParserTable;

public class GLRParser<T, N, P, V> extends Parser<T, N, P, V> implements Memento<ParserState> {
	private List<ParserState> states = new LinkedList<ParserState>();

	public GLRParser(ParserTable<T, N, P, V> table,
			ParserListener<? super T, ? super N, ? super P> listener,
			ParserErrorRecoveryPolicy<T, N, P, V> policy, N start, V version,
			LookaheadMap<? extends T, ? super V> lookaheadMap) {
		super(table, listener, policy, start, version, lookaheadMap);
		states.add(getState());
	}

	@Override
	protected ActionReturn doStep(T next) {
		int num = states.size();
		for (int i = 0; i < num; i++) {
			ParserState state = states.get(i);
			loadState(state);
			superDoStep(next);
		}
		return null;
	}

	protected ActionReturn superDoStep(T next) {
		Action<T, P, V>[] actions = table.getActions(next);

		ActionReturn result;
		do {
			if (policy.errorRecoveryNeedsContinuation()) {
				result = policy.continueRecoverOnError(this,
						stateStack, next);
			} else {
				Action<T, P, V> act = actions[stateStack.last()];
				result = act.doPerform(this, next);
				result = handleConflictsIfAny(next, result);
			}
		} while (result == ActionReturn.KEEP);
		return result;
	}

	private ActionReturn handleConflictsIfAny(T next, ActionReturn result) {
		if (result instanceof ConflictActionReturn) {
			ConflictActionReturn c = (ConflictActionReturn) result;
			ParserState savedState = getState();
			states.remove(savedState);
			for (Action<T, P, V> a : c.getActions()) {
				ParserState spawnState = savedState.clone();
				loadState(spawnState);
				result = a.doPerform(this, next);
				result = handleConflictsIfAny(next, result);
				if (!states.contains(spawnState)) {
					states.add(spawnState);
				}
			}
		}
		return result;
	}

	@Override
	public void loadState(ParserState state) {
		this.stateStack = state.getStack();
	}
	
	@Override
	public ParserState getState() {
		return new ParserState(stateStack);
	}

}
