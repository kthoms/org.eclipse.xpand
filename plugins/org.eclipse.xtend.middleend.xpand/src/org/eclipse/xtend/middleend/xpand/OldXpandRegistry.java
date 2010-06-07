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
package org.eclipse.xtend.middleend.xpand;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.internal.xpand2.ast.Advice;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.model.XpandAdvice;
import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandUtil;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.plugins.ImportedResource;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.ParsedResource;
import org.eclipse.xtend.middleend.xpand.internal.OldDefinitionConverter;
import org.eclipse.xtend.middleend.xpand.internal.xpandlib.XpandLibContributor;
import org.eclipse.xtend.middleend.xpand.plugin.XpandDefinitionName;
import org.eclipse.xtend.middleend.xtend.internal.OldHelper;
import org.eclipse.xtend.middleend.xtend.internal.TypeToBackendType;
import org.eclipse.xtend.middleend.xtend.internal.xtendlib.XtendLibContributor;


/**
 * This class manages the interdependent graph of parsed and converted Xpand files, allowing access to them by "compilation unit".
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class OldXpandRegistry implements LanguageSpecificMiddleEnd {
    private static final Log _log = LogFactory.getLog (OldXpandRegistry.class);
    private final XpandExecutionContext _ctx;
    private BackendTypesystem _ts;
    private MiddleEnd _middleEnd;

    
    public OldXpandRegistry (Object specificData) {
        if (specificData == null)
            throw new IllegalArgumentException (getName() + " middle end is not initialized - will not contribute");

        _ctx = (XpandExecutionContext) specificData;
    }
    
    public void setMiddleEnd (MiddleEnd middleEnd) {
        _middleEnd = middleEnd;
        _ts = middleEnd.getTypesystem();
    }
    
    public boolean canHandle (String xpandFile) {
        xpandFile = OldHelper.normalizeXpandResourceName (xpandFile);
        
        final String xpandResourceName = OldHelper.xpandFileAsOldResourceName (xpandFile);
        try {
            final Template file = (Template) _ctx.getResourceManager().loadResource (xpandResourceName, XpandUtil.TEMPLATE_EXTENSION);
            return file != null;
        }
        catch (Exception exc) {
            return false;
        }
    }

    public String getName () {
        return "Xpand";
    }

    public ParsedResource parseResource (String xpandFile) {
        final ParsedResource result = new ParsedResource ();
        
        xpandFile = OldHelper.normalizeXpandResourceName (xpandFile);
        
        final String xpandResourceName = OldHelper.xpandFileAsOldResourceName (xpandFile);
        final Template file = (Template) _ctx.getResourceManager().loadResource (xpandResourceName, XpandUtil.TEMPLATE_EXTENSION);
        if (file == null)
            throw new IllegalArgumentException ("could not find Xpand file '" + xpandResourceName + "'");
        
        final XpandExecutionContext ctx = (XpandExecutionContext) _ctx.cloneWithResource (file);
        
        final TypeToBackendType typeConverter = new TypeToBackendType (_ts, ctx);
        final OldDefinitionConverter definitionFactory = new OldDefinitionConverter (ctx, typeConverter);
        
        // register the XtendLib. Do this first so the extension can override functions
        for (NamedFunction f: new XtendLibContributor (_middleEnd).getContributedFunctions())
            result.getPrivateFunctions().add (f);
        
        // register the XpandLib
        for (NamedFunction f: new XpandLibContributor (_middleEnd).getContributedFunctions())
        	result.getPrivateFunctions().add (f);
        
        final Set<XpandDefinitionName> referenced = new HashSet<XpandDefinitionName> ();
        
        for (XpandDefinition ext: file.getDefinitions ())
            result.getPublicFunctions().add (definitionFactory.createUnregistered (ext, referenced));
        
        for (XpandAdvice a: file.getAdvices())
            result.getAdvice().add (definitionFactory.create ((Advice) a, referenced));
        
        // make sure all imported resources are registered as well
        for (String imported: file.getImportedExtensions()) 
            result.getImports().add (new ImportedResource (imported, false));

        // collect all referenced template files...
        final Set<String> xpandFileNames = new HashSet<String> ();
        for (XpandDefinitionName n: referenced)
            xpandFileNames.add (n.getCanonicalTemplateFileName());
        
        for (String importedXpand: xpandFileNames)
            result.getImports().add (new ImportedResource (importedXpand, false));
        
        return result;
    }
}






















