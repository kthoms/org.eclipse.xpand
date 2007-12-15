package org.eclipse.xpand.internal.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xpand.internal.tests");
		//$JUnit-BEGIN$
		suite.addTestSuite(GeneratorTest.class);
		suite.addTestSuite(GeneratorAdviceTest.class);
		//$JUnit-END$
		return suite;
	}

}
