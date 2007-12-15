package org.eclipse.xtend.shared.ui.test.core.metamodel.jdt;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllPackageTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.shared.ui.test.core.metamodel.jdt");
		//$JUnit-BEGIN$
		suite.addTestSuite(JdtMetaModelTest.class);
		//$JUnit-END$
		return suite;
	}

}
