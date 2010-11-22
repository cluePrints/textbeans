package net.sf.textbeans.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Assert;
import org.junit.Test;

import fr.umlv.tatoo.cc.parser.parser.ActionDecl;
import fr.umlv.tatoo.cc.parser.table.ConflictResolverPolicy.ActionEntry;

@SuppressWarnings({"unchecked", "rawtypes"})
public class ActionEntryComparatorTest {
	@Test
	public void testSortsAsc()
	{
		ActionEntry<?> a0 = mock("a");
		ActionEntry<?> a1 = mock("b");
		
		List<ActionEntry<?>> arr = Arrays.asList(a1, a0);
		Collections.sort(arr, ActionEntryComparator.ACTION_ID_ASC);
		
		Assert.assertEquals(arr.get(0), a0);
		Assert.assertEquals(arr.get(1), a1);
	}

	private ActionEntry<?> mock(String name) {
		ActionDecl a0 = EasyMock.createMock(ActionDecl.class);
		EasyMock.expect(a0.getId()).andReturn(name);
		EasyMock.replay(a0);
		ActionEntry ae = EasyMock.createMock(ActionEntry.class);
		EasyMock.expect(ae.getAction()).andReturn(a0);
		EasyMock.replay(ae);
		return ae;
	}
}
