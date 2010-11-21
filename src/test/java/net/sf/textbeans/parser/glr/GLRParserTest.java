package net.sf.textbeans.parser.glr;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.easymock.EasyMock;
import org.easymock.IAnswer;
import org.easymock.IMocksControl;
import org.junit.Assert;
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

	@Test
	public void shouldInitWithSingleStateStack() throws Exception {
		IGLRParser parser = initParser();

		List<ParserState> states = (List<ParserState>) ReflectionTestUtils
				.getField(parser, "states");
		Assert.assertEquals(1, states.size());
	}

	@Test
	public void shouldNotSpawnNewStackIfNotConflict() throws Exception {
		GLRParser parser = initParser();
		List<ParserState> states = (List<ParserState>) ReflectionTestUtils
				.getField(parser, "states");

		parser.handleConflictsIfAny(null, null);
		Assert.assertEquals(1, states.size());
	}

	@Test
	public void shouldSpawnNewStacksButThrowAwayOldOnConflict()
			throws Exception {
		final GLRParser parser = initParser();
		List<ParserState> states = (List<ParserState>) ReflectionTestUtils
				.getField(parser, "states");
		Action a = mockAction(parser, 53);

		ConflictActionReturn ret = new ConflictActionReturn(
				Collections.singleton(a));

		parser.handleConflictsIfAny(null, ret);
		Assert.assertEquals(1, states.size());
	}

	@Test
	public void shouldSpawnNewStacksButThrowAwaySimilar() throws Exception {
		final GLRParser parser = initParser();
		List<ParserState> states = (List<ParserState>) ReflectionTestUtils
				.getField(parser, "states");
		Action a = mockAction(parser, 53);
		Action a2 = mockAction(parser, 53);
		Action a3 = mockAction(parser, 53);

		ConflictActionReturn ret = new ConflictActionReturn(
				new HashSet<Action>(Arrays.asList(a, a2, a3)));

		parser.handleConflictsIfAny(null, ret);
		Assert.assertEquals(1, states.size());
	}

	@Test
	public void shouldSpawnNewStacksAndKeepThemIfNotSimilar() throws Exception {
		final GLRParser parser = initParser();
		List<ParserState> states = (List<ParserState>) ReflectionTestUtils
				.getField(parser, "states");
		Action a = mockAction(parser, 53);
		Action a2 = mockAction(parser, 52);
		Action a3 = mockAction(parser, 51);

		ConflictActionReturn ret = new ConflictActionReturn(
				new HashSet<Action>(Arrays.asList(a, a2, a3)));

		parser.handleConflictsIfAny(null, ret);
		Assert.assertEquals(3, states.size());
	}

	@Test
	public void shouldHandleRecursiveConflicts() throws Exception {
		final GLRParser parser = initParser();
		List<ParserState> states = (List<ParserState>) ReflectionTestUtils
				.getField(parser, "states");
		
		Action ra = mockAction(parser, 43);
		Action ra2 = mockAction(parser, 42);
		Action ra3 = mockAction(parser, 41);
		ConflictActionReturn rec = new ConflictActionReturn(
				new HashSet<Action>(Arrays.asList(ra, ra2, ra3)));
		
		Action a = mockAction(parser, 53);
		Action a2 = mockAction(parser, 52, rec);
		Action a3 = mockAction(parser, 51);

		ConflictActionReturn ret = new ConflictActionReturn(
				new HashSet<Action>(Arrays.asList(a, a2, a3)));
	

		parser.handleConflictsIfAny(null, ret);
		Assert.assertEquals(6, states.size());
	}
	
	@Test
	public void shouldInitiallySaveStateOnListenerSet() throws Exception
	{
		final GLRParser parser = initParser();
		LinkedList<ParserState> states = (LinkedList<ParserState>) ReflectionTestUtils
				.getField(parser, "states");
		
		GLRBranchSpawnedListener l = EasyMock.createMock(GLRBranchSpawnedListener.class);
		String ext = new String("aaaa");
		EasyMock.expect(l.onBranchSpawned()).andReturn(ext);
		EasyMock.replay(l);
		
		parser.setBranchSpawnedListener(l);
		
		ParserState state = states.getLast();
		Assert.assertEquals(ext, state.getExternal());
	}

	private Action mockAction(final GLRParser parser, final int val) {
		return mockAction(parser, val, null);
	}

	private Action mockAction(final GLRParser parser, final int val,
			final ActionReturn result) {
		Action a = EasyMock.createMock(Action.class);
		EasyMock.expect(a.doPerform(parser, null)).andAnswer(
				new IAnswer<ActionReturn>() {
					@Override
					public ActionReturn answer() throws Throwable {
						IntArrayList stateStack = (IntArrayList) ReflectionTestUtils
								.getField(parser, "stateStack");
						stateStack.add(val);
						return result;
					}
				});
		EasyMock.replay(a);
		return a;
	}

	private GLRParser initParser() {
		IMocksControl ctrl = EasyMock.createControl();
		ParserTable table = ctrl.createMock(ParserTable.class);
		Map map = new HashMap();
		map.put(this, 0);
		EasyMock.expect(table.getStartMap()).andReturn(map);
		ParserListener listener = ctrl.createMock(ParserListener.class);
		ParserErrorRecoveryPolicy policy = ctrl
				.createMock(ParserErrorRecoveryPolicy.class);
		Object start = this;
		Object version = this;
		LookaheadMap lookaheadMap = ctrl.createMock(LookaheadMap.class);
		ctrl.replay();

		GLRParser parser = new GLRParser(table, listener, policy, start,
				version, lookaheadMap);
		return parser;
	}
}
