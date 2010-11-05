package net.sf.textbeans.parser;

import fr.umlv.tatoo.cc.parser.grammar.Priority;
import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;

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