package org.eclipse.xtend.shared.ui.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.xtend.shared.ui.test.core.AllPackageTests;

public class AllTests{

	public static Test suite() {
		TestSuite suite = new TestSuite("All Test for org.eclipse.xtend.shared.ui");
		suite.addTest(AllPackageTests.suite());
		suite.addTest(org.eclipse.xtend.shared.ui.test.core.metamodel.jdt.AllPackageTests.suite());
		suite.addTest(org.eclipse.xtend.shared.ui.test.xpand2.core.AllPackageTests.suite());
		suite.addTest(org.eclipse.xtend.shared.ui.test.xpand2.emf.AllPackageTests.suite());
		return suite;
	}

}
