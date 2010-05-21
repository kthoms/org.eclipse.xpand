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
package org.eclipse.xtend.shared.ui.editor.navigation;

import org.eclipse.jdt.ui.actions.SelectionDispatchAction;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.xtend.shared.ui.Messages;
import org.eclipse.xtend.shared.ui.editor.AbstractXtendXpandEditor;

/**
 * OpenAction is instantiated by the editor and will be invoked when the user
 * presses the F3 key.
 * 
 * @author Peter Friese
 */
public class OpenAction extends SelectionDispatchAction {

	private final AbstractXtendXpandEditor editor;

	/**
	 * Creates a new <code>OpenAction</code>.
	 * 
	 * @param editor
	 *            the Properties file editor which provides the context
	 *            information for this action
	 */
	public OpenAction(AbstractXtendXpandEditor editor) {
		super(editor.getEditorSite());
		this.editor = editor;
		setText(Messages.OpenAction_ActionName);
		setEnabled(editor.getEditorInput() instanceof IFileEditorInput);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void selectionChanged(ITextSelection selection) {
		setEnabled(checkEnabled(selection));
	}

	/**
	 * @param selection
	 * @return
	 */
	protected boolean checkEnabled(ITextSelection selection) {
		if (selection == null || selection.isEmpty()) {
			return false;
		}

		return editor.getEditorInput() instanceof IFileEditorInput;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void run(ITextSelection selection) {

		if (!checkEnabled(selection)) {
			return;
		}

		IRegion region = new Region(selection.getOffset(), selection.getLength());
		GenericHyperlinkDetector detector = new GenericHyperlinkDetector(editor);
		IHyperlink[] hyperlinks = detector.detectHyperlinks(editor.internalGetSourceViewer(), region, false);

		if (hyperlinks != null && hyperlinks.length == 1) {
			hyperlinks[0].open();
		}

	}
	
	/**
	 * Given a ITextSelection (i.e. the current cursor position),
	 * analyse the region around this location in order to find the word under
	 * the cursor.
	 * 
	 * @param textViewer
	 *            The underlying text viewer.
	 * @param offset
	 *            The cursor location.
	 * @return The document region defining the hyperlinked word.
	 */
	protected IRegion getHyperlinkRegion(ITextSelection selection) {
		int offset = selection.getOffset();
		String currDoc = editor.getDocumentProvider().getDocument(editor.getEditorInput()).get();

		// special handling if cursor is located at end of document
		if (offset == currDoc.length()) {
			return null;
		}

		// find word start
		int start = offset;
		while (start > -1 && WordDetector.isWordPart(currDoc.charAt(start))) {
			start--;
		}

		// find word end
		start++;
		int end = offset;
		while (end < currDoc.length() && WordDetector.isWordPart(currDoc.charAt(end))) {
			end++;
		}

		if (start < 0) {
			start = 0;
		}

		if (end < start) {
			end = start;
		}

		return new Region(start, end - start);
	}
}
