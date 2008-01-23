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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.iface.BackendContributor;


/**
 * This class contributes no types, but all public methods in a Java class as functions, both static and
 *  non-static. Non-static methods share an instance of the providing class *per Contributor instance*.
 *  For more global sharing of the instance, Contributor instances must be shared. 
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class JavaFunctionClassContributor implements BackendContributor {
    private final List<NamedFunction> _functions = new ArrayList<NamedFunction>();

    public JavaFunctionClassContributor (Class<?> cls, BackendTypesystem ts) {
        for (JavaDefinedFunction f: JavaDefinedFunction.createForEntireClass (cls, ts))
            _functions.add (new NamedFunction (f.getName(), f));
    }

    public BackendType convertToType (List<String> segments) {
        return null; // no types are contributed
    }

    public Collection<NamedFunction> getContributedFunctions () {
        return _functions;
    }

}
