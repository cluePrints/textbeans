package net.sf.textbeans.binding.performance;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import net.sf.textbeans.parser.BindingParser;
import net.sf.textbeans.parser.TatooTest;
import net.sf.textbeans.util.Const;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

public class XStreamXML2JavaComparison {
	private static final String FILE_NAME = TatooTest.TEST_DIR
			+ "/binding/performance/1kStringsList";
	private int stringsNum = 150000;
	private int stringsLength = 100;

	@Before
	public void generateSet() throws Exception {
		List<String> strList = new LinkedList<String>();
		Random r = new Random();
		for (int i = 0; i < stringsNum; i++) {
			StringBuilder s = new StringBuilder();
			for (int j = 0; j < stringsLength; j++) {
				s.append(r.nextInt(9));
			}
			strList.add(s.toString());
		}
		XStream xStream = new XStream();
		xStream.toXML(strList, new FileWriter(FILE_NAME + Const.TEST_CASE_EXT));
		
		BindingParser p = new BindingParser();
		p.compile(new FileReader(FILE_NAME + Const.EBNF_EXT));
	}

	private void logResult(String name, long start) {
		long time = System.currentTimeMillis() - start;
		System.out.println(name+": "+time+"ms spend for "+this.stringsNum+" lines of "+stringsLength+" symbols each");
	}

	@Test
	public void testXStream() throws Exception {
		long start = System.currentTimeMillis();
		XStream xStream = new XStream();
		xStream.fromXML(new FileReader(FILE_NAME + Const.TEST_CASE_EXT));
		logResult("XStream", start);
	}

	@Test
	public void testTattoo() throws Exception {
		long start = System.currentTimeMillis();
		BindingParser p = new BindingParser();
		p.compile(new FileReader(FILE_NAME + Const.EBNF_EXT));
		p.loadAstRules(new FileReader(FILE_NAME+Const.BINDING_EXT));
		p.parse(new FileReader(FILE_NAME + Const.TEST_CASE_EXT));
		
		logResult("Tattoo", start);
	}
	
	@After
	public void cleanUp() throws Exception {
		File f = new File(FILE_NAME+Const.TEST_CASE_EXT);
		f.delete();
	}
}