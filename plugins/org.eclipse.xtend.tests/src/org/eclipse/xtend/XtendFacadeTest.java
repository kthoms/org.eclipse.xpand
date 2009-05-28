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
package org.eclipse.xtend;

import java.util.HashSet;

import junit.framework.TestCase;

import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.typesystem.Type;

public class XtendFacadeTest extends TestCase {

	public final void testEval() {
		final XtendFacade f = XtendFacade.create("org::eclipse::xtend::Extensions");
		assertEquals("_Stuff", f.call("appendStuff", new Object[] { "_" }));
	}

	public final void testEval1() {
		final XtendFacade f = XtendFacade.create("org::eclipse::xtend::AnotherExt");
		assertEquals("XXStuff", f.call("doStuff", new Object[] { "X" }));
	}

	public final void testReExported() {
		final XtendFacade f = XtendFacade.create("org::eclipse::xtend::AnotherExt");
		assertEquals("_Stuff", f.call("appendStuff", new Object[] { "_" }));
	}

	public final void testAnalyze() {
		final XtendFacade f = XtendFacade.create("org::eclipse::xtend::AnotherExt");
		final Type t = f.analyze("doStuff", new Object[] { "X" }, new HashSet<AnalysationIssue>());
		assertEquals("String", t.getName());
	}

	public void testOverwriteSemantics() throws Exception {
		final XtendFacade f = XtendFacade.create("org::eclipse::xtend::Reexporting");
		assertEquals("1-String",f.call("overwrite1", "FOO"));
		assertEquals("1-Object",f.call("overwrite1", 5));
		assertEquals("2-Object",f.call("overwrite2", "FOO"));
	}

}
