/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.FunctionDefContextFactory;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.MetaModel;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class XtendBackendFacade {
    private final OldXtendRegistry _registry;
    private final String _xtendFile;
    private final BackendTypesystem _ts;

    
    /**
     * This method invokes a "stand alone" expression that knows nothing about any functions defined in files. It is useful for
     *  *very* simple use cases, and for testing purposes. <br>
     *  
     * Both mms and localVars may be null.
     */
    public static Object evaluateExpression (String expression, Collection<MetaModel> mms, Map<String, Object> localVars) {
        return evaluateExpression (expression, mms, localVars, null);
    }
        
    public static Object evaluateExpression (String expression, Collection<MetaModel> mms, Map<String, Object> localVars, Map<String, Object> globalVars) {
        return evaluateExpression (expression, null, null, mms, localVars, globalVars);
    }

    /**
     * This method invokes an expression that may call functions from an Xtend file.<br>
     * 
     * The fileEncoding may be null, in which case the platform's default encoding is used. Both mms and localVars may be null.
     */
    public static Object evaluateExpression (String expression, String initialXtendFileName, String fileEncoding, Collection<MetaModel> mms, Map<String, Object> localVars) {
        return evaluateExpression (expression, initialXtendFileName, fileEncoding, mms, localVars, null);
    }
        
    public static Object evaluateExpression (String expression, String initialXtendFileName, String fileEncoding, Collection<MetaModel> mms, Map<String, Object> localVars, Map<String, Object> globalVars) {
        if (localVars == null)
            localVars = new HashMap<String, Object> ();
        if (globalVars == null)
            globalVars = new HashMap<String, Object> ();
        if (mms == null)
            mms = new ArrayList<MetaModel> ();

        final Expression oldAst = ParseFacade.expression (expression);
        
        ExecutionContextImpl ctx = new ExecutionContextImpl ();
        for (MetaModel mm: mms)
            ctx.registerMetaModel (mm);
        for (String varName: localVars.keySet())
            ctx = (ExecutionContextImpl) ctx.cloneWithVariable (new Variable (varName, ctx.getType (localVars.get (varName))));
            
        final BackendTypesystem ts = OldXtendHelper.guessTypesystem (mms);
        final TypeToBackendType typeConverter = new TypeToBackendType (ts, ctx);
        
        final ExpressionBase newAst = new OldExpressionConverter (ctx, typeConverter, "<no file>").convert(oldAst);

        final FunctionDefContext fdc = (initialXtendFileName != null) ? createForFile (initialXtendFileName, fileEncoding, mms).getFunctionDefContext() : new FunctionDefContextFactory (ts).create();
        final ExecutionContext newCtx = BackendFacade.createExecutionContext (fdc, ts, true); //TODO configure isLogStacktrace
        newCtx.getLocalVarContext().getLocalVars().putAll (localVars);
        newCtx.getGlobalParamContext().getGlobalParams().putAll (globalVars);

        return newAst.evaluate (newCtx);
    }
    
    /**
     * This function invokes a single Xtend function, returning the result. The fileEncoding may be null, in which case the platform's default file
     *  encoding is used.
     */
    public static Object invokeXtendFunction (String xtendFileName, String fileEncoding, Collection<MetaModel> mms, String functionName, Object... parameters) {
        final XtendBackendFacade xbf = createForFile (xtendFileName, fileEncoding, mms);
        final FunctionDefContext fdc = xbf.getFunctionDefContext();
        final ExecutionContext ctx = BackendFacade.createExecutionContext (fdc, OldXtendHelper.guessTypesystem (mms), true); //TODO configure isLogStacktrace
        return fdc.invoke (ctx, functionName, Arrays.asList (parameters));
    }
    
    
    public static XtendBackendFacade createForFile (String xtendFileName, String fileEncoding, Collection<MetaModel> mms) {
        return new XtendBackendFacade (xtendFileName, fileEncoding, mms);
    }
    
    private XtendBackendFacade (String xtendFileName, String fileEncoding, Collection<MetaModel> mms) {
        if (mms == null)
            mms = new ArrayList<MetaModel> ();
        
        fileEncoding = OldXtendHelper.normalizedFileEncoding (fileEncoding);
        _xtendFile = OldXtendHelper.normalizeXtendResourceName (xtendFileName);
        _ts = OldXtendHelper.guessTypesystem (mms);
        
        final ExecutionContextImpl ctx = new ExecutionContextImpl ();
        for (MetaModel mm: mms)
            ctx.registerMetaModel (mm);
        ctx.setFileEncoding (fileEncoding); 

        //TODO redesign to allow reuse of the registry?
        _registry = new OldXtendRegistry ( ctx, _ts);
        _registry.registerExtension (xtendFileName);
    }
    
    public Collection<NamedFunction> getContributedFunctions () {
        return _registry.getContributedFunctions (_xtendFile);
    }
    
    public FunctionDefContext getFunctionDefContext () {
        if (getContributedFunctions().isEmpty())
            return new FunctionDefContextFactory(_ts).create();
        
        return ((SourceDefinedFunction) getContributedFunctions().iterator().next().getFunction()).getFunctionDefContext();
    }
}


