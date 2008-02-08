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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.syslib.CollectionOperations;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class InvocationOnCollectionExpression extends ExpressionBase {
    private final ExpressionBase _coll;
    private final String _functionName;
    private final List<ExpressionBase> _params;
    
    public InvocationOnCollectionExpression (ExpressionBase coll, String functionName, List<ExpressionBase> params, SourcePos sourcePos) {
        super (sourcePos);
        
        _coll = coll;
        _functionName = functionName;
        _params = params;
    }

    @Override
    protected Object evaluateInternal(ExecutionContext ctx) {
        final Collection<?> coll = (Collection<?>) _coll.evaluate(ctx);
        
        if (coll == null) {
            ctx.logNullDeRef (getPos());
            return null;
        }
        
        final List<Object> params = new ArrayList<Object>();
        params.add (null); //placeholder
        for (ExpressionBase expr: _params)
        	params.add (expr.evaluate (ctx));
        
        final Collection<Object> result = CollectionOperations.createMatchingCollection (coll);
        
        for (Object o: coll) {
        	params.set (0, o);

        	CollectionOperations.addFlattened (result, ctx.getFunctionDefContext().invoke (ctx, _functionName, params));
        }
        
        return result;
    }
}
