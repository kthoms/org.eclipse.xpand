package org.eclipse.xtend.middleend.old.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipose.xtend.middleend.BackendTypesystemFactory;
import org.eclipse.internal.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.middleend.old.XtendBackendContributor;
import org.eclipse.xtend.typesystem.MetaModel;


public class FirstAttempt {
    public static void main (String[] args) {
        final List<MetaModel> mms = new ArrayList<MetaModel> ();
        mms.add (new JavaBeansMetaModel ());
        
        final CompositeTypesystem ts = new BackendTypesystemFactory().create();
        
        final XtendBackendContributor bc = new XtendBackendContributor ("org::eclipse::xtend::middleend::old::first::first", mms, ts);
        
        final ExecutionContext ctx = BackendFacade.createExecutionContext (bc.getFunctionDefContext(), ts);
        System.err.println (BackendFacade.invoke (ctx, "test", Arrays.asList ("Arno")));
        System.err.println (BackendFacade.invoke (ctx, "testColl", Arrays.asList (Arrays.asList (1L, "Hallo"))));
        System.err.println (BackendFacade.invoke (ctx, "reexp", Arrays.asList (2L)));
        
        final Person p = new Person ();
        p.setFirstName ("Testa");
        p.setName ("Testarossa");
        
        System.err.println (BackendFacade.invoke (ctx, "testPerson", Arrays.asList(p)));
    }
}
