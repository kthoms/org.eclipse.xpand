/*******************************************************************************
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend.test;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( { GeneralXtendTest.class, ExpressionTest.class,
		OperatorExpressionTest.class, AopTest.class, CheckTest.class })
public class AllTests {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllTests.class);
	}

}
