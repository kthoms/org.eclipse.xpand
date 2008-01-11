package org.eclipse.xtend.backend.expr;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ListLiteralExpression extends ExpressionBase {
    private final List<ExpressionBase> _inner;
    
    public ListLiteralExpression (List<ExpressionBase> inner, SourcePos sourcePos) {
        super (sourcePos);
        _inner = inner;
    }

    @Override
    protected Object evaluateInternal (ExecutionContext ctx) {
        final List<Object> result = new ArrayList<Object>();
        
        for (ExpressionBase e: _inner)
            result.add (e.evaluate(ctx));
        
        return result;
    }
}
