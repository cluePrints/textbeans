package net.sf.textbeans.parser.glr;

import java.util.Collections;
import java.util.Set;

import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.cc.parser.grammar.VersionDecl;
import fr.umlv.tatoo.cc.parser.parser.ActionDecl;
import fr.umlv.tatoo.cc.parser.parser.ActionDeclFactory;
import fr.umlv.tatoo.cc.parser.parser.ActionDeclVisitor;
import fr.umlv.tatoo.cc.parser.parser.BranchTableActionDecl;
import fr.umlv.tatoo.cc.parser.parser.RegularTableActionDecl;
import fr.umlv.tatoo.cc.parser.parser.SimpleActionDeclVisitor;
import fr.umlv.tatoo.cc.parser.parser.VersionedActionDecl;
import fr.umlv.tatoo.cc.parser.table.ConflictResolverPolicy.ActionEntry;
import fr.umlv.tatoo.cc.parser.table.NodeDecl;

public class LRConflictResolveActionDecl extends VersionedActionDecl implements BranchTableActionDecl, RegularTableActionDecl {
	Class<?> type;
	ActionDeclFactory actionFactory;
	Set<? extends ActionEntry<?>> actions;
	NodeDecl<?> node;
	TerminalDecl terminal;
	public Class<?> getType() {
		return type;
	}

	public void setType(Class<?> type) {
		this.type = type;
	}

	public ActionDeclFactory getActionFactory() {
		return actionFactory;
	}

	public void setActionFactory(ActionDeclFactory actionFactory) {
		this.actionFactory = actionFactory;
	}

	public Set<? extends ActionEntry<?>> getActions() {
		return actions;
	}

	public void setActions(Set<? extends ActionEntry<?>> actions) {
		this.actions = actions;
	}

	public NodeDecl<?> getNode() {
		return node;
	}

	public void setNode(NodeDecl<?> node) {
		this.node = node;
	}

	public TerminalDecl getTerminal() {
		return terminal;
	}

	public void setTerminal(TerminalDecl terminal) {
		this.terminal = terminal;
	}

	public TerminalDecl getEof() {
		return eof;
	}

	public void setEof(TerminalDecl eof) {
		this.eof = eof;
	}



	TerminalDecl eof;

	@Override
	public boolean isError() {
		return false;
	}
	
	@Override
	public String getId() {
		return "Blablabla";
	}

	@Override
	public boolean isReduce() {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public <R, P> R accept(ActionDeclVisitor<? extends R, ? super P> visitor,
			P parameter) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <R> R accept(SimpleActionDeclVisitor<? extends R> visitor) {
		return visitor.visit(this);
	}



	public LRConflictResolveActionDecl(Class<?> type,
			ActionDeclFactory actionFactory,
			Set<? extends ActionEntry<?>> actions, NodeDecl<?> node,
			TerminalDecl terminal, TerminalDecl eof) {
		super(actions.hashCode(), Collections.<VersionDecl, ActionDecl>emptyMap());
		this.type = type;
		this.actionFactory = actionFactory;
		this.actions = actions;
		this.node = node;
		this.terminal = terminal;
		this.eof = eof;
	}

}
