package org.eclipse.xpand.internal.tests.output;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xpand.internal.tests.output");
		//$JUnit-BEGIN$
		suite.addTestSuite(OutputImplTest.class);
		suite.addTestSuite(NoChangesVetoStrategyTest.class);
		//$JUnit-END$
		return suite;
	}

}
