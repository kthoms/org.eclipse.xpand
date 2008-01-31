/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.syslib;

import java.io.InputStream;
import java.util.Collection;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.DuplicateAwareNamedFunctionCollection;
import org.eclipse.xtend.backend.functions.java.JavaFunctionClassContributor;
import org.eclipse.xtend.backend.util.ErrorHandler;
import org.eclipse.xtend.backend.util.ResourceToList;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class SyslibContributor {
    public static final String SYSLIB_EXTENSION_RESOURCE = "/xtend.syslib.extensions";
    
    private final DuplicateAwareNamedFunctionCollection _functions = new DuplicateAwareNamedFunctionCollection ();
    
    public SyslibContributor (BackendTypesystem ts) {
        // register built-in functions
        registerExtensionClass (ts, StringOperations.class);
        registerExtensionClass (ts, CollectionOperations.class);
        registerExtensionClass (ts, FileIoOperations.class);
        registerExtensionClass (ts, PrimitiveOperations.class);

        // allow external overwriting and extension
        final InputStream in = getClass().getResourceAsStream (SYSLIB_EXTENSION_RESOURCE);
        for (String s: new ResourceToList (in).getResult()) {
            try {
                registerExtensionClass(ts, Class.forName(s));
            } catch (ClassNotFoundException e) {
                ErrorHandler.handle (e);
            }
        }
    }

    private void registerExtensionClass (BackendTypesystem ts, Class<?> cls) {
        for (NamedFunction f: new JavaFunctionClassContributor (cls, ts).getContributedFunctions())
            _functions.register (f);
    }
    
    public Collection<NamedFunction> getContributedFunctions () {
        return _functions.getFunctions();
    }
}
