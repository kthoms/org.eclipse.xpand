package org.eclipse.xtend.backend.expr;

import java.util.List;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class SequenceExpression extends ExpressionBase {
    private final List<ExpressionBase> _inner;

    public SequenceExpression (List<ExpressionBase> inner, SourcePos sourcePos) {
        super (sourcePos);
        _inner = inner;
    }
    
    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        Object result = null;
        
        for (ExpressionBase e: _inner)
            result = e.evaluate(ctx);
        
        return result;
    }
}
