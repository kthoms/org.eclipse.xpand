/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.middleend.xtend.test;

import java.util.Arrays;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * @author aarnold - Initial contribution and API
 */
public class BugsTest extends JavaXtendTest  {
	
	@Before
	@Override
	public void setUp() throws Exception {
		super.setUp();
		_bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::bugs", "iso-8859-1", _mms);;
		_ctx = BackendFacade.createExecutionContext (_bc.getFunctionDefContext(), _ts, true);
	}
	
	@Test
	public void testCreateSetWithSelectFirstBug329296 () {
		assertNotNull (BackendFacade.invoke(_ctx, new QualifiedName ("testCreateSetWithSelectFirstBug329296"), Arrays.asList (new Model())).toString());
	}

}
