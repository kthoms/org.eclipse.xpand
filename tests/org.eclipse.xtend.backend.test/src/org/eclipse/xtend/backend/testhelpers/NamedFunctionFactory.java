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
package org.eclipse.xtend.backend.testhelpers;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyFdc;

import java.util.Arrays;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.functions.AbstractFunction;
import org.eclipse.xtend.backend.types.CompositeTypesystem;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public abstract class NamedFunctionFactory extends AbstractFunction {
    private final String _name;
    
    public NamedFunctionFactory (String name, BackendType... paramTypes) {
        this (name, false, paramTypes);
    }
        
    public NamedFunctionFactory (String name, boolean cached, BackendType... paramTypes) {
        this (name, cached, createEmptyFdc (new CompositeTypesystem ()), paramTypes);
    }

    public NamedFunctionFactory (String name, boolean cached, FunctionDefContext fdc, BackendType... paramTypes) {
        super (null, Arrays.asList (paramTypes), cached);
        _name = name;
        setFunctionDefContext (fdc);
    }
    
    public NamedFunction create () {
        return new NamedFunction (new QualifiedName (_name), this);
    }
}
