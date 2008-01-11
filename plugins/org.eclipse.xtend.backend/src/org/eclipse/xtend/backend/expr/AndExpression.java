package org.eclipse.xtend.backend.expr;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * this is not delegated to syslib because of shortcut evaluation
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class AndExpression extends ExpressionBase {
    private final ExpressionBase _left, _right;

    public AndExpression (ExpressionBase left, ExpressionBase right, SourcePos sourcePos) {
        super(sourcePos);
        
        _left = left;
        _right = right;
    }

    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        final Object left = _left.evaluate(ctx);
        if (left == null) {
            ctx.logNullDeRef (getPos());
            return null;
        }
        
        if (Boolean.FALSE.equals (left))
            return Boolean.FALSE;
            
        final Object right = _right.evaluate(ctx);
        if (right == null) {
            ctx.logNullDeRef (getPos());
            return null;
        }
        return right;
    }
}
