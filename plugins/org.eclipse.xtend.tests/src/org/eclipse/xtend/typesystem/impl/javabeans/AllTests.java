package org.eclipse.xtend.typesystem.impl.javabeans;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.typesystem.impl.javabeans");
		//$JUnit-BEGIN$
		suite.addTestSuite(JavaBeansStrategyTest.class);
		//$JUnit-END$
		return suite;
	}

}
