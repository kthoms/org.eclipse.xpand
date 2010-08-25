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

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Helpers;
import org.eclipse.xtend.backend.common.FutureResultHolder;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ConcatExpression extends ExpressionBase {
    private final List<? extends ExpressionBase> _parts;

    public ConcatExpression (List<? extends ExpressionBase> parts, SourcePos sourcePos) {
        super(sourcePos);
        
        _parts = parts;
    }

    public List<? extends ExpressionBase> getParts() {
		return _parts;
	}

	@Override
    protected Object evaluateInternal (ExecutionContext ctx) {
        EfficientLazyString result = new EfficientLazyString ();

        for (ExpressionBase expr: _parts) {
        	Object res = expr.evaluate(ctx);
        	if (res instanceof FutureResultHolder && !((FutureResultHolder)res).isReady())
        		result = EfficientLazyString.createAppendedString (result, res);
        	else
        		result = EfficientLazyString.createAppendedString (result, Helpers.overridableToString (ctx, res));
        }

        return result;
    }

}
