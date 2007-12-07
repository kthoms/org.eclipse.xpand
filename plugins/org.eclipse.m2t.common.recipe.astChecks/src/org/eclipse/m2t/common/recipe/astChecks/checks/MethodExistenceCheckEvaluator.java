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

import java.util.StringTokenizer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.m2t.common.recipe.core.AtomicCheck;
import org.eclipse.m2t.common.recipe.core.EvaluationStop;

public class MethodExistenceCheckEvaluator extends
		EclipseResourceCheckEvaluator {

	private IType foundType = null;

	public void evaluate(AtomicCheck check) {
		String projectName = check.getParameterString("projectName");
		String className = check.getParameterString("className");
		IWorkspace workspace = refreshWorkspace(check);
		IProject project = workspace.getRoot().getProject(projectName);
		if (project == null) {
			check.fail("Project not found");
		}
		try {
			IJavaProject javaProject = JavaCore.create(project);
			IType type = javaProject.findType(className);
			if (type == null) {
				check.fail("Class not found: " + className);
			}
			ASTParser parser = ASTParser.newParser(AST.JLS3);
			parser.setResolveBindings(true);
			parser.setProject(javaProject);
			ITypeBinding binding = (ITypeBinding) parser.createBindings(
					new IJavaElement[] { type }, null)[0];
			String methodName = check.getParameterString("methodName");
			String parameters = check
					.getParameterString("commaSeparatedParamTypes");
			for (int i = 0; i < binding.getDeclaredMethods().length; i++) {
				IMethodBinding methodBinding = binding.getDeclaredMethods()[i];

				if (methodBinding.getName().equals(methodName)) {
					if (parameters == null) {
						parameters = "";
					}
					StringTokenizer st = new StringTokenizer(parameters, ",");
					ITypeBinding[] parameterTypes = methodBinding
							.getParameterTypes();
					if (st.countTokens() != parameterTypes.length) {
						continue;
					}
					if (st.countTokens() == 0) {
						check.ok();
						return;
					}
					for (int j = 0; j < parameterTypes.length; j++) {
						ITypeBinding param = parameterTypes[j];

						 if(!param.getQualifiedName().equals(st.nextElement())){
							break;
						}
						check.ok();
						return;
					}
				}
			}
			check.fail("Method " + methodName + "(" + parameters
					+ ") not found");
		} catch (EvaluationStop stop) {
			throw stop;
		} catch (JavaModelException e) {
			check.fail(e.getMessage());
		}
	}

	public IType getFoundType() {
		return foundType;
	}

}
