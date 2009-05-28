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
package org.eclipse.xpand.internal.tests.output;

import java.io.File;
import java.io.FileOutputStream;

import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.FileHandleImpl;
import org.eclipse.xpand2.output.NoChangesVetoStrategy;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.PostProcessor;

import junit.framework.TestCase;

public class NoChangesVetoStrategyTest extends TestCase {
	public void testHasChanges() throws Exception {
		File f = new File("./temp.txt");
		if (f.exists()) {
			f.delete();
		}
		FileOutputStream out = new FileOutputStream(f);
		out.write("Foo bar".getBytes());
		out.close();
		
		Outlet outlet = new Outlet();
		outlet.addPostprocessor(new 
				PostProcessor() {
					public void afterClose(FileHandle impl) {
					}
					public void beforeWriteAndClose(FileHandle impl) {
						impl.setBuffer(new StringBuffer("Foo ").append(impl.getBuffer()));
					}});
		FileHandleImpl fh = new FileHandleImpl(outlet,f);
		NoChangesVetoStrategy p = new NoChangesVetoStrategy();
		outlet.beforeWriteAndClose(fh);
		assertFalse(p.hasVeto(fh));
		
		fh.setBuffer("bar");
		outlet.beforeWriteAndClose(fh);
		assertTrue(p.hasVeto(fh));
		
		fh.setBuffer("honolulu");
		outlet.beforeWriteAndClose(fh);
		assertFalse(p.hasVeto(fh));
	}
}
