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


/**
 * This exception allows ExecutionListener implementations to veto the evaluation of the
 *  actual evaluation of the expression. To do this, they need to throw this exception
 *  in their preExecute method.<br>
 *  
 * Vetoing the evaluation of an expression requires them to provide an object that is used
 *  as the result of the expression. This object is passed to the exception as the sole
 *  constructor parameter.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class EvaluationVetoException extends Exception {
    private final Object _substitutedExpressionResult;
    
    public EvaluationVetoException (Object substitutedExpressionResult) {
        _substitutedExpressionResult = substitutedExpressionResult;
    }
    
    public Object getSubstitutedExpressionResult () {
        return _substitutedExpressionResult;
    }
}
