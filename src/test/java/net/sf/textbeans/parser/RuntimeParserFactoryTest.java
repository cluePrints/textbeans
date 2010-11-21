package net.sf.textbeans.parser;

import java.util.HashMap;
import java.util.HashSet;

import net.sf.textbeans.parser.glr.LRConflictResolveAction;
import net.sf.textbeans.parser.glr.LRConflictResolveActionDecl;

import org.junit.Assert;
import org.junit.Test;

import fr.umlv.tatoo.runtime.parser.Action;

@SuppressWarnings({"rawtypes", "unchecked"})
public class RuntimeParserFactoryTest {
	@Test
	public void shouldRuntimizeConflictDecl()
	{
		
		Action a = RuntimeParserFactory.runtimize(new HashMap(), new LRConflictResolveActionDecl(null, null, new HashSet(), null, null, null));
		Assert.assertTrue(a instanceof LRConflictResolveAction);
	}
}
