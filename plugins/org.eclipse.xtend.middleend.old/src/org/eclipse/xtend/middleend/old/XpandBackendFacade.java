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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipose.xtend.middleend.FunctionDefContextFactory;
import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.Statement;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.codeassist.XpandTokens;
import org.eclipse.internal.xpand2.parser.XpandParseFacade;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.FunctionDefContextImpl;
import org.eclipse.xtend.backend.functions.SourceDefinedFunction;
import org.eclipse.xtend.backend.syslib.FileIoOperations;
import org.eclipse.xtend.backend.syslib.FileOutlet;
import org.eclipse.xtend.backend.syslib.InMemoryPostprocessor;
import org.eclipse.xtend.backend.syslib.SysLibNames;
import org.eclipse.xtend.backend.syslib.UriBasedPostprocessor;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class XpandBackendFacade {
    private final OldXtendRegistry _extensions;
    private final OldXpandRegistry _registry;
    private final String _xpandFile;
    private final BackendTypesystem _ts;
    
    
    /**
     * This method executes Xpand code that is passed in as a string, script language style.<br>
     * 
     * There are two restrictions. Firstly, no DEFINEs are allowed - the string that is passed in must be a valid body for a DEFINE. Never
     *  mind the "parameters" - the "variables" parameter defines all variables that will be defined during execution. Use "this" as a 
     *  variable name to specify the variable that is implicitly bound as the "special" parameter passed to a definition.<br>
     *  
     * Secondly, no IMPORT or EXTENSION statements are possible. So types must be referenced by their fully qualified names, and no calls
     *  to extensions are possible. Calls to other templates that are available as files are possible, just as you would expect.<br>
     *  
     * Both the "variables" and "outlets" parameter may be null.
     */
    public static Object executeStatement (String code, Collection<MetaModel> mms, Map<String, Object> variables, Collection <Outlet> outlets) {
        final BackendTypesystem ts = guessTypesystem(mms);
        
        if (variables == null)
            variables = new HashMap<String, Object> ();
        if (outlets == null)
            outlets = new ArrayList<Outlet> ();
        
        final Template tpl = XpandParseFacade.file (new StringReader (XpandTokens.LT + "DEFINE dUmMy FOR dUmMy" + XpandTokens.RT + code + XpandTokens.RT + XpandTokens.LT + "ENDDEFINE" + XpandTokens.RT), null);
        final Statement[] statements = ((Definition) tpl.getDefinitions()[0]).getBody();
        
        
        XpandExecutionContext ctx = createOldExecutionContext (null, mms, outlets); // TODO fileEncoding
        for (String varName: variables.keySet())
            ctx = (XpandExecutionContext) ctx.cloneWithVariable (new Variable (varName, ctx.getType (variables.get (varName))));
        
        final Set<XpandDefinitionName> referenced = new HashSet<XpandDefinitionName>();
        final OldDefinitionConverter defConverter = new OldDefinitionConverter (ctx, new TypeToBackendType (ts, ctx));
        final ExpressionBase converted = defConverter.convertStatementSequence (statements, tpl, referenced);

        
        final FunctionDefContextImpl fdc = new FunctionDefContextFactory (ts).create();
        
        //TODO refactor this to extract common code - both from here and from OldXpandRegistry
        final OldXpandRegistry oxr = new OldXpandRegistry (ctx, ts, new OldXtendRegistry (ctx, ts));
        for (XpandDefinitionName xdn: referenced) {
            oxr.registerXpandFile (xdn.getCanonicalTemplateFileName());
            
            for (NamedFunction f: oxr.getContributedFunctions (xdn.getCanonicalTemplateFileName()))
                fdc.register (f);
        }
        
        final ExecutionContext backendCtx = BackendFacade.createExecutionContext (fdc, ts);
        backendCtx.getLocalVarContext().getLocalVars().putAll (variables);
        registerOutlets (backendCtx, outlets);

        return converted.evaluate (backendCtx);
    }

    public static BackendTypesystem guessTypesystem (Collection<MetaModel> mms) {
        boolean hasEmf = false;
        
        for (MetaModel mm: mms) {
            if (mm instanceof EmfRegistryMetaModel)
                hasEmf = true;
        }
        
        final CompositeTypesystem result = new CompositeTypesystem ();
        if (hasEmf)
            result.register (new EmfTypesystem ());
        //TODO register uml mm
        //TODO replace this by adding "asBackendType" to the frontend types
        
        return result;
    }
    
    public static void registerOutlets (ExecutionContext ctx, Collection<Outlet> outlets) {
        for (Outlet oldOutlet: outlets) {
            final FileOutlet newOutlet = new FileOutlet ();
            newOutlet.setAppend (oldOutlet.isAppend());
            newOutlet.setBaseDir (new File (oldOutlet.getPath()));
            if (oldOutlet.getFileEncoding() != null)
                newOutlet.setFileEncoding (oldOutlet.getFileEncoding());
            newOutlet.setOverwrite (oldOutlet.isOverwrite());

            // TODO register old postprocessors via adapters
            
            final String outletName = (oldOutlet.getName() != null) ? oldOutlet.getName() : FileIoOperations.DEFAULT_OUTLET_NAME;
            ctx.getFunctionDefContext ().invoke (ctx, SysLibNames.REGISTER_OUTLET, Arrays.asList (outletName, newOutlet));
        }
    }
    
    public static XpandBackendFacade createForFile (String xpandFilename, Collection<MetaModel> mms, Collection <Outlet> outlets) {
        return new XpandBackendFacade (xpandFilename, mms, outlets);
    }
    
    
    private static XpandExecutionContext createOldExecutionContext (String fileEncoding, Collection<MetaModel> mms, Collection<Outlet> outlets) {
        if (fileEncoding == null)
            fileEncoding = System.getProperty ("file.encoding");
        
        final Output output = new OutputImpl ();
        for (Outlet outlet: outlets)
            output.addOutlet (outlet);
        //TODO ProtectedRegionResolver
        
        final XpandExecutionContextImpl ctx = new XpandExecutionContextImpl (output, null);
        for (MetaModel mm: mms)
            ctx.registerMetaModel (mm);
        ctx.setFileEncoding (fileEncoding);
        
        return ctx;
    }
    
    private XpandBackendFacade (String xpandFilename, Collection<MetaModel> mms, Collection <Outlet> outlets) {
        _xpandFile = OldXtendHelper.normalizeXpandResourceName (xpandFilename);
        _ts = guessTypesystem(mms);
        
        final XpandExecutionContext ctx = createOldExecutionContext (null, mms, outlets);
        
        _extensions = new OldXtendRegistry (ctx, _ts);
        _registry = new OldXpandRegistry (ctx, _ts, _extensions);
        _registry.registerXpandFile (xpandFilename);
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


