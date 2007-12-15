package org.eclipse.xtend.expression.codeassist;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.expression.codeassist");
		//$JUnit-BEGIN$
		suite.addTestSuite(ReverseScannerTest.class);
		suite.addTestSuite(ExpressionProposalComputerTest.class);
		suite.addTestSuite(TypeProposalComputerTest.class);
		suite.addTestSuite(ExtensionImportProposalComputerTest.class);
		//$JUnit-END$
		return suite;
	}

}
