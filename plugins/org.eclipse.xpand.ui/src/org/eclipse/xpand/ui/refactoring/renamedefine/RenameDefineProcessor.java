/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xpand.ui.refactoring.renamedefine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;
import org.eclipse.ltk.core.refactoring.participants.SharableParticipants;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEditGroup;
import org.eclipse.xpand.ui.Messages;
import org.eclipse.xpand.ui.editor.XpandEditor;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.search.SearchMatch;
import org.eclipse.xtend.shared.ui.core.search.XtendXpandSearchEngine;

/**
 * RenameDefineProcessor creates the refactoring changes for rename
 * refactorings.
 * 
 * @author Peter Friese
 */
public class RenameDefineProcessor extends RefactoringProcessor {

	private final XpandEditor editor;
	private final ITextSelection selection;
	private String newName;

	/**
	 * Creates a new <code>RenameDefineProcessor</code>.
	 * 
	 * @param selection
	 * @param editor
	 */
	public RenameDefineProcessor(XpandEditor editor, ITextSelection selection) {
		this.editor = editor;
		this.selection = selection;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RefactoringStatus checkFinalConditions(IProgressMonitor pm,
			CheckConditionsContext context) throws CoreException,
			OperationCanceledException {
		return new RefactoringStatus();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RefactoringStatus checkInitialConditions(IProgressMonitor pm)
			throws CoreException, OperationCanceledException {
		IFile sourceFile = getSourceFile();

		RefactoringStatus result = new RefactoringStatus();
		if (sourceFile == null || !sourceFile.exists()) {
			result.addFatalError(Messages.RenameDefineProcessor_NoSuchFile);
		} else if (sourceFile.isReadOnly()) {
			result.addFatalError(Messages.RenameDefineProcessor_FileReadonly);
		}
		return result;
	}

	private IFile getSourceFile() {
		IFile sourceFile = (IFile) editor.getEditorInput().getAdapter(
				IFile.class);
		return sourceFile;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException,
			OperationCanceledException {

		CompositeChange result = new CompositeChange(
				Messages.RenameDefineProcessor_CompositeChangeName);

		IFile file = (IFile) editor.getEditorInput().getAdapter(IFile.class);
		IXtendXpandProject project = Activator.getExtXptModelManager()
				.findProject(file);
		String selectedText = selection.getText();
		List<SearchMatch> references = XtendXpandSearchEngine
				.findAllOccurrences(project, selectedText);

		Map<IFile, TextFileChange> fileChanges = new HashMap<IFile, TextFileChange>();
		for (SearchMatch match : references) {
			TextFileChange fileChange = null;
			if (fileChanges.containsKey(match.getFile())) {
				fileChange = fileChanges.get(match.getFile());
			} else {
				fileChange = new TextFileChange(
						Messages.RenameDefineProcessor_TextFileChangeName,
						match.getFile());
				MultiTextEdit fileChangeRootEdit = new MultiTextEdit();
				fileChange.setEdit(fileChangeRootEdit);
				fileChanges.put(match.getFile(), fileChange);
				result.add(fileChange);
			}

			ReplaceEdit replaceSelectionEdit = new ReplaceEdit(match
					.getOffSet() + 1, match.getLength(), newName);
			fileChange.addEdit(replaceSelectionEdit);

			TextEditGroup teg2 = new TextEditGroup(
					Messages.RenameDefineProcessor_GroupDescription);
			fileChange.addTextEditGroup(teg2);
			teg2.addTextEdit(replaceSelectionEdit);

		}

		return result;
	}

	/**
	 * Returns <code>true</code> if the given character is a line delimiter
	 * character.
	 * 
	 * @param ch
	 *            the given character
	 * @return Returns <code>true</code> if this the character is a line
	 *         delimiter character, <code>false</code> otherwise
	 */
	public static boolean isLineDelimiterChar(char ch) {
		return ch == '\n' || ch == '\r';
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object[] getElements() {
		return new Object[] { getSourceFile() };
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getIdentifier() {
		return Messages.RenameDefineProcessor_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getProcessorName() {
		return Messages.RenameDefineProcessor_ProcessorName;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isApplicable() throws CoreException {
		return true;
	}

	public boolean validateNewName() {
		// TODO (dennis) check if newName is a valid define name
		return newName != null && !newName.trim().equals("")
				&& !selection.getText().equals(newName);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RefactoringParticipant[] loadParticipants(RefactoringStatus status,
			SharableParticipants sharedParticipants) throws CoreException {
		return new RefactoringParticipant[0];
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public ITextSelection getSelection() {
		return selection;
	}
}
