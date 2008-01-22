/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipose.xtend.middleend;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.functions.FunctionDefContextImpl;
import org.eclipse.xtend.backend.syslib.SyslibContributor;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class FunctionDefContextFactory {
    private final SyslibContributor _syslib;
    
    public FunctionDefContextFactory (BackendTypesystem ts) {
        _syslib = new SyslibContributor (ts);
    }
    
    public FunctionDefContextImpl create () {
        return new FunctionDefContextImpl (_syslib);
    }

}
