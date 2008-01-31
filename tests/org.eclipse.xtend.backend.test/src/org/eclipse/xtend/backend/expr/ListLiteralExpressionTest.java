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

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.xtend.backend.common.ExpressionBase;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class ListLiteralExpressionTest {
    
    @Test public void testLogic () {
        assertEquals (Arrays.asList (1L, 2L), new ListLiteralExpression (Arrays.asList (createLiteral (1L), createLiteral (2L)), SOURCE_POS).evaluate (createEmptyExecutionContext()));
        assertEquals (new ArrayList<Object>(), new ListLiteralExpression (new ArrayList<ExpressionBase> (), SOURCE_POS).evaluate(createEmptyExecutionContext()));
    }
}
