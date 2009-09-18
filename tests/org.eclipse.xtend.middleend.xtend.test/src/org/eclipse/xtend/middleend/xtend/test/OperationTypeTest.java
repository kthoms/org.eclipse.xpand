package org.eclipse.xtend.middleend.xtend.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.builtin.StringType;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Before;
import org.junit.Test;


public class OperationTypeTest extends JavaXtendTest {

	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGetParameterTypes () {
		List<BackendType> result = (List<BackendType>)BackendFacade.invoke(_ctx, new QualifiedName ("testGetParameterTypes"), Arrays.asList (_person));
		assertEquals(1L, result.size());
		assertEquals("String", result.get(0).getName());
	}

	@Test
	public void testEvaluate () {
		String result = (String)BackendFacade.invoke(_ctx, new QualifiedName ("testEvaluate"), Arrays.asList (_person));
		assertEquals("called:call", result);
	}
}
