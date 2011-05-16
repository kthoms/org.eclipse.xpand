package org.eclipse.xtend.backend.compiler;

import java.util.Collection;
import java.util.Map;

public interface BackendCompilerFacade {
	
	public void compile (Collection<String> resources, String contributorNamespace, String contributorName, String outputDir, Map<Class<?>, Object> specificParams, String fileEncoding);

}
