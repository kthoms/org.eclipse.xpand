/* <copyright>
 *
 * Copyright (c) 2007 OAW Team, SD-mda Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *     Jeremie Ratomposon <jratomposon@sdmda.com>
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.astChecks.quickFixers;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2t.common.recipe.astChecks.checks.ResourceExistenceCheck;
import org.eclipse.m2t.common.recipe.astChecks.checks.ResourceExistenceCheckEvaluator;

public class ResourceExistenceQuickFixer extends QuickFixer {

	public ResourceExistenceQuickFixer(ResourceExistenceCheck check,
			ResourceExistenceCheckEvaluator checkEvaluator) {
		super(check, checkEvaluator);
	}

	@Override
	public IStatus quickFix() {

		// we create the class with the jdt as the check wants it to be
		try {
			this.createResource();
		} catch (JavaModelException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} catch (CoreException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}

		return Status.OK_STATUS;

	}

	private void createResource() throws FileNotFoundException, CoreException {

		String projectName = check.getParameterString("projectName");
		String resourceName = check.getParameterString("resourceName");
		IWorkspace workspace = checkEvaluator.refreshWorkspace(check);
		IProject project = workspace.getRoot().getProject(projectName);

		IFile f = project.getFile(resourceName);

		int lastSeparatorIndex = resourceName
				.lastIndexOf(java.io.File.separatorChar);
		//if the resource name indicates a folder
		if (lastSeparatorIndex != -1) {
			String folderName = resourceName.substring(0, lastSeparatorIndex);
			IFolder fo = project.getFolder(folderName);
			//we create the folder if not already present in the current project
			if (!fo.exists() && !folderName.equals(""))//to avoid user mistakes such as names like messages.properties/ (oops) 
				fo.create(false, true, null);
		}

		if (!f.exists()) {
			InputStream source = new ByteArrayInputStream(
					"#TODO: generated property file stub\n".getBytes());
			f.create(source, true, null);
		}

	}

}
