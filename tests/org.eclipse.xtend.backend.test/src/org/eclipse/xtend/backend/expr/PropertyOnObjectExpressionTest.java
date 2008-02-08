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
public class PropertyOnObjectExpressionTest {
    @Test public void testLogic () {
        assertEquals (6L, eval (new BeanWithSizeProperty (6), "size"));
        assertEquals (2L, eval (Arrays.asList (new BeanWithSizeProperty (7), new BeanWithSizeProperty (12)), "size"));
    }
    
    private Object eval (Object param, String propertyName) {
        return new PropertyOnObjectExpression (createLiteral (param), propertyName, SOURCE_POS).evaluate (createEmptyExecutionContext());
    }
}
