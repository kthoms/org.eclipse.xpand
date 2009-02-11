/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.middleend.xtend.internal;

import java.util.Collection;

import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.xpand2.XpandUtil;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.check.CheckUtils;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class OldHelper {
    public static BackendTypesystem guessTypesystem (Collection<MetaModel> mms) {
        boolean hasEmf = false;
        
        for (MetaModel mm: mms) {
            if (mm instanceof EmfRegistryMetaModel)
                hasEmf = true;
        }
        
        final CompositeTypesystem result = new CompositeTypesystem ();
        if (hasEmf)
            result.register (new EmfTypesystem ());
        //TODO register uml mm
        //TODO replace this by adding "asBackendType" to the frontend types
        
        return result;
    }

    
    public static String normalizedFileEncoding (String fileEncoding) {
        if (fileEncoding == null)
            return System.getProperty ("file.encoding");

        return fileEncoding;
    }
    
    public static String normalizeXtendResourceName (String xtendName) {
        if (xtendName == null)
            return null;
        
        xtendName = xtendName.replace (SyntaxConstants.NS_DELIM, "/");
        if (xtendName.endsWith ("." + XtendFile.FILE_EXTENSION))
            xtendName = xtendName.substring (0, xtendName.length() - (XtendFile.FILE_EXTENSION.length() + 1));
        if (xtendName.startsWith("/"))
            xtendName = xtendName.substring (1);
        
        return xtendName;
    }
    
    public static String normalizeXpandResourceName (String xpandName) {
        if (xpandName == null)
            return null;

        if (xpandName.endsWith("." + XpandUtil.TEMPLATE_EXTENSION))
            xpandName = xpandName.substring (0, xpandName.length() - XpandUtil.TEMPLATE_EXTENSION.length() - 1);

        xpandName = xpandName.replace (SyntaxConstants.NS_DELIM, "/");
        if (xpandName.startsWith ("/"))
            xpandName = xpandName.substring (1);
        
        return xpandName;
    }
    
    public static String normalizeCheckResourceName (String checkName) {
        if (checkName == null)
            return null;
        
        checkName = checkName.replace (SyntaxConstants.NS_DELIM, "/");
        if (checkName.endsWith ("." + XtendFile.FILE_EXTENSION))
            checkName = checkName.substring (0, checkName.length() - (CheckUtils.FILE_EXTENSION.length() + 1));
        if (checkName.startsWith("/"))
            checkName = checkName.substring (1);
        
        return checkName;
    }
    
    public static String xpandFileAsOldResourceName (String xpandName) {
        if (xpandName == null)
            return null;
        
        if (xpandName.toLowerCase().endsWith (XpandUtil.TEMPLATE_EXTENSION))
            xpandName = xpandName.substring (0, xpandName.length() - XpandUtil.TEMPLATE_EXTENSION.length() - 1);
        
        xpandName = xpandName.replace ("/", SyntaxConstants.NS_DELIM);
        
        return xpandName;
    }
}
