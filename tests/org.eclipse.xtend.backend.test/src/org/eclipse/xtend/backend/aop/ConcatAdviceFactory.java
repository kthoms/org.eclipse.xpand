package org.eclipse.xtend.backend.aop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.expr.ConcatExpression;
import org.eclipse.xtend.backend.expr.InvocationOnObjectExpression;
import org.eclipse.xtend.backend.expr.LiteralExpression;
import org.eclipse.xtend.backend.expr.LocalVarEvalExpression;


class ConcatAdviceFactory {
    public static ExpressionBase createConcatExpression (String prefix, String suffix, boolean callProceed) {
        final List<ExpressionBase> toBeConcatenated = new ArrayList<ExpressionBase> ();
        toBeConcatenated.add (new LiteralExpression (prefix, null));
        if (callProceed)
            toBeConcatenated.add (createProceedExpression());
        toBeConcatenated.add (new LiteralExpression (suffix, null));
        
        return new ConcatExpression (toBeConcatenated, null);
    }

    public static ExpressionBase createProceedExpression () {
        return new InvocationOnObjectExpression ("proceed", Arrays.asList (new LocalVarEvalExpression (SyntaxConstants.THIS_JOINPOINT, null)), true, null);
    }
}
