/*
Copyright (c) 2008 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend.xpand.test;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( { GeneralXpandTest.class, XpandStatementTest.class, XpandAopTest.class, XpandProtectedRegionResolverTest.class })
public class AllXpandTests {

	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter (AllXpandTests.class);
	}

}
