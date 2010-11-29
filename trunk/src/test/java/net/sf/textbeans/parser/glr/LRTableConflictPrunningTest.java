package net.sf.textbeans.parser.glr;

import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;
import net.sf.textbeans.binding.Binding;
import net.sf.textbeans.binding.TemplateBindingGenerator;
import net.sf.textbeans.parser.BindingFacade;
import net.sf.textbeans.parser.BindingParser;
import net.sf.textbeans.parser.SimpleParser;
import net.sf.textbeans.parser.TatooTest;
import net.sf.textbeans.parser.testobj.TLRTableConflictDisambiguation_Order;
import net.sf.textbeans.util.Const;
import net.sf.textbeans.util.Pair;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

import com.google.common.collect.LinkedListMultimap;

@SuppressWarnings({"rawtypes", "unchecked"})
public class LRTableConflictPrunningTest{
	final String name = "LRTableConflictPrunning";
	final String dir = TatooTest.TEST_DIR+"/parser/glr/";
	private Binding binding;
	
	@Test
	public void shouldReturnProperResult() throws Exception
	{
		String grammarFile = dir + name + Const.EBNF_EXT;
		String rulesFile = dir + name + Const.BINDING_EXT;
		BindingParser p = new BindingParser().compile(new FileReader(
				grammarFile));
		if (new File(rulesFile).exists()) {
			binding = p.loadAstRules(new FileReader(rulesFile));
		}
		p.setHook(new ObjectChangeHook() {
			
			@Override
			public void onObjectChanged(Object obj) {
				if (obj instanceof TLRTableConflictDisambiguation_Order) {
					Integer id = ((TLRTableConflictDisambiguation_Order) obj).getId();
					if (id == null || id != 234) {
						throw new DeadBranchException();
					}
				}
			}
		});
		String dataFile = dir + name + Const.TEST_CASE_EXT;
		
		p.parse(new FileReader(dataFile));		

		LinkedList<TLRTableConflictDisambiguation_Order> result = (LinkedList<TLRTableConflictDisambiguation_Order>) p.getResult();
		TLRTableConflictDisambiguation_Order order = result.get(0);
		Assert.assertEquals(1, result.size());
		Assert.assertEquals(Integer.valueOf(234), order.getId());
		Assert.assertEquals(Integer.valueOf(50000), order.getPrice());
	}
	
	private void assertContains(BindingParser p, List<String>... strs) 
	{
		LinkedList<ParserState> states = getStateStacks(p);
		BindingFacade f = new BindingFacade();
		LinkedList boundStuff = new LinkedList();
		for (ParserState state : states) {
			LinkedList<net.sf.textbeans.util.Pair<String, ? extends Object>> parsingBranchExternal = (LinkedList<net.sf.textbeans.util.Pair<String, ? extends Object>>) state.getExternal();
			boundStuff.add(f.lookForResultCandidate(parsingBranchExternal, binding));
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
