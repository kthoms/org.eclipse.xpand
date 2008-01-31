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


/**
 * This interface represents a postprocessor that modifies - or performs
 *  some other action based on - a file after it was persisted, e.g. written
 *  to a file.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface UriBasedPostprocessor {
    void process (String uri);
}
