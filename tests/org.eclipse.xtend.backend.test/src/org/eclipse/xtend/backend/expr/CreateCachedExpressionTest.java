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
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.types.builtin.ListType;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class CreateCachedExpressionTest {
    private ExecutionContext _ctx = null;
    
    @Test public void testLogic () {
        _ctx = createEmptyExecutionContext();
        
        final List<Object> listNoKey = eval ();
        final List<Object> listA = eval ("a");
        final List<Object> listB = eval ("b");
        final List<Object> listAB = eval ("a", "b");
        
        listNoKey.add ("no key");
        listA.add ("Aa");
        listB.add ("Bb");
        listAB.add ("AaBb");
        
        assertSame (listNoKey, eval ());
        assertSame (listA, eval ("a"));
        assertSame (listB, eval ("b"));
        assertSame (listAB, eval ("a", "b"));
        
        assertEquals (1, eval().size());
        assertEquals (1, eval("a").size());
        assertEquals (1, eval("b").size());
        assertEquals (1, eval("a", "b").size());

        assertEquals ("no key", eval().get(0));
        assertEquals ("Aa", eval("a").get(0));
        assertEquals ("Bb", eval("b").get(0));
        assertEquals ("AaBb", eval("a", "b").get(0));
        
        _ctx = createEmptyExecutionContext();
        assertNotSame (listNoKey, eval());
        assertTrue (eval().isEmpty());
    }
    
    @SuppressWarnings("unchecked")
    private List<Object> eval (Object... keys) {
        final List<ExpressionBase> keyExpr = new ArrayList<ExpressionBase> ();
        for (Object o: keys)
            keyExpr.add (createLiteral (o));
        
        return (List<Object>) new CreateCachedExpression (ListType.INSTANCE, keyExpr, SOURCE_POS).evaluate (_ctx);
        
    }
}
