package org.eclipse.xtend.backend.compiler;

import java.util.Map;
import java.util.Set;

public interface BackendCompilerFacade {
	
	public void compile (Set<String> resources, String contributorNamespace, String contributorName, String outputDir, Map<Class<?>, Object> specificParams, String fileEncoding);

}
