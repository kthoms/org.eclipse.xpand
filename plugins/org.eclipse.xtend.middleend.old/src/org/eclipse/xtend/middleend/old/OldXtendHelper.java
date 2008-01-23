/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.old;

import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.xpand2.XpandUtil;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class OldXtendHelper {
    public static String normalizeXtendResourceName (String xtendName) {
        xtendName = xtendName.replace (SyntaxConstants.NS_DELIM, "/");
        if (xtendName.endsWith ("." + XtendFile.FILE_EXTENSION))
            xtendName = xtendName.substring (0, xtendName.length() - (XtendFile.FILE_EXTENSION.length() + 1));

        return xtendName;
    }
    
    public static String normalizeXpandResourceName (String xpandName) {
        if (! xpandName.endsWith("." + XpandUtil.TEMPLATE_EXTENSION))
            xpandName += "." + XpandUtil.TEMPLATE_EXTENSION;

        xpandName = xpandName.replace (SyntaxConstants.NS_DELIM, "/");
        
        return xpandName;
    }
    
    public static String xpandFileAsOldResourceName (String xpandName) {
        if (xpandName.toLowerCase().endsWith (XpandUtil.TEMPLATE_EXTENSION))
            xpandName = xpandName.substring (0, xpandName.length() - XpandUtil.TEMPLATE_EXTENSION.length() - 1);
        
        xpandName = xpandName.replace ("/", SyntaxConstants.NS_DELIM);
        
        return xpandName;
    }
}
