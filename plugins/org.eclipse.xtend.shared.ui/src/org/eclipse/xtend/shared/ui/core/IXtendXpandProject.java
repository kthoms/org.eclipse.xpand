/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.shared.ui.core;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;

/**
 * Represents a project containing openArchitectureWare resources. These are Xpand template, Xtend
 * files, Workflow files etc.
 * @since 4.0
 */
public interface IXtendXpandProject {
	/**
	 * Finds an oAW resource by its fully qualified name and file extension.
	 * @param fqn The full qualified name in oAW syntax. For example: my::templates::Main 
	 * @return The resource or null if the resource could not be located.
	 */
    IXtendXpandResource findExtXptResource(String fqn, String extension);
    
    /**
     * Finds an oAW resource by it's underlying IStorage instance
     * @param 
     * @return The resource or null if the resource could not be located (i.e it's not an oaw resource).
     */
    IXtendXpandResource findOawResource(IStorage file);

    /**
     * Returns all registered resources within the project.
     * @return
     */
    IXtendXpandResource[] getRegisteredResources();

    /**
     * Returns the corresponding {@link IJavaProject Java Project}. 
     */
    IJavaProject getProject();

    /**
     * Unregisters a resource from the project.
     * @param res Resource which should be unregistered.
     */
    void unregisterOawResource(IXtendXpandResource res);

    /**
     * Analyzes the project's resources and marks erraneous resources.
     * @param monitor (optional) A monitor for the progress of the analysis.
     */
    void analyze(IProgressMonitor monitor);

	public IXtendXpandResource[] getAllRegisteredResources();

	public IXtendXpandProject[] getReferencedProjects();

	public IXtendXpandProject[] getAllReferencedProjects();
}
