/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.xtend.plugin;

import org.eclipose.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipose.xtend.middleend.plugins.LanguageSpecificMiddleEndFactory;
import org.eclipse.xtend.middleend.xtend.OldXtendRegistry;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class OldXtendRegistryFactory implements LanguageSpecificMiddleEndFactory {

    public LanguageSpecificMiddleEnd create (Object specificData) {
        return new OldXtendRegistry (specificData);
    }

    public String getName () {
        return "Xtend";
    }

    public int getPriority () {
        return 0;
    }
}
