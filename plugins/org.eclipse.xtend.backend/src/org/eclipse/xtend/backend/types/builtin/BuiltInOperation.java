/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.types.builtin;

import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class BuiltInOperation implements Function {
    private final String _name;
    private final List<BackendType> _parameterTypes;

    public BuiltInOperation (String name, BackendType... paramTypes) {
        _name = name;
        _parameterTypes = Arrays.asList(paramTypes);
    }
    
    public ExpressionBase getGuard () {
        return null;
    }

    public String getName () {
        return _name;
    }

    public List<BackendType> getParameterTypes () {
        return _parameterTypes;
    }

    public boolean isCached () {
        return false;
    }
}
