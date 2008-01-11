package org.eclipse.xtend.backend.expr;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class NewLocalVarDefExpression extends ExpressionBase {
    private final String _localVarName;
    private final ExpressionBase _defExpression;
    private final ExpressionBase _inner;

    public NewLocalVarDefExpression (String localVarName, ExpressionBase defExpression, ExpressionBase inner, 
            SourcePos sourcePos) {
        super (sourcePos);
        _localVarName = localVarName;
        _defExpression = defExpression;
        _inner = inner;
    }
    
    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        ctx.getLocalVarContext().getLocalVars().put (_localVarName, _defExpression.evaluate(ctx));

        try {
            return _inner.evaluate(ctx);
        }
        finally {
            ctx.getLocalVarContext().getLocalVars().remove(_localVarName);
        }
    }
}
