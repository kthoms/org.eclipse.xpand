/*******************************************************************************
 * Copyright (c) 2010 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.expr;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createLiteral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.FutureResultNotReadyException;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.syslib.CollectionOperations;
import org.eclipse.xtend.backend.syslib.DeferredEvalExecutionListener;
import org.eclipse.xtend.backend.syslib.SysLibNames;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * @author André Arnold - Initial contribution and API
 */
public class DeferredEvalExpressionTest {
	
	@Test
	public void testWithDeferredEvalExpressionListener () {
		
		ExecutionContext ctx = createEmptyExecutionContext();
		ExpressionBase part1 = createLiteral ("First");
		
		DeferredEvalExpression part2 = new DeferredEvalExpression (createLiteral("Deferred"), null);
		ExpressionBase part3 = createLiteral ("Last");

		List<ExpressionBase> parts = new ArrayList<ExpressionBase> ();
		parts.add (part1);
		parts.add (part2);
		parts.add (part3);
		
		DeferredEvalExecutionListener listener = new DeferredEvalExecutionListener();
		listener.registerDeferredEvalExpression(part2);
		ExpressionBase parentExpr = new ConcatExpression(parts, null);
		
		try {
			Object preDefEvalResult = parentExpr.evaluate(ctx);
			preDefEvalResult.toString();
			fail();
		} catch (FutureResultNotReadyException e) {
			assertTrue(true);
		}
		
		parentExpr.registerExecutionListener(listener);
		
		Object postDefEvalResult = parentExpr.evaluate(ctx);
		assertEquals("FirstDeferredLast", postDefEvalResult.toString());
	}

}
