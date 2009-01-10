/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.internal.xtend.expression.ast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 * @author Bernd Kolb
 */
public class SwitchExpression extends Expression {

	private Expression switchExpr = null;

	private Expression defaultExpr = null;

	private List<Case> cases = null;

	public SwitchExpression(final Expression switchExpr, final List<Case> cases, final Expression defaultExpr) {
		this.switchExpr = switchExpr;
		this.cases = cases;
		this.defaultExpr = defaultExpr;
	}

	@Override
	protected Object evaluateInternal(final ExecutionContext ctx) {
		Object switchVal = Boolean.TRUE;
		if (switchExpr != null) {
			switchVal = switchExpr.evaluate(ctx);
		}
		for (final Iterator<Case> iter = cases.iterator(); iter.hasNext();) {
			final Case c = iter.next();
			final Object caseCondVal = c.getCondition().evaluate(ctx);
			if ((switchVal != null && equals(switchVal, caseCondVal, ctx)) || switchVal == caseCondVal)
				return c.getThenPart().evaluate(ctx);
		}
		return defaultExpr.evaluate(ctx);
	}

	private boolean equals(Object switchVal, final Object caseCondVal, ExecutionContext ctx) {

		Map<String, Object> props = new HashMap<String, Object>();
		props.put("swtch", switchVal);
		props.put("cse", caseCondVal);
		return (Boolean) new ExpressionFacade(ctx).evaluate("swtch==cse", props);
	}

	@Override
	public Type analyzeInternal(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		Type condType = ctx.getBooleanType();
		if (switchExpr != null) {
			condType = switchExpr.analyze(ctx, issues);
		}
		if (condType == null)
			return null;
		Type returnType = defaultExpr.analyze(ctx, issues);
		if (returnType == null)
			return null;
		for (final Iterator<Case> iter = cases.iterator(); iter.hasNext();) {
			final Case c = iter.next();
			final Type caseCondType = c.getCondition().analyze(ctx, issues);
			if (caseCondType != null) {
				if (!condType.isAssignableFrom(caseCondType)) {
					issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, condType.getName()
							+ " expected!", c.getCondition()));
				}
			}
			final Type caseThenType = c.getThenPart().analyze(ctx, issues);
			if (caseThenType != null) {
				if (!returnType.isAssignableFrom(caseThenType)) {
					if (caseThenType.isAssignableFrom(returnType)) {
						returnType = caseThenType;
					}
					else {
						returnType = ctx.getObjectType();
					}
				}
			}
		}
		return returnType;
	}

	public List<Case> getCases() {
		return cases;
	}

	public Expression getDefaultExpr() {
		return defaultExpr;
	}

	public Expression getSwitchExpr() {
		return switchExpr;
	}

	@Override
	protected String toStringInternal() {
		return "switch " + switchExpr.toStringInternal();
	}
}
