/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.internal.xtend.util.ProfileCollector;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.expression.Variable;

public class XtendComponent extends AbstractExpressionsUsingWorkflowComponent {

    private final Log log = LogFactory.getLog(getClass());

    String extensionFile = null;
    
    private List<String> extensionAdvices = new ArrayList<String>();

    @Override
    public void addExtensionAdvice(String extensionAdvices) {
		if ( !this.extensionAdvices.contains(extensionAdvices) ) 
			this.extensionAdvices.add( extensionAdvices );
	}

    /** Stores the value of the 'invoke' property. Needed for error analysis. */ 
    private String invokeExpression;
    private String expression = null;

    private String collectProfileSummary = null;
    private String verboseProfileFilename = null;
    
    public void setCollectProfileSummary (String c) {
        collectProfileSummary = c;
    }
    
    public void setVerboseProfileFilename (String f) {
        verboseProfileFilename = f;
    }

    
    @Override
    public String getLogMessage() {
    	return "executing '"+extensionFile+"'";
    }
    
    public void setInvoke(final String invoke) {
    	invokeExpression = invoke;
        final int i = invoke.lastIndexOf("::");
        if (i != -1) {
            extensionFile = invoke.substring(0, i);
            expression = invoke.substring(i + 2);
        } else {
            expression = invoke;
        }
    }

    private String outputSlot = WorkflowContext.DEFAULT_SLOT;

    public void setOutputSlot(final String outputSlot) {
        this.outputSlot = outputSlot;
    }

    
    
    @Override
    public void invokeInternal2(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
        
        final InputStream in = getExtFileIS();
        if (in == null) {
            issues.addError("Cannot find extension file: "+extensionFile);
            return;
        }
        
        OutputStream verboseProfileOutputStream = null;

        if (verboseProfileFilename != null) {
            try {
                verboseProfileOutputStream = new BufferedOutputStream (new FileOutputStream (verboseProfileFilename));
                ProfileCollector.getInstance().setDetailedLoggingWriter(verboseProfileOutputStream);
            }
            catch (IOException exc) {
                log.warn("could not open profiling log file", exc);
            }
        }

        
        ExecutionContextImpl ec = getExecutionContext(ctx);
        
        for (String advice : extensionAdvices) {
            final String[] allAdvices = advice.split(",");
            for (int i = 0; i < allAdvices.length; i++) {
                final String string = allAdvices[i];
                ec.registerExtensionAdvices(string.trim());
            }
        }

        ec = (ExecutionContextImpl) ec.cloneWithResource(new Resource() {
            private String name = "noName";

            public String getFullyQualifiedName() {
                return name;
            }

            public void setFullyQualifiedName(final String fqn) {
                name = fqn;
            }

            public String[] getImportedNamespaces() {
                return new String[0];
            }

            public String[] getImportedExtensions() {
                return new String[] { extensionFile };
            }
        });
        final String[] slots = ctx.getSlotNames();
        for (int i = 0; i < slots.length; i++) {
            ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable(slots[i], ctx.get(slots[i])));
        }

        if (monitor!=null) {
        	ec.setMonitor(monitor);
        }
        
        final Object result = new ExpressionFacade(ec).evaluate(expression);
        ctx.set(outputSlot, result);

        ProfileCollector.getInstance().finish();
        if ("true".equalsIgnoreCase(this.collectProfileSummary)) {
            log.info ("profiling info: \n" + ProfileCollector.getInstance().toString());
        }
        
        if (verboseProfileOutputStream != null) {
            try {
                verboseProfileOutputStream.close ();
            }
            catch (IOException exc) {
                log.warn("problem closing profile log file", exc);
            }
        }
    }

    private InputStream getExtFileIS() {
        final InputStream in = ResourceLoaderFactory.createResourceLoader().getResourceAsStream(
                extensionFile.replace("::", "/")+".ext");
        return in;
    }

    @Override
    public void checkConfiguration(final Issues issues) {
        super.checkConfiguration(issues);
        
        // Try to create detailed error message (see Bug#172567)
        String compPrefix = getId()!=null ? getId()+": " : "";
        
        if (invokeExpression==null || invokeExpression.trim().length()==0) {
            issues.addError(compPrefix+"Property 'invoke' not specified.");
            return;
        }
        if (extensionFile==null) {
            issues.addError(compPrefix+"Error parsing property 'invoke': Could not extract name of the extension file.");
            return;
        }
        if (getExtFileIS()==null || expression == null) {
            issues.addError(compPrefix+"Property 'invoke' not specified properly. AbstractExtension file '"+extensionFile+"' not found.");
            return;
        }
        if (expression==null) {
            issues.addError(compPrefix+"Error parsing property 'invoke': Could not extract the expression to invoke in extension file '"+extensionFile+"'.");
            return;
        }
        
    }

    
}
