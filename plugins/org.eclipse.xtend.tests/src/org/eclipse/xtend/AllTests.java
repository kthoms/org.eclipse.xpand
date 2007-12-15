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
		//$JUnit-END$
		return suite;
	}

}
