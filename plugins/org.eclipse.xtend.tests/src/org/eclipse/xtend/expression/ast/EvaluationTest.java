/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.expression.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.internal.xtend.expression.ast.Expression;
import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.internal.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;
import org.eclipse.internal.xtend.xtend.parser.ParseFacade;
import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.Type1;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.Property;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Arno Haase
 */
public class EvaluationTest extends TestCase {

	private ExecutionContextImpl ec;

	@Override
	protected void setUp() throws Exception {
		ec = new ExecutionContextImpl();
		ec.registerMetaModel(new JavaMetaModel("asdf", new JavaBeansStrategy()));
	}

	private Expression parse (final String expression) {
		return ParseFacade.expression(expression);
	}

	private Object eval (Expression expr) {
	    return expr.evaluate (ec);
	}
	
	public final void testSimple() {
		final Expression expr = parse("true == null");
		final Object result = eval (expr);
		assertFalse(((Boolean) result).booleanValue());
	}

	public final void testStaticPropertyCall() {
		final Expression expr = parse("org::eclipse::xtend::expression::Type1::TYPE1_OBJECT_OBJECT");
		final Object result = eval (expr);
		assertEquals(Type1.TYPE1_OBJECT_OBJECT, result);
	}

	public final void testCollectionLiteral1() {
		final Expression expr = parse("{\"hallo\"}");
		final Object result = eval (expr);
		assertEquals("hallo", ((List) result).iterator().next());
	}

	public final void testCollectionLiteral3() {
		final Expression expr = parse("{3}");
		final Object result = eval (expr);
		assertEquals(new Long(3), ((List) result).iterator().next());
	}

	public final void testCollectionLiteral2() {
		final Expression expr = parse("{\"hallo\",3}");
		final List result = (List) eval (expr);
		assertEquals(2, result.size());
		assertEquals("hallo", result.get(0));
		assertEquals(new Long(3), result.get(1));
	}

	public final void testFeatureCall() {
		final Expression expr = parse("test");
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable(
				ExecutionContext.IMPLICIT_VARIABLE, new AType()));
		final Object result = eval (expr);
		assertEquals(new AType().getTest(), result);
	}

	public final void testFeatureCall1() {
		final Expression expr = parse("this.test");
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable(
				ExecutionContext.IMPLICIT_VARIABLE, new AType()));
		final Object result = eval (expr);
		assertEquals(new AType().getTest(), result);

	}

	public final void testOperationCall1() {
		final Expression expr = parse("myOperation()");
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable(
				ExecutionContext.IMPLICIT_VARIABLE, new AType()));
		final Object result = eval (expr);

		assertEquals(new AType().myOperation(), result);

	}

	public final void testOperationCall2() {
		final Expression expr = parse("myOperation(\"Test\")");
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable(
				ExecutionContext.IMPLICIT_VARIABLE, new AType()));
		final Object result = eval (expr);

		assertEquals(new AType().myOperation("Test"), result);
	}

	public final void testOperationCall3() {
		final Expression expr = parse("this.myOperation()");
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable(
				ExecutionContext.IMPLICIT_VARIABLE, new AType()));
		final Object result = eval (expr);

		assertEquals(new AType().myOperation(), result);

	}

	public final void testOperationCall4() {
		final Expression expr = parse("this.myOperation(\"Test\")");
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable(
				ExecutionContext.IMPLICIT_VARIABLE, new AType()));
		final Object result = eval (expr);

		assertEquals(new AType().myOperation("Test"), result);

	}

	public final void testArithmetic() {
		Expression expr;

		expr = parse("4 * 2 + 3");
		assertEquals(new Long(11), eval (expr));

		expr = parse("3 + 4 * 2");
		assertEquals(new Long(11), eval (expr));

		expr = parse("4 * 2 + 3 / 3");
		assertEquals(new Long(9), eval (expr));
	}

	public final void testArithmetic2() {
		Expression expr = parse("3 + 4.0 * 2");
		assertEquals(new Double(11), eval (expr));

		expr = parse("4.0 * 2 + 3");
		assertEquals(new Double(11), eval (expr));

		expr = parse("4 * 2 + 3 / 3.0");
		assertEquals(new Double(9), eval (expr));

	}

	public final void testArithmetic3() {
		Expression expr = parse("5 / 2");
		assertEquals(new Long(2), eval (expr));

		expr = parse("5 / 2.0");
		assertEquals(new Double(2.5), eval (expr));

	}

	public final void testStringConcatenation() {
		final Expression expr = parse("\"test\" + 3 + 4");
		assertEquals("test34", eval (expr));
	}

	public final void testNullReference() {
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable(
				"nullRef", null));
		final Expression expr = parse("nullRef + \"test\" + 3 + 4");
		assertEquals(null, eval (expr));

		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable("this",
				null));
		assertNull(eval (parse("this.unknownMember")));
	}

	public final void testTypeLiteral1() {
		assertEquals(ec.getStringType(), eval (parse("String")));
	}

	public final void testTypeLiteral2() {
		final Expression e = parse("String.getProperty('length')");
		assertTrue (eval (e) instanceof Property);
	}

	public final void testTypeLiteral3() {
		final Expression e = parse(getATypeName() + "::TEST");
		assertEquals(AType.TEST, eval(e));
	}

	private String getATypeName() {
		return AType.class.getName()
				.replaceAll("\\.", SyntaxConstants.NS_DELIM);
	}

	public final void testPath1() {
		final Expression expr = parse("{'a','b','c'}.toUpperCase()");
		final List result = (List) eval (expr);
		assertEquals("A", result.get(0));
		assertEquals("B", result.get(1));
		assertEquals("C", result.get(2));
	}

	public final void testPath2() {
		final Expression expr = parse("{'a','b','c'}.size");
		assertEquals(new Long(3), eval (expr));
	}

	public final void testPath3() {
		final Expression expr = parse("{'a','b2','c'}.toUpperCase().length");
		final List result = (List) eval (expr);
		assertEquals(new Long(1), result.get(0));
		assertEquals(new Long(2), result.get(1));
		assertEquals(new Long(1), result.get(2));
	}

	public final void testPath4() {
		final Expression expr = parse("{'a,b2,c','a,b,c','a,b,c'}.split(',').length");
		final List result = (List) eval (expr);
		assertEquals(9, result.size());
		assertEquals(new Long(1), result.get(0));
		assertEquals(new Long(2), result.get(1));
		assertEquals(new Long(1), result.get(2));
	}

	public final void testNestedCollExpr() {
		final Expression expr = parse("col.typeSelect(String).forAll(e|"
				+ "col.typeSelect(Integer).exists(a| a == e.length))");
		final List<Comparable> list = new ArrayList<Comparable>();
		list.add("123");
		list.add("1234");
		list.add("12345");
		list.add(new Long(3));
		list.add(new Long(4));
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable("col",
				list));
		assertEquals(Boolean.FALSE, eval (expr));
		list.add(new Long(5));
		assertEquals(Boolean.TRUE, eval (expr));
	}

	public final void testTypeSelectWithNull() {
		final Expression expr = parse("{null, 'test'}.typeSelect(String).size");
		assertEquals(new Long(1), eval (expr));
	}

	public final void testGlobalVar() {
		ec = new ExecutionContextImpl(Collections.singletonMap("horst",
				new Variable("horst", "TEST")));
		final Expression expr = parse("GLOBALVAR horst");
		assertEquals("TEST", eval (expr));
	}

	public final void testLet1() {
		final Expression expr = parse("let x = {'a,b2,c','a,b,c','1,2,3'} : x.get(1)");
		assertEquals("a,b,c", eval (expr));
	}

	public final void testCollectShortcut1() {
		final Expression expr = parse("{'a','b','c'}.toUpperCase()");
		assertEquals("C", ((List) eval (expr)).get(2));
	}

	public final void testCollectShortcut2() {
		final Expression expr = parse("{}.toUpperCase()");
		assertTrue(((List) eval (expr)).isEmpty());
	}

	public final void testCollectShortcut3() {
		final Expression expr = parse("{'a','b','c'}.length");
		assertEquals(1l, ((List) eval (expr)).get(2));
	}

	public final void testCollectShortcut4() {
		final Expression expr = parse("{}.length");
		assertTrue(((List) eval (expr)).isEmpty());
	}

	public final void testCollectShortcut5() {
		final Expression expr = parse("String.name");
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable(
				ExecutionContext.IMPLICIT_VARIABLE, new ArrayList<Object>()));
		assertEquals("String", eval (expr));
	}

	public final void testLet2() {
		final Expression expr = parse("let x = {} : x.add('1') -> x.add('2')"
				+ " -> x.add('3') -> x");
		final List<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("3");
		assertEquals(l, eval (expr));
	}

	public final void testConstruction() {
		final Expression expr = parse("new String");
		assertEquals("", eval (expr));

		try {
			eval (parse("new Unkown"));
			fail();
		} catch (final EvaluationException ee) {
			// expected
		}
	}

	public void testSortBy() throws Exception {
		final Expression expr = parse("{'X','AA','BBB'}.sortBy(e|e)");
		final List<String> l = new ArrayList<String>();
		l.add("AA");
		l.add("BBB");
		l.add("X");
		assertEquals(l, eval (expr));
	}

	public void testSortBy2() throws Exception {
		final Expression expr = parse("{'X','AA','BBB'}.sortBy(e|e.length)");
		final List<String> l = new ArrayList<String>();
		l.add("X");
		l.add("AA");
		l.add("BBB");
		assertEquals(l, eval (expr));
	}

	public void testIfExpression() throws Exception {
		assertEquals(true, eval (parse("if true then true else 'stuff'")));
		assertEquals("stuff", eval (parse("if false then false else 'stuff'")));
		assertEquals("stuff", eval (parse("if false then false else if true then 'stuff' else null ")));
		assertEquals(null, eval (parse("if false then false else if false then 'stuff' ")));
	}
	
	

	public void testCollectShortCutWithFeatureCalls() throws Exception {
		Expression e = parse("x.list.list.strings.toLowerCase()");
		TestMetaModel mm = new TestMetaModel();
		ec = new ExecutionContextImpl();
		ec.registerMetaModel(mm);
		List<?> var = Collections.singletonList(mm.singleType.newInstance());
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable("x", var));
		List<String> result = (List<String>) eval (e);
		assertEquals(1, result.size());
		assertEquals("test", result.get(0));
	}

	public void testCollectShortCutWithOperationCalls() throws Exception {
		Expression e = parse("x.list().list().strings().toLowerCase()");
		TestMetaModel mm = new TestMetaModel();
		ec = new ExecutionContextImpl();
		ec.registerMetaModel(mm);
		List<?> var = Collections.singletonList(mm.singleType.newInstance());
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable("x", var));
		List<String> result = (List<String>) eval (e);
		assertEquals(1, result.size());
		assertEquals("test", result.get(0));
	}

	public void testCollectShortCutWithMixedCalls() throws Exception {
		Expression e = parse("x.list.list().list.strings().toLowerCase()");
		TestMetaModel mm = new TestMetaModel();
		ec = new ExecutionContextImpl();
		ec.registerMetaModel(mm);
		List<?> var = Collections.singletonList(mm.singleType.newInstance());
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable("x", var));
		List<String> result = (List<String>) eval (e);
		assertEquals(1, result.size());
		assertEquals("test", result.get(0));
	}
	
	public void testCollectOnNull() throws Exception {
		Expression e = parse("null.collect(e|e.size)");
		assertNull(eval(e));
	}
	
	public void testEvaluationOrderOfOperands() throws Exception {
		Object x = new Object(){
			int c = 1;
			@Override
			public String toString() {
				return ""+c++;
			}
		};
		Expression e = parse("x.toString() + x.toString()");
		ec = new ExecutionContextImpl ();
		ec = (ExecutionContextImpl) ec.cloneWithVariable(new Variable("x",x));
		assertEquals("12",eval (e));
	}
}
