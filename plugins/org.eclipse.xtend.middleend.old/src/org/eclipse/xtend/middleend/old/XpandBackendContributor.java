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
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.backend.iface.BackendContributor;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.typesystem.MetaModel;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class XpandBackendContributor implements BackendContributor {
    private final OldXtendRegistry _extensions;
    private final OldXpandRegistry _registry;
    private final String _xpandFile;
    private final BackendTypesystem _ts;
    
    public XpandBackendContributor (String xpandFile, Collection<MetaModel> mms, CompositeTypesystem ts, Collection <Outlet> outlets) {
        _xpandFile = OldXtendHelper.normalizeXpandResourceName (xpandFile);
        _ts = ts;
        
        final Output output = new OutputImpl ();
        for (Outlet outlet: outlets)
            output.addOutlet (outlet);
        //TODO ProtectedRegionResolver
        final XpandExecutionContextImpl ctx = new XpandExecutionContextImpl (output, null);
        for (MetaModel mm: mms)
            ctx.registerMetaModel (mm);
        ctx.setFileEncoding("iso-8859-1"); //TODO really set the encoding
        
        _extensions = new OldXtendRegistry (ctx, ts);
        _registry = new OldXpandRegistry (ctx, ts, _extensions);
        _registry.registerXpandFile (xpandFile);
    }
    
    public BackendType convertToType (List<String> segments) {
        return null;
    }

    public Collection<NamedFunction> getContributedFunctions () {
        return _registry.getContributedFunctions (_xpandFile);
    }
    
    public FunctionDefContext getFunctionDefContext () {
        if (getContributedFunctions().isEmpty())
            return new FunctionDefContextFactory(_ts).create();
        
        return ((SourceDefinedFunction) getContributedFunctions().iterator().next().getFunction()).getFunctionDefContext();
    }
}


