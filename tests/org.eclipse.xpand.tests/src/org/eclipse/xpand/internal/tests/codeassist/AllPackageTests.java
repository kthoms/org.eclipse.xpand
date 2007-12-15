package org.eclipse.xpand.internal.tests.codeassist;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xpand.internal.tests.codeassist");
		//$JUnit-BEGIN$
		suite.addTestSuite(FastAnalyzerTest.class);
		suite.addTestSuite(KeywordProposalComputerTest.class);
		suite.addTestSuite(StatementProposalComputerTest.class);
		//$JUnit-END$
		return suite;
	}

}
