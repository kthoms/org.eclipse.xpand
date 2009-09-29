/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.middleend.xtend.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.typesystem.MetaModel;
import org.junit.Test;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 *
 */
public class GeneralXtendTest {
	
    @Test
    @SuppressWarnings("unchecked")
    public void testXtendFacade() throws Exception {
        final List<MetaModel> mms = new ArrayList<MetaModel> ();
        mms.add (new JavaBeansMetaModel ());
        
        final CompositeTypesystem ts = new CompositeTypesystem ();
        
        final XtendBackendFacade bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::xtend::test::first", "iso-8859-1", mms);
        final ExecutionContext ctx = BackendFacade.createExecutionContext (bc.getFunctionDefContext(), ts, true);

        assertEquals ("Hallo, Arno: 27 - imported 99!", BackendFacade.invoke (ctx, new QualifiedName ("test"), Arrays.asList ("Arno")).toString());
        assertEquals ("[a Hallo b]", BackendFacade.invoke (ctx, new QualifiedName ("testColl"), Arrays.asList (Arrays.asList (1L, "Hallo"))).toString());
        assertEquals (10L, BackendFacade.invoke (ctx, new QualifiedName ("reexp"), Arrays.asList (2L)));

        final Person p = new Person ();
        p.setFirstName ("Testa");
        p.setName ("Testarossa");

        assertEquals ("[Testa Testarossa] - Testa Testarossa - Testa Testarossa - Testa", BackendFacade.invoke (ctx, new QualifiedName ("testPerson"), Arrays.asList(p)).toString());
    }
    
    @Test
    public void testEvaluateExpression() throws Exception {
        final List<MetaModel> mms = new ArrayList<MetaModel> ();
        mms.add (new JavaBeansMetaModel ());
        
        assertEquals ("Hallo, Arno: 27 - imported 99!", XtendBackendFacade.invokeXtendFunction ("org::eclipse::xtend::middleend::xtend::test::first", null, mms, new QualifiedName ("test"), "Arno").toString());
        assertEquals (7L, XtendBackendFacade.evaluateExpression ("1 + 2 + \"asdf\".length", null, null));
        assertEquals (33L, XtendBackendFacade.evaluateExpression ("1 + 2 + test(\"Arno\").length", "org::eclipse::xtend::middleend::xpand::test::first", null, mms, null));
    }
}
