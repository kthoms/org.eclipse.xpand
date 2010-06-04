/*******************************************************************************
 * Copyright (c) 2010 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.syslib;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.EvaluationVetoException;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExecutionListener;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.expr.DeferredEvalExpression;

/**
 * @author André Arnold - Initial contribution and API
 */
public class DeferredEvalExecutionListener implements ExecutionListener {

	private List<DeferredEvalExpression> _deferredExpressions = new ArrayList<DeferredEvalExpression>();

	public void preExecute(ExecutionContext ctx, ExpressionBase originator) throws EvaluationVetoException {

	}
	
	public void postExecute(Object result, ExecutionContext ctx, ExpressionBase originator) {
		for (DeferredEvalExpression expr : _deferredExpressions) {
			expr.evalDeferred(ctx);
		}

	}
	
	public void registerDeferredEvalExpression (DeferredEvalExpression expr) {
		_deferredExpressions.add(expr);
	}

}
