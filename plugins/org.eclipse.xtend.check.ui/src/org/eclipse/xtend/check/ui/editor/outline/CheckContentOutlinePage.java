/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.check.ui.editor.outline;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.internal.xtend.xtend.ast.Check;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.editor.AbstractXtendXpandEditor;
import org.eclipse.xtend.shared.ui.editor.outlineview.AbstractExtXptContentOutlinePage;
import org.eclipse.xtend.shared.ui.editor.outlineview.OutlineElement;
import org.eclipse.xtend.shared.ui.expression.editor.EditorImages;


public class CheckContentOutlinePage extends AbstractExtXptContentOutlinePage {

	public static final int WARNING = 3, ERROR = 4;

	public CheckContentOutlinePage(AbstractXtendXpandEditor editor) {
		super(editor);
	}

	@Override
	protected OutlineElement[] getChildren(Object parentElement) {
		if (parentElement instanceof IXtendXpandResource) {
			ExtensionFile check = (ExtensionFile) ((IXtendXpandResource) parentElement)
					.getExtXptResource();
			if (check==null)
				return new OutlineElement[0];
			List<OutlineElement> result = new ArrayList<OutlineElement>();
			result.addAll(toOutlineElementsForNamespaceImports(check
					.getNsImports()));
			result.addAll(toOutlineElementsForExtensionImports(check
					.getExtImports()));
			result.addAll(toOutlineElements(check.getChecks()));
			return result.toArray(new OutlineElement[result.size()]);
		}
		return new OutlineElement[0];
	}
	//import
	//Since ImportStatements are used above, we can just use the superclass' methods
	//toOutlineElementsForNamespaceImports and toOutlineElementsForExtensionImports

	private List<OutlineElement> toOutlineElements(List<Check> checks) {
		List<OutlineElement> l = new ArrayList<OutlineElement>();
		for (Check check : checks) {

			Image img = EditorImages.getImage(EditorImages.ERROR_CHECK);
			int type = ERROR;
			if (!check.isErrorCheck()) {
				img = EditorImages.getImage(EditorImages.WARNING_CHECK);
				type = WARNING;
			}
			l.add(new OutlineElement(check.toString(), check.getStart(), check
					.getEnd()
					- check.getStart(), img, type));
		}
		return l;
	}

	// let's add a sort feature to this outline...
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		// register global actions
		registerToolbarActions(getSite().getActionBars());
	}
	private void registerToolbarActions(IActionBars actionBars) {
		actionBars.getToolBarManager().add(new LexicalSortingAction());
	}

}
