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
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class FatalException extends RuntimeException {
    private String _message = "";
    
    public FatalException (Exception inner) {
        super (inner);
    }
    
    public FatalException (String message, Exception inner) {
        super (inner);
        _message = message;
    }
    
    public void addMessage (String message) {
        if (_message == "")
            _message = message;
        else
            _message = message + ":\n" + _message;
    }
    
    @Override
    public String getMessage () {
        return _message;
    }
}
