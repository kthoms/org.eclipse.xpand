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

import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.AnalysationIssue;

public abstract class Statement extends SyntaxElement implements XpandAnalyzable, XpandEvaluatable {
	
    protected AbstractDefinition containingDefinition;

    public Statement() {
    }

    public final void evaluate(final XpandExecutionContext ctx) {
    	try {
	        ctx.getOutput().pushStatement(this,ctx);
	    	ctx.preTask(this);
	        evaluateInternal(ctx);
	        ctx.postTask(this);
	        ctx.getOutput().popStatement();
    	} catch (RuntimeException exc) {
    		ctx.handleRuntimeException(exc, this, null);
    	}
    }

    public void analyze(final XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
		try {
			analyzeInternal(ctx, issues);
		} catch (RuntimeException ex) {
			ctx.handleRuntimeException(ex, this, null);
		}
    }
    
    protected abstract void evaluateInternal(XpandExecutionContext ctx);
    protected abstract void analyzeInternal(XpandExecutionContext ctx, final Set<AnalysationIssue> issues);

	public AbstractDefinition getContainingDefinition() {
		return containingDefinition;
	}

	public void setContainingDefinition(AbstractDefinition definition) {
		this.containingDefinition = definition;
	}
    
}
