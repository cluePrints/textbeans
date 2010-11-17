package net.sf.textbeans.parser;

import java.io.FileReader;
import java.util.Collection;
import java.util.List;

import net.sf.textbeans.util.Const;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.collect.Lists;

/**
 * Just test to ensure that Tattoo is able to parse certain things.
 * No errors -> test passed. Inspired by previous not luck attempts with other parsers.
 */
@RunWith(Parameterized.class)
public class TatooTest {
	public static final String TEST_DIR = "src/test/resources/net/sf/textbeans/";
	private String caseName;

	@Parameters
	public static Collection<Object[]> cases() {
		List<Object[]> cases = Lists.newLinkedList();
		
		cases.add(new Object[] { "singleTokenToMultiFields" });
		cases.add(new Object[] { "adEmailOrder" });		
		cases.add(new Object[] { "multipleSimpleOrder" });
		cases.add(new Object[] { "simpleEmailOrder" });
		cases.add(new Object[] { "simplerOrder" });
		cases.add(new Object[] { "simpleOrder2" });
		cases.add(new Object[] { "LRTableConflict" });
		return cases;
	}

	@Test
	public void test() throws Exception {
		System.out.println("\n\n\n\n =======================\n" + caseName);
		compile(caseName);
	}

	private void compile(String name) throws Exception {
		compile(TEST_DIR+"/parser/", name);
	}

	void compile(String dir, String name) throws Exception {
		String grammarFile = dir + name + Const.EBNF_EXT;
		SimpleParser p = new SimpleParser().compile(new FileReader(grammarFile));
		String dataFile = dir + name + Const.TEST_CASE_EXT;
		p.parse(new FileReader(dataFile));
	}

	public TatooTest(String caseName) {
		super();
		this.caseName = caseName;
	}

}