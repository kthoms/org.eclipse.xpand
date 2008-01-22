/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.common;

import org.eclipse.xtend.backend.BackendFacade;


/**
 *
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface Constants {
    String THIS_NAME = "this";
    
    String LOG_NULL_DEREF = BackendFacade.class.getPackage().getName() + ".NULL_DEREF";
}
