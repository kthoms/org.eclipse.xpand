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
public class OrExpressionTest {
    @Test public void testLogic () {
        assertEquals (true, eval (true, true));
        assertEquals (true, eval (true, false));
        assertEquals (true, eval (false, true));
        assertEquals (false, eval (false, false));

        assertEquals (null, eval (null, false));
        assertEquals (null, eval (null, true));
        assertEquals (null, eval (false, null));
        assertEquals (true, eval (true, null));
        assertEquals (null, eval (null, null));
    }
    
    private Object eval (Boolean b1, Boolean b2) {
        return new OrExpression (new LiteralExpression (b1, SOURCE_POS), new LiteralExpression (b2, SOURCE_POS), SOURCE_POS).evaluate (createEmptyExecutionContext());
    }
    
    @Test public void testShortcutEvaluation () {
        assertEquals (true, new OrExpression (new LiteralExpression (true, SOURCE_POS), new ExceptionThrowingExpression(), SOURCE_POS).evaluate (createEmptyExecutionContext()));
    }
}
