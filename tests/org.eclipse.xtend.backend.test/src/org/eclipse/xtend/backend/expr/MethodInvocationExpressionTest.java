/*
Copyright (c) 2009 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.backend.expr;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Assert;

import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.testhelpers.BackendTestHelper;
import org.eclipse.xtend.backend.testhelpers.SomeTestFunctions;
import org.junit.Before;
import org.junit.Test;

public class MethodInvocationExpressionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMethodInvocation () {
		Class<?> cls;
		try {
			cls = Thread.currentThread().getContextClassLoader().loadClass(SomeTestFunctions.class.getName());
			Method mtd = cls.getMethod("sayHello");
			MethodInvocationExpression expr = new MethodInvocationExpression(mtd, new ArrayList<ExpressionBase>(), false, null);
			Object o = expr.evaluate (BackendTestHelper.createEmptyExecutionContext());
			Assert.assertEquals("Hello", o);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testMethodInvocationWithParam () {
		Class<?> cls;
		try {
			cls = Thread.currentThread().getContextClassLoader().loadClass(SomeTestFunctions.class.getName());
			Method mtd = cls.getMethod("sayHello", String.class);
			MethodInvocationExpression expr = new MethodInvocationExpression(mtd, Arrays.asList (new LiteralExpression ("Andre", null)), false, null);
			Object o = expr.evaluate (BackendTestHelper.createEmptyExecutionContext());
			Assert.assertEquals("Hello Andre", o);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testMethodInvocationWithIntParam () {
		Class<?> cls;
		try {
			cls = Thread.currentThread().getContextClassLoader().loadClass(SomeTestFunctions.class.getName());
			Method mtd = cls.getMethod("calc", Integer.TYPE);
			MethodInvocationExpression expr = new MethodInvocationExpression(mtd, Arrays.asList (new LiteralExpression (1, null)), false, null);
			Object o = expr.evaluate (BackendTestHelper.createEmptyExecutionContext());
			Assert.assertEquals(2L, o);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
