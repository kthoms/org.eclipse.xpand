/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.typesystem.baseimpl.types;

import junit.framework.TestCase;

import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;

public class ObjectTypeTest extends TestCase {

    ExecutionContextImpl ec;

    private ExpressionFacade ef;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        ef = new ExpressionFacade(ec);
    }

    public final void testIsInstance() {
        assertEquals("bar", ef.evaluate("String.isInstance(null) ? 'foo' : 'bar'"));
        assertEquals("foo", ef.evaluate("String.isInstance('') ? 'foo' : 'bar'"));
        assertEquals("bar", ef.evaluate("String.isInstance(5) ? 'foo' : 'bar'"));
    }
    

}
