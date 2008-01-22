/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.util;


/**
 * This class serves as the single handler for dealing with exceptions that prevent
 *  continued execution and can not be meaningfully handled locally.
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ErrorHandler {
    public static void handle (Exception exc) {
        if (exc instanceof FatalException)
            throw (FatalException) exc;
        
        throw new FatalException (exc);
    }
    
    public static void handle (String msg, Exception exc) {
        if (exc instanceof FatalException) {
            final FatalException fe = (FatalException) exc;
            fe.addMessage(msg);
            throw fe;
        }
        
        throw new FatalException (msg, exc);
    }
}
