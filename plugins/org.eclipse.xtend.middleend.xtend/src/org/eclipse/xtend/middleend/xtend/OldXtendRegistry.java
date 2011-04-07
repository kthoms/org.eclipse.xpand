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
package org.eclipse.xtend.middleend.xtend;

import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.ast.ExtensionImportStatement;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.plugins.ImportedResource;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.ParsedResource;
import org.eclipse.xtend.middleend.xtend.internal.TypeToBackendType;
import org.eclipse.xtend.middleend.xtend.internal.xtend.CheckConverter;
import org.eclipse.xtend.middleend.xtend.internal.xtend.OldExtensionConverter;
import org.eclipse.xtend.middleend.xtend.internal.xtendlib.XtendLibContributor;


/**
 * This class manages the interdependent graph of parsed and converted files, allowing access to them by "compilation unit".
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class OldXtendRegistry implements LanguageSpecificMiddleEnd {
    private final ExecutionContext _ctx;
    
    private MiddleEnd _middleEnd;
    
    private BackendTypesystem _ts;

    
    /**
     * the specificData field contains an ExecutionContext initialized with the MetaModels and the file encoding
     */
    public OldXtendRegistry (Object specificData) {
        if (specificData == null)
            throw new IllegalArgumentException (getName() + " middle end is not initialized - will not contribute");

        _ctx = (ExecutionContext) specificData;
    }

    public void setMiddleEnd (MiddleEnd middleEnd) {
        _middleEnd = middleEnd;
        _ts = middleEnd.getTypesystem();
    }
    
    
    public boolean canHandle (String resourceName) {
        resourceName = OldHelper.normalizeXtendResourceName (resourceName);
        
        try {
            final ExtensionFile extensionFile = (ExtensionFile) _ctx.getResourceManager().loadResource (resourceName, XtendFile.FILE_EXTENSION);
            return extensionFile != null;
        }
        catch (Exception exc) {
            return false;
        }
    }

    public String getName () {
        return "Xtend";
    }
    
    public ParsedResource parseResource (String xtendFile) {
        final ParsedResource result = new ParsedResource ();
        
        xtendFile = OldHelper.normalizeXtendResourceName (xtendFile);
        
        final ExtensionFile extensionFile = (ExtensionFile) _ctx.getResourceManager().loadResource (xtendFile, XtendFile.FILE_EXTENSION);
        if (extensionFile == null)
            throw new IllegalArgumentException ("could not find extension '" + xtendFile + "'");
        
        final ExecutionContext ctx = _ctx.cloneWithResource (extensionFile);
        
        final TypeToBackendType typeConverter = new TypeToBackendType (_ts, ctx);
        final OldExtensionConverter extensionFactory = new OldExtensionConverter (ctx, typeConverter);
        
        for (Extension ext: extensionFile.getExtensions())
            ext.init (ctx);
        
        // register the XtendLib. Do this first so the extension can override functions
        result.getPrivateFunctions().addAll (new XtendLibContributor (_middleEnd).getContributedFunctions());
        
        result.getPrivateFunctions().add (new CheckConverter (ctx, typeConverter).createCheckFunction(_ts, extensionFile));
        
        for (Extension ext: extensionFile.getExtensions()) {
            final NamedFunction f = extensionFactory.createUnregistered (ext);
            if (ext.isPrivate())
                result.getPrivateFunctions().add (f);
            else
                result.getPublicFunctions().add (f);
        }
        
        for (ExtensionImportStatement imp: extensionFile.getExtImports())
            result.getImports().add (new ImportedResource (OldHelper.normalizeXtendResourceName (imp.getImportedId().getValue()), imp.isExported()));

        for (Around a: extensionFile.getArounds())
            result.getAdvice().add(extensionFactory.create (a));
        
        return result;
    }
}







