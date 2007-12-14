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

package org.eclipse.internal.xpand2.ast;

import java.util.Set;

import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.AnalysationIssue;

/**
 * *
 * 
 * @author Sven Efftinge (http://www.efftinge.de) *
 */
public class ErrorStatement extends Statement {

    private Expression message;

    public ErrorStatement( final Expression msg) {
        message = msg;
    }

    public Expression getMessage() {
        return message;
    }

    public void analyzeInternal(final XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
    	message.analyze(ctx, issues);
    }

    @Override
    public void evaluateInternal(final XpandExecutionContext ctx) {
        System.err.println(message.evaluate(ctx));
    }

}
