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

import java.util.Collection;
import java.util.List;

import org.eclipose.xtend.middleend.FunctionDefContextFactory;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.backend.iface.BackendContributor;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.typesystem.MetaModel;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class XtendBackendContributor implements BackendContributor {
    //TODO merge with XpandBackendFacade
    private final OldXtendRegistry _registry;
    private final String _xtendFile;
    private final BackendTypesystem _ts;
    
    public XtendBackendContributor (String xtendFile, Collection<MetaModel> mms, CompositeTypesystem ts) {
        _xtendFile = OldXtendHelper.normalizeXtendResourceName (xtendFile);
        _ts = ts;
        
        final ExecutionContextImpl ctx = new ExecutionContextImpl ();
        for (MetaModel mm: mms)
            ctx.registerMetaModel (mm);
        ctx.setFileEncoding("iso-8859-1"); //TODO really set the encoding

        //TODO redesign to allow reuse of the registry?
        _registry = new OldXtendRegistry ( ctx, ts);
        _registry.registerExtension(xtendFile);
    }
    
    public BackendType convertToType (List<String> segments) {
        return null;
    }

    public Collection<NamedFunction> getContributedFunctions () {
        return _registry.getContributedFunctions (_xtendFile);
    }
    
    public FunctionDefContext getFunctionDefContext () {
        if (getContributedFunctions().isEmpty())
            return new FunctionDefContextFactory(_ts).create();
        
        return ((SourceDefinedFunction) getContributedFunctions().iterator().next().getFunction()).getFunctionDefContext();
    }
}


