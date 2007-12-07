/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.internal.xtend.expression.ast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

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
public class TypeSelectExpression extends FeatureCall {

    private Identifier typeLiteral;

    public TypeSelectExpression(final Identifier opName, final Identifier typeLiteral) {
        super(opName, null);
        this.typeLiteral = typeLiteral;
    }

    public String getTypeName () {
        return typeLiteral.getValue();
    }
    
    @Override
	protected String toStringInternal() {
        return super.toStringInternal() + "(" + typeLiteral + ")";
    }

    @Override
    public Object evaluateInternal(final ExecutionContext ctx) {
        Object targetObj = null;
        if (getTarget() == null) {
            final Variable v = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
            if (v != null)
                targetObj = v.getValue();
        } else {
            targetObj = getTarget().evaluate(ctx);
        }
        if (targetObj == null)
            return ctx.handleNullEvaluation(this);
        if (!(targetObj instanceof Collection)) {

        }

        return executeTypeSelect((Collection<?>) targetObj, ctx);
    }

    private Object executeTypeSelect(final Collection<?> collection, final ExecutionContext ctx) {
        final Collection<Object> resultCol = new ArrayList<Object>();
        final Type t = ctx.getTypeForName(typeLiteral.getValue());
        if (t == null)
            throw new EvaluationException("Unkown type '" + typeLiteral + "'", typeLiteral, ctx);
        for (final Iterator<?> iter = collection.iterator(); iter.hasNext();) {
            final Object ele = iter.next();
            if (ele!=null && t.isAssignableFrom(ctx.getType(ele))) {
                resultCol.add(ele);
            }
        }
        return resultCol;
    }

    @Override
    public Type analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        Type targetType = null;
        if (getTarget() == null) {
            final Variable v = ctx.getVariable(ExecutionContext.IMPLICIT_VARIABLE);
            if (v != null)
                targetType = (Type) v.getValue();
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

        final Type closureType = ctx.getTypeForName(typeLiteral.getValue());
        if (closureType == null) {
            issues.add(new AnalysationIssue(AnalysationIssue.TYPE_NOT_FOUND, "Couldn't find type " + typeLiteral,
                    typeLiteral));
            return null;
        }

        return ctx.getListType(closureType);
    }

}
