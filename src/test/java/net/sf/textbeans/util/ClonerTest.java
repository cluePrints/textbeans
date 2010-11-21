package net.sf.textbeans.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ClonerTest {
	private Cloner cloner;
	
	@Parameters
	public static Collection<Object[]> params()
	{
		List<Object[]> params = new LinkedList<Object[]>();
		params.add(new Object[]{ new SerializationCloner()});
		params.add(new Object[]{ new XStreamCloner()});
		return params;
	}
	
	@Test
	public void shouldBeNullSafe()
	{
		Assert.assertNull(cloner.clone(null));
	}
	
	@Test
	public void shouldReturnDifferentInstance()
	{
		String initial = new String("aaa");
		String cloned = cloner.clone(initial);
		Assert.assertEquals(initial, cloned);
	}
	
	public ClonerTest(Cloner cloner) {
		super();
		this.cloner = cloner;
	}

}
