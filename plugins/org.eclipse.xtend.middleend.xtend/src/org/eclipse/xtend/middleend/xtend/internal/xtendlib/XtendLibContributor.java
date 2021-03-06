/*
Copyright (c) 2008 Arno Haase, Andr� Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    Andr� Arnold
 */
package org.eclipse.xtend.middleend.xtend.internal.xtendlib;

import static org.eclipse.xtend.middleend.javaannotations.JavaFunctionClassContributor.classAsResource;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.DuplicateAwareNamedFunctionCollection;
import org.eclipse.xtend.middleend.MiddleEnd;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author Andr� Arnold
 */
public class XtendLibContributor {
    private final DuplicateAwareNamedFunctionCollection _functions = new DuplicateAwareNamedFunctionCollection ();

    public XtendLibContributor (MiddleEnd middleEnd) {
        registerExtensionClass (middleEnd, XtendBuiltinOperations.class);
        registerExtensionClass (middleEnd, XtendCollectionOperations.class);
        registerExtensionClass (middleEnd, XpandIsDeleteLine.class);
        registerExtensionClass (middleEnd, XtendGlobalVarOperations.class);
    }

    private void registerExtensionClass (MiddleEnd middleEnd, Class<?> cls) {
        for (NamedFunction f: middleEnd.getFunctions (classAsResource (cls)).getPublicFunctions())
            _functions.register (f);
    }

    public Collection<NamedFunction> getContributedFunctions () {
        return _functions.getFunctions();
    }
    
	public Collection<String> getContributingResources () {
    	return Arrays.asList (
    			classAsResource (XtendBuiltinOperations.class), 
    			classAsResource (XtendCollectionOperations.class), 
    			classAsResource (XpandIsDeleteLine.class), 
    			classAsResource (XtendGlobalVarOperations.class));
    }
}
