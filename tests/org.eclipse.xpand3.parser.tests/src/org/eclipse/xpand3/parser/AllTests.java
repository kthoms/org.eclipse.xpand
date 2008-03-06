package org.eclipse.xpand3.parser;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xpand3.parser");
		//$JUnit-BEGIN$
		suite.addTestSuite(XpandLexerTest.class);
		suite.addTestSuite(Xpand3MigratedNodeParserTest.class);
		suite.addTestSuite(Xpand3ScannerTest.class);
		suite.addTestSuite(Xpand3NodeParserTest.class);
		suite.addTestSuite(StatementParserTest.class);
		//$JUnit-END$
		return suite;
	}

}
