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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.m2t.common.recipe.astChecks.checks.JavaSupertypeCheck;
import org.eclipse.m2t.common.recipe.astChecks.checks.JavaSupertypeCheckEvaluator;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

public class JavaSupertypeQuickFixer extends QuickFixer {

	public static final String DEFAULT_SUPERCLASS_NAME_TAIL="ImplBase";
	
	public JavaSupertypeQuickFixer(JavaSupertypeCheck check,JavaSupertypeCheckEvaluator checkEvaluator){
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
		 * check.getParent().getChildren()) { if (c instanceof
		 * JavaClassExistenceCheck) { JavaClassExistenceCheck JCECheck =
		 * (JavaClassExistenceCheck) c; JCECheckEvaluator.evaluate(JCECheck); if
		 * (JCECheck.getStatus() == EvalStatus.FAILED) { new
		 * JavaClassExistenceQuickFixer(JCECheck).quickFix(); } break;// yes, I
		 * know break;'s bad... } }
		 */

		// then we add the willed supertype to the class
		// we-are-now-optimisticly-sure-to-exist
		try {
			this.addSuperClass();
		} catch (JavaModelException e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
		
		return Status.OK_STATUS;

	}

	private void addSuperClass() throws JavaModelException {

		String projectName = check.getParameterString("projectName");
		String className = check.getParameterString("className");
		IWorkspace workspace = checkEvaluator.refreshWorkspace(check);
		IProject project = workspace.getRoot().getProject(projectName);
		IJavaProject javaProject = JavaCore.create(project);

		IType type = javaProject.findType(className);
		IType supertype = javaProject.findType(className + JavaSupertypeQuickFixer.DEFAULT_SUPERCLASS_NAME_TAIL);

		try {
			// creation of a Document
			ICompilationUnit cu = type.getCompilationUnit();
			Document document = new Document(cu.getBuffer().getContents());

			// creation of DOM/AST from a ICompilationUnit
			ASTParser parser = ASTParser.newParser(AST.JLS3);
			parser.setSource(cu);
			CompilationUnit astRoot = (CompilationUnit) parser.createAST(null);

			// start record of the modifications
			astRoot.recordModifications();

			// modify the AST
			AST ast = astRoot.getRoot().getAST();
			SimpleType t = ast.newSimpleType(ast.newSimpleName(supertype
					.getElementName()));

			TypeDeclaration typeDeclaration = (TypeDeclaration) astRoot.types()
					.get(0);

			typeDeclaration.setSuperclassType(t);

			// computation of the text edits
			TextEdit edits = astRoot.rewrite(document, cu.getJavaProject()
					.getOptions(true));

			// computation of the new source code
			try {
				edits.apply(document);
			} catch (MalformedTreeException e) {
				e.printStackTrace();
			} catch (BadLocationException e) {
				e.printStackTrace();
			}
			String newSource = document.get();

			// update of the compilation unit
			cu.getBuffer().setContents(newSource);
			cu.save(null, false);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
