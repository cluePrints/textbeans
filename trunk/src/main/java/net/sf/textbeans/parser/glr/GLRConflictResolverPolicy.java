package net.sf.textbeans.parser.glr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import net.sf.textbeans.util.ActionEntryComparator;
import net.sf.textbeans.util.ObjectIdComparator;
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
			List<ActionEntry<A>> actionsList = new ArrayList<ActionEntry<A>>(actions);
			// TODO: asc/desc really matters, why?
			// probably something todo with ConflictResolveAction
			Collections.sort(actionsList, ActionEntryComparator.ACTION_ID_DESC);
			
			// TODO: seems A will be one of interfaces which LRConflictResolveActionDecl implements
			// though requires attention
			return (A) new LRConflictResolveActionDecl(type, actionFactory, actionsList, node, terminal, eof);
		}
	}	
}
