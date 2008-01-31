/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.syslib;

import java.io.Writer;
import java.util.List;


/**
 * This is the most fundamental abstraction as a data sink. It serves as a callback for 
 *  all writing operations.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface Outlet {
    Writer createWriter (String filename);
    Writer createWriter (String filename, boolean append);
    
    String createUri (String filename);
    
    List<InMemoryPostprocessor> getInMemoryPostprocessors ();
    List<UriBasedPostprocessor> getUriBasedPostprocessors ();
}
