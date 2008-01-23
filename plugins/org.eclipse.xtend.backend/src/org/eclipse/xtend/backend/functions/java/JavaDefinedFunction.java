/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.functions.java;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.util.ErrorHandler;


/**
 * This class represents a "helper" function that is defined in a Java class but for which the defining
 *  object is not an explicit parameter. It is used for "JAVA extension" style functions. <br>
 *  
 * If it represents a non-static method, a single instance of the underlying class is shared by all methods 
 *  of the class, and across all compilation units etc. from which they are referenced. This single instance
 *  is scoped with the ExecutionContext used.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class JavaDefinedFunction implements Function {
    private final Method _mtd;
    private final List<BackendType> _parameterTypes;
    private final ExpressionBase _guard;
    private final boolean _isStatic;

    private final List<ParameterConverter> _parameterConverters = new ArrayList<ParameterConverter>();
    private final JavaBuiltinConverter _returnValueConverter;
    
    
    /**
     * This is a convenience factory method that creates functions for all public methods for an entire class.
     */
    public static List<JavaDefinedFunction> createForEntireClass (Class<?> cls, BackendTypesystem ts) {
        final List<JavaDefinedFunction> result = new ArrayList<JavaDefinedFunction>();
        
        for (Method mtd: cls.getDeclaredMethods()) {
            // register only public methods
            if (! isPublic (mtd))
                continue;

            // do not register infrastructure methods inherited from ExecutionContextAware
            if (ExecutionContextAware.class.isAssignableFrom (cls)) {
                try {
                    ExecutionContextAware.class.getMethod (mtd.getName(), mtd.getParameterTypes());
                    continue;
                }
                catch (NoSuchMethodException e) {
                }
            }
            
            if (mtd.getAnnotation (M2tHidden.class) != null)
                continue;
            
            result.add (new JavaDefinedFunction (mtd, null, ts));
        }
        return result;
    }

    private static boolean isPublic (Method mtd) {
        return (mtd.getModifiers() & Modifier.PUBLIC) != 0;
    }

    
    /**
     *  shortcut constructor that attempts to derive the parameter types from the method's signature
     */
    public JavaDefinedFunction (Method mtd, ExpressionBase guard, BackendTypesystem ts) {
        this (mtd, guessParameterTypes(mtd, ts), guard);
    }
    
    
    /**
     * This constructor provides full control
     */
    public JavaDefinedFunction (Method mtd, List<BackendType> parameterTypes, ExpressionBase guard) {
        _mtd = mtd;
        _parameterTypes = parameterTypes;
        _guard = guard;
        
        for (int i=0; i<mtd.getParameterTypes().length; i++) {
            final ParameterConverter pc = JavaBuiltinConverterFactory.getParameterConverter (mtd.getParameterTypes()[i], i);
            if (pc != null)
                _parameterConverters.add(pc);
        }
        
        _returnValueConverter = JavaBuiltinConverterFactory.getConverter (mtd.getReturnType());
        
        _isStatic = (mtd.getModifiers() & Modifier.STATIC) != 0;
    }

    private Object getInstance (ExecutionContext ctx) {
        if (_isStatic)
            return null;

        try {
            Object result = ctx.getContributionStateContext().retrieveState (_mtd.getDeclaringClass());
            if (result == null) {
                result = _mtd.getDeclaringClass().newInstance();
                ctx.getContributionStateContext().storeState(_mtd.getDeclaringClass(), result);
            }
            return result;
        }
        catch (Exception exc) {
            ErrorHandler.handle (exc);
            return null; // just for the compiler - this is never executed
        }
    }
    
    public static List<BackendType> guessParameterTypes (Method mtd, BackendTypesystem ts) {
        final List<BackendType> result = new ArrayList<BackendType>();
        
        for (Class<?> cls: mtd.getParameterTypes()) 
            result.add (ts.findType (cls));
        
        return result;
    }
    
    public String getName () {
    	return _mtd.getName();
    }
    
    public boolean isCached () {
        return false;
    }
    
    public List<BackendType> getParameterTypes() {
        return _parameterTypes;
    }

    public Object invoke (ExecutionContext ctx, Object[] params) {
        for (ParameterConverter pc: _parameterConverters)
            pc.convert(params);
        
        Object o = getInstance (ctx);
        if (o instanceof ExecutionContextAware) {
            ((ExecutionContextAware) o).setExecutionContext (ctx);
        }
        
        try {
            final Object resultRaw = _mtd.invoke (o, params);
            return _returnValueConverter.javaToBackend (resultRaw);
            
        } catch (Exception e) {
            ErrorHandler.handle(e);
            return null; // to make the compiler happy - this is never executed
        }
    }
    
    public ExpressionBase getGuard () {
    	return _guard;
    }
	
	@Override
	public String toString () {
	    return "JavaDefinedFunction '" + getName() + "' " + _parameterTypes;
	}
}













