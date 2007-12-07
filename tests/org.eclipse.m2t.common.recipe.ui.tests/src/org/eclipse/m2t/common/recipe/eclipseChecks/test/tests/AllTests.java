/**
 * <copyright>
 *
 * Copyright (c) 2005-2006 Bernd Kolb and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bernd Kolb - implementation
 *
 * </copyright>
 */

package org.eclipse.m2t.common.recipe.eclipseChecks.test.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.internal.xtend.recipe.eclipseChecks.test.tests");
		//$JUnit-BEGIN$
		suite.addTestSuite(ResourceExistenceTest.class);
		suite.addTestSuite(ClassExistenceTest.class);
		suite.addTestSuite(InterfaceTest.class);
		suite.addTestSuite(PropertiesTest.class);
		suite.addTestSuite(MethodExistenceTest.class);
//		suite.addTestSuite(AnnotationExistenceTest.class);
		//$JUnit-END$
		return suite;
	}

}
