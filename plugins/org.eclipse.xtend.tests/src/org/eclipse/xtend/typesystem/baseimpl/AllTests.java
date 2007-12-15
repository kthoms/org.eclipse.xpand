package org.eclipse.xtend.typesystem.baseimpl;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.typesystem.baseimpl");
		//$JUnit-BEGIN$
		suite.addTestSuite(ObjectFeaturesTest.class);
		suite.addTestSuite(TypesComparatorTest.class);
		suite.addTestSuite(CollectionFeaturesTest.class);
		//$JUnit-END$
		return suite;
	}

}
