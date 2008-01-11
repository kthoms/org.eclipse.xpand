package org.eclipse.xtend.backend.expr;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class PropertyOnObjectExpression extends ExpressionBase {
    private final ExpressionBase _inner;
    private final String _propertyName;

    public PropertyOnObjectExpression (ExpressionBase inner, String propertyName, SourcePos sourcePos) {
        super (sourcePos);
        
        _inner = inner;
        _propertyName = propertyName;
    }

    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        final Object o = _inner.evaluate(ctx);
        if (o == null) {
            ctx.logNullDeRef (getPos());
            return null;
        }
        
        return ctx.getTypesystem().findType(o).getProperty(ctx, o, _propertyName);
    }
}
