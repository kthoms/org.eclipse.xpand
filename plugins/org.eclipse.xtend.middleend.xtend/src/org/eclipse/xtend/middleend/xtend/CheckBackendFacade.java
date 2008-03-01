/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.xtend;

import java.util.Collection;

import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtend.middleend.xtend.internal.xtend.CheckConverter;
import org.eclipse.xtend.typesystem.MetaModel;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class CheckBackendFacade {

    public static void checkAll (String xtendFileName, Collection<MetaModel> mms, Issues issues, Collection<?> allObjects) {
        checkAll (xtendFileName, null, mms, issues, allObjects);
    }
    
    public static void checkAll (String xtendFileName, String fileEncoding, Collection<MetaModel> mms, Issues issues, Collection<?> allObjects) {
        XtendBackendFacade.invokeXtendFunction (xtendFileName, fileEncoding, mms, CheckConverter.ALL_CHECKS_FUNCTION_NAME, issues, allObjects);
    }
}
