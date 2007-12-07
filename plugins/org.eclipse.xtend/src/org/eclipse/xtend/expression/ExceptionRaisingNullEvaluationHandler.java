package org.eclipse.xtend.expression;

import org.eclipse.internal.xtend.expression.ast.SyntaxElement;

public class ExceptionRaisingNullEvaluationHandler implements
		NullEvaluationHandler {

	public Object handleNullEvaluation(SyntaxElement element, ExecutionContext ctx) {
		throw new EvaluationException("null evaluation",element, ctx);
	}

}
