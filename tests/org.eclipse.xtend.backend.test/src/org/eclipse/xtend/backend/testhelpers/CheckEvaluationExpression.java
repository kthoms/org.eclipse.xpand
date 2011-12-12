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
package org.eclipse.xtend.backend.testhelpers;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.SOURCE_POS;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;


/**
 * This expression class serves as a mock implementation to test that an
 *  expression was actually evaluated.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class CheckEvaluationExpression extends ExpressionBase{
    public Object _value;
    public int _evalCounter = 0;
    
    public CheckEvaluationExpression (Object value) {
        super (SOURCE_POS);
        _value = value;
    }
    
    @Override
    protected Object evaluateInternal (ExecutionContext ctx) {
        _evalCounter++;
        return _value;
    }
}
