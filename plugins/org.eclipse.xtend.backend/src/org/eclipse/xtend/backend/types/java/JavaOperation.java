/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types.java;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.functions.java.JavaBuiltinConverter;
import org.eclipse.xtend.backend.functions.java.JavaBuiltinConverterFactory;
import org.eclipse.xtend.backend.functions.java.ParameterConverter;
import org.eclipse.xtend.backend.util.CollectionHelper;
import org.eclipse.xtend.backend.util.ErrorHandler;



/**
 * This class defines an operation defined as a method of a Java class, Java Beans style. The
 *  object on which the method is called is passed in as the first parameter of the function.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class JavaOperation implements Function {
    private final Method _mtd;
    private final List<BackendType> _parameterTypes;
    private final ExpressionBase _guard;

    private final List<ParameterConverter> _parameterConverters = new ArrayList<ParameterConverter>();
    private final JavaBuiltinConverter _returnValueConverter;
    
    public JavaOperation (Method mtd, List<BackendType> parameterTypes, ExpressionBase guard) {
        _mtd = mtd;
        _parameterTypes = parameterTypes;
        _guard = guard;
        
        for (int i=0; i<mtd.getParameterTypes().length; i++) {
            final ParameterConverter pc = JavaBuiltinConverterFactory.getParameterConverter (mtd.getParameterTypes()[i], i);
            if (pc != null)
                _parameterConverters.add(pc);
        }
        
        _returnValueConverter = JavaBuiltinConverterFactory.getConverter (mtd.getReturnType());
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

        try {
            final Object resultRaw = _mtd.invoke (params[0], CollectionHelper.withoutFirst (params));
            return _returnValueConverter.javaToBackend (resultRaw);
        } catch (Exception e) {
            ErrorHandler.handle (e);
            return null; // just for the compiler - this is never executed
        }
    }
    
    public ExpressionBase getGuard () {
    	return _guard;
    }
}













