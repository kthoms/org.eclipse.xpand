package org.eclipse.xtend.backend.compiler;

import org.eclipse.xtend.backend.common.FunctionDefContext;

public interface BackendCompilerFacade {
	
	public void compile (FunctionDefContext fdc, String resourceName);

}
