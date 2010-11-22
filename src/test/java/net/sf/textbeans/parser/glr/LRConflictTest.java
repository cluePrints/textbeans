package net.sf.textbeans.parser.glr;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.LinkedList;

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

		Assert.assertEquals(Arrays.asList("a"), getRes(p, 0));
		Assert.assertEquals(Arrays.asList("a", "a", "a", "a"), getRes(p, 1));
	}

	private LinkedList getRes(BindingParser p, int i) {
		SimpleParser sp = (SimpleParser) ReflectionTestUtils.getField(p, "parser");		
		GLRParser g = (GLRParser) ReflectionTestUtils.getField(sp, "dataParser");
		LinkedList<ParserState> states = (LinkedList<ParserState>) ReflectionTestUtils
				.getField(g, "stateStacks");
		
		ParserState parsingBranch = (ParserState) states.get(i);
		LinkedList<net.sf.textbeans.util.Pair<String, ? extends Object>> parsingBranchExternal = (LinkedList<net.sf.textbeans.util.Pair<String, ? extends Object>>) parsingBranch.getExternal();
		LinkedList res = ((LinkedList) parsingBranchExternal.get(0).v);
		return res;
	}
}
