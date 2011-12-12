/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.old;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.middleend.xpand.XpandBackendFacade;
import org.eclipse.xtend.middleend.xpand.XpandComponent;
import org.eclipse.xtend.middleend.xtend.XtendBackendFacade;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.typesystem.MetaModel;
import org.junit.Test;


public class GeneralTest {
    @Test
    public void testXpandFacade () throws Exception {
        final List<MetaModel> mms = new ArrayList<MetaModel> ();
        mms.add (new JavaBeansMetaModel ());
        
        final CompositeTypesystem ts = new CompositeTypesystem ();

        final XpandBackendFacade xp = XpandBackendFacade.createForFile ("org::eclipse::xtend::middleend::old::aTemplate", "iso-8859-1", mms, new ArrayList<Outlet>());
        final ExecutionContext ctx = BackendFacade.createExecutionContext (xp.getFunctionDefContext(), ts, true);

        assertEquals ("\n" + 
        		"Hello, Arno: Hallo, Arno: 27 - imported 99!\n" + 
        		"\n" + 
        		"  Name: Arno \n" + 
        		"\n" + 
        		"\n" + 
        		"\n" + 
        		"    ... output from otherTemplate.xpt...\n" + 
        		"\n" + 
        		"\n" + 
        		"  This is a message from another package!\n" + 
        		"\n" + 
        		"\n" + 
        		"  This is a message from another package!\n" + 
        		"\n" + 
        		"\n" + 
        		"  This is a message from another package!\n" + 
        		"\n" + 
        		"\n" + 
        		"", BackendFacade.invoke (ctx, new QualifiedName("org/eclipse/xtend/middleend/old/aTemplate/greeting"), Arrays.asList("Arno")).toString());
    }

    @Test
    public void testXpandComponentWithFile() throws Exception {
        final File genFile = new File ("src-gen/dummy.txt");
        genFile.delete();
        
        final List<MetaModel> mms = new ArrayList<MetaModel> ();
        mms.add (new JavaBeansMetaModel ());
        
        
        final XpandComponent xwc = new XpandComponent ();
        xwc.setExpand ("org::eclipse::xtend::middleend::old::WithFileOutput::WithFileOutput FOR toBeGreeted");
        xwc.addOutlet (new Outlet (false, "iso-8859-1", null, true, "src-gen"));
        xwc.setFileEncoding ("iso-8859-1");

        final WorkflowContext wfContext = new WorkflowContextDefaultImpl ();
        wfContext.set ("toBeGreeted", "Arno");
        xwc.invoke (wfContext, null, new IssuesImpl ());

        final Reader r = new BufferedReader (new InputStreamReader (new FileInputStream (genFile), "iso-8859-1"));
        final StringBuilder sb = new StringBuilder ();
        int i;
        while ((i=r.read()) != -1)
            sb.append ((char) i);
        
        assertEquals ("\n" + 
        		"\tHello Arno: 4!\n" + 
        		"\t", sb.toString());
        
        genFile.delete();
    }
    
    @Test
    @SuppressWarnings("unchecked")
    public void testXtendFacade() throws Exception {
        final List<MetaModel> mms = new ArrayList<MetaModel> ();
        mms.add (new JavaBeansMetaModel ());
        
        final CompositeTypesystem ts = new CompositeTypesystem ();
        
        final XtendBackendFacade bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::old::first", "iso-8859-1", mms);
        final ExecutionContext ctx = BackendFacade.createExecutionContext (bc.getFunctionDefContext(), ts, true);

        assertEquals ("Hallo, Arno: 27 - imported 99!", BackendFacade.invoke (ctx, new QualifiedName("test"), Arrays.asList ("Arno")).toString());
        assertEquals ("[a Hallo b]", BackendFacade.invoke (ctx, new QualifiedName("testColl"), Arrays.asList (Arrays.asList (1L, "Hallo"))).toString());
        assertEquals (10L, BackendFacade.invoke (ctx, new QualifiedName("reexp"), Arrays.asList (2L)));

        final Person p = new Person ();
        p.setFirstName ("Testa");
        p.setName ("Testarossa");

        assertEquals ("[Testa Testarossa] - Testa Testarossa - Testa Testarossa - Testa", BackendFacade.invoke (ctx, new QualifiedName("testPerson"), Arrays.asList(p)).toString());
    }
    
    @Test
    public void testEvaluateExpression() throws Exception {
        final List<MetaModel> mms = new ArrayList<MetaModel> ();
        mms.add (new JavaBeansMetaModel ());
        
        assertEquals ("Hallo, Arno: 27 - imported 99!", XtendBackendFacade.invokeXtendFunction ("org::eclipse::xtend::middleend::old::first", null, mms, new QualifiedName("test"), "Arno").toString());
        assertEquals (7L, XtendBackendFacade.evaluateExpression ("1 + 2 + \"asdf\".length", null, null));
        assertEquals (33L, XtendBackendFacade.evaluateExpression ("1 + 2 + test(\"Arno\").length", "org::eclipse::xtend::middleend::old::first", null, mms, null));
    }
}
