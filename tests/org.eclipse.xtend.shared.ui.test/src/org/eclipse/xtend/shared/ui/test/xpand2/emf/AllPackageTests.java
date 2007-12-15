package org.eclipse.xtend.shared.ui.test.xpand2.emf;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.shared.ui.test.xpand2.emf");
		//$JUnit-BEGIN$
		suite.addTestSuite(EmfXpandTest.class);
		//$JUnit-END$
		return suite;
	}

}
