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

import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.testhelpers.MutableLiteralExpression;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public class IfExpressionTest {
    
    @Test public void testLogic () {
        final MutableLiteralExpression condExpression = new MutableLiteralExpression (true);
        final ExpressionBase ifExpr = createLiteral ("ifBranch");
        final ExpressionBase elseExpr = createLiteral ("elseBranch");
        
        final IfExpression expr = new IfExpression (condExpression, ifExpr, elseExpr, SOURCE_POS);
        
        assertEquals ("ifBranch", expr.evaluate (createEmptyExecutionContext()));
        
        condExpression.setValue (false);
        assertEquals ("elseBranch", expr.evaluate (createEmptyExecutionContext()));
        
        condExpression.setValue (null);
        assertEquals (null, expr.evaluate (createEmptyExecutionContext()));
    }
}
