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

import java.util.Arrays;

import org.eclipse.xtend.backend.testhelpers.BeanWithSizeProperty;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class PropertyOnCollectionExpressionTest {
    @Test public void testLogic () {
        assertEquals (Arrays.asList (1L, 2L, 3L), new PropertyOnCollectionExpression (createLiteral (Arrays.asList ("a", "ab", "abc")), "length", SOURCE_POS).evaluate (createEmptyExecutionContext()));
        assertEquals (Arrays.asList (7L, 12L), new PropertyOnCollectionExpression (createLiteral (Arrays.asList (new BeanWithSizeProperty (7), new BeanWithSizeProperty (12))), "size", SOURCE_POS).evaluate (createEmptyExecutionContext()));
    }

    @Test public void testFlatten () {
        assertEquals (Arrays.asList("a0","a1","a0","a1","a2"), new PropertyOnCollectionExpression (createLiteral (Arrays.asList (new BeanWithSizeProperty (2), new BeanWithSizeProperty (3))), "chunks", SOURCE_POS).evaluate (createEmptyExecutionContext()));
    }
}
