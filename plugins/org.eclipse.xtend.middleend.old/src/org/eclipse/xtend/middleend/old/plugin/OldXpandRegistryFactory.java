/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.old.plugin;

import org.eclipose.xtend.middleend.MiddleEnd;
import org.eclipose.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipose.xtend.middleend.plugins.LanguageSpecificMiddleEndFactory;
import org.eclipse.xtend.middleend.old.internal.xpand.OldXpandRegistry;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class OldXpandRegistryFactory implements LanguageSpecificMiddleEndFactory {

    public LanguageSpecificMiddleEnd create (MiddleEnd middleEnd, Object specificData) {
        return new OldXpandRegistry (middleEnd, specificData);
    }

    public String getName () {
        return "Xpand";
    }

    public int getPriority () {
        return 0;
    }
}
