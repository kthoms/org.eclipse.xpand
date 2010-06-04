/*******************************************************************************
 * Copyright (c) 2010 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.common;

import static org.eclipse.xtend.backend.testhelpers.BackendTestHelper.createEmptyExecutionContext;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author aarnold - Initial contribution and API
 */
public class HelperTest {

	@Test public void testOverridableToString () {
        final ExecutionContext ctx = createEmptyExecutionContext();
        assertEquals ("expected", Helpers.overridableToString (ctx, "expected"));
	}
}
