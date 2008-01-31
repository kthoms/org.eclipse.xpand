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

import static org.eclipse.xtend.backend.helpers.BackendTestHelper.SOURCE_POS;
import static org.eclipse.xtend.backend.helpers.BackendTestHelper.createEmptyExecutionContext;
import static org.eclipse.xtend.backend.helpers.BackendTestHelper.createLiteral;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.eclipse.xtend.backend.common.ExpressionBase;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class ConcatExpressionTest {
    @Test public void testLogic () {
        assertEquals ("", eval ());
        assertEquals ("abc", eval (createLiteral ("abc")));
        assertEquals ("abc", eval (createLiteral ("a"), createLiteral ("b"), createLiteral ("c")));
        assertEquals ("123", eval (createLiteral (1), createLiteral (2), createLiteral (3)));
        assertEquals ("123", eval (createLiteral (1), createLiteral ("2"), createLiteral (3)));
        assertEquals ("", eval (createLiteral (null)));
        assertEquals ("a", eval (createLiteral (null), createLiteral ("a")));
    }
    
    private Object eval (ExpressionBase... parts) {
        return new ConcatExpression (Arrays.asList(parts), SOURCE_POS).evaluate (createEmptyExecutionContext()).toString();
    }
}
