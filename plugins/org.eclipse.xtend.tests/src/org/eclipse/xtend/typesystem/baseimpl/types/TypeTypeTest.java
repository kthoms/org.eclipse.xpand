/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.baseimpl.types;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;

public class TypeTypeTest extends TestCase {

    ExecutionContextImpl ec;

    private ExpressionFacade ef;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        ec.registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
        ef = new ExpressionFacade(ec);
    }

    public final void testCompareTo() {
        assertEquals(new Long(-1), ef.evaluate("'a'.compareTo('b')"));
        assertEquals(new Long(0), ef.evaluate("'xyz'.compareTo('xyz')"));
        assertEquals(new Long(1), ef.evaluate("'a2'.compareTo('a1')"));
        assertEquals(new Long(-1), ef.evaluate("null.compareTo('23')"));
        assertEquals(new Long(1), ef.evaluate("'23'.compareTo(null)"));
        assertEquals(new Long(0), ef.evaluate("null.compareTo(null)"));
    }

    public final void testToString() {
        assertEquals("3", ef.evaluate("3.toString()"));
        assertEquals("3.0", ef.evaluate("3.0.toString()"));
        assertEquals("true", ef.evaluate("true.toString()"));
        assertEquals("Test", ef.evaluate("'Test'.toString()"));

    }
}
