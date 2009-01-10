/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xpand.internal.tests;

import java.util.List;

import junit.framework.TestCase;

import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.Outlet;

public class GeneratorTest extends TestCase {
	private Generator generator;
	
	public void setUp () throws Exception {
		generator = new Generator();
	}
	
	public void testOutlets_DefaultEncoding () {
		configureDefaultOutlet();
		List<Outlet> outlets = generator.getOutlets();
		assertEquals(1, outlets.size());
		Outlet o = outlets.get(0);
		assertTrue(o.hasDefaultEncoding());
		assertEquals(System.getProperty("file.encoding"), o.getFileEncoding());
	}
	
	public void testOutlets_InheritedEncoding () {
		// choose encoding different from system default
		String encoding = System.getProperty("file.encoding").equalsIgnoreCase("utf8") ? "utf8" : "ISO-8859-1";
		generator.setFileEncoding(encoding);
		
		configureDefaultOutlet();
		List<Outlet> outlets = generator.getOutlets();
		assertEquals(1, outlets.size());
		Outlet o = outlets.get(0);
		assertTrue(!o.hasDefaultEncoding());
		assertEquals(encoding, o.getFileEncoding());
	}
	
	
	private void configureDefaultOutlet () {
		Outlet o = new Outlet();
		o.setPath(System.getProperty("java.io.tmpdir"));
		generator.addOutlet(o);
	}
}
