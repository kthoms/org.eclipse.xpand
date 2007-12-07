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
package org.eclipse.xpand.ui.editor.actions;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.editors.text.TextEditorActionContributor;
import org.eclipse.xpand.ui.editor.XpandEditor;

/**
 * XpandEditorContributor manages global actions for the Xpand editor.
 * 
 * @author Peter Friese
 */
public class XpandEditorContributor extends TextEditorActionContributor {

	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);

		if (part instanceof XpandEditor) {
			XpandEditor xpandEditor = (XpandEditor) part;
			xpandEditor.getActionGroup().fillActionBars(getActionBars());
		}

	}

}
