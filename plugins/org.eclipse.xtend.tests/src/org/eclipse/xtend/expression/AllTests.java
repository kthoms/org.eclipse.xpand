package org.eclipse.xtend.expression;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xtend.expression");
		//$JUnit-BEGIN$
		suite.addTestSuite(PolymorphismTest.class);
		suite.addTestSuite(TypeNameUtilTest.class);
		suite.addTestSuite(ResourceManagerDefaultImplTest.class);
		suite.addTestSuite(EvaluationExceptionTest.class);
		suite.addTestSuite(ExecutionContextImplTest.class);
		//$JUnit-END$
		return suite;
	}

}
