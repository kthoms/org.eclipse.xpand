/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend;

import java.util.HashMap;

import junit.framework.TestCase;

import org.eclipse.emf.mwe.core.WorkflowEngine;


public class XtendComponentTest extends TestCase {
    public void testGlobalVarDef () throws Exception {
        final WorkflowEngine wf = new WorkflowEngine ();
        wf.run("org/eclipse/xtend/globalvarTest.oaw", null, new HashMap<String, String>(), new HashMap<String, String> ());
        assertEquals ("Hello", wf.getContext().get("result"));
    }
}
