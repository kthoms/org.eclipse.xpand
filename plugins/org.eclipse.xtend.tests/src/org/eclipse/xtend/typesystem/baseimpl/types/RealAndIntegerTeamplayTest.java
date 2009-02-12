/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.typesystem.baseimpl.types;

import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;

import junit.framework.TestCase;

/**
 * @author Heiko Behrens - Initial contribution and API
 */
public class RealAndIntegerTeamplayTest extends TestCase {

	ExecutionContextImpl ec;

    private ExpressionFacade ef;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        ec.registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
        ef = new ExpressionFacade(ec);
    }
    
    protected void assertExpressionValue(String expected, String expression) {
    	Object actual = ef.evaluate(expression);
    	assertEquals(expected, actual.toString());
    }

    public void testAdd() throws Exception {
    	assertExpressionValue("3.0", "1 + 2.0");
    	assertExpressionValue("3.0", "2.0 + 1");
	}
    
    public void testSubtract() throws Exception {
    	assertExpressionValue("1.0", "2 - 1.0");
    	assertExpressionValue("1.0", "2.0 - 1");
	}

    public void testMultiply() throws Exception {
    	assertExpressionValue("2.0", "1 * 2.0");
    	assertExpressionValue("2.0", "2.0 * 1");
	}

    public void testDivide() throws Exception {
    	assertExpressionValue("2.0", "4 / 2.0");
    	assertExpressionValue("2.0", "4.0 / 2");
	}

    public void testEquals() throws Exception {
    	assertExpressionValue("true",  "1 == 1.0");
    	assertExpressionValue("false", "1 == 2.0");
    	assertExpressionValue("true",  "1.0 == 1");
    	assertExpressionValue("false", "1.0 == 2");
	}

    public void testNotEquals() throws Exception {
    	assertExpressionValue("false", "1 != 1.0");
    	assertExpressionValue("true",  "1 != 2.0");
    	assertExpressionValue("false", "1.0 != 1");
    	assertExpressionValue("true",  "1.0 != 2");
	}
    
    public void testGreaterThan() throws Exception {
    	assertExpressionValue("true",  "2 > 1.0");
    	assertExpressionValue("false", "2 > 2.0");
    	assertExpressionValue("false", "2 > 3.0");
    	assertExpressionValue("true",  "2.0 > 1");
    	assertExpressionValue("false", "2.0 > 2");
    	assertExpressionValue("false", "2.0 > 3");
	}

    public void testGreaterThanOrEqual() throws Exception {
    	assertExpressionValue("true",  "2 >= 1.0");
    	assertExpressionValue("true",  "2 >= 2.0");
    	assertExpressionValue("false", "2 >= 3.0");
    	assertExpressionValue("true",  "2.0 >= 1");
    	assertExpressionValue("true",  "2.0 >= 2");
    	assertExpressionValue("false", "2.0 >= 3");
	}

    public void testLessThan() throws Exception {
    	assertExpressionValue("true",  "1 < 2.0");
    	assertExpressionValue("false", "2 < 2.0");
    	assertExpressionValue("false", "3 < 2.0");
    	assertExpressionValue("true",  "1.0 < 2");
    	assertExpressionValue("false", "2.0 < 2");
    	assertExpressionValue("false", "3.0 < 2");
	}

    public void testLessOrEqual() throws Exception {
    	assertExpressionValue("true",  "1 <= 2.0");
    	assertExpressionValue("true", "2 <= 2.0");
    	assertExpressionValue("false", "3 <= 2.0");
    	assertExpressionValue("true",  "1.0 <= 2");
    	assertExpressionValue("true", "2.0 <= 2");
    	assertExpressionValue("false", "3.0 <= 2");
	}

}
