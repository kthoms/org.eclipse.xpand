/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.expr;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.*;
import static org.junit.Assert.*;

import org.eclipse.xtend.backend.testhelpers.ExceptionThrowingExpression;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class AndExpressionTest {
    @Test public void testLogic () {
        assertEquals (true, eval (true, true));
        assertEquals (false, eval (true, false));
        assertEquals (false, eval (false, true));
        assertEquals (false, eval (false, false));

        assertEquals (null, eval (null, false));
        assertEquals (null, eval (null, true));
        assertEquals (false, eval (false, null));
        assertEquals (null, eval (true, null));
        assertEquals (null, eval (null, null));
    }
    
    private Object eval (Boolean b1, Boolean b2) {
        return new AndExpression (createLiteral (b1), createLiteral (b2), SOURCE_POS).evaluate (createEmptyExecutionContext());
    }
    
    @Test public void testShortcutEvaluation () {
        assertEquals (false, new AndExpression (createLiteral (false), new ExceptionThrowingExpression(), SOURCE_POS).evaluate (createEmptyExecutionContext()));
    }
}
