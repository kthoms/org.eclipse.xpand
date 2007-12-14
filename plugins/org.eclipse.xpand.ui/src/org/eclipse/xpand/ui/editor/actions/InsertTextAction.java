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

package org.eclipse.xpand.ui.editor.actions;

import java.util.ResourceBundle;

import org.eclipse.jface.text.ITextViewer;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.ui.texteditor.TextEditorAction;

public class InsertTextAction extends TextEditorAction {
	protected ITextViewer viewer;

	protected String text;

	public InsertTextAction(final ResourceBundle bundle, final ITextEditor editor, final ITextViewer viewer,
			final String text) {
		super(bundle, null, editor);

		this.viewer = viewer;
		this.text = text;

		update();
	}

	@Override
	public void run() {
		final StyledText textWidget = viewer.getTextWidget();

		if (textWidget.getSelectionCount() == 0) {
			textWidget.insert(text);
			textWidget.setCaretOffset(textWidget.getCaretOffset() + text.length());
// viewer.getTextOperationTarget().doOperation(ISourceViewer.CONTENTASSIST_PROPOSALS);
		} else {
			textWidget.insert(text);
		}
	}

	@Override
	public void update() {
		super.update();

		final ITextEditor editor = getTextEditor();

		if (editor == null || !editor.isEditable()) {
			setEnabled(false);
		}
	}
}
