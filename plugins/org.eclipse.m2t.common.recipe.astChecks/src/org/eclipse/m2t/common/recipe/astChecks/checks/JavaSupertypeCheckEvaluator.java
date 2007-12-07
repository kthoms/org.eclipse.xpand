/**
 * <copyright>
 *
 * Copyright (c) 2005-2006 Bernd Kolb and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bernd Kolb - implementation
 *
 * </copyright>
 */

package org.eclipse.m2t.common.recipe.astChecks.checks;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2t.common.recipe.core.AtomicCheck;
import org.eclipse.m2t.common.recipe.core.EvaluationStop;

public class JavaSupertypeCheckEvaluator extends EclipseResourceCheckEvaluator {

	public void evaluate(AtomicCheck check) {
		String projectName = check.getParameterString("projectName");
		String className = check.getParameterString("className");
		String supertypeName = check.getParameterString("supertypeName");
		IWorkspace workspace = refreshWorkspace(check);
		IProject project = workspace.getRoot().getProject(projectName);
		if (project == null) {
			check.fail("Project not found");
		}
		try {
			IJavaProject javaProject = JavaCore.create(project);
			IType type = javaProject.findType(className);
			if (type == null) {
				check.fail("type not found");
			}
			IType superType = javaProject.findType(supertypeName);
			if (superType == null) {
				check.fail("Supertype not found");
			}
			ITypeHierarchy hierarchy = type.newSupertypeHierarchy(null);
			if (hierarchy.contains(superType)) {
				check.ok();
				return;
			} else {
				check.fail(check.getShortDescription());
			}
		} catch (EvaluationStop stop) {
			throw stop;
		} catch (JavaModelException e) {
			check.fail(e.getMessage());
		}
	}

}
