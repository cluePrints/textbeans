package net.sf.textbeans.parser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

import net.sf.textbeans.binding.TemplateBindingGenerator;
import net.sf.textbeans.binding.io.BindingInfoWriter;
import net.sf.textbeans.binding.io.XStreamBindingInfoWriter;
import net.sf.textbeans.parser.BindingParser;
import net.sf.textbeans.util.Const;
import net.sf.textbeans.util.XMLAssert;

import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.thoughtworks.xstream.XStream;

import fr.umlv.tatoo.cc.common.generator.Type;
import fr.umlv.tatoo.cc.parser.grammar.ProductionDecl;
import fr.umlv.tatoo.cc.parser.grammar.VariableDecl;

public class AbstractBindingIntegrationTest {
	protected String name = "simplerOrder";
	protected TemplateBindingGenerator bGen;
	protected boolean generateTmpBinding = false;
	
	@Test
	public void test() throws Exception
	{
		String dir = TatooTest.TEST_DIR + "parser/";
		String grammarFile = dir + name + Const.EBNF_EXT;
		String rulesFile = dir + name + Const.BINDING_EXT;
		BindingParser p = new BindingParser().compile(new FileReader(grammarFile));
		
		if (generateTmpBinding) {
			TemplateBindingGenerator.generateBindingTemplate(dir+name, p);
		}
		
		if (new File(rulesFile).exists()) {
			p.loadAstRules(new FileReader(rulesFile));
		}
		String dataFile = dir + name + Const.TEST_CASE_EXT;
		p.parse(new FileReader(dataFile));
		
		
		// actually binding check
		XStream xStream = new XStream();
		String actual = xStream.toXML(p.getResult());
		String expected = Files.toString(new File(dir+name+Const.TEST_CASE_RES_EXT), Charsets.UTF_8);
		XMLAssert.assertEquals(expected, actual);
	}
}
