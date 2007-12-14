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

package org.eclipse.xtend.check;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;

public class CheckComponent extends AbstractExpressionsUsingWorkflowComponent {

    private String expression = null;

    private List<String> checkFiles = new ArrayList<String>();

    private boolean abortOnError = true;

    private boolean warnIfNothingChecked = false;

    private String emfAllChildrenSlot;

    public void setAbortOnError(final boolean abortOnError) {
        this.abortOnError = abortOnError;
    }

    public void addCheckFile(final String checkFile) {
        this.checkFiles.add(checkFile);
    }

    public void setExpression(final String expression) {
        this.expression = expression;
    }

    public void setWarnIfNothingChecked(boolean b) {
        warnIfNothingChecked = b;
    }

    public void setEmfAllChildrenSlot(final String childExpression) {
        emfAllChildrenSlot = childExpression;
    }
    
    public String getLogMessage() {
    	StringBuilder b = new StringBuilder();
    	if ( emfAllChildrenSlot != null ) {
    		b.append("slot "+emfAllChildrenSlot+" ");
    	} else {
    		b.append("expression "+expression+" ");
    	}
    	b.append( "check file(s): ");
    	for (String f: checkFiles) {
    		b.append( f+" ");
		}
    	return b.toString();
    }    

    
    @Override
    protected void invokeInternal2(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
        final ExecutionContextImpl executionContext = getExecutionContext(ctx);
        if (monitor!=null) {
        	executionContext.setMonitor(monitor);
        }

        final Collection<?> model = getExpressionResult(executionContext, ctx, expression);

        for (String checkFile : checkFiles) {
            CheckFacade.checkAll(checkFile, model, executionContext, issues, warnIfNothingChecked);
        }

        if (abortOnError && issues.hasErrors())
            throw new WorkflowInterruptedException("Errors during validation.");
    }

   

    public void checkConfiguration(final Issues issues) {
        super.checkConfiguration(issues);
        
        if ((expression == null) && (emfAllChildrenSlot != null)) {
            expression = emfAllChildrenSlot + ".eAllContents.union( {" + emfAllChildrenSlot + "} )";
        } else if ((expression != null) && (emfAllChildrenSlot == null)) {
            // ok - do nothing, expression already has a reasonable value
        } else {
            issues.addError(this, "You have to set one of the properties 'expression' and 'emfAllChildrenSlot'!");
        }
        if (checkFiles.isEmpty()) {
            issues.addError(this, "Property 'checkFile' not set!");
        }
    }

    private Collection<?> getExpressionResult(final ExecutionContext exeCtx, final WorkflowContext context, final String expression2) {
        final ExpressionFacade f = new ExpressionFacade(exeCtx);
        final Map<String, Object> ctx = new HashMap<String, Object>();
        final String[] names = context.getSlotNames();
        for (int i = 0; i < names.length; i++) {
            final String name = names[i];
            ctx.put(name, context.get(name));
        }
        final Object result = f.evaluate(expression2, ctx);
        if (result instanceof Collection)
            return (Collection<?>) result;
        else if (result == null)
            return Collections.EMPTY_SET;
        else
            return Collections.singleton(result);

    }
}
