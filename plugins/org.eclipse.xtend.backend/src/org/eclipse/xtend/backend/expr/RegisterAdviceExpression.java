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

import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.common.AdviceContext;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;


//TODO test this

/**
 * This class dynamically registers advice for the scope of the execution of a contained expression.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class RegisterAdviceExpression extends ExpressionBase {
    private final AroundAdvice _advice;
    private final ExpressionBase _inner;

    public RegisterAdviceExpression (ExpressionBase inner, AroundAdvice advice, SourcePos sourcePos) {
        super(sourcePos);
        
        _advice = advice;
        _inner = inner;
    }

    public AroundAdvice getAdvice() {
		return _advice;
	}

	public ExpressionBase getInnerExpression() {
		return _inner;
	}

	@Override
    protected Object evaluateInternal (ExecutionContext ctx) {
        final AdviceContext oldContext = ctx.getAdviceContext();
        
        ctx.setAdviceContext (ctx.getAdviceContext ().copyWithAdvice (_advice));
        try {
            return _inner.evaluate (ctx);
        }
        finally {
            ctx.setAdviceContext (oldContext);
        }
    }
}
