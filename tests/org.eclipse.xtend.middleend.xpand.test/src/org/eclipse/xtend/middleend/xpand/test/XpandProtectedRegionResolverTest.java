/*
Copyright (c) 2009 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend.xpand.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.eclipse.internal.xpand2.pr.ProtectedRegion;
import org.eclipse.internal.xpand2.pr.ProtectedRegionResolverImpl;
import org.eclipse.internal.xpand2.pr.ProtectedRegionSyntaxException;
import org.eclipse.xtend.backend.util.Base64Codec;
import org.eclipse.xtend.backend.util.FileHelper;
import org.eclipse.xtend.middleend.xpand.internal.xpandlib.pr.DuplicateXpandProtectedRegionException;
import org.eclipse.xtend.middleend.xpand.internal.xpandlib.pr.XpandProtectedRegionResolver;
import org.eclipse.xtend.middleend.xpand.internal.xpandlib.pr.XpandProtectedRegionResolver.XpandProtectedRegion;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author André Arnold
 *
 */
@SuppressWarnings("restriction")
public class XpandProtectedRegionResolverTest extends AbstractXpandTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testOldGetProtectedRegion() {
		ProtectedRegionResolverImpl res = new ProtectedRegionResolverImpl();
		res.setDefaultExcludes(true);
		res.setFileEncoding("ISO-8859-1");
		res.setSrcPathes("out2");
		res.init();
		ProtectedRegion region = res.getProtectedRegion("ImportTestPerson1");
		try {
			assertEquals("\nreturn \"firstProtectedOperation\";\n", region.getBody("/*", "*/"));
		} catch (ProtectedRegionSyntaxException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetProtectedRegion() {
		XpandProtectedRegionResolver resolver = new XpandProtectedRegionResolver();
		resolver.setDefaultExcludes(true);
		resolver.setFileEncoding("ISO-8859-1");
		resolver.setSrcPathes("out2");
		try {
			resolver.init();
		} catch (DuplicateXpandProtectedRegionException e) {
			fail("Duplicate protected region detected");
		}
		XpandProtectedRegion region = resolver.getProtectedRegion("ImportTestPerson1");
		try {
			assertEquals("\nreturn \"firstProtectedOperation\";\n", region.getBody("/*", "*/"));
		} catch (Exception e) {
			fail(e.getMessage());
		}
		assertEquals("ProtectedRegionImportTest.java", region.getFile().getName());
	}

	@Test
	public void testRegister() {
		XpandProtectedRegionResolver resolver = new XpandProtectedRegionResolver();
		resolver.setDefaultExcludes(true);
		resolver.setFileEncoding("ISO-8859-1");
		resolver.setSrcPathes("out2");
		try {
			resolver.init();
		} catch (DuplicateXpandProtectedRegionException e) {
			fail("Duplicate protected region detected");
		}
		XpandProtectedRegion region = resolver.createProtectedRegion("TestRegion1", false);
		try {
			resolver.register(region);
		} catch (DuplicateXpandProtectedRegionException e) {
			fail("Duplicate protected region detected");
		}
		XpandProtectedRegion region2 = resolver.createProtectedRegion("TestRegion1", false);
		try {
			resolver.register(region2);
			fail("No duplicate protected region detected");
		} catch (DuplicateXpandProtectedRegionException e) {
			//success
		}
	}

	@Test
	public void testReportRegions() {
		XpandProtectedRegionResolver resolver = new XpandProtectedRegionResolver();
		resolver.setDefaultExcludes(true);
		resolver.setFileEncoding("ISO-8859-1");
		resolver.setSrcPathes("out2");
		try {
			resolver.init();
		} catch (DuplicateXpandProtectedRegionException e) {
			fail("Duplicate protected region detected");
		}
		XpandProtectedRegion region = resolver.getProtectedRegion("ImportTestPerson1");
		File dumpPath = new File("dump");
		File dumpFile = null;
		try {
			dumpFile = new File("dump", Base64Codec.toString("ImportTestPerson2"));
			resolver.reportRegions(dumpPath);
			assertTrue(dumpFile.exists());
			String dumpedRegion = FileHelper.read(dumpFile, "ISO-8859-1");
			assertEquals("PROTECTED REGION ID(ImportTestPerson2) ENABLED START*/\nreturn \"secondProtectedOperation\";\n/*PROTECTED REGION END", dumpedRegion);
			dumpFile.delete();
			assertFalse(dumpFile.exists());
		} catch (IOException e) {
			fail(e.getMessage());
		}
	}

}
