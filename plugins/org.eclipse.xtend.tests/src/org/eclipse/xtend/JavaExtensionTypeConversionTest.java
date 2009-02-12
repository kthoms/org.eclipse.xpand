/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend;

import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;

/**
 * @author Heiko Behrens - Initial contribution and API
 */
public class JavaExtensionTypeConversionTest extends TestCase {

    ExecutionContextImpl ec;

    private ExpressionFacade ef;

    @Override
    protected void setUp() throws Exception {
        ec = new ExecutionContextImpl();
        ec.registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
        ef = new ExpressionFacade(ec);
    }

    protected void registerExtensions(String extensions) {
    	final ExtensionFile file = ParseFacade.file(new StringReader(
    			extensions
    	), "nofile");
    	ec = (ExecutionContextImpl) ec.cloneWithResource(file);
    	ef = new ExpressionFacade(ec);
    }
    
    protected void assertExpressionValue(String expected, String expression) {
    	Object actual = ef.evaluate(expression);
    	assertEquals(expected, actual.toString());
    }
    
	public static String staticTestInteger(Byte param) {
		return "Byte " + param;
	}
	
	public static String staticTestInteger(Short param) {
		return "Short " + param;
	}

	public static String staticTestInteger(Integer param) {
		return "Integer " + param;
	}

    public static String staticTestInteger(Long param) {
		return "Long " + param;
	}
	
	public static String staticTestInteger(BigInteger param) {
		return "BigInteger " + param;
	}

	public void testInteger() {
		registerExtensions(
				  "String testByte(Integer param)       : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestInteger(java.lang.Byte) ; \n"
				+ "String testShort(Integer param)      : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestInteger(java.lang.Short) ; \n"
				+ "String testInteger(Integer param)    : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestInteger(java.lang.Integer) ; \n"
				+ "String testLong(Integer param)       : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestInteger(java.lang.Long) ; \n"
				+ "String testBigInteger(Integer param) : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestInteger(java.math.BigInteger) ; \n"
				);
		
		// since the implementation of IntegerTypeImpl is based on BigDecimal
		// the implicit type conversion greatly illustrates how the significant
		// bits are cut off
		assertExpressionValue("Byte 42",                         "testByte(42)");
		assertExpressionValue("Byte 0",                          "testByte(256)");
		assertExpressionValue("Short 256",                       "testShort(256)");
		assertExpressionValue("Short 0",                         "testShort(65536)");
		assertExpressionValue("Integer 65536",                   "testInteger(65536)");
		assertExpressionValue("Integer 0",                       "testInteger(4294967296)");
		assertExpressionValue("Long 4294967296",                 "testLong(4294967296)");
		assertExpressionValue("Long 0",                          "testLong(18446744073709551616)");
		assertExpressionValue("BigInteger 18446744073709551616", "testBigInteger(18446744073709551616)"); 
	}
	
	public static String staticTestReal(Float param) {
		return "Float " + param;
	}
	
	public static String staticTestReal(Double param) {
		return "Double " + param;
	}

	public static String staticTestReal(BigDecimal param) {
		return "BigDecimal " + param;
	}

	public void testReal() {
		registerExtensions(
				  "String testFloat(Real param)       : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestReal(java.lang.Float) ; \n"
				+ "String testDouble(Real param)      : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestReal(java.lang.Double) ; \n"
				+ "String testBigDecimal(Real param)  : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestReal(java.math.BigDecimal) ; \n"
				);
		
		assertExpressionValue("Float 137.0",      "testFloat(137.0)");
		assertExpressionValue("Double 137.0",     "testDouble(137.0)");
		assertExpressionValue("BigDecimal 137", "testBigDecimal(137.0)");
	}
	
	public static String staticTestString(Character param) {
		return "Char " + param;
	}
	
	public static String staticTestString(String param) {
		return "String " + param;
	}

	public static String staticTestString(StringBuffer param) {
		return "StringBuffer " + param;
	}

	public void testString() {
		registerExtensions(
				  "String testCharacter(String param)    : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestString(java.lang.Character) ; \n"
				+ "String testString(String param)       : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestString(java.lang.String) ; \n"
				+ "String testStringBuffer(String param) : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestString(java.lang.StringBuffer) ; \n"
				);

		assertExpressionValue("Char A",           "testCharacter('A')");
		try {
			assertExpressionValue("Char A",           "testCharacter('AB')");
			fail("Implicit String conversion to Character should not be allows for Strings with length different from 1");
		} catch (EvaluationException e){
			// expected
		}
		assertExpressionValue("String AB",        "testString('AB')");
		assertExpressionValue("StringBuffer ABC", "testStringBuffer('ABC')");
	}
	
	public static String staticTestMultipleParams(Byte b, Float f, Character c) {
		return "" + b + " " + f + " " + c;
	}
	
	public void testMultipleParams() {
		registerExtensions(
				  "String testMultipleParams(Integer i, Real r, String s)    : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticTestMultipleParams(java.lang.Byte, java.lang.Float, java.lang.Character) ; \n"
				);
		assertExpressionValue("1 2.0 A", "testMultipleParams(1, 2.0, 'A')");
	}
	
	public static Long staticReturnLong(Long param) {
		return param;
	}
	
	public static Character staticReturnCharacter(String param) {
		return param.charAt(0);
	}

	public void testReturnType() {
		registerExtensions(
				  "Integer returnLong(Integer param)     : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticReturnLong(java.lang.Long) ; \n"
				+ "String  returnCharacter(String param) : JAVA org.eclipse.xtend.JavaExtensionTypeConversionTest.staticReturnCharacter(java.lang.String) ; \n"
				);
		
		assertExpressionValue("42", "returnLong(42 - 1) + 1");
		assertExpressionValue("AB", "returnCharacter('AB'.subString(0,1)) + 'B' ");
	}
	
}
