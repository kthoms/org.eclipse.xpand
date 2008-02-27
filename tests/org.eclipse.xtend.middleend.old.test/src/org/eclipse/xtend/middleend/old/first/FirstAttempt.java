/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.old.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.internal.core.WorkflowContextDefaultImpl;
import org.eclipse.internal.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.middleend.old.XpandBackendFacade;
import org.eclipse.xtend.middleend.old.XpandComponent;
import org.eclipse.xtend.middleend.old.XtendBackendFacade;
import org.eclipse.xtend.typesystem.MetaModel;
import org.junit.Test;


public class FirstAttempt {
    @Test
    public void main() throws Exception {
        final List<MetaModel> mms = new ArrayList<MetaModel> ();
        mms.add (new JavaBeansMetaModel ());
        
        final CompositeTypesystem ts = new CompositeTypesystem ();
//        ts.register (new EmfTypesystem ());

        {
            final XpandBackendFacade xp = XpandBackendFacade.createForFile ("org::eclipse::xtend::middleend::old::first::aTemplate", "iso-8859-1", mms, new ArrayList<Outlet>());
            final ExecutionContext ctx = BackendFacade.createExecutionContext (xp.getFunctionDefContext(), ts, true);
            
            System.err.println (BackendFacade.invoke (ctx, "org/eclipse/xtend/middleend/old/first/aTemplate/greeting", Arrays.asList("Arno")));
        }
        
        {
            final XpandComponent xwc = new XpandComponent ();
            xwc.setExpand ("org::eclipse::xtend::middleend::old::first::WithFileOutput::WithFileOutput FOR toBeGreeted");
            xwc.addOutlet (new Outlet (false, "iso-8859-1", null, true, "src-gen"));
            xwc.setFileEncoding ("iso-8859-1");
            
            final WorkflowContext wfContext = new WorkflowContextDefaultImpl ();
            wfContext.set ("toBeGreeted", "Arno");
            xwc.invoke (wfContext, null, new IssuesImpl ());
        }
        
        {
            final XtendBackendFacade bc = XtendBackendFacade.createForFile ("org::eclipse::xtend::middleend::old::first::first", "iso-8859-1", mms);
            final ExecutionContext ctx = BackendFacade.createExecutionContext (bc.getFunctionDefContext(), ts, true);

            System.err.println (BackendFacade.invoke (ctx, "test", Arrays.asList ("Arno")));
            System.err.println (BackendFacade.invoke (ctx, "testColl", Arrays.asList (Arrays.asList (1L, "Hallo"))));
            System.err.println (BackendFacade.invoke (ctx, "reexp", Arrays.asList (2L)));

            final Person p = new Person ();
            p.setFirstName ("Testa");
            p.setName ("Testarossa");

            System.err.println (BackendFacade.invoke (ctx, "testPerson", Arrays.asList(p)));
        }
        
        {
            System.err.println ("--");
            System.err.println (XtendBackendFacade.invokeXtendFunction ("org::eclipse::xtend::middleend::old::first::first", null, mms, "test", "Arno"));
            System.err.println (XtendBackendFacade.evaluateExpression ("1 + 2 + \"asdf\".length", null, null));
            System.err.println (XtendBackendFacade.evaluateExpression ("1 + 2 + test(\"Arno\").length", "org::eclipse::xtend::middleend::old::first::first", null, mms, null));
        }
    }
}
