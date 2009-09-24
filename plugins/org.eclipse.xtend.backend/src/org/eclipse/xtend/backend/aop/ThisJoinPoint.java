/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
*/
package org.eclipse.xtend.backend.aop;

import java.util.Collection;
import java.util.List;

import org.eclipse.xtend.backend.common.StacktraceEntry;


/**
 * This class exposes all dynamic data available for a matched join point.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public abstract class ThisJoinPoint {
    private final List<StacktraceEntry> _stackTrace;
    private final List<?> _params;

    public ThisJoinPoint (List<StacktraceEntry> stackTrace, List<?> params) {
        _stackTrace = stackTrace;
        _params = params;
    }

    public List<StacktraceEntry> getStackTrace () {
        return _stackTrace;
    }

    public List<?> getParameters () {
        return _params;
    }
    
    public Object proceed () {
        return proceedWithParams (_params);
    }
    
    @SuppressWarnings("unchecked")
	public Object proceed (List<?> params) {
    	if (params.size() < _params.size())
    		params.addAll((Collection) _params.subList(params.size(), _params.size()));
        return proceedWithParams (params);
    }

    public abstract Object proceedWithParams (List<?> params); 
}
