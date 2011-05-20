/*******************************************************************************
 * Copyright (c) 2010 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.expr;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.SOURCE_POS;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createLiteral;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createLocalVar;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.EvaluationVetoException;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExecutionListener;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.FutureResultHolder;
import org.eclipse.xtend.backend.common.FutureResultNotReadyException;
import org.junit.Test;
/**
 * @author André Arnold - Initial contribution and API
 */
public class DeferredEvalExpressionTest {

	class ResultExtractorListener implements ExecutionListener {
		
		private Object intermediateResult;

		public Object getIntermediateResult() {
			return intermediateResult;
		}

		public void preExecute(ExecutionContext ctx, ExpressionBase originator) throws EvaluationVetoException {
			// TODO Auto-generated method stub
			
		}

		public void postExecute(Object result, ExecutionContext ctx, ExpressionBase originator) {
			intermediateResult = result;			
		}
		
		
	}
	
	@Test
	public void testDeferredEvaluation () {
		
		ExecutionContext ctx = createEmptyExecutionContext();
		ExpressionBase part1 = createLiteral ("First");
        
 		DeferredEvalExpression part2 = new DeferredEvalExpression (createLocalVar ("deferredVar"), null);
		
        final ExpressionBase expr = new NewLocalVarDefExpression ("deferredVar", createLiteral("bValue"), part2, SOURCE_POS);
		ExpressionBase part3 = createLiteral ("Last");

		List<ExpressionBase> parts = new ArrayList<ExpressionBase> ();
		parts.add (part1);
		ResultExtractorListener listener = new ResultExtractorListener();
		part2.registerExecutionListener (listener);
		parts.add (part2);
		parts.add (part3);
		
		ExpressionBase parentExpr = new ConcatExpression(parts, null);
		ctx.getLocalVarContext().getLocalVars().get("deferredVar");
		Object preDefEvalResult = null;
		try {
			preDefEvalResult = parentExpr.evaluate(ctx);
			preDefEvalResult.toString();
			fail();
		} catch (FutureResultNotReadyException e) {
			assertTrue (true);
		}
		
		ctx.getLocalVarContext().getLocalVars().put ("deferredVar", "Deferred");
		FutureResultHolder future = (FutureResultHolder) listener.getIntermediateResult();
		Object o = future.evaluate(ctx);
		assertEquals("FirstDeferredLast", preDefEvalResult.toString());
	}
	
	

}
