/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.plugins;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.common.NamedFunction;


/**
 * This class represents all information about a resource that is relevant for the backend. 
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ParsedResource {
    private final List<ImportedResource> _imports = new ArrayList<ImportedResource> ();
    private final List<NamedFunction> _privateFunctions = new ArrayList<NamedFunction> ();
    private final List<NamedFunction> _publicFunctions = new ArrayList<NamedFunction> ();
    private final List<AroundAdvice> _advice = new ArrayList<AroundAdvice> ();
    
    public List<ImportedResource> getImports () {
        return _imports;
    }
    
    public List<NamedFunction> getPrivateFunctions () {
        return _privateFunctions;
    }
    
    public List<NamedFunction> getPublicFunctions () {
        return _publicFunctions;
    }
    
    public List<AroundAdvice> getAdvice () {
        return _advice;
    }
}
