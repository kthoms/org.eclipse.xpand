package org.eclipse.xtend.expression.ast;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.expression.ast");
		//$JUnit-BEGIN$
		suite.addTestSuite(EvaluationTest.class);
		suite.addTestSuite(AnalyzationTest.class);
		//$JUnit-END$
		return suite;
	}

}
