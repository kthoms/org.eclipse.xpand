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
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipose.xtend.middleend.MiddleEnd;
import org.eclipose.xtend.middleend.MiddleEndFactory;
import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.Statement;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.codeassist.XpandTokens;
import org.eclipse.internal.xpand2.parser.XpandParseFacade;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.output.FileHandle;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xpand2.output.PostProcessor;
import org.eclipse.xtend.backend.BackendFacade;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.FunctionDefContextFactory;
import org.eclipse.xtend.backend.functions.FunctionDefContextInternal;
import org.eclipse.xtend.backend.syslib.FileIoOperations;
import org.eclipse.xtend.backend.syslib.FileOutlet;
import org.eclipse.xtend.backend.syslib.InMemoryPostprocessor;
import org.eclipse.xtend.backend.syslib.SysLibNames;
import org.eclipse.xtend.backend.syslib.UriBasedPostprocessor;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.middleend.old.common.OldHelper;
import org.eclipse.xtend.middleend.old.common.TypeToBackendType;
import org.eclipse.xtend.middleend.old.internal.xpand.OldDefinitionConverter;
import org.eclipse.xtend.middleend.old.internal.xpand.XpandDefinitionName;
import org.eclipse.xtend.middleend.old.plugin.OldXpandRegistryFactory;
import org.eclipse.xtend.middleend.old.plugin.OldXtendRegistryFactory;
import org.eclipse.xtend.typesystem.MetaModel;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class XpandBackendFacade {
    private final String _xpandFile;
    private final MiddleEnd _middleEnd;

    private final String _fileEncoding;
    private final Collection<MetaModel> _mms;
    private final Collection<Outlet> _outlets;
    
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
        return executeStatement (code, null, mms, variables, outlets);
    }
    
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
    public static Object executeStatement (String code, String fileEncoding, Collection<MetaModel> mms, Map<String, Object> variables, Collection <Outlet> outlets) {
        return executeStatement (code, fileEncoding, mms, variables, outlets, null);
    }
        
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
     * The "variables", "outlets" and "advice" parameter may be null.
     */
    public static Object executeStatement (String code, String fileEncoding, Collection<MetaModel> mms, Map<String, Object> variables, Collection <Outlet> outlets, List<String> advice) {
        return createForFile (null, fileEncoding, mms, outlets).executeStatement (code, variables, advice);
    }

    
    public Object executeStatement (String code, Map<String, Object> variables, List<String> advice) {
        if (variables == null)
            variables = new HashMap<String, Object> ();
        if (advice == null)
            advice = new ArrayList<String> ();

        for (String adv: advice)
            _middleEnd.applyAdvice (adv);
        
        final Template tpl = XpandParseFacade.file (new StringReader (XpandTokens.LT + "DEFINE dUmMy FOR dUmMy" + XpandTokens.RT + code + XpandTokens.RT + XpandTokens.LT + "ENDDEFINE" + XpandTokens.RT), null);
        final Statement[] statements = ((Definition) tpl.getDefinitions()[0]).getBody();

        XpandExecutionContext ctx = createXpandExecutionContext (_fileEncoding, _mms, _outlets);
        for (String varName: variables.keySet())
            ctx = (XpandExecutionContext) ctx.cloneWithVariable (new Variable (varName, ctx.getType (variables.get (varName))));
        
        final Set<XpandDefinitionName> referenced = new HashSet<XpandDefinitionName>();
        final OldDefinitionConverter defConverter = new OldDefinitionConverter (ctx, new TypeToBackendType (_middleEnd.getTypesystem(), ctx));
        final ExpressionBase converted = defConverter.convertStatementSequence (statements, tpl, referenced);

        final FunctionDefContextInternal fdc = new FunctionDefContextFactory (_middleEnd.getTypesystem()).create();
        
        for (XpandDefinitionName xdn: referenced)
            for (NamedFunction f: _middleEnd.getFunctions (xdn.getCanonicalTemplateFileName ()).getPublicFunctions())
                fdc.register (f, false);
        
        final ExecutionContext backendCtx = BackendFacade.createExecutionContext (fdc, _middleEnd.getTypesystem(), true); //TODO configure isLogStacktrace 
        backendCtx.getLocalVarContext().getLocalVars().putAll (variables);
        registerOutlets (backendCtx, _outlets);

        return converted.evaluate (backendCtx);
    }
    
    public static void registerOutlets (ExecutionContext ctx, Collection<Outlet> outlets) {
        for (Outlet oldOutlet: outlets) {
            final FileOutlet newOutlet = new FileOutlet ();
            newOutlet.setAppend (oldOutlet.isAppend());
            newOutlet.setBaseDir (new File (oldOutlet.getPath()));
            if (oldOutlet.getFileEncoding() != null)
                newOutlet.setFileEncoding (oldOutlet.getFileEncoding());
            newOutlet.setOverwrite (oldOutlet.isOverwrite());

            for (PostProcessor pp: oldOutlet.postprocessors) {
                newOutlet.register (new InMemoryPpAdapter (pp, oldOutlet));
                newOutlet.register (new UriBasedPpAdapter (pp, oldOutlet));
            }
            
            final String outletName = (oldOutlet.getName() != null) ? oldOutlet.getName() : FileIoOperations.DEFAULT_OUTLET_NAME;
            ctx.getFunctionDefContext ().invoke (ctx, SysLibNames.REGISTER_OUTLET, Arrays.asList (outletName, newOutlet));
        }
    }
    
    private static class InMemoryPpAdapter implements InMemoryPostprocessor {
        private final PostProcessor _oldPp;
        private final Outlet _outlet;

        public InMemoryPpAdapter (PostProcessor oldPp, Outlet outlet) {
            _oldPp = oldPp;
            _outlet = outlet;
        }

        public CharSequence process (CharSequence unprocessed, String uri) {
            final FileHandle fh = new FileHandleImpl (unprocessed, _outlet, new File (uri));
            _oldPp.beforeWriteAndClose (fh);
            return fh.getBuffer();
        }
    }

    private static class FileHandleImpl implements FileHandle {
        private CharSequence _buffer;
        private final Outlet _outlet;
        private final File _file;

        public FileHandleImpl (CharSequence buffer, Outlet outlet, File file) {
            _buffer = buffer;
            _outlet = outlet;
            _file = file;
        }

        public CharSequence getBuffer () {
            return _buffer;
        }

        public String getFileEncoding () {
            return _outlet.getFileEncoding();
        }

        public Outlet getOutlet () {
            return _outlet;
        }

        public File getTargetFile () {
            return _file;
        }

        public boolean isAppend () {
            return _outlet.isAppend();
        }

        public boolean isOverwrite () {
            return _outlet.isOverwrite();
        }

        public void setBuffer (CharSequence buffer) {
            _buffer = buffer;
        }

        public void writeAndClose () {
            throw new UnsupportedOperationException ();
        }
    }
    
    private static class UriBasedPpAdapter implements UriBasedPostprocessor {
        private final PostProcessor _oldPp;
        private final Outlet _outlet;
        
        public UriBasedPpAdapter (PostProcessor oldPp, Outlet outlet) {
            _oldPp = oldPp;
            _outlet = outlet;
        }

        public void process (String uri) {
            final FileHandle fh = new FileHandleImpl ("", _outlet, new File (uri));
            _oldPp.afterClose (fh);
        }
    }
    
    public static XpandBackendFacade createForFile (String xpandFilename, String fileEncoding, Collection<MetaModel> mms, Collection <Outlet> outlets) {
        return new XpandBackendFacade (xpandFilename, fileEncoding, mms, outlets);
    }
    
    
    private XpandExecutionContext createXpandExecutionContext (String fileEncoding, Collection<MetaModel> mms, Collection<Outlet> outlets) {
        fileEncoding = OldHelper.normalizedFileEncoding (fileEncoding);
        
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
    
    private Map<Class<?>, Object> createSpecificParameters (String fileEncoding, Collection<MetaModel> mms, Collection<Outlet> outlets) {
        final XpandExecutionContext ctx = createXpandExecutionContext (fileEncoding, mms, outlets);

        final Map<Class<?>, Object> result = new HashMap<Class<?>, Object> ();
        result.put (OldXtendRegistryFactory.class, ctx);
        result.put (OldXpandRegistryFactory.class, ctx);
        return result;
    }

    
    private XpandBackendFacade (String xpandFilename, String fileEncoding, Collection<MetaModel> mms, Collection <Outlet> outlets) {
        if (outlets == null)
            outlets = new ArrayList<Outlet> ();

        _xpandFile = OldHelper.normalizeXpandResourceName (xpandFilename);
        _middleEnd = MiddleEndFactory.create (OldHelper.guessTypesystem (mms), createSpecificParameters (fileEncoding, mms, outlets));
        
        _fileEncoding = fileEncoding;
        _mms = mms;
        _outlets = outlets;
    }
    
    public Collection<NamedFunction> getContributedFunctions () {
        return _middleEnd.getFunctions(_xpandFile).getPublicFunctions();
    }
    
    public FunctionDefContext getFunctionDefContext () {
        if (_xpandFile == null)
            return new FunctionDefContextFactory (_middleEnd.getTypesystem()).create();
        
        return _middleEnd.getFunctions (_xpandFile);
    }
}


