package org.eclipse.xtend.codeassist;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xtend.codeassist");
		//$JUnit-BEGIN$
		suite.addTestSuite(FastAnalyzerTest.class);
		//$JUnit-END$
		return suite;
	}

}
