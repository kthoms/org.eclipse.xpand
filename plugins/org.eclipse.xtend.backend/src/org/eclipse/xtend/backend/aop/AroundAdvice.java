/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
*/
package org.eclipse.xtend.backend.aop;

import org.eclipse.xtend.backend.aop.internal.AdviceScopeCounter;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.SyntaxConstants;


/**
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class AroundAdvice {
    private final ExpressionBase _body;
    private final Pointcut _pointcut;
    private final FunctionDefContext _fdc;
    
    private final boolean _isCacheable;
    
    /**
     * 
     * @param body contains the body of this advice
     * @param pointcut contains the pointcut that guards this advice
     * @param isCacheable This flag marks the advice as "cacheable". This means that the result of its execution
     *         will be cached iff all advice wrapped by it, and the originally wrapped function, 
     *         are cacheable or cached, respectively.
     */
    public AroundAdvice (ExpressionBase body, Pointcut pointcut, boolean isCacheable, FunctionDefContext fdc) {
        _body = body;
        _pointcut = pointcut;
        _isCacheable = isCacheable;
        _fdc = fdc;
    }

    /**
     * actually evaluates the advice, regardless of caching - that is context sensitive and must
     *  be taken care of by callers
     */
    public Object evaluate (ExecutionContext ctx, AdviceScopeCounter scopeCounter, ThisJoinPoint thisJoinPoint, ThisJoinPointStaticPart thisJoinPointStaticPart) {
        scopeCounter.enterAdvice();
        ctx.getLocalVarContext().getLocalVars().put (SyntaxConstants.THIS_JOINPOINT, thisJoinPoint);
        ctx.getLocalVarContext().getLocalVars().put (SyntaxConstants.THIS_JOINPOINT_STATICPART, thisJoinPointStaticPart);
        
        final FunctionDefContext oldFdc = ctx.getFunctionDefContext();
        ctx.setFunctionDefContext (_fdc);
        
        try {
            return _body.evaluate (ctx);
        }
        finally {
            ctx.setFunctionDefContext (oldFdc);
            ctx.getLocalVarContext ().getLocalVars ().remove (SyntaxConstants.THIS_JOINPOINT);
            ctx.getLocalVarContext ().getLocalVars ().remove (SyntaxConstants.THIS_JOINPOINT_STATICPART);
            scopeCounter.leaveAdvice();
        }
    }

    public Pointcut getPointcut () {
        return _pointcut;
    }

    /**
     * This flag determines whether the advice is cacheable. It is intentionally
     *  kept separate from the "cached" flag of the implementing function because
     *  of the different semantics.
     */
    public boolean isCacheable () {
        return _isCacheable;
    }
}
