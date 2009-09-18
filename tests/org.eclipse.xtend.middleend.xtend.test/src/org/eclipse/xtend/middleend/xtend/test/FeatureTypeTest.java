package org.eclipse.xtend.middleend.xtend.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.LinkedList;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionException;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.java.internal.JavaBeansType;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Before;
import org.junit.Test;


public class FeatureTypeTest extends JavaXtendTest {

	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}
	
	@Test
	public void testName () {
		String result1 = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testOperationName"), Arrays.asList (_person));
		assertEquals("call", result1);
		String result2 = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testPropertyName"), Arrays.asList (_person));
		assertEquals("firstName", result2);

	}
	
	@SuppressWarnings("restriction")
	@Test
	public void testFeatureReturnType () {
		Object result1 = BackendFacade.invoke(_ctx, new QualifiedName ("testOperationReturnType"), Arrays.asList(_person));
		assertTrue (result1 instanceof JavaBeansType);
		assertEquals("java::lang::String", ((JavaBeansType)result1).getName());
		try {
			Object result2 = BackendFacade.invoke(_ctx, new QualifiedName(
					"testPropertyReturnType"), Arrays.asList(_person));
			fail ("Expected an UnsupportedOperationException but yielded returnType " + result2);
		} catch (ExecutionException e) {
			assertTrue (true);
		}
		try {
			Object result3 = BackendFacade.invoke(_ctx, new QualifiedName ("testFeatureReturnType"), Arrays.asList(_person, new LinkedList<BackendType>()));
		} catch (ExecutionException e) {
			assertTrue (true);
		}
	}
	
	@Test
	public void testFeatureOwner () {
		Object result1 = BackendFacade.invoke(_ctx, new QualifiedName ("testOperationOwner"), Arrays.asList(_person));
		assertTrue (result1 instanceof JavaBeansType);
		assertEquals("org::eclipse::xtend::middleend::xtend::test::Person", ((JavaBeansType)result1).getName());
		Object result2 = BackendFacade.invoke(_ctx, new QualifiedName ("testPropertyOwner"), Arrays.asList(_person));
		assertTrue (result2 instanceof JavaBeansType);
		Object result3 = BackendFacade.invoke(_ctx, new QualifiedName ("testFeatureOwner"), Arrays.asList(_person, new LinkedList<BackendType>()));
		assertTrue (result3 instanceof JavaBeansType);
	}
}
