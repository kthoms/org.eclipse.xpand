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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.xtend.type.impl.java.beans.JavaBeansStrategy;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 * @author Heiko Behrens
 */
public class IntegerTypeTest extends TestCase {

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
    
    @SuppressWarnings("unchecked")
	public final void testUpTo1() {
        final List r = (List) ef.evaluate("1.upTo(5)", Collections.EMPTY_MAP);
        final List<BigInteger> c = new ArrayList<BigInteger>();
        for (int i = 1; i <= 5; i++) {
            c.add(new BigInteger("" + i));
        }
        assertEquals(c, r);
    }
    
    @SuppressWarnings("unchecked")
	public final void testUpToWithStepping() {
        final List r = (List) ef.evaluate("1.upTo(10, 2)", Collections.EMPTY_MAP);
        final List<BigInteger> c = new ArrayList<BigInteger>();
        c.add(new BigInteger("1"));
        c.add(new BigInteger("3"));
        c.add(new BigInteger("5"));
        c.add(new BigInteger("7"));
        c.add(new BigInteger("9"));
        assertEquals(c, r);
    }

    public void testBug172154Equals() {
    	Boolean result = (Boolean) ef.evaluate("1==null");
    	assertNotNull(result);
    	assertFalse(result.booleanValue());
    }

    public void testBug172154NotEquals() {
    	Boolean result = (Boolean) ef.evaluate("1!=null");
    	assertNotNull(result);
    	assertTrue(result.booleanValue());
    }
    
    public void testLiteral() {
    	assertExpressionValue("1", "1");
    	assertExpressionValue("9223372036854775807", "9223372036854775807");
    	assertExpressionValue("9223372036854775808", "9223372036854775808");
    	assertIsBigInt("1");
    }
    
    public void testNegate() {
    	assertExpressionValue("-1", "-1");
    	assertExpressionValue("1", "-(-1)");
    	assertExpressionValue("-9223372036854775808", "-9223372036854775808");
    	assertExpressionValue("-9223372036854775809", "-9223372036854775809");
    	assertIsBigInt("-1");
    }
    
	private void assertIsBigInt(String expression) {
		Object result = ef.evaluate(expression);
		assertEquals(BigInteger.class.getName(), result.getClass().getName());
	}

	public void testAdd() {
		assertExpressionValue("2", "1 + 1");
		assertExpressionValue("9223372036854775808", "9223372036854775807 + 1");
		assertIsBigInt("1 + 1");
    }
	
	public void testSubtract() {
		assertExpressionValue("-1", "1 - 2");
		assertExpressionValue("-9223372036854775809", "-9223372036854775808 - 1");
		assertIsBigInt("1 - 2");
    }
	final static String TWO_POW_64 = "18446744073709551616";
	final static String TWO_POW_128 = "340282366920938463463374607431768211456"; 
	
	public void testMultiply() {
		assertExpressionValue("0", "42 * 0");
		assertExpressionValue("42", "42 * 1");
		assertExpressionValue(TWO_POW_128, TWO_POW_64 + " * " + TWO_POW_64);
		assertIsBigInt("1 * 1");
	}
	
	public void testDivide() {
		assertExpressionValue("0", "0 / 42");
		assertExpressionValue("1", "42 / 42");
		assertExpressionValue(TWO_POW_64, TWO_POW_128 + " / " + TWO_POW_64);
		assertIsBigInt("1 / 1");
	}
	
	public void testEquals() {
		assertExpressionValue("true", "1 == 1");
		assertExpressionValue("false", "1 == 0");
		assertExpressionValue("false", "9223372036854775808 == -9223372036854775808");
		assertExpressionValue("true", "9223372036854775808 == 9223372036854775808");
	}
    
	public void testNotEquals() {
		assertExpressionValue("false", "1 != 1");
		assertExpressionValue("true", "1 != 0");
		assertExpressionValue("true", "9223372036854775808 != -9223372036854775808");
		assertExpressionValue("false", "9223372036854775808 != 9223372036854775808");
	}
	
	public void testGreaterThan() {
		assertExpressionValue("true", "1 > 0");
		assertExpressionValue("false", "0 > 0");
		assertExpressionValue("false", "0 > 1");
		assertExpressionValue("true", "9223372036854775808 > 0");
	}

	public void testGreaterThanOrEqual() {
		assertExpressionValue("true", "1 >= 0");
		assertExpressionValue("true", "1 >= 1");
		assertExpressionValue("true", "0 >= 0");
		assertExpressionValue("false", "0 >= 1");
		assertExpressionValue("true", "9223372036854775808 >= 0");
		assertExpressionValue("true", "9223372036854775808 >= 9223372036854775808");
	}

	public void testLessThan() {
		assertExpressionValue("true", "0 < 1");
		assertExpressionValue("false", "0 < 0");
		assertExpressionValue("false", "1 < 0");
		assertExpressionValue("true", "0 < 9223372036854775808");
	}

	public void testLessThanOrEqual() {
		assertExpressionValue("true", "0 <= 1");
		assertExpressionValue("true", "1 <= 1");
		assertExpressionValue("true", "0 <= 0");
		assertExpressionValue("false", "1 <= 0");
		assertExpressionValue("true", "0 <= 9223372036854775808");
		assertExpressionValue("true", "9223372036854775808 <= 9223372036854775808");
	}
	
}
