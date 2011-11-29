package org.eclipse.xtend.backend.compiler;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.compiler.model.NamedParsedResource;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.NoMiddleEndForResourceException;
import org.eclipse.xtend.middleend.plugins.ImportedResource;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.ParsedResource;

public abstract class AbstractBackendResourceCompilerFacade implements BackendCompilerFacade {
    private static final Log _log = LogFactory.getLog (AbstractBackendResourceCompilerFacade.class);

	protected BackendTypesystem _typeSystem;
	protected List<LanguageSpecificMiddleEnd> _languageHandlers;
	private MiddleEnd _middleEnd;

	private boolean _initialized;


    /**
	 * @return the initialized
	 */
	public boolean isInitialized() {
		return _initialized;
	}

	/**
	 * @param initialized the initialized to set
	 */
	public void setInitialized(boolean initialized) {
		_initialized = initialized;
	}

	public AbstractBackendResourceCompilerFacade (BackendTypesystem ts) {
		_typeSystem = ts;
    }

	public void compile(Collection<String> resources, String contributorNamespace,
			String contributorName, String outputDir,
			Map<Class<?>, Object> specificParams, String fileEncoding) {

		Map<String, Set<NamedParsedResource>> imports = new HashMap<String, Set<NamedParsedResource>> ();
		_middleEnd = createMiddleEnd (specificParams);
		Map<String, ParsedResource> parsedResources = null;
		for (String res : resources) {
			try {
				_middleEnd.getFunctions (res);
				parsedResources = _middleEnd.getParsedResources();
				Set<NamedParsedResource> resImports = new HashSet<NamedParsedResource> ();
				for (ImportedResource impRes : parsedResources.get(res).getImports()) {
					ParsedResource curImport = parsedResources.get (impRes.getResourceName());
					if (curImport != null)
						resImports.add(new NamedParsedResource (impRes.getResourceName(), curImport));
				}
				collectReexportedResources (resImports, new HashSet<String> (), res);
				imports.put (res, resImports);
				compileInternal (res, parsedResources.get(res), imports, _middleEnd, _typeSystem, outputDir, fileEncoding);
			} catch (NoMiddleEndForResourceException e) {
				
			}
		}
	}

    abstract protected void compileInternal (String resourceName, ParsedResource parsedRes, Map<String, Set<NamedParsedResource>> imports, MiddleEnd middleend, BackendTypesystem typeSystem, String outputDir, String fileEncoding);

	protected MiddleEnd createMiddleEnd (Map<Class<?>, Object> specificParams) {
		if (MiddleEndFactory.canCreateFromExtentions()) {
			_middleEnd = MiddleEndFactory.createFromExtensions(_typeSystem, specificParams);
		} else {
			_middleEnd = MiddleEndFactory.create(_typeSystem, _languageHandlers);
		}
		if (_middleEnd != null)
			_initialized = true;
		return _middleEnd;
	}

    public void collectReexportedResources (Set<NamedParsedResource> result, Set<String> visited, String curResource) {
    	if (_initialized) {
	    	ParsedResource parsedRes = _middleEnd.getParsedResources().get(curResource);
	    	if (visited.contains (curResource))
	            return;
	        visited.add (curResource);
	        
	        for (ImportedResource candidate: parsedRes.getImports()) {
	            final String candidateName = candidate.getResourceName();
	            
	            if (visited.contains (candidateName))
	                continue;
	            
	            if (candidate.isReexported() && parsedRes != null)
	            	result.add (new NamedParsedResource(candidateName, _middleEnd.getParsedResources().get(candidateName)));
	            
	            collectReexportedResources (result, visited, candidateName);
	        }
    	}
        
    }

	/**
	 * @return the typeSystem
	 */
	public BackendTypesystem getTypeSystem() {
		return _typeSystem;
	}

	/**
	 * @param typeSystem the typeSystem to set
	 */
	public void setTypeSystem(BackendTypesystem typeSystem) {
		_typeSystem = typeSystem;
	}

	/**
	 * @return the languageHandlers
	 */
	public List<LanguageSpecificMiddleEnd> getLanguageHandlers() {
		return _languageHandlers;
	}

	/**
	 * @param languageHandlers the languageHandlers to set
	 */
	public void setLanguageHandlers(List<LanguageSpecificMiddleEnd> languageHandlers) {
		_languageHandlers = languageHandlers;
	}

	/**
	 * @return the middleEnd
	 */
	public MiddleEnd getMiddleEnd() {
		return _middleEnd;
	}

	/**
	 * @param middleEnd the middleEnd to set
	 */
	public void setMiddleEnd(MiddleEnd middleEnd) {
		_middleEnd = middleEnd;
	}

}
