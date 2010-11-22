package net.sf.textbeans.util;

import java.util.Comparator;

import fr.umlv.tatoo.cc.parser.table.ConflictResolverPolicy.ActionEntry;

public final class ActionEntryComparator{
	public static final Comparator<ActionEntry<?>> ACTION_ID_ASC = new Comparator<ActionEntry<?>>(){
		@Override
		public int compare(ActionEntry<?> o1, ActionEntry<?> o2) {
			return ObjectIdComparator.ASC.compare(o1.getAction(), o2.getAction());
		}	
	};
	public static final Comparator<ActionEntry<?>> ACTION_ID_DESC = new Comparator<ActionEntry<?>>(){
		@Override
		public int compare(ActionEntry<?> o1, ActionEntry<?> o2) {
			return -ACTION_ID_ASC.compare(o1, o2);
		}
	};
	
	private ActionEntryComparator() {};
}
