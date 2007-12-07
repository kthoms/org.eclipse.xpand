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

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2t.common.recipe.astChecks.checks.JavaClassExistenceCheck;
import org.eclipse.m2t.common.recipe.astChecks.checks.JavaClassExistenceCheckEvaluator;

public class JavaClassExistenceQuickFixer extends QuickFixer {

	private static final String DEFAULT_CLASS_LOCATION = "man-src";

	public JavaClassExistenceQuickFixer(JavaClassExistenceCheck check,
			JavaClassExistenceCheckEvaluator checkEvaluator) {
		super(check, checkEvaluator);
	}

	@Override
	public IStatus quickFix() {

		// we create the class with the jdt as the check wants it to be
		try {
			this.createClass();
		} catch (JavaModelException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		} catch (CoreException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
		return Status.OK_STATUS;
	}

	private void createClass() throws JavaModelException, CoreException {

		String projectName = check.getParameterString("projectName");
		String className = check.getParameterString("className");
		IWorkspace workspace = checkEvaluator.refreshWorkspace(check);
		IProject project = workspace.getRoot().getProject(projectName);
		IJavaProject javaProject = JavaCore.create(project);

		String contents = new StringBuffer().append("\n\npublic class ")
				.append(className).append(
						" //TODO: generated class stub\n{\n\n}").toString();

		// Here we first try to put generated classes after quick fixing in
		// the same package than their respective classes:
		String relatedSuperclassName = className+JavaSupertypeQuickFixer.DEFAULT_SUPERCLASS_NAME_TAIL;
		IType relatedSupertype = javaProject.findType(relatedSuperclassName);
		if (relatedSupertype != null) {
			relatedSupertype.getPackageFragment().createCompilationUnit(
					className + ".java", contents, false, null);
			//relatedSupertype.getPackageFragment().save(null, false);
		} else {

			// If we can't, then here's a solution involving a default output
			// location for generated classes after quick fixing:

			IFolder folder = javaProject.getProject().getFolder(
					JavaClassExistenceQuickFixer.DEFAULT_CLASS_LOCATION);
			if (!folder.exists()) {
				folder.create(false, true, null);
				//javaProject.save(null, false);
			}
			IPackageFragment pf = javaProject.findPackageFragment(new Path(
					javaProject.getPath().toString()
							+ java.io.File.separatorChar
							+ JavaClassExistenceQuickFixer.DEFAULT_CLASS_LOCATION));
			pf.createCompilationUnit(className + ".java", contents,
							false, null);

		}
	}
}
