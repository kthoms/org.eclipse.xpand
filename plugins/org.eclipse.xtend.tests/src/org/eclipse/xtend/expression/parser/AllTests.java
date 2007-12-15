package org.eclipse.xtend.expression.parser;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.expression.parser");
		//$JUnit-BEGIN$
		suite.addTestSuite(ParserTest.class);
		suite.addTestSuite(ScannerTest.class);
		//$JUnit-END$
		return suite;
	}

}
