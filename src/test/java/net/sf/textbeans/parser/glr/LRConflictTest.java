package net.sf.textbeans.parser.glr;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;
import net.sf.textbeans.parser.BindingParser;
import net.sf.textbeans.parser.SimpleParser;
import net.sf.textbeans.parser.TatooTest;
import net.sf.textbeans.util.Const;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

@SuppressWarnings({"rawtypes", "unchecked"})
public class LRConflictTest{
	final String name = "LRTableConflict";
	final String dir = TatooTest.TEST_DIR+"/parser/";
	
	@Test
	public void shouldFollowParsingBranches() throws Exception
	{
		String grammarFile = dir + name + Const.EBNF_EXT;
		String rulesFile = dir + name + Const.BINDING_EXT;
		BindingParser p = new BindingParser().compile(new FileReader(
				grammarFile));
		if (new File(rulesFile).exists()) {
			p.loadAstRules(new FileReader(rulesFile));
		}
		String dataFile = dir + name + Const.TEST_CASE_EXT;
		p.parse(new FileReader(dataFile));

		assertContains(p, Arrays.asList("a"), Arrays.asList("a", "a", "a", "a"));
	}
	
	private void assertContains(BindingParser p, List<String>... strs) 
	{
		LinkedList<ParserState> states = getStateStacks(p);

		LinkedList boundStuff = new LinkedList();
		for (ParserState state : states) {
			LinkedList<net.sf.textbeans.util.Pair<String, ? extends Object>> parsingBranchExternal = (LinkedList<net.sf.textbeans.util.Pair<String, ? extends Object>>) state.getExternal();
			boundStuff.add(parsingBranchExternal.get(0).v);
		}
		
		for (List<String> lst : strs) {
			Assert.assertTrue(boundStuff.contains(lst));
		}
	}

	private LinkedList<ParserState> getStateStacks(BindingParser p) {
		SimpleParser sp = (SimpleParser) ReflectionTestUtils.getField(p, "parser");		
		GLRParser g = (GLRParser) ReflectionTestUtils.getField(sp, "dataParser");
		LinkedList<ParserState> states = (LinkedList<ParserState>) ReflectionTestUtils
				.getField(g, "stateStacks");
		return states;
	}
}
