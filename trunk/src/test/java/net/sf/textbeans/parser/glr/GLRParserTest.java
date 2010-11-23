package net.sf.textbeans.parser.glr;

import static org.easymock.EasyMock.anyObject;
import static org.easymock.EasyMock.createControl;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.easymock.IAnswer;
import org.easymock.IMocksControl;
import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.ActionReturn;
import fr.umlv.tatoo.runtime.parser.LookaheadMap;
import fr.umlv.tatoo.runtime.parser.ParserErrorRecoveryPolicy;
import fr.umlv.tatoo.runtime.parser.ParserListener;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.util.IntArrayList;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class GLRParserTest {
	private Action[] mockActions;

	@Test
	public void shouldInitWithSingleStateStack() throws Exception {
		IGLRParser parser = initParser();

		List<ParserState> states = getStateStacks(parser);
		assertEquals(1, states.size());
	}
	
	@Test
	public void shouldInitiallySaveStateOnListenerSet() throws Exception
	{
		final GLRParser parser = initParser();
		LinkedList<ParserState> states = getStateStacks(parser);
		
		GLRBranchSpawnedListener l = createMock(GLRBranchSpawnedListener.class);
		String ext = new String("aaaa");
		expect(l.onBranchSpawned()).andReturn(ext);
		replay(l);
		
		parser.setBranchSpawnedListener(l);
		
		ParserState state = states.getLast();
		assertEquals(ext, state.getExternal());
	}

	private LinkedList<ParserState> getStateStacks(IGLRParser parser) {
		return (LinkedList<ParserState>) ReflectionTestUtils.getField(parser,
				"stateStacks");
	}

	@Test
	public void shouldNotSpawnNewStackIfNotConflict() throws Exception {
		GLRParser parser = initParser();
		List<ParserState> states = getStateStacks(parser);

		parser.handleConflictsIfAny(null, null);
		assertEquals(1, states.size());
	}

	@Test
	public void shouldSpawnNewStacksButThrowAwayOldOnConflict()
			throws Exception {
		final GLRParser parser = initParser();
		List<ParserState> states = getStateStacks(parser);
		Action a = mockAction(parser, 53);

		ConflictActionReturn ret = new ConflictActionReturn(
				Collections.singletonList(a));

		parser.handleConflictsIfAny(null, ret);
		assertEquals(1, states.size());
	}

	@Test
	public void shouldSpawnNewStacksButThrowAwaySimilar() throws Exception {
		final GLRParser parser = initParser();
		List<ParserState> states = getStateStacks(parser);
		Action a = mockAction(parser, 53);
		Action a2 = mockAction(parser, 53);
		Action a3 = mockAction(parser, 53);

		ConflictActionReturn ret = new ConflictActionReturn(Arrays.asList(a,
				a2, a3));

		parser.handleConflictsIfAny(null, ret);
		assertEquals(1, states.size());
	}
	
	@Test
	/**
	 * 
	 * 0 -> 1 -> 2 -> 3
	 */
	public void shouldFollowActionsIfReturnIsKeep() throws Exception {
		final GLRParser parser = initParser();
		Action a1 = mockAction(parser, 1, ActionReturn.KEEP);
		Action a2 = mockAction(parser, 2, ActionReturn.KEEP);
		Action a3 = mockAction(parser, 3, ActionReturn.NEXT);
		setMockActions(a1, a2, a3);
		
		LinkedList<ParserState> states = getStateStacks(parser);
		parser.doStep(null);

		assertStates(states.get(0).getStack(), 0, 1, 2, 3);
		assertEquals(1, states.size());
	}
	

	@Test
	/**
	 *        2
	 *        ^
	 *        |
	 *  0 --> 1 -->3
	 */
	public void shouldSpawnBranchesAndKillParentOnConflict() throws Exception {
		final GLRParser parser = initParser();		
		Action a1 = mockAction(parser, 2, ActionReturn.NEXT);
		Action a2 = mockAction(parser, 3, ActionReturn.NEXT);
		Action a0 = mockAction(parser, 1, new ConflictActionReturn(Arrays.asList(a1, a2)));
		setMockActions(a0);
		
		LinkedList<ParserState> states = getStateStacks(parser);
		parser.doStep(null);

		assertStates(states.get(0).getStack(), 0, 1, 2);
		assertStates(states.get(1).getStack(), 0, 1, 3);
		assertEquals(2, states.size());
	}
	
	/**
	 * 
	 * 		  
	 *  	  4 --> 5 --> 6
	 *        ^
	 *        |
	 *  0 --> 1 --> 2 --> 3
 	 */
	@Test
	public void shouldFollowActionsIfBranchReturnIsKeep() throws Exception {
		final GLRParser parser = initParser();		
		Action a56 = mockAction(parser, 6, ActionReturn.NEXT);
		Action a45 = mockAction(parser, 5, ActionReturn.KEEP);
		Action a14 = mockAction(parser, 4, ActionReturn.KEEP);
		Action a12 = mockAction(parser, 2, ActionReturn.KEEP);
		Action a23 = mockAction(parser, 3, ActionReturn.NEXT);
		Action a01 = mockAction(parser, 1, new ConflictActionReturn(Arrays.asList(a12, a14)));		
		setMockActions(a01, a12, a23, a14, a45, a56);
		
		LinkedList<ParserState> states = getStateStacks(parser);
		parser.doStep(null);

		assertStates(states.get(0).getStack(), 0, 1, 2, 3);
		assertStates(states.get(1).getStack(), 0, 1, 4, 5, 6);
		assertEquals(2, states.size());
	}
	
	/**
	 * 
	 * 		  
	 *  5 <-- 2 --> 4
	 *        ^
	 *        |
	 *  0 --> 1 --> 3
	 */
	@Test
	public void shouldFollowSpawnBranchesRecursively() throws Exception {
		final GLRParser parser = initParser();		
		Action a24 = mockAction(parser, 4, ActionReturn.NEXT);
		Action a25 = mockAction(parser, 5, ActionReturn.NEXT);
		Action a12 = mockAction(parser, 2, new ConflictActionReturn(Arrays.asList(a24, a25)));
		Action a13 = mockAction(parser, 3, ActionReturn.NEXT);
		Action a01 = mockAction(parser, 1, new ConflictActionReturn(Arrays.asList(a12, a13)));		
		setMockActions(a01);
		
		LinkedList<ParserState> states = getStateStacks(parser);
		parser.doStep(null);

		assertStates(states.get(0).getStack(), 0, 1, 2, 4);
		assertStates(states.get(1).getStack(), 0, 1, 2, 5);
		assertStates(states.get(2).getStack(), 0, 1, 3);
		assertEquals(3, states.size());
	}

	private void assertStates(IntArrayList lst, int... states) {
		IntArrayList n = new IntArrayList();
		for (int i=0; i<states.length; i++) {
			n.add(states[i]);
		}
		assertEquals(n.toString(), lst.toString());
	}

	private void setMockActions(Action... actions) {
		mockActions = actions;
	}

	private Action mockAction(final GLRParser parser, final int val) {
		return mockAction(parser, val, null);
	}

	private Action mockAction(final GLRParser parser,
			final int valueToAddToStack, final ActionReturn result) {
		Action a = createMock("a"+valueToAddToStack, Action.class);
		expect(a.doPerform(parser, null)).andAnswer(
				new IAnswer<ActionReturn>() {
					@Override
					public ActionReturn answer() throws Throwable {
						IntArrayList stateStack = (IntArrayList) ReflectionTestUtils
								.getField(parser, "stateStack");
						stateStack.add(valueToAddToStack);
						return result;
					}
				}).anyTimes();
		replay(a);
		return a;
	}

	private GLRParser initParser() {
		IMocksControl ctrl = createControl();
		ParserTable table = ctrl.createMock(ParserTable.class);
		Map map = new HashMap();
		map.put(this, 0);
		expect(table.getStartMap()).andReturn(map);
		expect(table.getActions(anyObject())).andAnswer(
				new IAnswer<Action[]>() {
					@Override
					public Action[] answer() throws Throwable {
						return GLRParserTest.this.mockActions;
					}
				}).anyTimes();
		ParserListener listener = ctrl.createMock(ParserListener.class);
		ParserErrorRecoveryPolicy policy = ctrl
				.createMock(ParserErrorRecoveryPolicy.class);
		expect(policy.errorRecoveryNeedsContinuation())
				.andReturn(false).anyTimes();
		Object start = this;
		Object version = this;
		LookaheadMap lookaheadMap = ctrl.createMock(LookaheadMap.class);
		ctrl.replay();

		GLRParser parser = new GLRParser(table, listener, policy, start,
				version, lookaheadMap);
		return parser;
	}
}
