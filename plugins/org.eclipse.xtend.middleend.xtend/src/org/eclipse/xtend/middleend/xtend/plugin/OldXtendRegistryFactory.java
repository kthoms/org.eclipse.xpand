/*
Copyright (c) 2008, 2009 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.middleend.xtend.plugin;

import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEndFactory;
import org.eclipse.xtend.middleend.xtend.OldXtendRegistry;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class OldXtendRegistryFactory implements LanguageSpecificMiddleEndFactory {

    public final static String LANGUAGE_NAME = "Xtend";

	public LanguageSpecificMiddleEnd create (Object specificData) {
        return new OldXtendRegistry (specificData);
    }

    public String getName () {
        return LANGUAGE_NAME;
    }

    public int getPriority () {
        return 0;
    }
}
