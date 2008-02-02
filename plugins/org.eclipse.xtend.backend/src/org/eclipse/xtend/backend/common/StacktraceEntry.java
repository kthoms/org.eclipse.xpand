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

import java.util.HashMap;
import java.util.Map;


/**
 * This class represents an entry in the stack trace of the backend execution.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class StacktraceEntry {
    private final SourcePos _sourcePos;
    private final Map<String, Object> _localVars;

    public StacktraceEntry (SourcePos sourcePos, ExecutionContext ctx) {
        _sourcePos = sourcePos;
        _localVars = new HashMap<String, Object> (ctx.getLocalVarContext().getLocalVars());
    }

    public SourcePos getSourcePos () {
        return _sourcePos;
    }

    public Map<String, Object> getLocalVars () {
        return _localVars;
    }
    
    @Override
    public String toString () {
        return "at " + getSourcePos() + " " + getLocalVars();
    }
}
