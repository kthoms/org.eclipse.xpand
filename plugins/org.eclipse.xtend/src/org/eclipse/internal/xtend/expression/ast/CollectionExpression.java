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
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.internal.xtend.type.baseimpl.BuiltinMetaModel;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.ParameterizedType;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 * @author Bernd Kolb
 */
@SuppressWarnings("unchecked")
public class CollectionExpression extends FeatureCall {

	private Expression closure;

	private Identifier eleName;

	public CollectionExpression(final Identifier name, final Identifier eleName, final Expression closure) {
    	super(name,null);
		this.eleName = eleName;
		this.closure = closure;
	}

	@Override
	protected String toStringInternal() {
		return super.toStringInternal() + "(" + (eleName != null ? eleName.getValue() + "|" : "") + closure + ")";
	}

    public Expression getClosure () {
		return closure;
	}

	@Override
	public Object evaluateInternal(final ExecutionContext ctx) {
		Object targetObj = null;
		if (getTarget() == null) {
			final Variable v = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
			if (v != null) {
				targetObj = v.getValue();
			}
        } else {
			targetObj = getTarget().evaluate(ctx);
		}
		if (targetObj == null)
			return ctx.handleNullEvaluation(this);
        if (!(targetObj instanceof Collection)) {
            throw new EvaluationException("Couldn't call '"+this.toString()+"' on an object of java type "+targetObj.getClass().getName(),this, ctx);
        }

		if (getName().getValue().equals(SyntaxConstants.COLLECT))
			return executeCollect((Collection) targetObj, ctx);
		else if (getName().getValue().equals(SyntaxConstants.SELECT))
			return executeSelect((Collection) targetObj, ctx);
		else if (getName().getValue().equals(SyntaxConstants.SELECTFIRST))
			return executeSelectFirst((Collection) targetObj, ctx);
		else if (getName().getValue().equals(SyntaxConstants.REJECT))
			return executeReject((Collection) targetObj, ctx);
		else if (getName().getValue().equals(SyntaxConstants.EXISTS))
			return executeExists((Collection) targetObj, ctx);
		else if (getName().getValue().equals(SyntaxConstants.NOT_EXISTS))
			return executeNotExists((Collection) targetObj, ctx);
		else if (getName().getValue().equals(SyntaxConstants.FOR_ALL))
			return executeForAll((Collection) targetObj, ctx);
		else if (getName().getValue().equals(SyntaxConstants.SORT_BY))
			return executeSortBy((Collection) targetObj, ctx);
		else
			throw new EvaluationException("Unknown collection operation : " + getName().getValue(), this, ctx);

	}

	@SuppressWarnings("unchecked")
	private Object executeSortBy(Collection collection, final ExecutionContext ctx) {
		List<Object> result = new ArrayList<Object>();
		result.addAll(collection);
		Collections.sort(result, new Comparator<Object> () {

			@SuppressWarnings("unchecked")
			public int compare(Object o1, Object o2) {
				final Object a = closure.evaluate(ctx.cloneWithVariable(new Variable(getElementName(), o1)));
				final Object b = closure.evaluate(ctx.cloneWithVariable(new Variable(getElementName(), o2)));
	            if (a==b)
					return 0;
	            if (a==null)
					return -1;
	            if (b==null)
					return 1;
				if (a instanceof Comparable)
	            	return ((Comparable)a).compareTo(b);
				return a.toString().compareTo(b.toString());
			}});
		return result;
	}

	private Object executeForAll(final Collection collection, ExecutionContext ctx) {
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), iter.next()));
			final Object result = closure.evaluate(ctx);
			if (!(result instanceof Boolean) || !((Boolean) result).booleanValue())
				return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	private Object executeExists(final Collection collection, ExecutionContext ctx) {
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), iter.next()));
			final Object result = closure.evaluate(ctx);
			if (result instanceof Boolean && ((Boolean) result).booleanValue())
				return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	private Object executeNotExists(final Collection collection, ExecutionContext ctx) {
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), iter.next()));
			final Object result = closure.evaluate(ctx);
			if (result instanceof Boolean && ((Boolean) result).booleanValue())
				return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}

	@SuppressWarnings("unchecked")
	private Object executeReject(final Collection collection, ExecutionContext ctx) {
		final Collection resultCol = new ArrayList(collection);
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			final Object ele = iter.next();
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), ele));
			final Object result = closure.evaluate(ctx);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				resultCol.remove(ele);
			}
		}
		return resultCol;
	}

	private Object executeSelect(final Collection collection, ExecutionContext ctx) {
		final Collection<Object> resultCol = new ArrayList<Object>();
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			final Object ele = iter.next();
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), ele));
			final Object result = closure.evaluate(ctx);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				resultCol.add(ele);
			}
		}
		return resultCol;
	}

	private Object executeSelectFirst(final Collection collection, ExecutionContext ctx) {
		final Collection<Object> resultCol = new ArrayList<Object>();
		for (final Iterator iter = collection.iterator(); iter.hasNext();) {
			final Object ele = iter.next();
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), ele));
			final Object result = closure.evaluate(ctx);
			if (result instanceof Boolean && ((Boolean) result).booleanValue()) {
				resultCol.add(ele);
			}
		}
        if ( resultCol.size() == 0 ) return null;
		return resultCol.iterator().next();
	}

	@SuppressWarnings("unchecked")
	private Object executeCollect(final Collection collection, ExecutionContext ctx) {
		final Collection<Object> resultCol = new ArrayList<Object>();
		for (final Iterator iter = Collections.unmodifiableCollection(collection).iterator(); iter.hasNext();) {
			final Object ele = iter.next();
			ctx = ctx.cloneWithVariable(new Variable(getElementName(), ele));
			resultCol.add(closure.evaluate(ctx));
		}
		return resultCol;
	}

	@Override
	public Type analyzeInternal(ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		Type targetType = null;
		if (getTarget() == null) {
			final Variable v = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
			if (v != null) {
				targetType = (Type) v.getValue();
			}
        } else {
			targetType = getTarget().analyze(ctx, issues);
		}
		if (targetType == null)
			return null;

		if (!(targetType instanceof ParameterizedType)) {
			issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "Collection type expected! was : "
					+ targetType, getTarget()));
			return null;
		}

		final Type innerType = ((ParameterizedType) targetType).getInnerType();
		Type result = null;
		ctx = ctx.cloneWithVariable(new Variable(getElementName(), innerType));
		final Type closureType = closure.analyze(ctx, issues);
		if (getName().getValue().equals(SyntaxConstants.COLLECT)) {
			if (targetType.getName().startsWith(BuiltinMetaModel.SET))
				return ctx.getSetType(closureType);
			else if (targetType.getName().startsWith(BuiltinMetaModel.LIST))
				return ctx.getListType(closureType);
			else
				return ctx.getCollectionType(closureType);
        } else if (getName().getValue().equals(SyntaxConstants.SELECT)
                || getName().getValue().equals(SyntaxConstants.REJECT)
                 ) {
			return targetType;
        } else if (getName().getValue().equals(SyntaxConstants.SELECTFIRST)) {
			return innerType;
        } else if (getName().getValue().equals(SyntaxConstants.SORT_BY)) {
			return ctx.getListType(innerType);
        }else if (getName().getValue().equals(SyntaxConstants.TYPE_SELECT)) {
			if (closureType == null)
				return null;
			return ctx.getListType(closureType);
        } else if (getName().getValue().equals(SyntaxConstants.EXISTS)
				|| getName().getValue().equals(SyntaxConstants.NOT_EXISTS)
				|| getName().getValue().equals(SyntaxConstants.FOR_ALL)) {
			if (!ctx.getBooleanType().isAssignableFrom(closureType)) {
				issues.add(new AnalysationIssue(AnalysationIssue.INCOMPATIBLE_TYPES, "Boolean type expected! was : "
						+ closureType, closure));
			}
			result = ctx.getBooleanType();
        } else {
			issues.add(new AnalysationIssue(AnalysationIssue.INTERNAL_ERROR, "Unknown operation : "
					+ getName().getValue(), this));
		}
		return result;
	}

	public String getElementName() {
		return eleName != null ? eleName.getValue() : SyntaxConstants.DEFAULT_ELE_NAME;
	}

}
