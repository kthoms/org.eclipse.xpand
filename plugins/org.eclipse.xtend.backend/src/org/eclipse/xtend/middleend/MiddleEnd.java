/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend;

import java.util.Map;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.middleend.plugins.ParsedResource;


/**
 * This interface is the generic entry point for parsing and executing code. Different
 *  languages can contribute their specific middle ends using extension points.<br>
 *  
 * MiddleEnd instances are stateful in that they preserve caching of the contributed 
 *  middle ends. They also preserve a single ExecutionContext instance throughout their
 *  life span, but they expose it to allows using code to selectively manipulate and / or
 *  re-initialize it between invocations. 
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface MiddleEnd {
    /**
     * tells this middle end instance to apply the advice in a given resource to all
     *  subsequent invocations. 
     */
    void applyAdvice (String resourceName);
    
    FunctionDefContext getFunctions (String resourceName);
    
    /**
     * This method exposes the execution context to using code with the explicit purpose of allowing others to
     *  inspect and manipulate / re-initialize it partially or in toto. <br>
     *  
     * But beware: This data structure is used directly by the runtime, and modifications can significantly
     *  influence behavior at runtime!
     */
    ExecutionContext getExecutionContext ();
    
    BackendTypesystem getTypesystem ();
    
    FunctionDefContextInternal createEmptyFdc ();
    
    Map<String, ParsedResource> getParsedResources ();
}
