/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipose.xtend.middleend;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipose.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.functions.FunctionDefContextFactory;


/**
 * This class is the generic entry point for parsing and executing code. Different
 *  languages can contribute their specific middle ends using extension points.<br>
 *  
 * MiddleEnd instances are stateful in that they preserve caching of the contributed 
 *  middle ends. They also preserve a single ExecutionContext instance throughout their
 *  life span, but they expose it to allows using code to selectively manipulate and / or
 *  re-initialize it between invocations. 
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class MiddleEnd {
    private static final Log _log = LogFactory.getLog (MiddleEnd.class);
    
    private final List<LanguageSpecificMiddleEnd> _languageHandlers;
    private final ExecutionContext _ctx;
    private final BackendTypesystem _ts;
    
    /**
     * The map with "specific params" is used to initialize the contributed middle ends.
     *  The key must be the class implementing the LanguageSpecificMiddleEnd interface
     *  and contributed via the extension point.
     */
    public MiddleEnd (BackendTypesystem ts, List<LanguageSpecificMiddleEnd> languageHandlers) {
        _ctx = BackendFacade.createExecutionContext (new FunctionDefContextFactory (ts).create(), ts, false);
        _ts = ts;
        _languageHandlers = languageHandlers;
    }
    
    private LanguageSpecificMiddleEnd findHandler (String resourceName) {
        for (LanguageSpecificMiddleEnd candidate: _languageHandlers) {
            if (candidate.canHandle (resourceName)) {
                _log.debug ("middle end " + candidate.getName() + " handles resource " + resourceName);
                return candidate;
            }
        }

        _log.warn ("no middle end for  resource " + resourceName);
        throw new IllegalArgumentException ("no middle end for resource " + resourceName);
    }
    
    /**
     * tells this middle end instance to apply the advice in a given resource to all
     *  subsequent invocations. 
     */
    public void applyAdvice (String resourceName) {
        for (AroundAdvice advice: findHandler(resourceName).getContributedAdvice(resourceName))
            _ctx.setAdviceContext (_ctx.getAdviceContext().copyWithAdvice (advice));
    }
    
    public FunctionDefContext getFunctions (String resourceName) {
        return findHandler (resourceName).getContributedFunctions (resourceName);
    }
    
    
    /**
     * This method exposes the execution context to using code with the explicit purpose of allowing others to
     *  inspect and manipulate / re-initialize it partially or in toto. <br>
     *  
     * But beware: This data structure is used directly by the runtime, and modifications can significantly
     *  influence behavior at runtime!
     */
    public ExecutionContext getExecutionContext () {
        return _ctx;
    }
    
    public BackendTypesystem getTypesystem () {
        return _ts;
    }
}
