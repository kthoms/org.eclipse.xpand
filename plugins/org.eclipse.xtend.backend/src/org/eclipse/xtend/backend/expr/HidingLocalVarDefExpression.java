/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.expr;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.common.StacktraceEntry;


//TODO refactor: middle ends only use this, and a subsequent step differentiates / optimizes to NewLocalVarExpression


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class HidingLocalVarDefExpression extends ExpressionBase {
    private final String _localVarName;
    private final ExpressionBase _defExpression;
    private final ExpressionBase _inner;

    public HidingLocalVarDefExpression (String localVarName, ExpressionBase defExpression, ExpressionBase inner, SourcePos sourcePos) {
        super (sourcePos);
        _localVarName = localVarName;
        _defExpression = defExpression;
        _inner = inner;
    }
    
    public String getLocalVarName() {
		return _localVarName;
	}

	public ExpressionBase getDefExpression() {
		return _defExpression;
	}

	public ExpressionBase getInnerExpression() {
		return _inner;
	}

	@Override
    protected Object evaluateInternal(ExecutionContext ctx) {
        final Object oldValue = ctx.getLocalVarContext().getLocalVars().get(_localVarName);
        ctx.getLocalVarContext().getLocalVars().put (_localVarName, _defExpression.evaluate(ctx));

        if (ctx.isLogStacktrace())
            ctx.getStacktrace().add (new StacktraceEntry (getPos(), ctx));

        try {
            return _inner.evaluate(ctx);
        }
        finally {
            ctx.getStacktrace ().remove (ctx.getStacktrace().size() - 1);
            ctx.getLocalVarContext().getLocalVars().put(_localVarName, oldValue);
        }
    }
}
