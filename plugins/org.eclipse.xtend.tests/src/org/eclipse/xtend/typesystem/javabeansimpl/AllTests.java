package org.eclipse.xtend.typesystem.javabeansimpl;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.typesystem.javabeansimpl");
		//$JUnit-BEGIN$
		suite.addTestSuite(JavaTest.class);
		//$JUnit-END$
		return suite;
	}

}
