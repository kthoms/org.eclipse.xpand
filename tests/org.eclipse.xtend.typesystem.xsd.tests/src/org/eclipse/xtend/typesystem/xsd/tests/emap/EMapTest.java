/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.tests.emap;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.emf.EcoreUtil2;
import org.eclipse.xtend.typesystem.xsd.XSDMetaModel;
import org.eclipse.xtend.typesystem.xsd.tests.AbstractTestCase;

/**
 * @author Moritz Eysholdt - Initial contribution
 */
public class EMapTest extends AbstractTestCase {

	private ExpressionFacade ec;

	protected void setUp() throws Exception {
		super.setUp();
		String file = getSrcDir() + "/EMap.ecore";
		EPackage pack = EcoreUtil2.getEPackage(file);
		XSDMetaModel mm = new XSDMetaModel();
		mm.getXsdManager().getPackageRegistry().put(pack.getNsURI(), pack);
		ExecutionContextImpl ctx = new ExecutionContextImpl();
		ctx.registerMetaModel(mm);
		ec = new ExpressionFacade(ctx);
		Object obj = ec.evaluate("emap::Class1.newInstance()");
		ec = ec.cloneWithVariable(new Variable("obj", obj));
		ec.evaluate("obj.map.put('key1','value1')");
		ec.evaluate("obj.map.put('key2','value2')");
	}

	public void testContainsKey() {
		assertTrue(ec.evaluate("obj.map.containsKey('key1')"));
		assertFalse(ec.evaluate("obj.map.containsKey('keyX')"));
	}

	public void testContainsValue() {
		assertTrue(ec.evaluate("obj.map.containsValue('value1')"));
		assertFalse(ec.evaluate("obj.map.containsValue('valueX')"));
	}

	public void testGet() {
		assertEquals("value1", ec.evaluate("obj.map.get('key1')"));
		assertNull("value1", ec.evaluate("obj.map.get('keyX')"));
	}

	public void testIndexOfKey() {
		assertEquals(0, ec.evaluate("obj.map.indexOfKey('key1')"));
		assertEquals(1, ec.evaluate("obj.map.indexOfKey('key2')"));
	}

	public void testKeySet() {
		assertEquals("[key1, key2]", ec.evaluate("obj.map.keySet()").toString());
	}

	public void testRemoveKey() {
		assertEquals("value1", ec.evaluate("obj.map.removeKey('key1')"));
		assertEquals(new Long(1), ec.evaluate("obj.map.size"));
	}

	public void testValues() {
		assertEquals("[value1, value2]", ec.evaluate("obj.map.values()")
				.toString());
	}

}
