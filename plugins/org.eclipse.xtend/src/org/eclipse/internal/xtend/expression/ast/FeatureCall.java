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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.ParameterizedType;
import org.eclipse.xtend.typesystem.Property;
import org.eclipse.xtend.typesystem.StaticProperty;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 * @author Bernd Kolb
 */
@SuppressWarnings("unchecked")
public class FeatureCall extends Expression {

	private Expression target;

	private Identifier name;

	public FeatureCall(final Identifier name, final Expression target) {
		this.target = target;
		this.name = name;
	}

	public Expression getTarget() {
		return target;
	}

	public void setTarget(final Expression target) {
		this.target = target;
	}

	public Identifier getName() {
		return name;
	}
	
	@Override
	public String getNameString(ExecutionContext context){
		return name.getValue();
	}

	public StaticProperty getEnumLiteral(final ExecutionContext ctx) {
		if (name.getValue().indexOf(SyntaxConstants.NS_DELIM) != -1) {
			String typeName = name.getValue();
			typeName = typeName.substring(0, typeName
					.lastIndexOf(SyntaxConstants.NS_DELIM));
			final Type type = ctx.getTypeForName(typeName);
			if (type != null) {
				final String litName = name.getValue().substring(
						name.getValue().lastIndexOf(SyntaxConstants.NS_DELIM)
								+ SyntaxConstants.NS_DELIM.length());
				return type.getStaticProperty(litName);
			}
		}
		return null;
	}

	/**
	 * evaluates in the following order if (target==null) 1) enumeration literal
	 * 2) variable 3) implicit var (e.g. this) being everything but an empty
	 * list 4) type literal otherwise it's a property
	 * 
	 * if the above doesn't match throw an error as long as target is no empty
	 * Collection
	 */
	@Override
	public Object evaluateInternal(final ExecutionContext ctx) {
		Object targetObj = null;
		if (target == null) {
			final StaticProperty staticProp = getEnumLiteral(ctx);
			if (staticProp != null)
				return staticProp.get();
			Variable var = ctx.getVariable(getName().getValue());
			if (var != null)
				return var.getValue();

			var = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
			if (var != null) {
				targetObj = var.getValue();
				if (targetObj == null)
					return ctx.handleNullEvaluation(this);
			}
		} else {
			targetObj = getTarget().evaluate(ctx);
			if (targetObj == null)
				return ctx.handleNullEvaluation(this);
		}
		final String additionalMsg = "";
		if (targetObj != null) {
			// Does the target object define a property with the feature name?
			final Property p = ctx
					.findProperty(getName().getValue(), targetObj);
			if (p == null
					&& (targetObj instanceof Collection && !((Collection) targetObj)
							.isEmpty())) {
				return invokeOnInnerElements(ctx, targetObj, additionalMsg);
			}
			if (p != null)
				return p.get(targetObj);
		}
		if (target == null) {
			// type literal ?
			final Type type = ctx.getTypeForName(getName().getValue());
			if (type != null) {
				return type;
			}
		}
		if (targetObj instanceof Collection
				&& ((Collection) targetObj).isEmpty()) {
			return targetObj;
		}
		if (getName().getValue().indexOf(SyntaxConstants.NS_DELIM) != -1)
			throw new EvaluationException(
					"Couldn't find enum literal or type '"
							+ getName().getValue() + "'", this, ctx);
		if (target == null)
			throw new EvaluationException("Couldn't find type or property '"
					+ getName().getValue() + "'", this, ctx);
		else
			throw new EvaluationException("Couldn't find property '"
					+ getName().getValue() + "' for type "
					+ findType(targetObj, ctx).getName() + additionalMsg, this,
					ctx);
	}

	private Object invokeOnInnerElements(final ExecutionContext ctx,
			Object targetObj, final String additionalMsg) {
		final Collection col = (Collection) targetObj;
		final List<Object> result = new ArrayList<Object>();
		for (final Iterator iter = col.iterator(); iter.hasNext()
				&& additionalMsg.length() == 0;) {
			final Object element = iter.next();
			final Property prop = ctx.findProperty(getName().getValue(),
					element);
			if (prop == null) {
				final Type type = ctx.getType(element);
				throw new EvaluationException("Couldn't find property '"
						+ getName().getValue() + "' for inner type " + type
						+ "'", this, ctx);
			} else {
				final Object r = prop.get(element);
				if (r instanceof Collection) {
					result.addAll((Collection<?>) r);
				} else {
					result.add(r);
				}
			}
		}
		return result;
	}

	/**
	 * analyzes in the following order if (target==null) 1) enumeration literal
	 * 2) variable 3) implicite var (e.g. this) 4) type literal
	 * 
	 * otherwise it's a property
	 */
	@Override
    public Type analyzeInternal(final ExecutionContext ctx,
			final Set<AnalysationIssue> issues) {
		Type targetType = null;
		if (target == null) {
			// enum literal
			final StaticProperty staticProp = getEnumLiteral(ctx);
			if (staticProp != null)
				return staticProp.getReturnType();

			// variable
			Variable var = ctx.getVariable(getName().getValue());
			if (var != null)
				return (Type) var.getValue();

			// implicite variable 'this'
			var = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
			if (var != null) {
				targetType = (Type) var.getValue();
			}

		} else {
			targetType = analyzeTarget(ctx, issues);
			if (targetType == null)
				return null;
		}

		String additionalMsg = "";
		// simple property
		if (targetType != null) {
			Property p = targetType.getProperty(getName().getValue());
			if (p != null)
				return p.getReturnType();

			if (targetType instanceof ParameterizedType) {
				final Type innerType = ((ParameterizedType) targetType)
						.getInnerType();
				p = innerType.getProperty(getName().getValue());
				if (p != null) {
					Type rt = p.getReturnType();
					if (rt instanceof ParameterizedType) {
						rt = ((ParameterizedType) rt).getInnerType();
					}
					return ctx.getListType(rt);
				}
				additionalMsg = " or inner type '" + innerType + "'";
			}
		}
		if (target == null) {
			final Type type = ctx.getTypeForName(getName().getValue());
			if (type != null)
				return ctx.getTypeType();
		}

		if (target == null) {
			String txt = "";
			if (targetType != null) {
				txt = targetType.getName() + " property, ";
			}
			issues.add(new AnalysationIssue(AnalysationIssue.FEATURE_NOT_FOUND,
					"Unknown " + txt
							+ "variable, type or enumeration literal '"
							+ getName().getValue() + "'", this));
			return null;
		}

		issues.add(new AnalysationIssue(AnalysationIssue.FEATURE_NOT_FOUND,
				"Couldn't find property '" + getName().getValue()
						+ "' for type '" + (targetType!=null ? targetType.getName() : "UNKNOWN") + "'"
						+ additionalMsg, this));
		return null;

	}

	protected Type analyzeTarget(final ExecutionContext ctx,
			final Set<AnalysationIssue> issues) {
		return getTarget().analyze(ctx, issues);
	}

	protected Type findType(final Object value, final ExecutionContext ctx) {
		final Type t = ctx.getType(value);
		if (t == null)
			throw new EvaluationException("Unknown object type : "
					+ value.getClass().getName(), this, ctx);
		return t;
	}

	@Override
	protected String toStringInternal() {
		return (getTarget() != null ? getTarget().toString() + "." : "")
				+ name.getValue();
	}

}
