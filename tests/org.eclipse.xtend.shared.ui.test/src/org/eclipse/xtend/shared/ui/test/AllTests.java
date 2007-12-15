package org.eclipse.xtend.shared.ui.test;

import org.eclipse.xtend.shared.ui.test.core.AllPackageTests;

import junit.framework.TestSuite;

public class AllTests extends TestSuite {

	public AllTests() {
		addTest(AllPackageTests.suite());
		addTest(org.eclipse.xtend.shared.ui.test.core.metamodel.jdt.AllPackageTests.suite());
		addTest(org.eclipse.xtend.shared.ui.test.xpand2.core.AllPackageTests.suite());
		addTest(org.eclipse.xtend.shared.ui.test.xpand2.emf.AllPackageTests.suite());
	}

}
