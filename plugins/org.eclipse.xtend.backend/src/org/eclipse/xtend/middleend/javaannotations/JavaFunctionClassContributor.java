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

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.javaannotations.internal.JavaDefinedFunction;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.ParsedResource;


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
    
    public ParsedResource parseResource (String resourceName) {
        final ParsedResource result = new ParsedResource ();
        
        if (classAsResource (Object.class).equals (resourceName))
            return result;
        
        //TODO imports
        //TODO advice
        //TODO guards

        final Class<?> cls = getCls (resourceName);
        
        for (Method mtd: cls.getDeclaredMethods()) {
            // register only public methods
            if (! isPublic (mtd))
                continue;

            if(isInfrastructureMethod (mtd, cls))
                continue;
            
            if (mtd.getAnnotation (M2tNoFunction.class) != null)
                continue;
         
            final boolean isPublicFunction = (mtd.getAnnotation (M2tPrivateFunction.class) == null);
            final NamedFunction f = new NamedFunction (mtd.getName(), new JavaDefinedFunction (mtd, null, _middleEnd.getTypesystem()));
            
            if (isPublicFunction)
                result.getPublicFunctions().add (f);
            else
                result.getPrivateFunctions().add (f);
        }
        
        return result;
    }

    private boolean isPublic (Method mtd) {
        return (mtd.getModifiers() & Modifier.PUBLIC) != 0;
    }
    
    private boolean isInfrastructureMethod (Method mtd, Class<?> cls) {
        if (ExecutionContextAware.class.isAssignableFrom (cls)) {
            try {
                ExecutionContextAware.class.getMethod (mtd.getName(), mtd.getParameterTypes());
                return true;
            }
            catch (NoSuchMethodException e) {
            }
        }
        return false;
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
