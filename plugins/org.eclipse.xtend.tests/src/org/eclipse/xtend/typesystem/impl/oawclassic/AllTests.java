package org.eclipse.xtend.typesystem.impl.oawclassic;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.typesystem.impl.oawclassic");
		//$JUnit-BEGIN$
		suite.addTestSuite(OawClassicStrategyTest.class);
		//$JUnit-END$
		return suite;
	}

}
