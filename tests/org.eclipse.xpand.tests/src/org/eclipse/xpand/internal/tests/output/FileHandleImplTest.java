/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xpand.internal.tests.output;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.ast.ExpandStatement;
import org.eclipse.xpand2.output.FileHandleImpl;
import org.eclipse.xpand2.output.Outlet;

/**
 * @author Karsten Thoms (karsten.thoms@itemis.de) - Initial contribution and API
 */
public class FileHandleImplTest extends TestCase {

	public final void testNormalAppend() throws Exception {
		FileHandleImpl handle = createTestFileHandle();
		((Appendable) handle.getBuffer()).append("text1");
		((Appendable) handle.getBuffer()).append("text2");
		((Appendable) handle.getBuffer()).append("text3");
		assertEquals("text1text2text3", handle.getBuffer().toString());
	}

	/**
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=329520
	 */
	public final void testInsertionPoint() throws Exception {
		FileHandleImpl handle = createTestFileHandle();
		// used for insertion point reference
		ExpandStatement stmt1 = new ExpandStatement(null, null, null, null, false, true);
		ExpandStatement stmt2 = new ExpandStatement(null, null, null, null, false, true);

		((Appendable) handle.getBuffer()).append("1");
		((Appendable) handle.getBuffer()).append("2");

		handle.registerInsertionPoint(stmt1);

		((Appendable) handle.getBuffer()).append("3");

		handle.registerInsertionPoint(stmt2);

		((Appendable) handle.getBuffer()).append("4");
		((Appendable) handle.getBuffer()).append("5");

		handle.activateInsertionPoint(stmt2);
		((Appendable) handle.getBuffer()).append("6");
		((Appendable) handle.getBuffer()).append("7");
		handle.deactivateInsertionPoint(stmt2);

		handle.activateInsertionPoint(stmt1);
		((Appendable) handle.getBuffer()).append("8");
		((Appendable) handle.getBuffer()).append("9");
		handle.deactivateInsertionPoint(stmt1);

		assertEquals("128936745", handle.getBuffer().toString());
	}

	private FileHandleImpl createTestFileHandle() throws IOException {
		File f = File.createTempFile("test", "");
		f.deleteOnExit();
		Outlet outlet = new Outlet(System.getProperty("java.io.tmpdir"));
		FileHandleImpl handle = new FileHandleImpl(outlet, f);
		return handle;
	}
}
