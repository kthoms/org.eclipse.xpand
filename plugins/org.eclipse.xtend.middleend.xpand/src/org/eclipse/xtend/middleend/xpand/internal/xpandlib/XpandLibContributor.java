/*
Copyright (c) 2009 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend.xpand.internal.xpandlib;

import static org.eclipse.xtend.middleend.javaannotations.JavaFunctionClassContributor.classAsResource;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.DuplicateAwareNamedFunctionCollection;
import org.eclipse.xtend.middleend.MiddleEnd;

/**
 * This class registers functions from the XpandLib at the middleend
 * 
 * @author André Arnold
 *
 */
public class XpandLibContributor {
    private final DuplicateAwareNamedFunctionCollection _functions = new DuplicateAwareNamedFunctionCollection ();

    public XpandLibContributor (MiddleEnd middleEnd) {
        registerExtensionClass (middleEnd, XpandProtectedRegionOperations.class);
    }

    private void registerExtensionClass (MiddleEnd middleEnd, Class<?> cls) {
        for (NamedFunction f: middleEnd.getFunctions (classAsResource (cls)).getPublicFunctions())
            _functions.register (f);
    }

    public Collection<NamedFunction> getContributedFunctions () {
        return _functions.getFunctions();
    }
    
	public Collection<String> getContributingResources () {
    	return Arrays.asList (classAsResource (XpandProtectedRegionOperations.class));
    }

}
