package org.eclipse.xtend.typesystem.emf;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.typesystem.emf");
		//$JUnit-BEGIN$
		suite.addTestSuite(EmfMetaModelTest.class);
		suite.addTestSuite(EnumTypeTest.class);
		//$JUnit-END$
		return suite;
	}

}
