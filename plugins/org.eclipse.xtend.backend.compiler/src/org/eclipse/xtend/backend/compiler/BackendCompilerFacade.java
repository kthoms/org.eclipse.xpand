package org.eclipse.xtend.backend.compiler;

import java.util.Set;

public interface BackendCompilerFacade {
	
	public void compile (Set<String> resources, String contributorNamespace, String contributorName, String outputDir);

}
