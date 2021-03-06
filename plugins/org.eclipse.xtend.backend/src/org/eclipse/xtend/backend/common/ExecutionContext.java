/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.common;

import java.util.List;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface ExecutionContext {
    LocalVarContext getLocalVarContext ();
    void setLocalVarContext (LocalVarContext ctx);
    
    BackendTypesystem getTypesystem ();
    FunctionDefContext getFunctionDefContext ();
    void setFunctionDefContext (FunctionDefContext ctx);
    
    FunctionInvoker getFunctionInvoker ();
    CreationCache getCreationCache ();
    
    AdviceContext getAdviceContext ();
    void setAdviceContext (AdviceContext ctx);
    
    void logNullDeRef (SourcePos pos);
    
    boolean isLogStacktrace ();
    /**
     * Maintaining the stack trace requires expensive operations during regular 
     *  operation - it can not be done retrospectively. Therefore the stacktrace
     *  is maintained only if the isLogStacktrace flag is set, otherwise this
     *  method returns an empty list.
     */
    List<StacktraceEntry> getStacktrace ();
    
    ContributionStateContext getContributionStateContext ();
    
    /**
     * This list of "global" ExecutionListeners allows the registration of listeners that
     *  are notified of the evaluation of any expression. This is in addition to the list
     *  of listeners registered per expression node.<br>
     *  
     * Listeners registered per node are notified *before* (pre) these global listeners.
     */
    List<ExecutionListener> getGlobalExecutionListeners ();
}
