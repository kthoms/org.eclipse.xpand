package org.eclipse.xtend.backend.compiler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;

public abstract class AbstractBackendCompilerFacade {

	protected BackendTypesystem ts;
	protected List<LanguageSpecificMiddleEnd> languageHandlers;

	public AbstractBackendCompilerFacade() {
		super();
	}

	public void compile (Set<String> resources, String contributorNamespace, String contributorName, String outputDir) {
		MiddleEnd me = createMiddleEnd();
		Map<String, FunctionDefContext> fdcs = new HashMap<String, FunctionDefContext>();
		for (String res : resources) {
			FunctionDefContext fdc = me.getFunctions(res);
			fdcs.put(res, fdc);
		}
		FdcHolder fdcHolder = new FdcHolder(fdcs);
		compileInternal (fdcHolder, contributorNamespace, contributorName, outputDir);
	}
	
	protected abstract void compileInternal (FdcHolder fdcs, String contributorNamespace, String contributorName, String outputDir);

	protected MiddleEnd createMiddleEnd () {
		if (MiddleEndFactory.canCreateFromExtentions()) {
			return MiddleEndFactory.createFromExtensions(ts, null);
		} else {
			return MiddleEndFactory.create(ts, languageHandlers);
		}
	}
}