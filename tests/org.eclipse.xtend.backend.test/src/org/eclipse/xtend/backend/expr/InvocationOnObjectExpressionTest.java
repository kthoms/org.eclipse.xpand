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

import static org.eclipse.xtend.backend.helpers.BackendTestHelper.*;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class InvocationOnObjectExpressionTest {
    @Test public void testInvocation () {
        assertEquals (3L, new InvocationOnObjectExpression ("operatorPlus", Arrays.asList (createLiteral (1L), createLiteral (2L)), false, SOURCE_POS).evaluate (createEmptyExecutionContext ()));
        assertEquals (3L, new InvocationOnObjectExpression ("operatorPlus", Arrays.asList (createLiteral (1L), createLiteral (2L)), true, SOURCE_POS).evaluate (createEmptyExecutionContext ()));
        assertEquals (Arrays.asList (1L), new InvocationOnObjectExpression ("asList", Arrays.asList (createLiteral (Arrays.asList(1L))), false, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        assertEquals (Arrays.asList (1L), new InvocationOnObjectExpression ("asList", Arrays.asList (createLiteral (Arrays.asList(1L))), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        
        assertEquals (null, new InvocationOnObjectExpression ("asList", Arrays.asList (createLiteral (null)), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        assertEquals (null, new InvocationOnObjectExpression ("operatorPlus", Arrays.asList (createLiteral (null), createLiteral (2L)), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));

        try {
            new InvocationOnObjectExpression ("operatorPlus", Arrays.asList (createLiteral (null), createLiteral (2L)), false, SOURCE_POS).evaluate (createEmptyExecutionContext());
            fail ("exception expected");
        }
        catch (Exception exc) {
        }
    }
}
