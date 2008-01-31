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
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.eclipse.xtend.backend.common.ExecutionException;
import org.eclipse.xtend.backend.helpers.BeanWithSizeProperty;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class SetPropertyExpressionTest {
    @Test public void testReadWrite () {
        final BeanWithSizeProperty bwsp = new BeanWithSizeProperty (5);
        
        assertSame (bwsp, eval (bwsp, "size", 9L));
        assertEquals (9L, bwsp.getSize());

        assertSame (bwsp, eval (bwsp, "size", 3L));
        assertEquals (3L, bwsp.getSize());
        
        assertNull (eval (null, "abc", "newValue"));
        
        try {
            eval (new ArrayList<Object>(), "size", 9L);
            fail ("exception expected");
        }
        catch (ExecutionException e) {
        }
    }
    
    private Object eval (Object target, String propName, Object newValue) {
        return new SetPropertyExpression (createLiteral (target), propName, createLiteral(newValue), SOURCE_POS).evaluate (createEmptyExecutionContext());
    }
}
