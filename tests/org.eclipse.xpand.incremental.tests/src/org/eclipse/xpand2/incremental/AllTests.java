/*******************************************************************************
 * Copyright (c) 2005, 2009 eXXcellent solution gmbh and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Achim Demelt - initial API and implementation
 *******************************************************************************/
package org.eclipse.xpand2.incremental;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.xpand.incremental");
		//$JUnit-BEGIN$
		suite.addTestSuite(CompareTests.class);
		suite.addTestSuite(TraceTests.class);
		suite.addTestSuite(IncrementalCallbackTests.class);
		suite.addTestSuite(IncrementalFacadeTests.class);
		//$JUnit-END$
		return suite;
	}

}
