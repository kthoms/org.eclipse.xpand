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
package org.eclipse.internal.xpand2.ast;

import java.util.Set;

import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Type;

/**
 * *
 * 
 * @author Sven Efftinge (http://www.efftinge.de) *
 */
public class LetStatement extends StatementWithBody {

    private Identifier varName;

    private Expression varValue;

    public LetStatement(final Identifier varName,
            final Expression value, final Statement[] body) {
    	super(body);
        this.varName = varName;
        varValue = value;
    }

    public Identifier getVarName() {
        return varName;
    }

    public Expression getVarValue() {
        return varValue;
    }

    public void analyzeInternal(XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
        Type t = getVarValue().analyze(ctx, issues);
        if (t == null) {
            t = ctx.getObjectType();
        }
        ctx = (XpandExecutionContext) ctx.cloneWithVariable(new Variable(getVarName().getValue(), t));
        for (int i = 0; i < body.length; i++) {
            body[i].analyze(ctx, issues);
        }
    }

    @Override
    public void evaluateInternal(XpandExecutionContext ctx) {
        ctx = (XpandExecutionContext) ctx.cloneWithVariable(new Variable(getVarName().getValue(), getVarValue()
                .evaluate(ctx)));
        for (int i = 0; i < body.length; i++) {
            body[i].evaluate(ctx);
        }
    }

}
