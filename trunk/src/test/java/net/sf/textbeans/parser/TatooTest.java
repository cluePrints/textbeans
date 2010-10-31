package net.sf.textbeans.parser;

import java.util.Collection;
import java.util.List;

import net.sf.textbeans.parser.GrammarParser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.google.common.collect.Lists;

import fr.umlv.tatoo.cc.parser.grammar.Priority;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;

@RunWith(Parameterized.class)
public class TatooTest {
	private String caseName;

	@Parameters
	public static Collection<Object[]> cases() {
		List<Object[]> cases = Lists.newLinkedList();
		
		cases.add(new Object[] { "adEmailOrder" });
		
		cases.add(new Object[] { "multipleSimpleOrder" });
		cases.add(new Object[] { "simpleOrder" });

		
		cases.add(new Object[] { "simpleEmailOrder" });
		cases.add(new Object[] { "simplerOrder" });
		cases.add(new Object[] { "simpleOrder" });
		cases.add(new Object[] { "simpleOrder2" });
		return cases;
	}

	@Test
	public void test() throws Exception {
		System.out.println("\n\n\n\n =======================\n" + caseName);
		compile(caseName);
	}

	private void compile(String name) throws Exception {
		compile("src/test/java/net/sf/textbeans/tatoo/", name);
	}

	private void compile(String dir, String name) throws Exception {
		GrammarParser p = GrammarParser.compile(dir + name + ".ebnf");
		p.parse(dir + name + ".txt");
	}

	public TatooTest(String caseName) {
		super();
		this.caseName = caseName;
	}

}

class DTOTerminalDecl extends TerminalDecl {
	final CharSequence data;
	final TerminalDecl decl;
	DTOTerminalDecl(CharSequence data, TerminalDecl decl) {
		super(null, null, false);
		this.data = data;
		this.decl = decl;
	}
	public String getId() {
		return decl.getId();
	}
	public Priority getPriority() {
		return decl.getPriority();
	}
	public boolean isBranching() {
		return decl.isBranching();
	}
	public boolean isTerminal() {
		return decl.isTerminal();
	}
	public void setAlias(String alias) {
		decl.setAlias(alias);
	}
	public String getAlias() {
		return decl.getAlias();
	}
	public String getName() {
		return decl.getName();
	}
	public String toString() {
		return decl.toString();
	}
	public int hashCode() {
		return decl.hashCode();
	}
	public boolean equals(Object obj) {
		return decl.equals(obj);
	}	
	
}

