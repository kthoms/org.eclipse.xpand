package org.eclipse.xpand.internal.tests;


import org.eclipse.xpand.internal.tests.analyze.AllPackageTests;

import junit.framework.TestSuite;

public class AllTests extends TestSuite{
	
	public AllTests() {
		addTest(org.eclipse.xpand.internal.tests.pr.AllPackageTests.suite());
		addTest(org.eclipse.xpand.internal.tests.AllPackageTests.suite());
		addTest(AllPackageTests.suite());
		addTest(org.eclipse.xpand.internal.tests.codeassist.AllPackageTests.suite());
		addTest(org.eclipse.xpand.internal.tests.evaluate.AllPackageTests.suite());
		addTest(org.eclipse.xpand.internal.tests.impl.AllPackageTests.suite());
		addTest(org.eclipse.xpand.internal.tests.output.AllPackageTests.suite());
		addTest(org.eclipse.xpand.internal.tests.parser.AllPackageTests.suite());
	}

}
