package net.sf.textbeans.util;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TypeConvertorTest {
	TypeConvertor unit = new TypeConvertor();
	private Object expected;
	private Class<?> type;
	private Object initial;
	
	@Test
	public void test()
	{
		Object actual = unit.convert(initial, type);
		Assert.assertEquals(expected, actual);
	}
	
	@Parameters
	public static List<Object[]> params()
	{
		return Arrays.asList(
				params("3", 3, Integer.TYPE),
				params("3", 3, Integer.class),
				params("1", BigDecimal.ONE, BigDecimal.class),
				params("aaa", "aaa", String.class));
	}

	
	public TypeConvertorTest(Object initial,
			Object expected, Class<?> type) {
		super();
		this.expected = expected;
		this.type = type;
		this.initial = initial;
	}
	
	private static Object[] params(Object initial,
			Object expected, Class<?> type)
	{
		return new Object[]{initial, expected, type};
	}
	
}
