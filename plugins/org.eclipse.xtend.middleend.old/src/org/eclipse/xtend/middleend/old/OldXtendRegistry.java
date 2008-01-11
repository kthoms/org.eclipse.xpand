package org.eclipse.xtend.middleend.old;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipose.xtend.middleend.FunctionDefContextFactory;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.internal.xtend.xtend.ast.ImportStatement;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.functions.FunctionDefContextImpl;
import org.eclipse.xtend.backend.types.CompositeTypesystem;
import org.eclipse.xtend.backend.util.Cache;
import org.eclipse.xtend.expression.ExecutionContext;


/**
 * This class manages the interdependent graph of parsed and converted files, allowing access to them by "compilation unit".
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class OldXtendRegistry {
    private final ExecutionContext _ctx;
    private final CompositeTypesystem _ts;

    private final Cache<String, FunctionDefContextImpl> _functionDefContexts = new Cache<String, FunctionDefContextImpl> () {
        @Override
        protected FunctionDefContextImpl create (String compilationUnit) {
            return new FunctionDefContextFactory (_ts).create();
        }
    };

    
    /**
     * all functions actually defined in a given compilation unit
     */
    private final Map<String, List<NamedFunction>> _definedFunctionsByResource = new HashMap <String, List<NamedFunction>>();
    
    /**
     * all functions exported by a compilation unit, i.e. those functions visible to others that import it
     */
    private final Map<String, List<NamedFunction>> _exportedFunctionsByResource = new HashMap <String, List<NamedFunction>>();

    /**
     * all locally defined functions that are exported by a compilation unit. This is an artifact to cleanly handle
     * reexports.
     */
    private final Map<String, List<NamedFunction>> _locallyExportedFunctionsByResource = new HashMap <String, List<NamedFunction>>();

    
    public OldXtendRegistry (ExecutionContext ctx, CompositeTypesystem ts) {
        _ctx = ctx;
        _ts = ts;
    }
    
    
    private FunctionDefContextImpl getFunctionDefContext (String xtendName) {
        return _functionDefContexts.get (OldXtendHelper.normalizeXtendResourceName (xtendName));
    }
    
    
    /**
     * parses and converts an Xtend file and all other files it depends on.
     */
    public void registerExtension (String xtendFile) {
        xtendFile = OldXtendHelper.normalizeXtendResourceName (xtendFile);
        
        if (_definedFunctionsByResource.containsKey(xtendFile))
            return;
        
        final XtendFile file = (XtendFile) _ctx.getResourceManager().loadResource (xtendFile, XtendFile.FILE_EXTENSION);
        if (file == null)
            throw new IllegalArgumentException ("could not find extension '" + xtendFile + "'");
        
        final ExecutionContext ctx = _ctx.cloneWithResource (file);
        
        final TypeToBackendType typeConverter = new TypeToBackendType (_ts, ctx);
        final OldExtensionConverter extensionFactory = new OldExtensionConverter (ctx, typeConverter);
        
        for (Extension ext: file.getExtensions())
            ext.init (ctx);
        
        final List<NamedFunction> defined = new ArrayList<NamedFunction>();
        final List<NamedFunction> exported = new ArrayList<NamedFunction>();
        
        final FunctionDefContextImpl fdc = getFunctionDefContext (xtendFile);
        
        for (Extension ext: file.getExtensions()) {
            final NamedFunction f = extensionFactory.create (ext, fdc);

            defined.add(f);
            
            if (!ext.isPrivate())
                exported.add (f);
        }
        
        _definedFunctionsByResource.put (xtendFile, defined);
        _exportedFunctionsByResource.put (xtendFile, exported);
        _locallyExportedFunctionsByResource.put (xtendFile, new ArrayList<NamedFunction> (exported));
        
        // make sure all imported resources are registered as well
        for (String imported: file.getImportedExtensions())
            registerExtension (imported);

        // make all imported extensions visible for the scope of this compilation unit
        for (String importedResource: file.getImportedExtensions()) {
            for (NamedFunction f: _locallyExportedFunctionsByResource.get (OldXtendHelper.normalizeXtendResourceName (importedResource)))
                fdc.register (f);
        }

        final Set<String> visitedForReexport = new HashSet<String>();
        visitedForReexport.add (xtendFile);
        final List<NamedFunction> reexported = new ArrayList<NamedFunction>();
        getReexported (xtendFile, reexported, visitedForReexport, new HashSet<String>());
        
        for (NamedFunction f: reexported) {
            exported.add (f);
            fdc.register (f);
        }
    }
    
    private void getReexported (String xtendFile, Collection<NamedFunction> result, Set<String> harvestedCompilationUnits, Set<String> processedCompilationUnits) {
        xtendFile = OldXtendHelper.normalizeXtendResourceName (xtendFile);
        
        if (processedCompilationUnits.contains (xtendFile))
            return;
        processedCompilationUnits.add (xtendFile);
        
        if (! harvestedCompilationUnits.contains (xtendFile)) {
            for (NamedFunction f: _locallyExportedFunctionsByResource.get(xtendFile))
                result.add (f);
            
            harvestedCompilationUnits.add (xtendFile);
        }
        
        final ExtensionFile file = (ExtensionFile) _ctx.getResourceManager().loadResource (xtendFile, XtendFile.FILE_EXTENSION);
        for (ImportStatement imp: file.getExtImports()) {
            if (imp.isExported())
                getReexported (imp.getImportedId().getValue(), result, harvestedCompilationUnits, processedCompilationUnits);
        }
    }
    
    public Collection<NamedFunction> getContributedFunctions (String xtendFile) {
        return _exportedFunctionsByResource.get (xtendFile);
    }
}







