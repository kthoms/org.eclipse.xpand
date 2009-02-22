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

package org.eclipse.internal.xtend.xtend.ast;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.typesystem.Type;

public class Check extends SyntaxElement {

	private Identifier type;

	private boolean errorSeverity = true;

	private Expression msg;

	private Expression constraint;

	private Expression guard;

	private final Identifier feature;

	public Check(final Identifier type, final Identifier f, final Expression guard, final boolean errorSeverity,
			final Expression msg, final Expression constraint) {
		this.type = type;
		this.feature = f;
		this.guard = guard;
		this.errorSeverity = errorSeverity;
		this.msg = msg;
		this.constraint = constraint;
	}

	public final void analyze(ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		try {
			if (ctx.getCallback() != null) {
				ctx.getCallback().pre(this, ctx);
			}
			final Type toCheck = ctx.getTypeForName(type.getValue());
			if (toCheck == null) {
				issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Type not found: " + type.getValue(),
						this));
				return;
			}
			if (feature != null) {
				Property property = toCheck.getProperty(feature.getValue());
				if (property == null) {
					issues.add(new AnalysationIssue(AnalysationIssue.FEATURE_NOT_FOUND, "Couldn't find property '"
							+ feature.getValue() + "' for type '" + type.getValue() + "'", this));
					return;
				}
			}

			ctx = ctx.cloneWithVariable(new Variable(ExecutionContext.IMPLICIT_VARIABLE, toCheck));
			if (guard != null) {
				Type guardType = null;
				try {
					guardType = guard.analyze(ctx, issues);
				}
				catch (RuntimeException ex) {
					ctx.handleRuntimeException(ex, this, null);
				}
				if (guardType == null)
					return;
				if (!guardType.equals(ctx.getBooleanType())) {
					issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Boolean expected! (is "
							+ guardType.getName() + ")", guard));
				}
			}

			Type constraintType = null;
			try {
				constraintType = constraint.analyze(ctx, issues);
			}
			catch (RuntimeException ex) {
				ctx.handleRuntimeException(ex, this, null);
			}
			if (constraintType == null)
				return;
			if (!constraintType.equals(ctx.getBooleanType())) {
				issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Boolean expected! (is "
						+ constraintType.getName() + ")", constraint));
			}

			try {
				msg.analyze(ctx, issues);
			}
			catch (RuntimeException ex) {
				ctx.handleRuntimeException(ex, this, null);
			}
		}
		finally {
			if (ctx.getCallback() != null) {
				ctx.getCallback().post(null);
			}
		}
	}

	/**
	 * Executes the check.
	 * 
	 * @param ctx
	 *            The current execution context
	 * @param colToCheck
	 *            Collection of objects on which the check is evaluated
	 * @param issues
	 *            Errors and warnings are reported to this instance
	 * @param warnIfNothingChecked
	 *            <code>true</code>: If this check is not evaluated for any
	 *            elements an warning will be added to <tt>issues</tt>
	 */
	public void validate(ExecutionContext ctx, final Collection<?> colToCheck, final Issues issues,
			boolean warnIfNothingChecked) {
		try {
			if (ctx.getCallback() != null) {
				ctx.getCallback().pre(this, ctx);
			}
			// get the type for which the check should be evaluated
			final Type typeToCheck = ctx.getTypeForName(type.getValue());
			// The type is unknown => exit with exception
			if (typeToCheck == null)
				throw new EvaluationException("Type not found : " + type.getValue(), this, ctx);

			// will be set to true when check is evaluated for any object
			boolean someObjectFound = false;
			for (final Iterator<?> iter = colToCheck.iterator(); iter.hasNext();) {
				final Object o = iter.next();
				// Object matches the type the check is declared for
				if (typeToCheck.isInstance(o)) {
					someObjectFound = true;
					try {
						// create a new execution context for evaluation
						ctx = ctx.cloneWithVariable(new Variable(ExecutionContext.IMPLICIT_VARIABLE, o));
						// check the guard condition; do not evaluate if guard
						// is
						// evaluated to false
						if (process(ctx)) {
							Object result = null;
							try {
								result = constraint.evaluate(ctx);
							}
							catch (RuntimeException e) {
								final String msg = e.getMessage();
								issues.addError(msg, e);
							}

							// check result must be of Boolean type
							if (result != null && !(result instanceof Boolean))
								throw new EvaluationException("Boolean expected! ( was " + result.getClass().getName()
										+ ")", this, ctx);

							// add issue if result of the check is false
							final Boolean r = (Boolean) result;
							if (Boolean.FALSE.equals(r)) {
								// get the error message
								Object msgResult = null;
								try {
									msgResult = msg.evaluate(ctx);
								}
								catch (RuntimeException e) {
									final String msg = e.getMessage();
									issues.addError(msg, e);
								}

								String stringResult = "Message evaluation returned null";
								if (msgResult != null) {
									stringResult = msgResult.toString();
								}
								// Involved property e.g. test::Bean#property
								String propertyName = null;
								if (feature != null) {
									String featureValue = feature.getValue();
									Property property = typeToCheck.getProperty(featureValue);
									if (property == null)
										throw new EvaluationException("Property " + featureValue + " for Type "
												+ typeToCheck + " not found!", this, ctx);
									else {
										propertyName = property.getName();
									}
								}
								if (errorSeverity) {
									issues.addError(null, stringResult, o, propertyName, null, Collections.emptyList());
								}
								else {
									issues.addWarning(null, stringResult, o, propertyName, null, Collections
											.emptyList());
								}
							}
						}
					}
					catch (final NullPointerException npe) {
						final Object msgResult = msg.evaluate(ctx);
						String stringResult = "Message evaluation returned null";
						if (msgResult != null) {
							stringResult = msgResult.toString();
						}
						if (errorSeverity) {
							issues.addError(stringResult + " (NPE in constraint evaluation)", o);
						}
						else {
							issues.addWarning(stringResult + " (NPE in constraint evaluation)", o);
						}
					}
				}
			}
			if (warnIfNothingChecked && (!someObjectFound)) {
				issues.addWarning("The constraint did not match any model elements. Context: " + type.toString()
						+ ", message: " + msg);
			}
		}
		finally {
			if (ctx.getCallback() != null) {
				ctx.getCallback().post(null);
			}
		}
	}

	private boolean process(final ExecutionContext ctx) {
		if (guard != null) {
			final Object result = guard.evaluate(ctx);
			return result instanceof Boolean && ((Boolean) result).booleanValue();
		}
		return true;
	}

	@Override
	public String toString() {
		return type + " " + msg;
	}

	public boolean isErrorCheck() {
		return this.errorSeverity;
	}

	public Expression getConstraint() {
		return constraint;
	}

	public Expression getGuard() {
		return guard;
	}

	public Expression getMsg() {
		return msg;
	}

	public Identifier getType() {
		return type;
	}

}
