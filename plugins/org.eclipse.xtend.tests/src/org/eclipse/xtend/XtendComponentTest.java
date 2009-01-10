/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.xtend;

import java.util.HashMap;

import junit.framework.TestCase;

import org.eclipse.emf.mwe.core.WorkflowRunner;


public class XtendComponentTest extends TestCase {
    public void testGlobalVarDef () throws Exception {
        final WorkflowRunner wf = new WorkflowRunner ();
        wf.run("org/eclipse/xtend/globalvarTest.oaw", null, new HashMap<String, String>(), new HashMap<String, String> ());
        assertEquals ("Hello", wf.getContext().get("result"));
    }
}
