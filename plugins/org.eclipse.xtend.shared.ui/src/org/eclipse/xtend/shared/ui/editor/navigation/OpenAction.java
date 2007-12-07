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
		setText("Open");
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
	private boolean checkEnabled(ITextSelection selection) {
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
}
