package org.eclipse.xtend.middleend.xtend.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Before;
import org.junit.Test;


public class RealTypeTest extends JavaXtendTest {
	
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}

	@Test
	public void testLess () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testLess"), Arrays.asList (1.0, 2.0));
		assertTrue(result);
	}

	@Test
	public void testGreater () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testGreater"), Arrays.asList (2.0, 1.0));
		assertTrue(result);
	}

	@Test
	public void testLessEquals () {
		Boolean result1 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testLessEquals"), Arrays.asList (1.0, 2.0));
		assertTrue(result1);
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testLessEquals"), Arrays.asList (2.0, 2.0));
		assertTrue(result2);
	}

	@Test
	public void testGreaterEquals () {
		Boolean result1 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testGreaterEquals"), Arrays.asList (2.0, 1.0));
		assertTrue(result1);
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testGreaterEquals"), Arrays.asList (2.0, 2.0));
		assertTrue(result2);
	}

	@Test
	public void testEquals () {
		Boolean result1 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testEquals"), Arrays.asList (2.0, 2.0));
		assertTrue(result1);
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testEquals"), Arrays.asList (1.0, 2.0));
		assertFalse(result2);
	}

	@Test
	public void testPlus () {
		Double result = (Double)BackendFacade.invoke(_ctx, new QualifiedName ("testPlus"), Arrays.asList (1.0, 2.0));
		assertEquals(3L, result.doubleValue(), 0.01);
	}

	@Test
	public void testMinus () {
		Double result = (Double)BackendFacade.invoke(_ctx, new QualifiedName ("testMinus"), Arrays.asList (1.0, 2.0));
		assertEquals(-1.0, result.doubleValue(), 0.01);
	}

	@Test
	public void testInvert () {
		Double result = (Double)BackendFacade.invoke(_ctx, new QualifiedName ("testInvert"), Arrays.asList (2.0));
		assertEquals(-2.0, result.doubleValue(), 0.01);
	}

	@Test
	public void testMultiply () {
		Double result = (Double)BackendFacade.invoke(_ctx, new QualifiedName ("testMultiply"), Arrays.asList (4.0, 2.5));
		assertEquals(10.0, result.doubleValue(), 0.01);
	}

	@Test
	public void testDivide () {
		Double result = (Double)BackendFacade.invoke(_ctx, new QualifiedName ("testDivide"), Arrays.asList (4.0, 2.0));
		assertEquals(2.0, result.doubleValue(), 0.01);
	}

//  TODO Add toInteger() method for Real type
//  see https://bugs.eclipse.org/bugs/show_bug.cgi?id=297613
//	@Test
//	public void testToInteger () {
//		Number result = (Number)BackendFacade.invoke(_ctx, new QualifiedName ("testToInteger"), Arrays.asList (4.3));
//		assertEquals(new Long(4), result);
//	}
}
