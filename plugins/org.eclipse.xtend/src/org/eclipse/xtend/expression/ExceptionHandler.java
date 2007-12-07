package org.eclipse.xtend.expression;

import java.util.Map;

import org.eclipse.internal.xtend.expression.ast.SyntaxElement;

public interface ExceptionHandler {
	void handleRuntimeException (RuntimeException ex, SyntaxElement element, ExecutionContext ctx, Map<String,Object> additionalContextInfo);
}
