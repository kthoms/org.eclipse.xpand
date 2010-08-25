/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.backend.common;

import java.util.Collection;
import java.util.List;


/**
 * A FunctionDefContext is roughly the backend representation of a compilation unit - it stands for all
 *  functions that are visible from a given point in the code, and every function knows the FunctionDefContext
 *  that is valid within its body.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public interface FunctionDefContext {
    Object invoke (ExecutionContext ctx, QualifiedName functionName, List<? extends Object> params);
    Object invoke (ExecutionContext ctx, QualifiedName functionName, List<? extends Object> params, boolean firstParamIsThis);
    
    /**
     * for reflection. This method returns all functions, both those separately registered and those "built into" the
     *  type.
     */
    Collection<NamedFunction> getByFirstParameterType (BackendType firstParameterType); 
    
    /**
     * for reflection. This method returns all functions, both those built-into the types and those
     *  registered separately.
     */
    Function getMatch (ExecutionContext ctx, QualifiedName name, List<BackendType> params);
    
    /**
     * for dynamic matching, e.g. to determine if a function should be called on a collection itself or
     *  on all of its members. This method matches against all functions, both those built into the
     *  types and those registered separately.
     */
    boolean hasMatch (ExecutionContext ctx, QualifiedName functionName, List<? extends Object> params);
    
    Collection<NamedFunction> getPublicFunctions ();

    Collection<NamedFunction> getAllFunctions ();
}
