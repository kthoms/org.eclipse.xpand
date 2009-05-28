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
package org.eclipse.xtend.ui.editor.outline;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.internal.xtend.xtend.ast.CreateExtensionStatement;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionFile;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.xtend.shared.ui.editor.AbstractXtendXpandEditor;
import org.eclipse.xtend.shared.ui.editor.outlineview.AbstractExtXptContentOutlinePage;
import org.eclipse.xtend.shared.ui.editor.outlineview.OutlineElement;
import org.eclipse.xtend.shared.ui.expression.editor.EditorImages;
import org.eclipse.xtend.ui.core.IXtendResource;


public class XtendContentOutlinePage extends AbstractExtXptContentOutlinePage {

	public static final int PRIVATE_CREATE_EXTENSION = 3,
			PRIVATE_EXTENSION = 4, CREATE_EXTENSION = 5, EXTENSION = 6;

	public XtendContentOutlinePage(AbstractXtendXpandEditor editor) {
		super(editor);
	}

	@Override
	protected OutlineElement[] getChildren(Object parentElement) {
		if (parentElement instanceof IXtendResource) {
			ExtensionFile xr = (ExtensionFile) ((IXtendResource) parentElement)
					.getExtXptResource();
			if (xr==null)
				return new OutlineElement[0];
			List<OutlineElement> result = new ArrayList<OutlineElement>();
			result.addAll(toOutlineElementsForNamespaceImports(xr
					.getNsImports()));
			result.addAll(toOutlineElementsForExtensionImports(xr
					.getExtImports()));
			result.addAll(toOutlineElements(xr.getExtensions()));
			return result.toArray(new OutlineElement[result.size()]);
		}
		return new OutlineElement[0];
	}

	//Since ImportStatements are used above, we can just use the superclass' methods
	//toOutlineElementsForNamespaceImports and toOutlineElementsForExtensionImports

	private List<OutlineElement> toOutlineElements(List<Extension> extensions) {
		List<OutlineElement> l = new ArrayList<OutlineElement>();
		for (Extension ext : extensions) {
			Image img = null;
			int type = PRIVATE_CREATE_EXTENSION;
			if (ext.isPrivate()) {
				if (ext instanceof CreateExtensionStatement) {
					img = EditorImages
							.getImage(EditorImages.PRIVATE_CREATE_EXTENSION);
				} else {
					img = EditorImages.getImage(EditorImages.PRIVATE_EXTENSION);
					type = PRIVATE_EXTENSION;
				}
			} else {
				if (ext instanceof CreateExtensionStatement) {
					img = EditorImages.getImage(EditorImages.CREATE_EXTENSION);
					type = CREATE_EXTENSION;
				} else {
					img = EditorImages.getImage(EditorImages.EXTENSION);
					type = EXTENSION;
				}
			}
			l.add(new OutlineElement(ext.toOutlineString(), ext.getStart(), ext
					.getEnd()
					- ext.getStart(), img,type));
		}
		return l;
	}

	// let's add a sort feature to this outline...
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		// register global actions (yes global in the meaning of affecting all
		// items in the TreeViewer)
		registerToolbarActions(getSite().getActionBars());
	}

	private void registerToolbarActions(IActionBars actionBars) {
		actionBars.getToolBarManager().add(new LexicalSortingAction());
	}

}
