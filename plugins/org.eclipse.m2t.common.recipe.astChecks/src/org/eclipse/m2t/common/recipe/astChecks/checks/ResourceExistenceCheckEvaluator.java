/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Markus Voelter and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.astChecks.checks;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.Path;
import org.eclipse.m2t.common.recipe.core.AtomicCheck;

public class ResourceExistenceCheckEvaluator extends EclipseResourceCheckEvaluator {

	public void evaluate(AtomicCheck check) {
		String projectName = check.getParameter("projectName").getValue().toString();
		String resourceName = check.getParameter("resourceName").getValue().toString();
		IWorkspace workspace = refreshWorkspace(check);
		IProject project = workspace.getRoot().getProject(projectName);
		if (project == null)
			check.fail("project not found: " + projectName);
		IFile f = workspace.getRoot().getFile(new Path(projectName + "/" + resourceName));
		if (!f.exists())
			check.fail("resource not found: " + projectName + "/" + resourceName);
		check.ok();
	}

}
