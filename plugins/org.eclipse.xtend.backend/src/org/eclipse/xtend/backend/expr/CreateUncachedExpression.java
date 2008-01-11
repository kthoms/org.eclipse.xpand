package org.eclipse.xtend.backend.expr;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class CreateUncachedExpression extends ExpressionBase {
    private final BackendType _t;

    public CreateUncachedExpression (BackendType t, SourcePos sourcePos) {
        super(sourcePos);
        _t = t;
    }

    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        return _t.create();
    }
}
