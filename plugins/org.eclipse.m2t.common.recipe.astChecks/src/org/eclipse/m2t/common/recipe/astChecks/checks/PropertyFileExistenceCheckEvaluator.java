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

package org.eclipse.m2t.common.recipe.astChecks.checks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.Path;
import org.eclipse.m2t.common.recipe.core.AtomicCheck;

public class PropertyFileExistenceCheckEvaluator extends EclipseResourceCheckEvaluator {

	public void evaluate(AtomicCheck check) {
		String projectName = check.getParameter("projectName").getValue().toString();
		String resourceName = check.getParameter("propertyFileLoc").getValue().toString();
		IWorkspace workspace = refreshWorkspace(check);
		IProject project = workspace.getRoot().getProject(projectName);
		if (project == null)
			check.fail("project not found: " + projectName);
		IFile f = workspace.getRoot().getFile(new Path(projectName + "/" + resourceName));
		if (!f.exists()) {
			check.fail("resource not found: " + projectName + "/" + resourceName);
		}
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(f.getLocation().toOSString()));
		} catch (FileNotFoundException e) {
			check.fail("File not found");
		} catch (IOException e) {
			check.fail("Could not load file");
		}
		String propertyName = check.getParameterString("propertyName");
		if (propertyName != null) {
			if (p.containsKey(propertyName)) {
				String propertyVal = check.getParameterString("propertyVal");
				if (propertyVal != null) {
					if (p.get(propertyName).equals(propertyVal)) {
						check.ok();
					} else {
						check.fail("Property " + propertyName + " has wrong value");
					}
				}
				check.ok();
			} else {
				check.fail("Property does not exist: " + propertyName);
			}
		}
		check.ok();
	}
}
