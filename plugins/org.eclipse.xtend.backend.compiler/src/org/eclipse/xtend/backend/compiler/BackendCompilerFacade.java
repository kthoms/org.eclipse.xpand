package org.eclipse.xtend.backend.compiler;

import java.util.Collection;
import java.util.Map;

public interface BackendCompilerFacade {

	/**
	 * Compiles resources handles by the M2T Backend.
	 * 
	 * @param resources
	 *            A collection containing the classpath root relative names of
	 *            files to be compiled
	 * @param contributorNamespace
	 * @param contributorName
	 * @param outputDir
	 *            The output folder to compile the resources to
	 * @param specificParams
	 *            A map of middleend specific configuration parameters. The
	 *            parameter may be required by some middleend specific libraries
	 * @param fileEncoding
	 *            The charset to be used for compiled resources
	 */
	public void compile (Collection<String> resources, String contributorNamespace, String contributorName, String outputDir, Map<Class<?>, Object> specificParams, String fileEncoding);

}
