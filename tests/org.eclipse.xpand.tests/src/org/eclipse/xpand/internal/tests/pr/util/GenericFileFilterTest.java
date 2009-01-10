/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xpand.internal.tests.pr.util;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.pr.util.GenericFileFilter;

/**
 * Unit test for class {@link GenericFileFilter}.
 * @author Karsten Thoms
 *
 * @since 21.01.2008
 */
public class GenericFileFilterTest extends TestCase {
	private static final File TMPDIR = new File(System.getProperty("java.io.tmpdir")); 
	
	/**
	 * Creates a testfile in temp dir for this test.
	 * @param extension The file extension to use
	 * @return A newly created file that will be deleted automatically on exit
	 * @throws IOException On any errors
	 * @since 21.01.2008
	 */
	private File createTestFileByExtension (String extension) throws IOException {
		File f = new File(TMPDIR, "GenericFileFilterTest."+extension);
		f.createNewFile();
		f.deleteOnExit();
		return f;
	}

	/**
	 * Tests the filter with default extensions
	 * @throws Exception On any unexpected exception
	 * @since 21.01.2008
	 */
	public void testDefaultExcludes () throws Exception {
		// create without custom excludes and with default excludes option on
		GenericFileFilter filter = new GenericFileFilter(null, true);

		assertFalse("file with extension '.bak' must be excluded", filter.accept(createTestFileByExtension("bak")));
		assertFalse("file with extension '.elc' must be excluded", filter.accept(createTestFileByExtension("elc")));
		
		assertTrue("file with extension '.txt' must be included", filter.accept(createTestFileByExtension("txt")));
	}

	/**
	 * Tests the file filter with a comma-separated list of custom extensions. Default excludes are ignored.
	 * @throws Exception
	 * @since 21.01.2008
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=205522
	 */
	public void testNonDefaultExcludes_CommaSeparated_withDefaultExcludes () throws Exception {
		// create the filter and deactivate default excludes
		GenericFileFilter filter = new GenericFileFilter("*.xml, *.hbm", true);

		assertFalse("file with extension '.xml' must be excluded", filter.accept(createTestFileByExtension("xml")));
		assertFalse("file with extension '.hbm' must be excluded", filter.accept(createTestFileByExtension("hbm")));
		assertFalse("file with extension '.bak' must be excluded", filter.accept(createTestFileByExtension("bak")));
		
		assertTrue("file with extension '.txt' must be included", filter.accept(createTestFileByExtension("txt")));
	}
	
	/**
	 * Tests the file filter with a comma-separated list of custom extensions. Default excludes are ignored.
	 * @throws Exception
	 * @since 21.01.2008
	 */
	public void testNonDefaultExcludes_SpaceSeparated_withoutDefaultExcludes () throws Exception {
		// create the filter and deactivate default excludes
		GenericFileFilter filter = new GenericFileFilter("*.xml *.hbm", false);

		assertFalse("file with extension '.xml' must be excluded", filter.accept(createTestFileByExtension("xml")));
		assertFalse("file with extension '.hbm' must be excluded", filter.accept(createTestFileByExtension("hbm")));
		
		assertTrue("file with extension '.txt' must be included", filter.accept(createTestFileByExtension("txt")));
		assertTrue("file with extension '.bak' must be included", filter.accept(createTestFileByExtension("bak")));
	}
	
	/**
	 * Tests wrong custom exclude list: Wildcard in the middle of a search pattern 
	 * @since 21.01.2008
	 */
	public void testWildcardInMiddleOfCustomExclude () {
		try {
			new GenericFileFilter("test*.xml", false);
			fail ("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			; // OK
		}
	}

	/**
	 * Tests wrong custom exclude list: Missing separator between extensions with wildcards. 
	 * @since 21.01.2008
	 */
	public void testMultipleWildcardsInCustomExclude () {
		try {
			new GenericFileFilter("*.test*.xml", false);
			fail ("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			; // OK
		}
	}
}
