package org.eclipse.xtend.parser;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xtend.parser");
		//$JUnit-BEGIN$
		suite.addTestSuite(ExtensionParserTest.class);
		//$JUnit-END$
		return suite;
	}

}
