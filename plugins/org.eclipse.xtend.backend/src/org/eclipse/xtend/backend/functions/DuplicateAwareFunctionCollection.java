/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.functions;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.xtend.backend.common.Function;


/**
 * This class collects functions. It removes an old one if a new one with identical signature is
 *  added, allowing overwriting. The check for "identical signature" is performed only if both
 *  functions have no guard. Functions with guards are never treated as having the same signature
 *  because an equality check would then require comparison of guards, a tricky undertaking which
 *  is left for a future version. 
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class DuplicateAwareFunctionCollection {
    private final Collection<Function> _allFunctions = new HashSet<Function>();

    
    /**
     * registers a function and returns the old function of the same signature if one was replaced, and null otherwise 
     */
    public Function register (Function f) { 
        Function result = null;
        
        for (Function candidate: _allFunctions) {
            if (haveSameSignature (f, candidate)) {
                _allFunctions.remove (candidate);
                result = candidate;
                break;
            }
        }
        
        _allFunctions.add (f);
        return result;
    }
    
    
    /**
     * checks if this collection already contains a function with identical signature. 
     */
    public boolean contains (Function f) {
        for (Function candidate: _allFunctions)
            if (haveSameSignature(f, candidate))
                return true;
        
        return false;
    }

    
    public Collection<Function> getFunctions () {
        return _allFunctions;
    }
    
    
    /**
     * helper operation to compare two functions.
     */
    public static boolean haveSameSignature (Function f1, Function f2) {
        if (f1.getGuard() != null || f2.getGuard() != null)
            return false;

        return f1.getParameterTypes().equals (f2.getParameterTypes());
    }
} 

