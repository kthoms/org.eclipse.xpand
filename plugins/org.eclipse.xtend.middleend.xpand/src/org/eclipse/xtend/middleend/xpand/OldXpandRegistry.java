/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.xpand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipose.xtend.middleend.MiddleEnd;
import org.eclipose.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.internal.xpand2.ast.Advice;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.model.XpandAdvice;
import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandUtil;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.backend.util.Cache;
import org.eclipse.xtend.middleend.xpand.internal.OldDefinitionConverter;
import org.eclipse.xtend.middleend.xpand.plugin.XpandDefinitionName;
import org.eclipse.xtend.middleend.xtend.internal.OldHelper;
import org.eclipse.xtend.middleend.xtend.internal.TypeToBackendType;
import org.eclipse.xtend.middleend.xtend.internal.xtendlib.XtendLibContributor;


/**
 * This class manages the interdependent graph of parsed and converted Xpand files, allowing access to them by "compilation unit".
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class OldXpandRegistry implements LanguageSpecificMiddleEnd {
    private final XpandExecutionContext _ctx;
    private BackendTypesystem _ts;
    private MiddleEnd _middleEnd;

    private final Cache<String, FunctionDefContextInternal> _functionDefContexts = new Cache<String, FunctionDefContextInternal> () {
        @Override
        protected FunctionDefContextInternal create (String compilationUnit) {
            return _middleEnd.createEmptyFdc();
        }
    };
    
    /**
     * all functions actually defined in a given compilation unit
     */
    private final Map<String, List<NamedFunction>> _functionsByResource = new HashMap <String, List<NamedFunction>>();

    private final Map<String, List<AroundAdvice>> _adviceByResource = new HashMap <String, List<AroundAdvice>> ();

    private FunctionDefContextInternal getFunctionDefContext (String xtendName) {
        return _functionDefContexts.get (OldHelper.normalizeXtendResourceName (xtendName));
    }

    
    public OldXpandRegistry (Object specificData) {
        if (specificData == null)
            throw new IllegalArgumentException (getName() + " middle end is not initialized - will not contribute");

        _ctx = (XpandExecutionContext) specificData;
    }
    
    public void setMiddleEnd (MiddleEnd middleEnd) {
        _middleEnd = middleEnd;
        _ts = middleEnd.getTypesystem();
    }
    
    
    /**
     * parses and converts an Xpand file and all other files it depends on. 
     */
    public void registerXpandFile (String xpandFile) {
        xpandFile = OldHelper.normalizeXpandResourceName (xpandFile);
        
        if (_functionsByResource.containsKey (xpandFile))
            return;
        
        final String xpandResourceName = OldHelper.xpandFileAsOldResourceName (xpandFile);
        final Template file = (Template) _ctx.getResourceManager().loadResource (xpandResourceName, XpandUtil.TEMPLATE_EXTENSION);
        if (file == null)
            throw new IllegalArgumentException ("could not find Xpand file '" + xpandResourceName + "'");
        
        final XpandExecutionContext ctx = (XpandExecutionContext) _ctx.cloneWithResource (file);
        
        final TypeToBackendType typeConverter = new TypeToBackendType (_ts, ctx);
        final OldDefinitionConverter definitionFactory = new OldDefinitionConverter (ctx, typeConverter);
        
        final List<NamedFunction> defined = new ArrayList<NamedFunction>();
        final FunctionDefContextInternal fdc = getFunctionDefContext (xpandFile);
        
        // register the XtendLib. Do this first so the extension can override functions
        for (NamedFunction f: new XtendLibContributor (_middleEnd).getContributedFunctions())
            fdc.register (f, false);
        
        final Set<XpandDefinitionName> referenced = new HashSet<XpandDefinitionName> ();
        
        for (XpandDefinition ext: file.getDefinitions ())
            defined.add (definitionFactory.create (ext, fdc, referenced));
        
        _functionsByResource.put (xpandFile, defined);

        final List<AroundAdvice> newAdvice = new ArrayList<AroundAdvice>();
        for (XpandAdvice a: file.getAdvices()) 
            newAdvice.add (definitionFactory.create ((Advice) a, referenced, fdc));
        _adviceByResource.put(xpandResourceName, newAdvice);
        
        // make sure all imported resources are registered as well
        for (String imported: file.getImportedExtensions()) 
            for (NamedFunction f: _middleEnd.getFunctions (imported).getPublicFunctions())
                fdc.register (f, false);

        // collect all referenced template files...
        final Set<String> xpandFileNames = new HashSet<String> ();
        for (XpandDefinitionName n: referenced)
            xpandFileNames.add (n.getCanonicalTemplateFileName());
        
        // ... and register all template definitions from these files. It is necessary to have them all registered to enable 
        //  polymorphism - static type analysis does not find all potential matches.
        for (String xpandFileName: xpandFileNames)
            for (NamedFunction f: _middleEnd.getFunctions (xpandFileName).getPublicFunctions())
                fdc.register (f, false);
        
    }


    public FunctionDefContext getContributedFunctions (String xpandFile) {
        registerXpandFile (xpandFile);
        return getFunctionDefContext (xpandFile);
    }


    public boolean canHandle (String xpandFile) {
        xpandFile = OldHelper.normalizeXpandResourceName (xpandFile);
        
        if (_functionsByResource.containsKey (xpandFile))
            return true;

        final String xpandResourceName = OldHelper.xpandFileAsOldResourceName (xpandFile);
        try {
            final Template file = (Template) _ctx.getResourceManager().loadResource (xpandResourceName, XpandUtil.TEMPLATE_EXTENSION);
            return file != null;
        }
        catch (Exception exc) {
            return false;
        }
    }


    public List<AroundAdvice> getContributedAdvice (String resourceName) {
        registerXpandFile (resourceName);
        return _adviceByResource.get (OldHelper.normalizeXpandResourceName (resourceName));
    }

    public String getName () {
        return "Xpand";
    }
}







