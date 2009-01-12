package org.eclipse.xpand.internal.tests.impl;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xpand.internal.tests.impl");
		//$JUnit-BEGIN$
		suite.addTestSuite(NameUtilTest.class);
		//$JUnit-END$
		return suite;
	}

}
