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
package org.eclipse.xtend.middleend.xtend.internal.xtend;

import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.functions.AbstractFunction;
import org.eclipse.xtend.backend.util.ErrorHandler;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
final class JavaExtensionFunction extends AbstractFunction {
    private final Method _mtd;

    public JavaExtensionFunction (Method mtd, boolean cached, List<? extends BackendType> paramTypes, BackendType returnType) {
        super (null, paramTypes, returnType, cached);
        _mtd = mtd;
    }
    
    public String getName () {
        return _mtd.getName();
    }

    public Object invoke (ExecutionContext ctx, Object[] params) {
        try {
            return _mtd.invoke (null, params);
        } catch (Exception e) {
            ErrorHandler.handle(e);
            return null; // to make the compiler happy - this is never executed
        }
    }
}
