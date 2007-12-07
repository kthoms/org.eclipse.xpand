package org.eclipse.xtend.expression;

import org.eclipse.internal.xtend.expression.ast.SyntaxElement;

public interface NullEvaluationHandler {
	public Object handleNullEvaluation(SyntaxElement element, ExecutionContext ctx);
}
