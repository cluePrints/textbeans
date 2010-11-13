package net.sf.textbeans.binding;

import java.io.FileReader;

import net.sf.textbeans.parser.ReaderGrammarParser;
import net.sf.textbeans.parser.TatooTest;

import org.junit.Assert;
import org.junit.Test;

public class TypeGenerationTest {
	@Test
	public void shouldFillTypeInfo() throws Exception
	{
		ReaderGrammarParser p = new ReaderGrammarParser();
		p.compile(new FileReader(TatooTest.TEST_DIR + "binding/typeGeneration.ebnf"));
		TemplateBindingGenerator tbg = new TemplateBindingGenerator(p.getGrammarFactory().getAllProductions(), p.getToolsFactory().getVariableTypeMap());
		Binding b = tbg.createBindingTemplate();
		Assert.assertEquals(1, b.getBindings().size());
		String className = b.getBindings().get(0).getClassName();
		Assert.assertEquals("net.sf.textbeans.TestObj", className);
	}
}
