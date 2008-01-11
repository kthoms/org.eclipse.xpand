package org.eclipse.xtend.backend.expr;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class LiteralExpression extends ExpressionBase {
    private final Object _value;

    public LiteralExpression (Object value, SourcePos sourcePos) {
        super (sourcePos);
        _value = value;
    }

    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        return _value;
    }
}
