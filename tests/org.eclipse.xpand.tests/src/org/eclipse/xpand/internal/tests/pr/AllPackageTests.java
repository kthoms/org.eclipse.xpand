package org.eclipse.xpand.internal.tests.pr;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xpand.internal.tests.pr");
		//$JUnit-BEGIN$
		suite.addTestSuite(ProtectedRegionResolverImplTest.class);
		//$JUnit-END$
		return suite;
	}

}
