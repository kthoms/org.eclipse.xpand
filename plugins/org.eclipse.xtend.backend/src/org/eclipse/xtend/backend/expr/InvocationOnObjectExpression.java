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
public final class InvocationOnObjectExpression extends ExpressionBase {
    private final String _functionName;
    private final List<? extends ExpressionBase> _params;
    
    public InvocationOnObjectExpression (String functionName, List<? extends ExpressionBase> params, SourcePos sourcePos) {
        super (sourcePos);
        
        _functionName = functionName;
        _params = params;
    }
    
    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        final List<Object> params = new ArrayList<Object> ();
        for (ExpressionBase expr: _params)
        	params.add (expr.evaluate(ctx));
        
        return ctx.getFunctionDefContext().invoke (ctx, _functionName, params);
    }
}
