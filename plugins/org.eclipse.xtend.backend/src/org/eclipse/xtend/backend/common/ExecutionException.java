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

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class ExecutionException extends RuntimeException {
    private final List<StacktraceEntry> _stackTrace = new ArrayList<StacktraceEntry> ();
    
    public ExecutionException (Exception exc) {
        super (exc);
    }
    
    public ExecutionException (Exception exc, StacktraceEntry ste) {
        super (exc);
        addStackTraceElement (ste);
    }
    
    public void addStackTraceElement (StacktraceEntry ste) {
        _stackTrace.add (ste);
    }
    
    @Override
    public String getMessage () {
        final StringBuilder result = new StringBuilder ();
        
        result.append (getCause().getMessage() + "\n");
        for (StacktraceEntry ste: _stackTrace)
            result.append (ste + "\n");
        
        return result.toString();
    }
}
