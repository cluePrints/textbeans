package net.sf.textbeans.parser;

import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;

import net.sf.textbeans.parser.BindingListener;

import org.junit.Test;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;

@SuppressWarnings("serial")
public class BindingListenerTest {
	@Test
	public void shouldSupportPathMapAccessExpression()
	{
		
		ListMultimap<String, Object> map = from(new HashMap<String, Object>(){{
			put("a", null);
			put("fee", from(new HashMap<String,Object>(){{
				put("number", 3);
				put("value", "test");
			}}));
			put("zz", "bb");
		}});
		BindingListener l = new BindingListener(null);
		Assert.assertEquals(3, l.lookFor(map, "fee.number"));
	}
	
	private ListMultimap<String, Object> from(Map<String, Object> map)
	{
		ListMultimap<String, Object> mmap = LinkedListMultimap.create();
		for (Map.Entry<String, Object> e : map.entrySet()) {
			mmap.put(e.getKey(), e.getValue());
		}
		return mmap;
	}
	
	@Test
	public void shouldReturnNotFoundObjOnNotFound()
	{
		ListMultimap<String, Object> map = from(new HashMap<String, Object>(){{
			put("a", null);
			put("fee", from(new HashMap<String,Object>(){{
				put("number", 3);
				put("value", "test");
			}}));
			put("zz", "bb");
		}});
		BindingListener l = new BindingListener(null);
		Assert.assertEquals(BindingListener.NOT_FOUND, l.lookFor(map, "fee.john"));
	}
	
	@Test
	public void shouldIterateLists() 
	{
		ListMultimap<String, Object> map = LinkedListMultimap.create();
		map.put("fee", "first");
		map.put("fee", "second");
		BindingListener l = new BindingListener(null);
		Assert.assertEquals("second", l.lookFor(map, "fee.1"));
	}
	
	@Test
	public void shouldWorkForUsualTokens()
	{
		ListMultimap<String, Object> map = from(new HashMap<String, Object>(){{
			put("a", null);
			put("fee", from(new HashMap<String,Object>(){{
				put("number", 3);
				put("value", "test");
			}}));
			put("zz", "bb");
		}});
		BindingListener l = new BindingListener(null);
		Assert.assertEquals("bb", l.lookFor(map, "zz"));
	}
}
