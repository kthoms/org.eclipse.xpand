package org.eclipse.xtend.middleend.xtend.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Before;
import org.junit.Test;


public class ObjectTest extends JavaXtendTest {
	
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}
	
	public void testMetaType () {
		BackendType result = (BackendType)BackendFacade.invoke(_ctx, new QualifiedName ("testMetaType"), Arrays.asList ("a"));
		assertEquals ("String", result.getName());
	}
	
	@Test
	public void testCompareTo () {
		Long result1 = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testCompareTo"), Arrays.asList ("a", "b"));
		assertEquals (-1L, result1.longValue());
		Long result2 = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testCompareTo"), Arrays.asList ("b", "a"));
		assertEquals (1L, result2.longValue());
		Long result3 = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testCompareTo"), Arrays.asList ("a", "a"));
		assertEquals (0L, result3.longValue());
//		Long result4 = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testCompareTo"), Arrays.asList (null, "a"));
//		assertEquals (-1L, result4.longValue());
		Long result5 = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testCompareTo"), Arrays.asList ("a", null));
		assertEquals (1L, result5.longValue());
//		Long result6 = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testCompareTo"), Arrays.asList (null, null));
//		assertEquals (0L, result6.longValue());
	}
}
