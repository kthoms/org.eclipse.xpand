package org.eclipse.xtend.backend.expr;

import java.util.List;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class CurryingExpression extends ExpressionBase{
    private final Function _function;
    private final List<ExpressionBase> _boundParams;

    /**
     * 
     * @param boundParams must have the same size as the number of parameters of the function. Unbound parameters
     *  are represented by "null" entries.
     */
    public CurryingExpression (Function f, List<ExpressionBase> boundParams, SourcePos pos) {
        super (pos);
        
        _function = f;
        _boundParams = boundParams;
    }

    @Override
    protected Object evaluateInternal (ExecutionContext ctx) {
        return new CurriedFunction (_function, _boundParams, ctx);
    }
}
