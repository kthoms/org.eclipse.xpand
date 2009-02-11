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

import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.QualifiedName;


/**
 * This class exposes all static information about the matched join point.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class ThisJoinPointStaticPart {
    private final QualifiedName _functionName;
    private final Function _function;
    
    public ThisJoinPointStaticPart (QualifiedName functionName, Function function) {
        _functionName = functionName;
        _function = function;
    }

    public QualifiedName getFunctionName () {
        return _functionName;
    }

    public Function getFunction () {
        return _function;
    }
    
    @Override
    public String toString () {
        return _functionName.toString() + ": " + _function;
    }
}
