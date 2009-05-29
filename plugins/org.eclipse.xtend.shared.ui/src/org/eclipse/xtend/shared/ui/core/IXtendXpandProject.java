/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.shared.ui.core;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend.expression.ExecutionContext;

/**
 * Represents a project containing openArchitectureWare resources. These are
 * Xpand template, Xtend files, Workflow files etc.
 * 
 * @since 4.0
 */
public interface IXtendXpandProject {
	/**
	 * Finds an Xtend resource by its fully qualified name and file extension.
	 * 
	 * @param fqn
	 *            The full qualified name in Xtend syntax. For example:
	 *            my::templates::Main
	 * @return The resource or null if the resource could not be located.
	 */
	IXtendXpandResource findExtXptResource(String fqn, String extension);

	/**
	 * Finds an Xtend resource by it's underlying IStorage instance
	 * 
	 * @param
	 * @return The resource or null if the resource could not be located (i.e
	 *         it's not an Xtend/Xpand resource).
	 */
	IXtendXpandResource findXtendXpandResource(IStorage file);

	/**
	 * Returns all registered resources within the project.
	 * 
	 * @return
	 */
	IXtendXpandResource[] getRegisteredResources();

	/**
	 * Returns the corresponding {@link IJavaProject Java Project}.
	 */
	IJavaProject getProject();

	/**
	 * Unregisters a resource from the project.
	 * 
	 * @param res
	 *            Resource which should be unregistered.
	 */
	void unregisterXtendXpandResource(IXtendXpandResource res);

	/**
	 * Analyzes the project's resources and marks erraneous resources.
	 * 
	 * @param monitor
	 *            (optional) A monitor for the progress of the analysis.
	 */
	void analyze(IProgressMonitor monitor, ExecutionContext ctx);

	public IXtendXpandResource[] getAllRegisteredResources();

	public IXtendXpandProject[] getReferencedProjects();

	public IXtendXpandProject[] getAllReferencedProjects();
}
