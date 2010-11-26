/*******************************************************************************
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CollectionExpressionTest extends JavaXtendTest {
	
	private Entity _entity;
	
	/*@Before
	public void setup () throws Exception {
		super.setUp();
		_entity = new Entity ();
		Field firstName = new Field ();
		firstName.setName ("firstName");
		Field lastName = new Field ();
		lastName.setName ("lastName");
		Version version = new Version ();
		version.setName ("version");
		Identifier id = new Identifier ();
		id.setName ("id");
		_entity.setName ("Entity");
		_entity.addField (id);
		_entity.addField (version);
		_entity.addField (firstName);
		_entity.addField (lastName);
	}*/

	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::expressions", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testTypeSelect() {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testTypeSelect"), Arrays.asList (Arrays.asList(_person, _employee)));
		Assert.assertFalse(result.contains(_person));
		Assert.assertTrue(result.contains(_employee));
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void testSelect() {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testSelect"), Arrays.asList (Arrays.asList(_person, _employee, _otherPerson)));
		Assert.assertFalse(result.contains(_person));
		Assert.assertTrue(result.contains(_employee));
		Assert.assertTrue(result.contains(_otherPerson));
	}
	
	@Test
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void testSelectFirst() {
		List persons = new ArrayList();
		persons.add(_person);
		persons.add (_otherPerson);
		persons.add (_yetAnotherPerson);
		Person result = (Person)BackendFacade.invoke(_ctx, new QualifiedName ("testSelectFirst"), Arrays.asList (persons));
		Assert.assertEquals(_otherPerson, result);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testCollect() {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testCollect"), Arrays.asList (Arrays.asList(_person, _employee, _otherPerson)));
		Assert.assertTrue(result.contains(_person.getName()));
		Assert.assertTrue(result.contains(_employee.getName()));
		Assert.assertTrue(result.contains(_otherPerson.getName()));
		Assert.assertFalse(result.contains(_person));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testTypeSelectPolymorphism() {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testTypeSelectPolymorphism"), Arrays.asList ((List)Arrays.asList(_person, _employee)));
		Assert.assertTrue(result.contains(_person));
		Assert.assertTrue(result.contains(_employee));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testRejectExpression () {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testReject"), Arrays.asList ());
		assertEquals (3, result.size());
		assertEquals (1L, result.get(0));
		assertEquals (2L, result.get(1));
		assertEquals (1L, result.get(2));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testReject () {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testReject"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 1L, 5L)));
		assertEquals (3, result.size());
		assertEquals (1L, result.get(0));
		assertEquals (2L, result.get(1));
		assertEquals (1L, result.get(2));
	}

	@Test
	public void testExists () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testExists"), Arrays.asList ());
		assertTrue(result);
	}

	@Test
	public void testForAll () {
		Boolean result = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testForAll"), Arrays.asList ());
		assertTrue(result);
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testForAllFalse"), Arrays.asList ());
		assertFalse(result2);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testSortBy () {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testSortBy"), Arrays.asList (Arrays.asList(1, 2, 3, 4, 5)));
		assertEquals (1, result.get(0));
		assertEquals (2, result.get(1));
		assertEquals (3, result.get(2));
		assertEquals (4, result.get(3));
		assertEquals (5, result.get(4));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testWithout () {
		Set result = (Set)BackendFacade.invoke(_ctx, new QualifiedName ("testWithout"), Arrays.asList (Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(3)));
		assertEquals (4, result.size());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testWithout2 () {
		Field f1 = new Field ();
		f1.setName("firstName");
		Field f2 = new Field ();
		f2.setName("lastName");
		Identifier i = new Identifier ();
		i.setName ("id");
		Version v = new Version ();
		v.setName ("version");
		Set result = (Set)BackendFacade.invoke(_ctx, new QualifiedName ("testWithout2"), Arrays.asList (Arrays.asList(f1, f2, i, v), Arrays.asList(i, v)));
		
		assertEquals (2, result.size());
		assertFalse (result.contains(i));
		assertFalse (result.contains(v));
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testUnion () {
		Set result = (Set)BackendFacade.invoke(_ctx, new QualifiedName ("testUnion"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L), Arrays.asList(6L)));
		assertEquals (6, result.size());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testIntersect () {
		Set result = (Set)BackendFacade.invoke(_ctx, new QualifiedName ("testIntersect"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L), Arrays.asList(2L, 3L)));
		assertEquals (2, result.size());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testAdd () {
		List<Long> col = new ArrayList<Long>();
		col.addAll(Arrays.asList(1L, 2L, 3L, 4L, 5L));
		Long elem = new Long(6);
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testAdd"), Arrays.asList (col, elem));
		
		assertEquals(6L, result.size());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testAddAll () {
		List<Long> col1 = new ArrayList<Long>();
		col1.addAll(Arrays.asList(1L, 2L, 3L, 4L, 5L));
		List<Long> col2 = new ArrayList<Long>();
		col2.addAll(Arrays.asList(6L, 7L, 8L, 9L));
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testAddAll"), Arrays.asList (col1, col2));

		assertEquals(9L, result.size());
	}

	@Test
	public void testContains () {
		List<Long> col = new ArrayList<Long>();
		col.addAll(Arrays.asList(1L, 2L, 3L, 4L, 5L));
		Long elem1 = new Long(3);
		Long elem2 = new Long(7);
		Boolean result1 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testContains"), Arrays.asList (col, elem1));
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testContains"), Arrays.asList (col, elem2));
		
		assertTrue (result1);
		assertFalse (result2);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testContainsAll () {
		List<Long> col1 = new ArrayList<Long>();
		col1.addAll(Arrays.asList(1L, 2L, 3L, 4L, 5L));
		List<Long> col2 = new ArrayList<Long>();
		col2.addAll(Arrays.asList(1L, 3L, 4L));
		List<Long> col3 = new ArrayList<Long>();
		col3.addAll(Arrays.asList(1L, 3L, 7L));
		Boolean result1 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testContainsAll"), Arrays.asList (col1, col2));
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testContainsAll"), Arrays.asList (col1, col3));
		
		assertTrue (result1);
		assertFalse (result2);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testFlatten () {
		Collection<Long> result = (Collection<Long>)BackendFacade.invoke(_ctx, new QualifiedName ("testFlatten"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, Arrays.asList(2L, Arrays.asList(2L, 3L)), 5L) ));
		Iterator<Long> it = result.iterator();
		assertEquals(1L, it.next().longValue());
		assertEquals(2L, it.next().longValue());
		assertEquals(3L, it.next().longValue());
		assertEquals(4L, it.next().longValue());
		assertEquals(2L, it.next().longValue());
		assertEquals(2L, it.next().longValue());
		assertEquals(3L, it.next().longValue());
		assertEquals(5L, it.next().longValue());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testIsEmpty () {
		List<Long> col1 = new ArrayList<Long>();
		List<Long> col2 = new ArrayList<Long>();
		col2.addAll(Arrays.asList(1L, 2L, 3L, 4L, 5L));
		Boolean result1 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testIsEmpty"), Arrays.asList (col1));
		Boolean result2 = (Boolean)BackendFacade.invoke(_ctx, new QualifiedName ("testIsEmpty"), Arrays.asList (col2));
		
		assertTrue (result1);
		assertFalse (result2);
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testRemove () {
		List<Long> col = new ArrayList<Long>();
		col.addAll(Arrays.asList(1L, 2L, 3L, 4L, 5L));
		Long elem = new Long(3);
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testRemove"), Arrays.asList (col, elem));
		
		assertEquals(4L, result.size());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testSize () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testSize"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L)));
		assertEquals(5L, result.intValue());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testRemoveAll () {
		List<Long> col1 = new ArrayList<Long>();
		col1.addAll(Arrays.asList(1L, 2L, 3L, 4L, 5L, 3L));
		List<Long> col2 = new ArrayList<Long>();
		col2.addAll(Arrays.asList(3L, 4L));
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testRemoveAll"), Arrays.asList (col1, col2));
		
		assertEquals (3L, result.size());
		assertTrue (result.contains(1L));
		assertTrue (result.contains(2L));
		assertTrue (result.contains(5L));
		assertFalse (result.contains(3L));
		assertFalse (result.contains(4L));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testReverse () {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testReverse"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L)));
		assertEquals(5L, result.size());
		assertEquals(5L, result.get(0));
		assertEquals(4L, result.get(1));
		assertEquals(3L, result.get(2));
		assertEquals(2L, result.get(3));
		assertEquals(1L, result.get(4));
	}
	
	@Test
	public void testIndexOf () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testIndexOf"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L), 3L));
		assertEquals(2L, result.longValue());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testFirst () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testFirst"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L)));
		assertEquals(1L, result.longValue());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testLast () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testLast"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L)));
		assertEquals(5L, result.longValue());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testWithoutFirst () {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testWithoutFirst"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L)));
		assertEquals(4L, result.size());
		assertEquals(2L, result.get(0));
		assertEquals(3L, result.get(1));
		assertEquals(4L, result.get(2));
		assertEquals(5L, result.get(3));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testWithoutLast () {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testWithoutLast"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L)));
		assertEquals(4L, result.size());
		assertEquals(1L, result.get(0));
		assertEquals(2L, result.get(1));
		assertEquals(3L, result.get(2));
		assertEquals(4L, result.get(3));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testGet () {
		Long result = (Long)BackendFacade.invoke(_ctx, new QualifiedName ("testGet"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 4L, 5L), 3L));
		assertEquals(4L, result.longValue());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testToList () {
		List result = (List)BackendFacade.invoke(_ctx, new QualifiedName ("testToList"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 3L, 4L, 5L)));
		assertEquals(6L, result.size());
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testToSet () {
		Set result = (Set)BackendFacade.invoke(_ctx, new QualifiedName ("testToSet"), Arrays.asList (Arrays.asList(1L, 2L, 3L, 3L, 4L, 5L)));
		assertEquals(5L, result.size());
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testPolymorhicCollections1 () {
		Field f1 = new Field ();
		f1.setName("firstName");
		Field f2 = new Field ();
		f2.setName("lastName");
		Identifier i = new Identifier ();
		i.setName ("id");
		Version v = new Version ();
		v.setName ("version");
		Set<String> result = (Set<String>)BackendFacade.invoke(_ctx, new QualifiedName ("testCollectionsWithOperationParams"), Arrays.asList (Arrays.asList(f1, i, v, f2)));

		assertEquals(2, result.size());
		assertTrue (result.contains (f1));
		assertTrue (result.contains (f2));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testPolymorhicCollections2 () {
		Field f1 = new Field ();
		f1.setName("firstName");
		Field f2 = new Field ();
		f2.setName("lastName");
		Identifier i = new Identifier ();
		i.setName ("id");
		Version v = new Version ();
		v.setName ("version");
		Set result = (Set)BackendFacade.invoke(_ctx, new QualifiedName ("testPolymorphicCollections"), Arrays.asList (Arrays.asList(f1, i, v, f2)));

		assertEquals (2, result.size());
	}
}
