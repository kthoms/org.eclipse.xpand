/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.internal.xtend.expression.ast;

import java.util.Set;

import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.Analyzable;
import org.eclipse.xtend.expression.Evaluatable;
import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author Bernd Kolb
 * 
 */
public abstract class Expression extends SyntaxElement implements Analyzable, Evaluatable {

	protected Type findType(final Identifier type, final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		final Type toCast = ctx.getTypeForName(type.getValue());
		if (toCast == null) {
			issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, type.getValue(), type));
		}
		return toCast;
	}

	public final Object evaluate(final ExecutionContext ctx) {
		Object evaluateInternal = null;
		try {
			ProgressMonitor monitor = ctx.getMonitor();
			if (monitor != null && monitor.isCanceled())
				return null;

			if (ctx.getCallback() != null) {
				ctx.getCallback().pre(this, ctx);
			}
			evaluateInternal = evaluateInternal(ctx);
			return evaluateInternal;
		}
		catch (final EvaluationException ex) {
			ctx.handleRuntimeException(ex, this, null);
			return null;
		}
		catch (final RuntimeException ex) {
			EvaluationException evalex = new EvaluationException(ex.getMessage(), this, ctx);
			ctx.handleRuntimeException(evalex, this, null);
			return null;
		}
		finally {
			if (ctx.getCallback() != null) {
				ctx.getCallback().post(evaluateInternal);
			}
		}
	}

	public Type analyze(ExecutionContext ctx, Set<AnalysationIssue> issues) {
		Type val = null;
		try {
			if (ctx.getCallback() != null) {
				ctx.getCallback().pre(this, ctx);
			}
			val = analyzeInternal(ctx, issues);
			return val;
		}
		catch (final RuntimeException ex) {
			issues.add(new AnalysationIssue(AnalysationIssue.INTERNAL_ERROR, ex.getMessage(), this));
			return null;
		}
		finally {
			if (ctx.getCallback() != null) {
				ctx.getCallback().post(val);
			}
		}
	}

	protected abstract Type analyzeInternal(ExecutionContext ctx, Set<AnalysationIssue> issues);

	@Override
	public final String toString() {
		return toStringInternal();
	}

	protected abstract String toStringInternal();

	protected abstract Object evaluateInternal(ExecutionContext ctx);

}
