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

import java.util.StringTokenizer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2t.common.recipe.astChecks.checks.MethodExistenceCheck;
import org.eclipse.m2t.common.recipe.astChecks.checks.MethodExistenceCheckEvaluator;

public class MethodExistenceQuickFixer extends QuickFixer {

	private static final String DEFAULT_METHOD_MODIFIERS = "public void";

	public MethodExistenceQuickFixer(MethodExistenceCheck check,MethodExistenceCheckEvaluator checkEvaluator){
		super(check,checkEvaluator);
	}

	@Override
	public IStatus quickFix() {

		// OPTIMISTIC OR COMPOSITE CHECKS ONLY QUICK FIXING:
		// these following lines shouldn't even be uncommented
		// PESSIMISTIC OR ATOMIC (LEAF) CHECKS QUICK FIXING :
		// uncomment the following lines to be pessimistic
		// (if the class we have to supertype doesn't exist,
		// we create it with so we can go on with the fixing:
		// To achieve this, we look in this check's parent's tree if there's
		// no Check already there and ready to help.)
		/*
		 * JavaClassExistenceCheckEvaluator JCECheckEvaluator = new
		 * JavaClassExistenceCheckEvaluator(); for (Check c :
		 * JSCheck.getParent().getChildren()) { if (c instanceof
		 * JavaClassExistenceCheck) { JavaClassExistenceCheck JCECheck =
		 * (JavaClassExistenceCheck) c; JCECheckEvaluator.evaluate(JCECheck); if
		 * (JCECheck.getStatus() == EvalStatus.FAILED) { new
		 * JavaClassExistenceQuickFixer(JCECheck).quickFix(); } break;// yes, I
		 * know break;'s bad... } }
		 */

		// then we add the willed supertype to the class
		// we-are-now-optimisticly-sure-to-exist
		try {
			this.addEmptyMethod();// equivalent of creating a method
			// actually...
		} catch (JavaModelException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
		
		return Status.OK_STATUS;

	}

	private void addEmptyMethod() throws JavaModelException {

		String projectName = check.getParameterString("projectName");
		String className = check.getParameterString("className");
		IWorkspace workspace = checkEvaluator.refreshWorkspace(check);
		IProject project = workspace.getRoot().getProject(projectName);
		IJavaProject javaProject = JavaCore.create(project);

		IType type = javaProject.findType(className);

		String methodName = check.getParameterString("methodName");
		String[] parameterTypes = check.getParameterString(
				"commaSeparatedParamTypes").split(",");

		// let's create the import for the used types
		for (int i = 0; i < parameterTypes.length; i++) {
			// except for all java.lang.* packages and primitive types, of
			// course
			if (!parameterTypes[i].contains("java.lang")
					&& parameterTypes[i].contains("."))
				type.getCompilationUnit().createImport(parameterTypes[i], null,
						null);

			// ...and simplify simplifiable types' names
			if (parameterTypes[i].contains(".")) {
				String s = "";
				// ...by getting the last dot-separated token of the completely
				// qualified name
				for (StringTokenizer stk = new StringTokenizer(
						parameterTypes[i], "."); stk.hasMoreTokens(); s = stk
						.nextToken())
					;
				parameterTypes[i] = s;
			}
		}

		// then we create the method in itself..:
		StringBuilder sbl = new StringBuilder();

		for (int i = 0; i < parameterTypes.length; i++) {
			if (0 < i)
				sbl.append(", ");
			sbl.append(parameterTypes[i]).append(" arg").append(i);
		}

		String parametersString = sbl.toString();
		StringBuffer sbf = new StringBuffer().append(MethodExistenceQuickFixer.DEFAULT_METHOD_MODIFIERS+' ').append(
				methodName).append("(").append(parametersString).append(
				"){\n//TODO: generated method stub\n\n}");
		String contents = sbf.toString();

		try {
			type.createMethod(contents, null, false, null);
		} catch (JavaModelException e) {
			System.out
					.println("well, the method already exists, so it's not useful to create it...");
		}
		type.getCompilationUnit().save(null, false);
	}

}