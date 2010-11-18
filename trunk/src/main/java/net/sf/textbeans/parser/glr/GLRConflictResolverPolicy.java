package net.sf.textbeans.parser.glr;

import java.util.Set;

import fr.umlv.tatoo.cc.parser.grammar.TerminalDecl;
import fr.umlv.tatoo.cc.parser.parser.ActionDecl;
import fr.umlv.tatoo.cc.parser.parser.ActionDeclFactory;
import fr.umlv.tatoo.cc.parser.table.AbstractConflictDiagnosisReporter;
import fr.umlv.tatoo.cc.parser.table.DefaultConflictResolverPolicy;
import fr.umlv.tatoo.cc.parser.table.NodeDecl;

public class GLRConflictResolverPolicy extends DefaultConflictResolverPolicy {

	@Override
	public <A extends ActionDecl> A priorityAction(Class<A> type,
			AbstractConflictDiagnosisReporter reporter,
			ActionDeclFactory actionFactory, Set<ActionEntry<A>> actions,
			NodeDecl<?> node, TerminalDecl terminal, TerminalDecl eof) {
		// if we have no alternatives, use old policy
		// TODO: sometimes priorities might do the trick as well - consider this case
		if (actions.size() < 2) {
			return super.priorityAction(type, reporter, actionFactory, actions, node, terminal, eof);
		} else {
			// TODO: seems A will be one of interfaces which LRConflictResolveActionDecl implements
			// though requires attention
			return (A) new LRConflictResolveActionDecl(type, actionFactory, actions, node, terminal, eof);
		}
	}	
}
