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
import static org.junit.Assert.assertEquals;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.junit.Test;

/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class LocalVarEvalExpressionTest {
    
    @Test public void testLogic () {
        final ExecutionContext ctx = createEmptyExecutionContext();
        ctx.getLocalVarContext().getLocalVars().put ("a", "aValue");
        ctx.getLocalVarContext().getLocalVars().put ("b", "bValue");
        
        assertEquals ("aValue", new LocalVarEvalExpression ("a", SOURCE_POS).evaluate (ctx));
        assertEquals ("bValue", new LocalVarEvalExpression ("b", SOURCE_POS).evaluate (ctx));
        assertEquals (null, new LocalVarEvalExpression ("c", SOURCE_POS).evaluate (ctx));
    }
}
