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
package org.eclipse.xtend.backend.expr;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.SOURCE_POS;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createLiteral;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.eclipse.xtend.backend.common.QualifiedName;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class InvocationOnObjectExpressionTest {
    @Test public void testInvocation () {
        assertEquals (3L, new InvocationOnObjectExpression (new QualifiedName ("operatorPlus"), Arrays.asList (createLiteral (1L), createLiteral (2L)), false, SOURCE_POS).evaluate (createEmptyExecutionContext ()));
        assertEquals (3L, new InvocationOnObjectExpression (new QualifiedName ("operatorPlus"), Arrays.asList (createLiteral (1L), createLiteral (2L)), true, SOURCE_POS).evaluate (createEmptyExecutionContext ()));
        assertEquals (Arrays.asList (1L), new InvocationOnObjectExpression (new QualifiedName ("toList"), Arrays.asList (createLiteral (Arrays.asList(1L))), false, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        assertEquals (Arrays.asList (1L), new InvocationOnObjectExpression (new QualifiedName ("toList"), Arrays.asList (createLiteral (Arrays.asList(1L))), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        
        assertEquals (null, new InvocationOnObjectExpression (new QualifiedName ("toList"), Arrays.asList (createLiteral (null)), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        assertEquals (null, new InvocationOnObjectExpression (new QualifiedName ("operatorPlus"), Arrays.asList (createLiteral (null), createLiteral (2L)), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));

        try {
            new InvocationOnObjectExpression (new QualifiedName ("operatorPlus"), Arrays.asList (createLiteral (null), createLiteral (2L)), false, SOURCE_POS).evaluate (createEmptyExecutionContext());
            fail ("exception expected");
        }
        catch (Exception exc) {
        }
    }
}
