/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types.java.internal;

import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.functions.java.internal.JavaBuiltinConverterFactory;
import org.eclipse.xtend.backend.util.ErrorHandler;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class AbstractJavaBeansTypesystem implements BackendTypesystem {
    private BackendTypesystem _rootTypesystem = null;
    private Map<Class<?>, JavaBeansType> _cache = new HashMap<Class<?>, JavaBeansType>(); // this is necessary to avoid endless recursion!
    
    public BackendType findType (Class<?> cls) {
        if (cls == Object.class)
            return null;

        final BackendType nonstandardBuiltin = JavaBuiltinConverterFactory.getTypeForAdditionalBuiltin (cls);
        if (nonstandardBuiltin != null)
            return nonstandardBuiltin;
        
        if (! matchesScope (cls))
            return null;

        JavaBeansType result = _cache.get (cls);
        if (result != null)
            return result;
        
        result = new JavaBeansType (cls);
        _cache.put (cls, result);
        
        try {
            result.init (this);
        } catch (IntrospectionException e) {
            ErrorHandler.handle(e);
        }
        return result;
    }
    
    public BackendType findType (Object o) {
        if (o == null)
            return null;
        
        return findType (o.getClass());
    }

    /**
     * This operation allows support for type system instances that are selective, e.g. by package, as
     *  to which classes they feel responsible for. 
     */
    public abstract boolean matchesScope (Class<?> cls);


    public BackendTypesystem getRootTypesystem () {
        return _rootTypesystem;
    }

    public void setRootTypesystem (BackendTypesystem ts) {
        _rootTypesystem = ts;
    }
}
