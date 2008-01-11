package org.eclipse.xtend.backend.expr;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SourcePos;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class LocalVarEvalExpression extends ExpressionBase {
    private final String _localVarName;

    public LocalVarEvalExpression (String localVarName, SourcePos sourcePos) {
        super(sourcePos);
        _localVarName = localVarName;
    }
    
    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        //expects a static check to have been performed that a local variable of this name exists
        return ctx.getLocalVarContext().getLocalVars().get (_localVarName);
    }
}
