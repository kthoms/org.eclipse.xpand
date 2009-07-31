/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend;

import java.util.List;
import java.util.Map;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.middleend.internal.Activator;
import org.eclipse.xtend.middleend.internal.MiddleEndImpl;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;


/**
 * This class encapsulates the OSGi / Eclipse extension registry specific behavior and
 *  initialization code. It serves as an optional wrapper / convenience initialization
 *  code for the actual MiddleEnd class.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class MiddleEndFactory {
    /**
     * This method creates a MiddleEnd instance based on an explicitly provided list of handlers. It works without
     *  OSGi.
     */
    public static MiddleEnd create (BackendTypesystem ts, List<LanguageSpecificMiddleEnd> languageHandlers) {
        return new MiddleEndImpl (ts, languageHandlers);
    }
    
    /**
     * This method creates a middle end based on the handlers registered with the extension point. It relies
     *  on OSGi and makes use of the Eclipse extension registry.<br>
     * 
     * The map with "specific params" is used to initialize the contributed middle ends.
     *  The key must be the class implementing the LanguageSpecificMiddleEnd interface
     *  and contributed via the extension point.
     */
    public static MiddleEnd createFromExtensions (BackendTypesystem ts, Map<Class<?>, Object> specificParams) {
        return new MiddleEndImpl (ts, Activator.getInstance().getFreshMiddleEnds (specificParams));
    }
    
    public static boolean canCreateFromExtentions () {
		if (Activator.getInstance() != null) 
			return true;
		else
			return false;
	}
}
