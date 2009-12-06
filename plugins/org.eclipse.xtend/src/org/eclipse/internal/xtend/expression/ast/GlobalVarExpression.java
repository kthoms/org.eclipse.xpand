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

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Type;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 * @author Bernd Kolb
 */
public class GlobalVarExpression extends Expression {
    private Log logger = LogFactory.getLog(getClass());
    private Identifier globalVarName;

    public GlobalVarExpression(final Identifier globalVarName) {
        this.globalVarName = globalVarName;
    }

    public String getVarName () {
        return globalVarName.getValue();
    }
    
    @Override
    public Object evaluateInternal(final ExecutionContext ctx) {
        Variable o = ctx.getGlobalVariables().get(globalVarName.getValue());
        if (o==null) {
            logger.warn("Global variable '"+globalVarName.getValue()+"' is null. Is it configured?");
            return null;
        }
        return o.getValue();
    }

    @Override
	public Type analyzeInternal(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        return ctx.getObjectType();
    }
    
    @Override
	protected String toStringInternal() {
    	return "var "+globalVarName.getValue();
    }

}
