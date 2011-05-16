package org.eclipse.xtend.backend.compiler;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.NoMiddleEndForResourceException;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;

public abstract class AbstractBackendCompilerFacade implements BackendCompilerFacade {

	private final static Log _log = LogFactory.getLog (AbstractBackendCompilerFacade.class);

	protected BackendTypesystem _typeSystem;
	protected List<LanguageSpecificMiddleEnd> _languageHandlers;

	public AbstractBackendCompilerFacade(BackendTypesystem typeSystem) {
		super();
		_typeSystem = typeSystem;
	}

	public void compile (Collection<String> resources, String contributorNamespace, String contributorName, String outputDir, Map<Class<?>, Object> specificParams, String fileEncoding) {
		MiddleEnd me = createMiddleEnd (specificParams);
		Map<String, FunctionDefContext> fdcs = new HashMap<String, FunctionDefContext>();
		for (String res : resources) {
			try {
				_log.debug ("Creating FDC for " + res);
				FunctionDefContext fdc = me.getFunctions(res);
				for (NamedFunction f : fdc.getAllFunctions()) {
					_log.debug ("Function " + f.getName());
				}
				fdcs.put(res, fdc);
			} catch (NoMiddleEndForResourceException e) {
				// TODO: handle exception
			}
		}
		FdcHolder fdcHolder = new FdcHolder(fdcs);
		compileInternal (fdcHolder, _typeSystem, contributorNamespace, contributorName, outputDir, fileEncoding);
	}
	
	protected abstract void compileInternal (FdcHolder fdcs, BackendTypesystem bts, String contributorNamespace, String contributorName, String outputDir, String fileEncoding);

	protected MiddleEnd createMiddleEnd (Map<Class<?>, Object> specificParams) {
		if (MiddleEndFactory.canCreateFromExtentions()) {
			return MiddleEndFactory.createFromExtensions(_typeSystem, specificParams);
		} else {
			return MiddleEndFactory.create(_typeSystem, _languageHandlers);
		}
	}
}