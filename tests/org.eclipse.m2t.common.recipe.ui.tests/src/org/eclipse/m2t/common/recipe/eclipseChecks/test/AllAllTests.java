package org.eclipse.m2t.common.recipe.eclipseChecks.test;

import org.eclipse.m2t.common.recipe.eclipseChecks.test.tests.AllTests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllAllTests{

	public static Test suite() {
		TestSuite suite = new TestSuite("All Test for org.eclipse.m2t.common.recipe.ui");
		suite.addTest(AllTests.suite());
		return suite;
	}
}
