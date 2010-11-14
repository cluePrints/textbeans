package net.sf.textbeans.binding;

import java.io.FileReader;

import net.sf.textbeans.parser.SimpleParser;
import net.sf.textbeans.parser.TatooTest;
import net.sf.textbeans.util.Const;

import org.junit.Assert;
import org.junit.Test;

public class TypeGenerationTest {
	@Test
	public void shouldFillTypeInfo() throws Exception
	{
		SimpleParser p = new SimpleParser();
		p.compile(new FileReader(TatooTest.TEST_DIR + "binding/typeGeneration"+Const.EBNF_EXT));
		TemplateBindingGenerator tbg = new TemplateBindingGenerator(p.getGrammarFactory().getAllProductions(), p.getToolsFactory().getVariableTypeMap());
		Binding b = tbg.createBindingTemplate();
		Assert.assertEquals(1, b.getBindings().size());
		String className = b.getBindings().get(0).getClassName();
		Assert.assertEquals("net.sf.textbeans.TestObj", className);
	}
}
