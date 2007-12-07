/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: committers of openArchitectureWare - initial API and
 * implementation
 ******************************************************************************/
package org.eclipse.xpand.ui.refactoring.actions;

import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;
import org.eclipse.ltk.ui.refactoring.RefactoringWizardOpenOperation;
import org.eclipse.xpand.ui.editor.XpandEditor;
import org.eclipse.xpand.ui.refactoring.renamedefine.RenameDefineProcessor;
import org.eclipse.xpand.ui.refactoring.renamedefine.RenameDefineRefactoring;
import org.eclipse.xpand.ui.refactoring.renamedefine.RenameDefineRefactoringWizard;
import org.eclipse.xtend.shared.ui.core.action.SelectionDispatchAction;

public class RenameDefineAction extends SelectionDispatchAction {

	private final XpandEditor editor;

	public RenameDefineAction(XpandEditor editor) {
		super(editor.getEditorSite());
		setText("Rename Define");
		this.editor = editor;
	}

	@Override
	public void selectionChanged(ITextSelection selection) {
		int length = selection.getLength();
		setEnabled(length == 0 ? false : editor != null);
	}

	@Override
	public void run(ITextSelection selection) {
		RefactoringProcessor processor = new RenameDefineProcessor(editor, selection);
		RenameDefineRefactoring refactoring = new RenameDefineRefactoring(processor);
		RenameDefineRefactoringWizard wizard = new RenameDefineRefactoringWizard(refactoring);
		RefactoringWizardOpenOperation op = new RefactoringWizardOpenOperation(wizard);
		try {
			String titleForFailedChecks = ""; //$NON-NLS-1$ 
			op.run(getShell(), titleForFailedChecks);
		} catch (InterruptedException irex) {
			// operation was canceled
		}
	}
}
