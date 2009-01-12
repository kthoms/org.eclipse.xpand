package org.eclipse.xpand.internal.tests.analyze;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xpand.internal.tests.analyze");
		//$JUnit-BEGIN$
		suite.addTestSuite(StatementAnalyzationTest.class);
		//$JUnit-END$
		return suite;
	}

}
