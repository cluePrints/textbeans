package net.sf.textbeans.parser.glr;

import java.util.LinkedList;

import net.sf.textbeans.util.Memento;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.ActionReturn;
import fr.umlv.tatoo.runtime.parser.LookaheadMap;
import fr.umlv.tatoo.runtime.parser.Parser;
import fr.umlv.tatoo.runtime.parser.ParserErrorRecoveryPolicy;
import fr.umlv.tatoo.runtime.parser.ParserListener;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.tools.builder.ParserFactory;

public class GLRParser<T, N, P, V> extends Parser<T, N, P, V> implements
		Memento<ParserState>, IGLRParser {
	private LinkedList<ParserState> states = new LinkedList<ParserState>();
	private GLRBranchFollowedListener branchFollowingListener = GLRBranchFollowedListener.NONE;
	private GLRBranchSpawnedListener branchSpawnedListener = GLRBranchSpawnedListener.NONE;

	public GLRParser(ParserTable<T, N, P, V> table,
			ParserListener<? super T, ? super N, ? super P> listener,
			ParserErrorRecoveryPolicy<T, N, P, V> policy, N start, V version,
			LookaheadMap<? extends T, ? super V> lookaheadMap) {
		super(table, listener, policy, start, version, lookaheadMap);
		states.add(getState());
	}

	public static final ParserFactory FACTORY = new ParserFactory() {

		public <T, N, P, V> Parser<T, N, P, V> createParser(
				ParserTable<T, N, P, V> table,
				ParserListener<? super T, ? super N, ? super P> listener,
				ParserErrorRecoveryPolicy<T, N, P, V> policy, N start,
				V version, LookaheadMap<? extends T, ? super V> lookaheadMap) {
			return new GLRParser<T, N, P, V>(table, listener, policy, start,
					version, lookaheadMap);
		}
	};

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
				result = policy.continueRecoverOnError(this, stateStack, next);
			} else {
				Action<T, P, V> act = actions[stateStack.last()];
				result = act.doPerform(this, next);
				result = handleConflictsIfAny(next, result);
			}
		} while (result == ActionReturn.KEEP);
		return result;
	}

	ActionReturn handleConflictsIfAny(T next, ActionReturn result) {
		if (result instanceof ConflictActionReturn) {
			ConflictActionReturn c = (ConflictActionReturn) result;
			ParserState savedState = getState();
			Object savedExternalState = branchSpawnedListener.onBranchSpawned();
			savedState.setExternal(savedExternalState);
			states.remove(savedState);
			for (Action<T, P, V> a : c.getActions()) {
				ParserState spawnState = savedState.clone();
				Object externalState = branchSpawnedListener.onBranchSpawned();
				spawnState.setExternal(externalState);

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
		this.branchFollowingListener.onBranchFollowing(state.getExternal());
		this.stateStack = state.getStack();
	}

	@Override
	public ParserState getState() {
		return new ParserState(stateStack);
	}

	@Override
	public void setBranchFollowingListener(
			GLRBranchFollowedListener branchFollowingListener) {
		this.branchFollowingListener = branchFollowingListener;
	}

	@Override
	public void setBranchSpawnedListener(
			GLRBranchSpawnedListener branchSpawnedListener) {
		this.branchSpawnedListener = branchSpawnedListener;
		this.states.getLast().setExternal(branchSpawnedListener.onBranchSpawned());
	}
}
