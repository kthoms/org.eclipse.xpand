package org.eclipse.xpand.internal.tests.parser;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xpand.internal.tests.parser");
		//$JUnit-BEGIN$
		suite.addTestSuite(StatementParserTest.class);
		suite.addTestSuite(XpandLexerTest.class);
		//$JUnit-END$
		return suite;
	}

}
