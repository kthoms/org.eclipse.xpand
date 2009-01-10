/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend.expression.codeassist;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.xtend.expression.codeassist");
		//$JUnit-BEGIN$
		suite.addTestSuite(ReverseScannerTest.class);
		suite.addTestSuite(ExpressionProposalComputerTest.class);
		suite.addTestSuite(TypeProposalComputerTest.class);
		suite.addTestSuite(ExtensionImportProposalComputerTest.class);
		//$JUnit-END$
		return suite;
	}

}
