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

import java.util.List;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;
import org.eclipse.xtend.backend.util.Pair;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class SwitchExpression extends ExpressionBase {
    private final ExpressionBase _switchExpr;
    private final List<Pair<ExpressionBase, ExpressionBase>> _cases;
    private final ExpressionBase _defaultExpr;
    
    public SwitchExpression (ExpressionBase switchExpr, List<Pair<ExpressionBase, ExpressionBase>> cases, ExpressionBase defaultExpr, SourcePos sourcePos) {
        super (sourcePos);
        
        if (switchExpr == null)
            switchExpr = new LiteralExpression (Boolean.TRUE, sourcePos);
        
        _switchExpr = switchExpr;
        _cases = cases;
        _defaultExpr = defaultExpr;
    }

    @Override
    protected Object evaluateInternal (ExecutionContext ctx) {
        final Object switchVal = _switchExpr.evaluate (ctx);
        
        for (Pair<ExpressionBase, ExpressionBase> curCase: _cases) {
            final Object curVal = curCase.getFirst().evaluate(ctx);
                
            if (nullSafeEquals (switchVal, curVal))
                return curCase.getSecond().evaluate(ctx);
        }
        
        return _defaultExpr.evaluate(ctx);
    }
    
    private static boolean nullSafeEquals (Object o1, Object o2) {
        if (o1 == o2)
            return true;
        
        if (o1 == null || o2 == null)
            return false;
        
        return o1.equals (o2);
    }
}

