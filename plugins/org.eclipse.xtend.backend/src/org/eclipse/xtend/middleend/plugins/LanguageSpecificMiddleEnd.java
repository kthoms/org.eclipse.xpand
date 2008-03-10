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

import org.eclipse.xtend.middleend.MiddleEnd;


/**
 * This interface is the common abstraction through which all handlers for different
 *  languages can contribute their middle ends.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface LanguageSpecificMiddleEnd {
    /**
     * This method is used to break the circular dependency between MiddleEnd and the
     *  language specific handlers. It is called by the MiddleEnd on creation.
     */
    void setMiddleEnd (MiddleEnd middleEnd);
    
    String getName ();
    
    /**
     * gives the middle end a way to declare if it can and wants to handle a given
     *  source file / resource. If and only if it returns true, it will be asked for
     *  the functions and advice provided in this resource.
     */
    boolean canHandle (String resourceName);
    
    /**
     * This method asks the middle end to parse a resource for which it declared
     *  that it is the appropriate handler, and return the functions contained therein.<br>
     *  
     * Implementations are not required to perform any caching because the MiddleEnd
     *  implementation takes care of that.
     */
    ParsedResource parseResource (String resourceName);
}
