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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2t.common.recipe.astChecks.checks.PropertyFileExistenceCheck;
import org.eclipse.m2t.common.recipe.astChecks.checks.PropertyFileExistenceCheckEvaluator;

public class PropertyFileExistenceQuickFixer extends QuickFixer {

	public PropertyFileExistenceQuickFixer(PropertyFileExistenceCheck check,
			PropertyFileExistenceCheckEvaluator checkEvaluator) {
		super(check, checkEvaluator);
	}

	@Override
	public IStatus quickFix() {

		// we create the class with the jdt as the check wants it to be
		try {
			this.createPropertyFile();
		} catch (JavaModelException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} catch (IOException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} catch (CoreException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;	
		}

		return Status.OK_STATUS;
	}

	private void createPropertyFile() throws IOException, CoreException {

		String projectName = check.getParameterString("projectName");
		String resourceName = check.getParameter("propertyFileLoc").getValue()
				.toString();
		IWorkspace workspace = checkEvaluator.refreshWorkspace(check);
		IProject project = workspace.getRoot().getProject(projectName);

		IPath path = new Path(resourceName);
		IFile f = project.getFile(path);
		Properties p = new Properties();
		p.load(new FileInputStream(f.getLocation().toOSString()));

		String propertyName = check.getParameterString("propertyName");
		String propertyValue = check.getParameterString("propertyVal");

		if (!p.containsKey(propertyName))
			p.put(propertyName, propertyValue);
		else
			p.setProperty(propertyName, propertyValue);

		p.store(new FileOutputStream(f.getLocation().toOSString()),
				"generated property added");
		

	}

}
