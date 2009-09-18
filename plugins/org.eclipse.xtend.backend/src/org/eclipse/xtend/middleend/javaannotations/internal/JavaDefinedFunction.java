/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.javaannotations.internal;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.functions.AbstractFunction;
import org.eclipse.xtend.backend.functions.java.internal.JavaBuiltinConverter;
import org.eclipse.xtend.backend.functions.java.internal.JavaBuiltinConverterFactory;
import org.eclipse.xtend.backend.functions.java.internal.ParameterConverter;
import org.eclipse.xtend.backend.util.ErrorHandler;
import org.eclipse.xtend.middleend.javaannotations.ExecutionContextAware;
import org.eclipse.xtend.middleend.javaannotations.M2tCached;


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
public final class JavaDefinedFunction extends AbstractFunction {
    private final Method _mtd;
    private final boolean _isStatic;
    
    private final List<ParameterConverter> _parameterConverters = new ArrayList<ParameterConverter>();
    private final JavaBuiltinConverter _returnValueConverter;
    
    
    /**
     *  shortcut constructor that attempts to derive the parameter types from the method's signature
     */
    public JavaDefinedFunction (Method mtd, ExpressionBase guard, BackendTypesystem ts) {
        this (mtd, guessParameterTypes (mtd, ts), ts.findType (mtd.getReturnType()), guard);
    }
    
    
    /**
     * This constructor provides full control
     */
    public JavaDefinedFunction (Method mtd, List<BackendType> parameterTypes, BackendType returnType, ExpressionBase guard) {
        super (guard, parameterTypes, returnType, mtd.getAnnotation (M2tCached.class) != null);
        
        _mtd = mtd;
        
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
            final List<String> paramTypes = new ArrayList<String> ();
            for (Object p: params) {
                if (p == null)
                    paramTypes.add (Void.TYPE.getName());
                else
                    paramTypes.add (p.getClass().getName());
            }
            
            ErrorHandler.handle ("could not invoke method " + _mtd + " with parameters " + Arrays.asList(params) + " of types " + paramTypes, e);
            return null; // to make the compiler happy - this is never executed
        }
    }
	
	@Override
	public String toString () {
	    return "JavaDefinedFunction '" + getName() + "' " + getParameterTypes();
	}
}













