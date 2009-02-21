package org.eclipse.xtend.shared.ui.test.xpand2.core;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.shared.ui.test.xpand2.core");
		//$JUnit-BEGIN$
		suite.addTestSuite(Bug155018Test.class);
		suite.addTestSuite(JdtJavaBeanTest.class);
		suite.addTestSuite(XtendXpandProjectTest.class);
		suite.addTestSuite(SimpleProjectTest.class);
		suite.addTestSuite(ASTTest.class);
		//$JUnit-END$
		return suite;
	}

}
