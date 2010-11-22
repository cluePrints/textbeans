package net.sf.textbeans.util;

import java.util.Comparator;

import fr.umlv.tatoo.cc.common.generator.ObjectId;

public final class ObjectIdComparator implements Comparator<ObjectId>{
	public static final ObjectIdComparator ASC = new ObjectIdComparator();
	
	@Override
	public int compare(ObjectId o1, ObjectId o2) {
		return o1.getId().compareTo(o2.getId());
	}
	
	private ObjectIdComparator() {};
}
