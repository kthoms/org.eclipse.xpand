/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
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

import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.xtend.type.impl.java.beans.JavaBeansStrategy;

public class RealTypeTest extends TestCase {

    ExecutionContextImpl ec;

    private ExpressionFacade ef;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        ec.registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
        ef = new ExpressionFacade(ec);
    }

    public void testBug172154Equals() {
    	Boolean result = (Boolean) ef.evaluate("1.1==null");
    	assertNotNull(result);
    	assertFalse(result.booleanValue());
    }

    public void testBug172154NotEquals() {
    	Boolean result = (Boolean) ef.evaluate("1.1!=null");
    	assertNotNull(result);
    	assertTrue(result.booleanValue());
    }
    public void test_toInteger() {
    	Long result = (Long) ef.evaluate("1.1.toInteger()");
    	assertNotNull(result);
    	assertEquals(new Long(1), result);
    }
}
