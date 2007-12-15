package org.eclipse.xtend.check;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xtend.check");
		//$JUnit-BEGIN$
		suite.addTestSuite(CheckFastAnalyzerTest.class);
		suite.addTestSuite(CheckAnalyzationTest.class);
		suite.addTestSuite(CheckEvaluationTest.class);
		//$JUnit-END$
		return suite;
	}

}
