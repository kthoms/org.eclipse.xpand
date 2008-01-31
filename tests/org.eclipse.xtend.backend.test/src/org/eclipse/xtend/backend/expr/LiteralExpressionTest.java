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
import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class LiteralExpressionTest {
    
    @Test public void testLogic () {
        assertEquals (null, new LiteralExpression (null, SOURCE_POS).evaluate(createEmptyExecutionContext()));
        assertEquals ("abc", new LiteralExpression ("abc", SOURCE_POS).evaluate(createEmptyExecutionContext()));
        assertEquals (1L, new LiteralExpression (1L, SOURCE_POS).evaluate(createEmptyExecutionContext()));
    }
}
