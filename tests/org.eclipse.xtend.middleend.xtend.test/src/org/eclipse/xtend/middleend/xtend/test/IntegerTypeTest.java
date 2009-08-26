package org.eclipse.xtend.middleend.xtend.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Before;
import org.junit.Test;


public class IntegerTypeTest extends JavaXtendTest {
	
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}

	@Test
	public void testLess () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testLess"), Arrays.asList (1, 2));
		assertTrue(result);
	}

	@Test
	public void testGreater () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testGreater"), Arrays.asList (2, 1));
		assertTrue(result);
	}

	@Test
	public void testLessEquals () {
		Boolean result1 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testLessEquals"), Arrays.asList (1, 2));
		assertTrue(result1);
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testLessEquals"), Arrays.asList (2, 2));
		assertTrue(result2);
	}

	@Test
	public void testGreaterEquals () {
		Boolean result1 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testGreaterEquals"), Arrays.asList (2, 1));
		assertTrue(result1);
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testGreaterEquals"), Arrays.asList (2, 2));
		assertTrue(result2);
	}

	@Test
	public void testEquals () {
		Boolean result1 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testEquals"), Arrays.asList (2, 2));
		assertTrue(result1);
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testEquals"), Arrays.asList (1, 2));
		assertFalse(result2);
	}

	@Test
	public void testPlus () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testPlus"), Arrays.asList (1L, 2L));
		assertEquals(3L, result.longValue());
	}

	@Test
	public void testMinus () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testMinus"), Arrays.asList (1L, 2L));
		assertEquals(-1L, result.longValue());
	}

	@Test
	public void testInvert () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testInvert"), Arrays.asList (2L));
		assertEquals(-2L, result.longValue());
	}

	@Test
	public void testMultiply () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testMultiply"), Arrays.asList (4L, 2L));
		assertEquals(8L, result.longValue());
	}

	@Test
	public void testDivide () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testDivide"), Arrays.asList (4L, 2L));
		assertEquals(2L, result.longValue());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testUpto () {
		List<Integer> result = (List<Integer>)BackendFacade.invoke(_ctx, new QualifiedName ("testUpto"), Arrays.asList (1, 5));
		assertEquals(1L, result.get (0).longValue ());
		assertEquals(2L, result.get (1).longValue ());
		assertEquals(3L, result.get (2).longValue ());
		assertEquals(4L, result.get (3).longValue ());
		assertEquals(5L, result.get (4).longValue ());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testUptoInc () {
		List<Integer> result = (List<Integer>)BackendFacade.invoke(_ctx, new QualifiedName ("testUpto"), Arrays.asList (1L, 5L, 2L));
		assertEquals(1L, result.get (0).longValue ());
		assertEquals(3L, result.get (1).longValue ());
		assertEquals(5L, result.get (2).longValue ());
	}

}
