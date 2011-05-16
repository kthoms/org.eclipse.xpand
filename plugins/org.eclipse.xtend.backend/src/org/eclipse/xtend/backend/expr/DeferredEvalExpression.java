/*******************************************************************************
 * Copyright (c) 2010 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.expr;

import org.eclipse.xtend.backend.common.FutureResultHolder;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;

/**
 * @author André Arnold - Initial contribution and API
 */
public class DeferredEvalExpression extends ExpressionBase {
	
	private ExpressionBase _inner;
	private FutureResultHolder _result;

	public DeferredEvalExpression(ExpressionBase inner, SourcePos sourcePos) {
		super(sourcePos);
		_inner = inner;
	}

	public ExpressionBase getInnerExpr() {
		return _inner;
	}

	@Override
	protected Object evaluateInternal(ExecutionContext ctx) {
		_result = new FutureResultHolder (_inner);
		return _result;
	}
	
	public FutureResultHolder evalDeferred (ExecutionContext ctx) {
		if (_result == null)
			throw new IllegalStateException(getClass().getSimpleName() + ": FutureResultHolder not initialized, evaluateInternal() must be called first.");
		_result.evaluate (ctx);
		return _result;
	}

}
