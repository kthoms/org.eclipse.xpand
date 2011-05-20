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
package org.eclipse.xtend.backend.aop;

import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.util.Pair;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class ExecutionPointcut implements Pointcut {
    private final String _functionNamePattern;
    private final boolean _hasCompleteName;
    private final Pattern _namePattern;
    
    private final List<Pair<String, AdviceParamType>> _paramTypes;

    private final boolean _hasVarArgs;
    private final AdviceParamType _varArgsType;

    /**
     * 
     * @param functionNamePattern is the pattern for the function name that is matched by this pointcut. '*' can
     *         be used as a wildcard.
     * 
     * @param paramTypes this is the - optionally empty - list of parameters for which an explicit type is given.
     * 
     * @param hasVarArgs this flag determines if there is a variable number of arguments after the explicitly given
     *         param types. One of the two extreme cases is that all parameters are explicitly given, then this 
     *         flag is false. The other extreme case is that the pointcut regardless of 
     * 
     * @param varArgsType
     */
    public ExecutionPointcut (String functionNamePattern, List<Pair<String, AdviceParamType>> paramTypes, boolean hasVarArgs, AdviceParamType varArgsType) {
        _functionNamePattern = functionNamePattern;
        if (_functionNamePattern.contains ("*")) {
            _hasCompleteName = false;
            _namePattern = Pattern.compile (functionNamePattern.replace ("*", ".*"));
        }
        else {
            _hasCompleteName = true;
            _namePattern = null;
        }
        
        _paramTypes = paramTypes;
        _hasVarArgs = hasVarArgs;
        _varArgsType = varArgsType;
    }

    public boolean matches (QualifiedName name, Function function) {
        if (! matchesName (name))
            return false;
        
        if (! matchesParamTypes (function.getParameterTypes()))
            return false;
        
        return true;
    }
    
    private boolean matchesParamTypes (List<? extends BackendType> paramTypes) {
        // check the number of parameters
        if (_hasVarArgs) {
            if (paramTypes.size() < _paramTypes.size())
                return false;
        }
        else {
            if (paramTypes.size() != _paramTypes.size())
                return false;
        }
            
        // check the explicitly given parameter types
        for (int i=0; i<_paramTypes.size(); i++)
            if (! _paramTypes.get (i).getSecond().matches (paramTypes.get (i)))
                return false;
        
        // check the var args type against the remaining parameter types
        for (int i=_paramTypes.size(); i<paramTypes.size(); i++)
            if (! _varArgsType.matches (paramTypes.get(i)))
                return false;
        
        return true;
    }
    
    private boolean matchesName (QualifiedName functionName) {
        if (_hasCompleteName)
            return functionName.getFullQualifiedName().equals (_functionNamePattern);
        
        return _namePattern.matcher (functionName.getFullQualifiedName()).matches();
    }

	public List<Pair<String, AdviceParamType>> getParamTypes() {
		return _paramTypes;
	}

	public String getFunctionNamePattern() {
		return _functionNamePattern;
	}

	public boolean isHasVarArgs() {
		return _hasVarArgs;
	}

	public AdviceParamType getVarArgsType() {
		return _varArgsType;
	}
}












