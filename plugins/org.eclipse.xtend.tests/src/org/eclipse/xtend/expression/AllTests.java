/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
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
