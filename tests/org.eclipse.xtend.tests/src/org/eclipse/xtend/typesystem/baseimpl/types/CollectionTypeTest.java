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
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.xtend.expression.EvaluationException;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.typesystem.Callable;
import org.eclipse.xtend.typesystem.Type;

public class CollectionTypeTest extends TestCase {

	ExecutionContextImpl ec;

	private ExpressionFacade ef;

	@Override
	protected void setUp() throws Exception {
		ec = new ExecutionContextImpl();
		ef = new ExpressionFacade(ec);
	}

	@SuppressWarnings("unchecked")
	public final void testStuff() {
		final List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		try {
			ef.evaluate("{Object.newInstance()} + 'b'");
			fail("EvaluationException expected");
		}
		catch (final EvaluationException e) {
		}
		assertTrue(((Set) ef.evaluate("{'a'}.union({'b'})")).contains("a"));
	}

	@SuppressWarnings("unchecked")
	public final void testUnion() {
		final Set result = (Set) ef.evaluate("{1,2}.union({2,3})");
		assertEquals(3, result.size());

		final Number l = (Number) ef.evaluate("{1,2}.union({2,3}).size");
		assertEquals(3, l.intValue());
		
		// ugly, but for the case a Null argument is passed to union() the result is a copy of the original collection
		final Number l2 = (Number) ef.evaluate("{1,2}.union({2,3}).union(null).size");
		assertEquals(3, l2.intValue());
		
	}

	@SuppressWarnings("unchecked")
	public final void testUnionStableOrder() {
		final Set<Number> result = (Set) ef.evaluate("{1,2,2,1,2}.union({2,1,3,2})");
		assertEquals(3, result.size());
		Iterator<Number> iter = result.iterator();
		assertTrue(iter.hasNext());
		assertEquals("1", iter.next().toString());
		assertTrue(iter.hasNext());
		assertEquals("2", iter.next().toString());
		assertTrue(iter.hasNext());
		assertEquals("3", iter.next().toString());
		assertFalse(iter.hasNext());
	}

	@SuppressWarnings("unchecked")
	public final void testIntersect() {
		final Set result = (Set) ef.evaluate("{1,2,3}.intersect({2,3,4})");
		assertEquals(2, result.size());
	}

	@SuppressWarnings("unchecked")
	public final void testIntersectStableOrder() {
		final Set<Number> result = (Set) ef.evaluate("{1,2,1,2,3}.intersect({2,4,3,4})");
		assertEquals(2, result.size());
		Iterator<Number> iter = result.iterator();
		assertTrue(iter.hasNext());
		assertEquals("2", iter.next().toString());
		assertTrue(iter.hasNext());
		assertEquals("3", iter.next().toString());
		assertFalse(iter.hasNext());
	}

	@SuppressWarnings("unchecked")
	public final void testWithout() {
		final Set result = (Set) ef.evaluate("{1,2,3}.without({2})");
		assertEquals(2, result.size());
		assertFalse(result.contains(new Long(2)));
	}

	@SuppressWarnings("unchecked")
	public final void testWithoutStableOrder() {
		final Set<Number> result = (Set) ef.evaluate("{1,2,1,2,3}.without({2,4})");
		assertEquals(2, result.size());
		Iterator<Number> iter = result.iterator();
		assertTrue(iter.hasNext());
		assertEquals("1", iter.next().toString());
		assertTrue(iter.hasNext());
		assertEquals("3", iter.next().toString());
		assertFalse(iter.hasNext());
	}

	@SuppressWarnings("unchecked")
	public final void testToSet() {
		final Set result = (Set) ef.evaluate("{1,2,3}.toSet()");
		assertEquals(3, result.size());
		assertTrue(result.contains(new BigInteger("2")));
	}

	@SuppressWarnings("unchecked")
	public void testToSetStableOrder() {
		final Set<Number> result = (Set) ef.evaluate("{1,1,2,1,2,3,2,1,3}.toSet()");
		assertEquals(3, result.size());
		Iterator<Number> iter = result.iterator();
		assertTrue(iter.hasNext());
		assertEquals("1", iter.next().toString());
		assertTrue(iter.hasNext());
		assertEquals("2", iter.next().toString());
		assertTrue(iter.hasNext());
		assertEquals("3", iter.next().toString());
		assertFalse(iter.hasNext());
	}

	@SuppressWarnings("unchecked")
	public void testToSetReturnsEmptySet() {
		final Collection result = (Collection) ef.evaluate("{}.toSet()");
		assertTrue(result instanceof Set);
		assertTrue(result.isEmpty());
	}

	public final void testSize() {
		assertEquals(Boolean.TRUE, ef.evaluate("{1,2,3}.size == 3"));
	}

	public final void testIsEmpty() {
		assertEquals(Boolean.FALSE, ef.evaluate("{1,2,3}.isEmpty"));
		assertEquals(Boolean.TRUE, ef.evaluate("{}.isEmpty"));
	}

	public final void testContains() {
		assertEquals(Boolean.TRUE, ef.evaluate("{1,2,3}.contains(2)"));
		assertEquals(Boolean.FALSE, ef.evaluate("{1,2,3}.contains('2')"));
		assertEquals(Boolean.FALSE, ef.evaluate("{1,2,3}.contains(42)"));
	}

	public final void testContainsAll() {
		assertEquals(Boolean.TRUE, ef.evaluate("{1,2,3}.containsAll({2})"));
		assertEquals(Boolean.FALSE, ef.evaluate("{1,2,3}.containsAll({'2',2})"));
		assertEquals(Boolean.FALSE, ef.evaluate("{1,2,3}.containsAll({42,1})"));
		assertEquals(Boolean.TRUE, ef.evaluate("{1,2,3}.containsAll({3,2,1})"));
	}

	public final void testFirst() {
		assertEquals(BigInteger.ONE, ef.evaluate("{1,2,3}.first()"));
		assertEquals(null, ef.evaluate("{}.first()"));
		assertEquals(null, ef.evaluate("null.first()"));
	}

	public final void testLast() {
		assertEquals(new BigInteger("3"), ef.evaluate("{1,2,3}.last()"));
		assertNull(ef.evaluate("{}.last()"));
		assertNull(ef.evaluate("null.last()"));
	}

	@SuppressWarnings("unchecked")
	public final void testReverse() {
		assertEquals(new BigInteger("3"), ef.evaluate("{1,2,3}.reverse().first()"));
		assertEquals(BigInteger.ONE, ef.evaluate("{1,2,3}.reverse().reverse().first()"));
		assertTrue(((List) ef.evaluate("{}.reverse()")).isEmpty());
		assertNull(ef.evaluate("null.reverse()"));
	}

	public final void testWithoutFirst() {
		List<BigInteger> l = new ArrayList<BigInteger>();
		l.add(new BigInteger("2"));
		l.add(new BigInteger("3"));
		assertEquals(l, ef.evaluate("{1,2,3}.withoutFirst()"));
		assertEquals(Collections.EMPTY_LIST, ef.evaluate("{1}.withoutFirst()"));
		assertEquals(Collections.EMPTY_LIST, ef.evaluate("{}.withoutFirst()"));
		assertEquals(null, ef.evaluate("null.withoutFirst()"));
	}

	public final void testWithoutLast() {
		List<BigInteger> l = new ArrayList<BigInteger>();
		l.add(BigInteger.ONE);
		l.add(new BigInteger("2"));
		assertEquals(l, ef.evaluate("{1,2,3}.withoutLast()"));
		assertEquals(Collections.EMPTY_LIST, ef.evaluate("{1}.withoutLast()"));
		assertEquals(Collections.EMPTY_LIST, ef.evaluate("{}.withoutLast()"));
		assertEquals(null, ef.evaluate("null.withoutLast()"));
	}

	public final void testFlattenReturnType() {
		Type innerMostType = ec.getBooleanType();
		Type innerType = ec.getCollectionType(innerMostType);
		Type innerType2 = ec.getCollectionType(innerType);
		Type collectionType = ec.getCollectionType(innerType2);
		Type expectedResult = ec.getListType(innerMostType);
		Callable feature = collectionType.getFeature("flatten", new Type[0]);
		assertNotNull(feature);
		assertEquals(expectedResult, feature.getReturnType());
		assertTrue(feature.getReturnType().isAssignableFrom(expectedResult));
	}
	
//	public final void testEqualsReturnType() {
//		Type innerType1 = ec.getBooleanType();
//		Type innerType2 = ec.getStringType();
//		
//		Type collType1 = ec.getCollectionType(innerType1);
//		Type collType1_1 = ec.getCollectionType(innerType1);
//		Type collType2 = ec.getCollectionType(innerType2);
//		
//		assertEquals (collType1, collType1_1);
//		assertTrue(!collType1.equals(collType2));
//	}

}
