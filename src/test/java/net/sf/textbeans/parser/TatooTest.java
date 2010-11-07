package net.sf.textbeans.parser;

import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.collect.Lists;

@RunWith(Parameterized.class)
public class TatooTest {
	public static final String TEST_DIR = "src/test/resources/net/sf/textbeans/parser/";
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
		return cases;
	}

	@Test
	public void test() throws Exception {
		System.out.println("\n\n\n\n =======================\n" + caseName);
		compile(caseName);
	}

	private void compile(String name) throws Exception {
		compile(TEST_DIR, name);
	}

	void compile(String dir, String name) throws Exception {
		String grammarFile = dir + name + ".ebnf";
		GrammarParser p = new GrammarParser().compile(grammarFile);
		String dataFile = dir + name + ".txt";
		p.parse(dataFile);
	}

	public TatooTest(String caseName) {
		super();
		this.caseName = caseName;
	}

}