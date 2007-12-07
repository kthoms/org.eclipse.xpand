/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xpand.ui.editor;

import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.Vector;

import org.eclipse.internal.xpand2.codeassist.XpandTokens;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionContext;
import org.eclipse.ui.actions.ActionGroup;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
import org.eclipse.xpand.ui.editor.actions.InsertTextAction;
import org.eclipse.xpand.ui.editor.outline.XpandContentOutlinePage;
import org.eclipse.xpand.ui.refactoring.actions.RefactorActionGroup;
import org.eclipse.xtend.shared.ui.editor.AbstractXtendXpandEditor;
import org.eclipse.xtend.shared.ui.editor.outlineview.AbstractExtXptContentOutlinePage;

/**
 * Template specific text editor.
 */
public class XpandEditor extends AbstractXtendXpandEditor {

	private ActionGroup contextMenuRefactoringGroup;

	public XpandEditor() {
		setSourceViewerConfiguration(new XpandSourceViewerConfiguration(this, getPreferenceStore()));
		setDocumentProvider(new XpandDocumentProvider());
	}

	@Override
	protected AbstractExtXptContentOutlinePage createOutlinePage() {
		return new XpandContentOutlinePage(this);
	}

	@Override
	protected void editorContextMenuAboutToShow(IMenuManager menu) {
		super.editorContextMenuAboutToShow(menu);

		ActionContext context = new ActionContext(getSelectionProvider().getSelection());
		contextMenuRefactoringGroup.setContext(context);
		contextMenuRefactoringGroup.fillContextMenu(menu);
		contextMenuRefactoringGroup.setContext(null);
	}
	

	@Override
	protected void createActions() {
		super.createActions();
		final ResourceBundle rb = new ResourceBundle() {

			@Override
			public Enumeration getKeys() {
				return new Vector().elements();
			}

			@Override
			protected Object handleGetObject(String key) {
				return null;
			}
		};
		IAction a = new InsertTextAction(rb, this, getSourceViewer(), XpandTokens.LT);
		a.setActionDefinitionId(IXpandEditorActionDefinitionIds.INSERT_LT);
		setAction("InsertLT", a);

		a = new InsertTextAction(rb, this, getSourceViewer(), XpandTokens.RT);
		a.setActionDefinitionId(IXpandEditorActionDefinitionIds.INSERT_RT);
		setAction("InsertRT", a);

		// refactoring
		contextMenuRefactoringGroup = new RefactorActionGroup(this, ITextEditorActionConstants.GROUP_EDIT);

	}

	public ActionGroup getActionGroup() {
		return contextMenuRefactoringGroup;
	}
	
	@Override
	protected void initializeKeyBindingScopes() {
		setKeyBindingScopes(new String[] { "org.eclipse.internal.xtend.xpand2.editor.XpandEditorScope" }); //$NON-NLS-1$
	}
}
