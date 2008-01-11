package org.eclipse.xtend.backend.common;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface ExecutionContext {
    LocalVarContext getLocalVarContext ();
    void setLocalVarContext (LocalVarContext ctx);
    
    GlobalVarContext getGlobalVarContext (); 
    
    BackendTypesystem getTypesystem ();
    FunctionDefContext getFunctionDefContext ();
    void setFunctionDefContext (FunctionDefContext ctx);
    
    FunctionInvoker getFunctionInvoker ();
    CreationCache getCreationCache ();
    
    void logNullDeRef (SourcePos pos);
    
    ContributionStateContext getContributionStateContext ();
}
