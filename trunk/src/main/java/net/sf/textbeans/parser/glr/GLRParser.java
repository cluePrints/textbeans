package net.sf.textbeans.parser.glr;

import java.util.ArrayList;
import java.util.Iterator;
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
import fr.umlv.tatoo.runtime.tools.builder.ParserFactory;

public class GLRParser<T, N, P, V> extends Parser<T, N, P, V> implements
		Memento<ParserState>, IGLRParser {
	private LinkedList<ParserState> stateStacks = new LinkedList<ParserState>();
	private GLRBranchFollowedListener branchFollowingListener = GLRBranchFollowedListener.NONE;
	private GLRBranchSpawnedListener branchSpawnedListener = GLRBranchSpawnedListener.NONE;

	public GLRParser(ParserTable<T, N, P, V> table,
			ParserListener<? super T, ? super N, ? super P> listener,
			ParserErrorRecoveryPolicy<T, N, P, V> policy, N start, V version,
			LookaheadMap<? extends T, ? super V> lookaheadMap) {
		super(table, listener, policy, start, version, lookaheadMap);
		stateStacks.add(getState());
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

	/**
	 * Iterate over state stacks. 
	 * If that stateStack caused parser to spawn branches - remove from list 
	 */
	@Override
	protected ActionReturn doStep(T next) {
		// TODO: if only one stateStack?
		List<ParserState> survivedStacks = new LinkedList<ParserState>();
		List<ParserState> statesToIterate = new ArrayList<ParserState>(stateStacks);
		for (ParserState state : statesToIterate) {
			loadState(state);
			List<ParserState> justSpawned = superDoStep(next, state);
			if (justSpawned.isEmpty()) {
				survivedStacks.add(state);
			} else {
				survivedStacks.addAll(justSpawned);
			}
		}
		stateStacks.clear();
		stateStacks.addAll(survivedStacks);
		return null;
	}

	// <1> perform action, if it's KEEP - do it once more
	// <2> if conflict:
			// remove current stateStack from the list and save			
			// for each conflicting action:
			// clone saved stateStack
			// recursively perform <1>
			// if conflict, recursively do <2>
	
	// works ok if:
	//	A. stateStack with branch spawned is removed from the list
	//  B. program eventually stop(i.e. branches spawned should not be acted immediately):)
	protected List<ParserState> superDoStep(T next, ParserState curr) {
		Action<T, P, V>[] actions = table.getActions(next);

		List<ParserState> branchesSpawned = new LinkedList<ParserState>(); 
		ActionReturn result;
		do {
			if (policy.errorRecoveryNeedsContinuation()) {
				result = policy.continueRecoverOnError(this, stateStack, next);
			} else {
				Action<T, P, V> act = actions[stateStack.last()];
				
				result = doAction(next, curr, act);
				branchesSpawned.addAll(handleConflictsIfAny(next, result));
			}
		} while (result == ActionReturn.KEEP);
		return branchesSpawned;
	}

	private ActionReturn doAction(T next, ParserState current, Action<T, P, V> act) {
		ActionReturn result = null;
		do {
			result = act.doPerform(this, next);
			
			if (result == ActionReturn.KEEP) {
				Action<T, P, V>[] actions = table.getActions(next);
				act = actions[stateStack.last()];
			}
		} while (result == ActionReturn.KEEP); 
		return result;
	}

	// TODO: log4j NDC logging to track simultaneously followed branch in some comprehensive way
	List<ParserState> handleConflictsIfAny(T next, ActionReturn result) {
		List<ParserState> branchesSpawned = new LinkedList<ParserState>();
		if (result instanceof ConflictActionReturn) {
			ConflictActionReturn c = (ConflictActionReturn) result;
			
			// save state
			ParserState savedState = getState();
			Object savedExternalState = branchSpawnedListener.onBranchSpawned();
			savedState.setExternal(savedExternalState);

			Iterator<Action> it = c.getActions().iterator();
			while (it.hasNext()) {
				Action a = it.next();
				// clone
				ParserState spawnState = savedState.clone();
				spawnState.setExternal(branchSpawnedListener.onBranchSpawned());				
				
				// use cloned
				loadState(spawnState);
				result = doAction(next, spawnState, a);
				branchesSpawned.add(spawnState);
				
				// restore initial
				if (it.hasNext()) {
					loadState(savedState);
				}
			}
		}
		return branchesSpawned;
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
		this.stateStacks.getLast().setExternal(branchSpawnedListener.onBranchSpawned());
	}
}
