/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.javaannotations;

import java.util.ArrayList;
import java.util.List;

import org.eclipose.xtend.middleend.MiddleEnd;
import org.eclipose.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;


/**
 * This class contributes no types, but all public methods in a Java class as functions, both static and
 *  non-static. Non-static methods share an instance of the providing class *per Contributor instance*.
 *  For more global sharing of the instance, Contributor instances must be shared. 
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class JavaFunctionClassContributor implements LanguageSpecificMiddleEnd {
    public static final String MIDDLE_END_NAME = "JavaAnnotations";
    
    private ResourceLoader _resourceLoader = null;
    private MiddleEnd _middleEnd = null;
    
    private ResourceLoader getResourceLoader () {
        if (_resourceLoader == null)
            _resourceLoader = ResourceLoaderFactory.createResourceLoader();
        
        return _resourceLoader;
    }
    
    public boolean canHandle (String resourceName) {
        return getCls (resourceName) != null;
    }

    private Class<?> getCls (String resourceName) {
        try {
            return getResourceLoader().loadClass (resourceName.replace('/', '.'));
        } catch (Throwable e) {
            return null;
        }
    }
    
    public List<AroundAdvice> getContributedAdvice (String resourceName) {
        return new ArrayList<AroundAdvice> (); //TODO add support for advice
    }

    public FunctionDefContext getContributedFunctions (String resourceName) {
        final FunctionDefContextInternal result = _middleEnd.createEmptyFdc();
        
        //TODO add support for imported resources
        
        for (JavaDefinedFunction f: JavaDefinedFunction.createForEntireClass (getCls (resourceName), _middleEnd.getTypesystem()))
            result.register (new NamedFunction (f.getName(), f), true); //TODO add support for non-public functions
        
        return result;
    }

    public String getName () {
        return MIDDLE_END_NAME;
    }
 
    public void setMiddleEnd (MiddleEnd middleEnd) {
        _middleEnd = middleEnd;
    }
    
    public static String classAsResource (Class<?> cls) {
        return cls.getName().replace('.', '/');
    }
}
