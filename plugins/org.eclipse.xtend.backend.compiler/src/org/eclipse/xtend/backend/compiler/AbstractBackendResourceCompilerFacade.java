package org.eclipse.xtend.backend.compiler;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.NoMiddleEndForResourceException;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.ParsedResource;

public abstract class AbstractBackendResourceCompilerFacade implements BackendCompilerFacade {
    private static final Log _log = LogFactory.getLog (AbstractBackendResourceCompilerFacade.class);

	protected BackendTypesystem _typeSystem;
	protected List<LanguageSpecificMiddleEnd> _languageHandlers;


    public AbstractBackendResourceCompilerFacade (BackendTypesystem ts) {
		_typeSystem = ts;
    }

	public void compile(Set<String> resources, String contributorNamespace,
			String contributorName, String outputDir,
			Map<Class<?>, Object> specificParams, String fileEncoding) {
		
		MiddleEnd me = createMiddleEnd (specificParams);
		for (String res : resources) {
			try {
				me.getFunctions (res);
			} catch (NoMiddleEndForResourceException e) {
				
			}
		}

		for (Entry<String, ParsedResource> res : me.getParsedResources().entrySet()) {
			compileInternal (res.getKey(), res.getValue(), me, _typeSystem, outputDir, fileEncoding);
		}
	}

    abstract protected void compileInternal (String resourceName, ParsedResource parsedRes, MiddleEnd middleend, BackendTypesystem typeSystem, String outputDir, String fileEncoding);

	protected MiddleEnd createMiddleEnd (Map<Class<?>, Object> specificParams) {
		if (MiddleEndFactory.canCreateFromExtentions()) {
			return MiddleEndFactory.createFromExtensions(_typeSystem, specificParams);
		} else {
			return MiddleEndFactory.create(_typeSystem, _languageHandlers);
		}
	}


}
