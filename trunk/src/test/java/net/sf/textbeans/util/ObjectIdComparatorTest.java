package net.sf.textbeans.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

import fr.umlv.tatoo.cc.common.generator.ObjectId;

public class ObjectIdComparatorTest {
	@Test
	public void testSortsAsc()
	{
		ObjectId r0 = EasyMock.createMock(ObjectId.class);
		EasyMock.expect(r0.getId()).andReturn("a");
		EasyMock.replay(r0);
		ObjectId r1 = EasyMock.createMock(ObjectId.class);
		EasyMock.expect(r1.getId()).andReturn("b");
		EasyMock.replay(r1);
		
		List<ObjectId> arr = Arrays.asList(r1, r0);
		Collections.sort(arr, ObjectIdComparator.ASC);
		
		Assert.assertEquals(arr.get(0), r0);
		Assert.assertEquals(arr.get(1), r1);
	}
}
