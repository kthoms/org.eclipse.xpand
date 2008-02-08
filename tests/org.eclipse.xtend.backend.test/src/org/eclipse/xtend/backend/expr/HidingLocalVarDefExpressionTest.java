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

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class HidingLocalVarDefExpressionTest {
    
    @Test public void testLocalVar () {
        final ExecutionContext outerCtx = createEmptyExecutionContext();
        outerCtx.getLocalVarContext().getLocalVars().put ("a", "aValue");
        
        final ExpressionBase expr = new HidingLocalVarDefExpression ("a", createLiteral("bValue"), new ExpressionBase (SOURCE_POS) {
            @Override
            protected Object evaluateInternal (ExecutionContext innerCtx) {
                assertEquals ("bValue", innerCtx.getLocalVarContext().getLocalVars().get ("a"));
                return "xyz";
            }
        }, SOURCE_POS);
        
        assertEquals ("xyz", expr.evaluate (outerCtx));
        assertEquals ("aValue", outerCtx.getLocalVarContext().getLocalVars().get ("a"));
    }
}
