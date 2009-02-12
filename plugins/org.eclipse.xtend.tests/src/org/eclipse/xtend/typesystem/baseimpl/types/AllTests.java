package org.eclipse.xtend.typesystem.baseimpl.types;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.typesystem.baseimpl.types");
		//$JUnit-BEGIN$
		suite.addTestSuite(IntegerTypeTest.class);
		suite.addTestSuite(CollectionTypeTest.class);
		suite.addTestSuite(ObjectTypeTest.class);
		suite.addTestSuite(TypeTypeTest.class);
		suite.addTestSuite(RealTypeTest.class);
		suite.addTestSuite(StringTypeTest.class);
		suite.addTestSuite(EnumTest.class);
		suite.addTestSuite(BooleanTypeTest.class);
		suite.addTestSuite(RealAndIntegerTeamplayTest.class);
		//$JUnit-END$
		return suite;
	}

}
