package org.eclipse.xtend.typesystem.emf;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllAllTests{

	public static Test suite() {
		TestSuite suite = new TestSuite("All Test for org.eclipse.xtend.typesystem.emf");
		suite.addTest(AllTests.suite());
		suite.addTestSuite(PluginTests.class);
		return suite;
	}
}
