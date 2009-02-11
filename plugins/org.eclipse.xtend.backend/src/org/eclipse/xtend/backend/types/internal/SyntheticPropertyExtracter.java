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
package org.eclipse.xtend.backend.types.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.Property;
import org.eclipse.xtend.backend.util.Cache;
import org.eclipse.xtend.backend.util.Pair;


//TODO inherit from AbstractProperty after JavaConverter is removed from it

/**
 * This class creates properties from the functions of a given type by matching
 *  against Java Bean naming conventions.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class SyntheticPropertyExtracter {
    private final Cache<String, AccessorPair> _accessorPairs = new Cache<String, AccessorPair> () {

        @Override
        protected AccessorPair create (String key) {
            return new AccessorPair ();
        }
    };
    
    private final BackendType _owner;
    
    public SyntheticPropertyExtracter (ExecutionContext ctx, BackendType type) {
        _owner = type;
        
        final Collection<NamedFunction> _allFunctions = ctx.getFunctionDefContext().getByFirstParameterType (type);
        
        for (NamedFunction f: _allFunctions) {
            final Pair<Boolean, String> propAcc = getPropertyAccessorDetails (f);
            
            if (propAcc == null)
                continue;
            
            final AccessorPair ap = _accessorPairs.get (refinePropertyName (propAcc.getSecond()));
            
            final boolean isSetter = propAcc.getFirst();
            if (isSetter)
                ap._setterName = f.getName().getSimpleName();
            else
                ap._getterName = f.getName().getSimpleName();
        }
    }

    public Map<String, Property> getProperties () {
        final Map<String, Property> result = new HashMap<String, Property> ();
        
        for (String propName: _accessorPairs.getMap().keySet()) {
            final AccessorPair ap = _accessorPairs.get (propName);
            result.put (propName, new FunctionBackedProperty (propName, ap._getterName, ap._setterName, _owner));
        }
        
        return result;
    }
  
    
    /**
     * This method implements the Java Beans conventions for property accessors, but on NamedFunctions
     *  rather then Methods
     */
    private static Pair<Boolean, String> getPropertyAccessorDetails (NamedFunction f) {
        if (f.getFunction().getGuard() != null)
            return null;
        
        if (hasPrefix (f.getName().getSimpleName(), "set")) { 
            if (f.getFunction().getParameterTypes().size() != 2)
                return null;

            return new Pair<Boolean, String> (true, f.getName().getSimpleName().substring (3));
        }

        if (f.getFunction().getParameterTypes().size() != 1)
            return null;
        
        if (hasPrefix (f.getName().getSimpleName(), "get") || hasPrefix (f.getName().getSimpleName(), "has"))
            return new Pair<Boolean, String> (false, f.getName().getSimpleName().substring (3));
        
        if (hasPrefix (f.getName().getSimpleName(), "is"))
            return new Pair<Boolean, String> (false, f.getName().getSimpleName().substring (2));
        
        return null;
    }
    
    private static boolean hasPrefix (String functionName, String prefix) {
        if (! functionName.startsWith (prefix))
            return false;
        
        if (functionName.length() < prefix.length() + 1)
            return false;
        
        return Character.isUpperCase (functionName.charAt(prefix.length()));
    }

    private static String refinePropertyName (String rawName) {
        if (rawName.length() >= 2 && Character.isUpperCase (rawName.charAt (1)))
            return rawName;
        
        return Character.toLowerCase(rawName.charAt (0)) + rawName.substring (1);
    }
    
    private static class AccessorPair {
        public String _getterName;
        public String _setterName;
    }
}
