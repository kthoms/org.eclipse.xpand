/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.iface;

import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.NamedFunction;


//TODO add an 'init' method to pass in the string argument and the backend typesystem?


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface BackendContributor {
    
    /**
     * This method is used by the middle end to resolve type literals. This Contributor
     *  should return "null" if it does not feel responsible for a giben type literal.
     */
    BackendType convertToType (List<String> segments);
    
    Collection<NamedFunction> getContributedFunctions ();
}
