/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.old.internal.xtendlib;

import java.util.Collection;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.DuplicateAwareNamedFunctionCollection;
import org.eclipse.xtend.backend.functions.java.JavaFunctionClassContributor;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class XtendLibContributor {
    private final DuplicateAwareNamedFunctionCollection _functions = new DuplicateAwareNamedFunctionCollection ();

    public XtendLibContributor (BackendTypesystem ts) {
        registerExtensionClass (ts, XtendCollectionOperations.class);
        registerExtensionClass (ts, XpandIsDeleteLine.class);
        registerExtensionClass (ts, XtendGlobalVarOperations.class);
    }

    private void registerExtensionClass (BackendTypesystem ts, Class<?> cls) {
        for (NamedFunction f: new JavaFunctionClassContributor (cls, ts).getContributedFunctions())
            _functions.register (f);
    }

    public Collection<NamedFunction> getContributedFunctions () {
        return _functions.getFunctions();
    }
}
