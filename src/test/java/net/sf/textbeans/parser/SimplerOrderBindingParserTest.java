package net.sf.textbeans.parser;

import java.io.File;

import net.sf.textbeans.parser.testobj.TSimplerOrder_Batch;

import org.junit.Assert;
import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.thoughtworks.xstream.XStream;

public class SimplerOrderBindingParserTest {
	@Test
	public void test() throws Exception
	{
		String dir = TatooTest.TEST_DIR;
		String name = "simplerOrder";
		String grammarFile = dir + name + ".ebnf";
		String rulesFile = dir + name + ".xml";
		TextBindingParser p = new TextBindingParser().compile(grammarFile);
		if (new File(rulesFile).exists()) {
			p.loadAstRules(rulesFile);
		}		
		String dataFile = dir + name + ".txt";
		p.parse(dataFile);
		Assert.assertTrue(p.getResult() instanceof TSimplerOrder_Batch);
		
		
		// actually binding check
		XStream xStream = new XStream();
		String actual = xStream.toXML(p.getResult());
		String expected = Files.toString(new File(dir+name+".xml.res"), Charsets.UTF_8);
		Assert.assertEquals("Actual: "+actual, expected, actual);
	}
}
