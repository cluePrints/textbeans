package net.sf.textbeans.parser;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import org.junit.Test;

@SuppressWarnings("serial")
public class BindingListenerTest {
	@Test
	public void shouldSupportPathMapAccessExpression()
	{
		
		Map<String, Object> map = new HashMap<String, Object>(){{
			put("a", null);
			put("fee", new HashMap<String,Object>(){{
				put("number", 3);
				put("value", "test");
			}});
			put("zz", "bb");
		}};
		BindingListener l = new BindingListener(null);
		Assert.assertEquals(3, l.lookFor(map, "fee.number"));
	}
	
	@Test
	public void shouldReturnNullOnNotFound()
	{
		Map<String, Object> map = new HashMap<String, Object>(){{
			put("a", null);
			put("fee", new HashMap<String,Object>(){{
				put("number", 3);
				put("value", "test");
			}});
			put("zz", "bb");
		}};
		BindingListener l = new BindingListener(null);
		Assert.assertEquals(null, l.lookFor(map, "fee.john"));
	}
	
	@Test
	public void shouldWorkForUsualTokens()
	{
		Map<String, Object> map = new HashMap<String, Object>(){{
			put("a", null);
			put("fee", new HashMap<String,Object>(){{
				put("number", 3);
				put("value", "test");
			}});
			put("zz", "bb");
		}};
		BindingListener l = new BindingListener(null);
		Assert.assertEquals("bb", l.lookFor(map, "zz"));
	}
}
