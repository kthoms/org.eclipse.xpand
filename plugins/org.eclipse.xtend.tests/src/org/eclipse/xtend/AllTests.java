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

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xtend");
		//$JUnit-BEGIN$
		suite.addTestSuite(ExtensionAnalyzationTest.class);
		suite.addTestSuite(XtendFacadeTest.class);
		suite.addTestSuite(XtendComponentTest.class);
		suite.addTestSuite(ExtensionEvaluationTest.class);
		suite.addTestSuite(JavaExtensionTypeConversionTest.class);
		//$JUnit-END$
		return suite;
	}

}
