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

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.SOURCE_POS;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createLiteral;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;



/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class InvocationOnWhateverExpressionTest {
    @SuppressWarnings("unchecked")
    @Test public void testInvocationOnObject () {
        assertEquals (3L, new InvocationOnWhateverExpression ("operatorPlus", Arrays.asList (createLiteral (1L), createLiteral (2L)), false, SOURCE_POS).evaluate (createEmptyExecutionContext ()));
        assertEquals (3L, new InvocationOnWhateverExpression ("operatorPlus", Arrays.asList (createLiteral (1L), createLiteral (2L)), true, SOURCE_POS).evaluate (createEmptyExecutionContext ()));
        assertEquals (Arrays.asList (1L), new InvocationOnWhateverExpression ("toList", Arrays.asList (createLiteral (Arrays.asList(1L))), false, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        assertEquals (Arrays.asList (1L), new InvocationOnWhateverExpression ("toList", Arrays.asList (createLiteral (Arrays.asList(1L))), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));

        assertEquals (Arrays.asList (Collections.singleton (1L)), new InvocationOnWhateverExpression ("toList", Arrays.asList (createLiteral (Collections.singleton (Collections.singleton (1L)))), false, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        assertEquals (Arrays.asList (Collections.singleton (1L)), new InvocationOnWhateverExpression ("toList", Arrays.asList (createLiteral (Collections.singleton (Collections.singleton (1L)))), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        
        assertEquals (null, new InvocationOnWhateverExpression ("toList", Arrays.asList (createLiteral (null)), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));
        assertEquals (null, new InvocationOnWhateverExpression ("operatorPlus", Arrays.asList (createLiteral (null), createLiteral (2L)), true, SOURCE_POS).evaluate (createEmptyExecutionContext()));

        try {
            new InvocationOnWhateverExpression ("operatorPlus", Arrays.asList (createLiteral (null), createLiteral (2L)), false, SOURCE_POS).evaluate (createEmptyExecutionContext());
            fail ("exception expected");
        }
        catch (Exception exc) {
        }
    }

     @Test public void testPrecedenceOfCollectionOperation () {
        assertEquals ("[1, 2, 3]4", new InvocationOnWhateverExpression ("operatorPlus", Arrays.asList (createLiteral (Arrays.asList (1L, 2L, 3L)), createLiteral (4L)), true, SOURCE_POS).evaluate (createEmptyExecutionContext ()).toString());
        assertEquals ("[1, 2, 3]4", new InvocationOnWhateverExpression ("operatorPlus", Arrays.asList (createLiteral (Arrays.asList (1L, 2L, 3L)), createLiteral (4L)), false, SOURCE_POS).evaluate (createEmptyExecutionContext ()).toString());
    }
    
    @Test public void testInvocationOnCollection () {
        assertEquals (Arrays.asList (1L, 2L, 3L), new InvocationOnWhateverExpression ("operatorMinus", Arrays.asList (createLiteral (Arrays.asList (3L, 4L, 5L)), createLiteral (2L)), true, SOURCE_POS).evaluate (createEmptyExecutionContext ()));
        assertEquals (Arrays.asList (1L, 2L, 3L), new InvocationOnWhateverExpression ("operatorMinus", Arrays.asList (createLiteral (Arrays.asList (3L, 4L, 5L)), createLiteral (2L)), false, SOURCE_POS).evaluate (createEmptyExecutionContext ()));
    }
    
    @Test public void testFlatten () {
        assertEquals (Arrays.asList("a","b","b","c","d"), new InvocationOnWhateverExpression ("split", Arrays.asList (createLiteral (Arrays.asList ("a,b", "b,c,d")), createLiteral (",")), false, SOURCE_POS).evaluate (createEmptyExecutionContext()));
    }
}
