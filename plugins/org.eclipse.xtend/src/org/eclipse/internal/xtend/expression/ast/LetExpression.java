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

import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 * @author Bernd Kolb
 */
public class LetExpression extends Expression {

    private Expression varExpression;

    private Expression targetExpression;

    private Identifier varName;

    public LetExpression(final Identifier varName,
            final Expression varExpression, final Expression target) {
        this.varName = varName;
        this.varExpression = varExpression;
        targetExpression = target;
    }

    public Expression getVarExpression () {
        return varExpression;
    }
    
    public Expression getTargetExpression () {
        return targetExpression;
    }
    
    public String getName () {
        return varName.getValue();
    }
    
    @Override
    public Object evaluateInternal(ExecutionContext ctx) {
        final Object o = varExpression.evaluate(ctx);
        ctx = ctx.cloneWithVariable(new Variable(varName.getValue(), o));
        return targetExpression.evaluate(ctx);
    }

    public Type analyzeInternal(ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        final Type t = varExpression.analyze(ctx, issues);
        if (t == null)
            return null;
        ctx = ctx.cloneWithVariable(new Variable(varName.getValue(), t));
        return targetExpression.analyze(ctx, issues);
    }

    @Override
	protected String toStringInternal() {
        return "let " + varName + "=" + varExpression + " : " + targetExpression;
    }

}
