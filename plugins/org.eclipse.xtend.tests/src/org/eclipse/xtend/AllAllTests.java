/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllAllTests extends TestSuite {
	public static Test suite() {
		AllAllTests suite = new AllAllTests();
		return suite;
	}

	public AllAllTests() {
		super("All Test for org.eclipse.xtend");
		addTest(AllTests.suite());
		addTest(org.eclipse.xtend.check.AllTests.suite());
		addTest(org.eclipse.xtend.codeassist.AllTests.suite());
		addTest(org.eclipse.xtend.expression.AllTests.suite());
		addTest(org.eclipse.xtend.expression.ast.AllTests.suite());
		addTest(org.eclipse.xtend.expression.codeassist.AllTests.suite());
		addTest(org.eclipse.xtend.expression.parser.AllTests.suite());
		addTest(org.eclipse.xtend.parser.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.baseimpl.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.baseimpl.types.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.emf.check.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.emf.check.cache.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.impl.javabeans.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.impl.oawclassic.AllTests.suite());
		addTest(org.eclipse.xtend.typesystem.javabeansimpl.test.AllTests.suite());
	}

}
