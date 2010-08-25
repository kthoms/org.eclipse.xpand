/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
*/
package org.eclipse.xtend.backend.aop;

import java.util.Iterator;

import org.eclipse.xtend.backend.aop.internal.AdviceScopeCounter;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.util.Pair;


/**
 * @author Arno Haase (http://www.haase-consulting.com)
 * @André Arnold
 */
public final class AroundAdvice {
    private final ExpressionBase _body;
    private final Pointcut _pointcut;
    private FunctionDefContext _fdc;
    
    private final boolean _isCacheable;
    
    /**
     * 
     * @param body contains the body of this advice
     * @param pointcut contains the pointcut that guards this advice
     * @param isCacheable This flag marks the advice as "cacheable". This means that the result of its execution
     *         will be cached iff all advice wrapped by it, and the originally wrapped function, 
     *         are cacheable or cached, respectively.
     */
    public AroundAdvice (ExpressionBase body, Pointcut pointcut, boolean isCacheable) {
        _body = body;
        _pointcut = pointcut;
        _isCacheable = isCacheable;
    }

    public ExpressionBase getBody() {
		return _body;
	}

	/**
     * actually evaluates the advice, regardless of caching - that is context sensitive and must
     *  be taken care of by callers
     */
    public Object evaluate (ExecutionContext ctx, AdviceScopeCounter scopeCounter, ThisJoinPoint thisJoinPoint, ThisJoinPointStaticPart thisJoinPointStaticPart) {
        scopeCounter.enterAdvice();
        ctx.getLocalVarContext().getLocalVars().put (SyntaxConstants.THIS_JOINPOINT, thisJoinPoint);
        ctx.getLocalVarContext().getLocalVars().put (SyntaxConstants.THIS_JOINPOINT_STATICPART, thisJoinPointStaticPart);
        // TODO assign params from thisJoinPoint via _pointcut.paramTypes to _body localVarContext, see also AdvicedFunction
        Iterator<Pair<String, AdviceParamType>> paramTypeIt = _pointcut.getParamTypes().iterator();
        Iterator<?> paramIt = thisJoinPoint.getParameters().iterator();
        while (paramTypeIt.hasNext () && paramIt.hasNext ()) {
        	Pair<String, AdviceParamType> paramType = paramTypeIt.next();
        	Object param = paramIt.next();
        	ctx.getLocalVarContext().getLocalVars().put (paramType.getFirst(), param);
		}
        
        final FunctionDefContext oldFdc = ctx.getFunctionDefContext();
        ctx.setFunctionDefContext (_fdc);
        
        try {
            return _body.evaluate (ctx);
        }
        finally {
            ctx.setFunctionDefContext (oldFdc);
            ctx.getLocalVarContext ().getLocalVars ().remove (SyntaxConstants.THIS_JOINPOINT);
            ctx.getLocalVarContext ().getLocalVars ().remove (SyntaxConstants.THIS_JOINPOINT_STATICPART);
            for (Pair<String, AdviceParamType> advParamType : _pointcut.getParamTypes()) {
            	ctx.getLocalVarContext().getLocalVars().remove (advParamType.getFirst());
    		}
            scopeCounter.leaveAdvice();
        }
    }

    public void setFunctionDefContext (FunctionDefContext fdc) {
        _fdc = fdc;
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
