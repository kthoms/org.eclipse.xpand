package org.eclipse.xtend.shared.ui.test.core;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.shared.ui.test.core");
		//$JUnit-BEGIN$
		suite.addTestSuite(JdtOawClassicTest.class);
		suite.addTestSuite(JdtJavaBeanTest.class);
		//$JUnit-END$
		return suite;
	}

}
