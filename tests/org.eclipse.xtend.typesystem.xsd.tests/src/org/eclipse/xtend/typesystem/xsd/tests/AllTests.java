package org.eclipse.xtend.typesystem.xsd.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.xtend.typesystem.xsd.tests.compositetypes.CompositeTypesTest;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xtend.typesystem.xsd.tests");
		// $JUnit-BEGIN$
		suite.addTestSuite(CompositeTypesTest.class);
		// $JUnit-END$
		return suite;
	}

}
