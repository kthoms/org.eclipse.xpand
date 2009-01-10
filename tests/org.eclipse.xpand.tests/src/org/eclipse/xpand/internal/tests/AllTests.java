/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xpand.internal.tests;

import org.eclipse.xpand.internal.tests.analyze.AllPackageTests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("All Test for org.eclipse.xpand");
		suite.addTest(org.eclipse.xpand.internal.tests.pr.AllPackageTests.suite());
		suite.addTest(org.eclipse.xpand.internal.tests.AllPackageTests.suite());
		suite.addTest(AllPackageTests.suite());
		suite.addTest(org.eclipse.xpand.internal.tests.codeassist.AllPackageTests.suite());
		suite.addTest(org.eclipse.xpand.internal.tests.evaluate.AllPackageTests.suite());
		suite.addTest(org.eclipse.xpand.internal.tests.impl.AllPackageTests.suite());
		suite.addTest(org.eclipse.xpand.internal.tests.output.AllPackageTests.suite());
		suite.addTest(org.eclipse.xpand.internal.tests.parser.AllPackageTests.suite());
		return suite;

	}

}
