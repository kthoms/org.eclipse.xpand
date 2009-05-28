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

package org.eclipse.xpand.ui.editor.outline;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.internal.xpand2.ast.AbstractDefinition;
import org.eclipse.internal.xpand2.ast.Advice;
import org.eclipse.internal.xpand2.ast.ImportDeclaration;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.xpand.ui.core.IXpandResource;
import org.eclipse.xtend.shared.ui.editor.AbstractXtendXpandEditor;
import org.eclipse.xtend.shared.ui.editor.outlineview.AbstractExtXptContentOutlinePage;
import org.eclipse.xtend.shared.ui.editor.outlineview.OutlineElement;
import org.eclipse.xtend.shared.ui.expression.editor.EditorImages;

public class XpandContentOutlinePage extends AbstractExtXptContentOutlinePage {

	public static final int TEMPLATE = 3, AROUND = 4;

	public XpandContentOutlinePage(AbstractXtendXpandEditor editor) {
		super(editor);
	}

	@Override
	protected OutlineElement[] getChildren(Object parentElement) {
		if (parentElement instanceof IXpandResource) {
			Template tpl = (Template) ((IXpandResource) parentElement)
					.getExtXptResource();
			if (tpl==null) 
				return new OutlineElement[0];
			List<OutlineElement> result = new ArrayList<OutlineElement>();
			result
					.addAll(toOutlineElementsForNamespaceImports(tpl
							.getImports()));
			result.addAll(toOutlineElementsForExtensionImports(tpl
					.getExtensions()));
			result.addAll(toOutlineElements(tpl.getAllDefinitions()));
			return result.toArray(new OutlineElement[result.size()]);
		}
		return new OutlineElement[0];
	}

	// here we have to redefine the two superclass's methods
	// toOutlineElementsForNamespaceImports and
	// toOutlineElementsForExtensionImports
	// just because ImportDeclaration_s are not ImportStatement_s !
	private List<OutlineElement> toOutlineElementsForNamespaceImports(
			ImportDeclaration[] declarations) {
		List<OutlineElement> l = new ArrayList<OutlineElement>();
		for (ImportDeclaration s : declarations) {
			l.add(new OutlineElement(s.getImportString().getValue(), s
					.getStart(), s.getEnd() - s.getStart(), EditorImages
					.getImage(EditorImages.NS_IMPORT), OutlineElement.IMPORT));
		}
		return l;
	}

	private List<OutlineElement> toOutlineElementsForExtensionImports(
			ImportDeclaration[] declarations) {
		List<OutlineElement> l = new ArrayList<OutlineElement>();
		for (ImportDeclaration s : declarations) {
			l.add(new OutlineElement(s.getImportString().getValue(), s
					.getStart(), s.getEnd() - s.getStart(), EditorImages
					.getImage(EditorImages.EXT_IMPORT),
					OutlineElement.EXTENSION));
		}
		return l;
	}

	
	
	
	private List<OutlineElement> toOutlineElements(
			AbstractDefinition[] definitions) {
		List<OutlineElement> l = new ArrayList<OutlineElement>();
		for (AbstractDefinition def : definitions) {
			Image img = EditorImages.getImage(EditorImages.XPAND_TEMPLATE);
			int type = TEMPLATE;
			if (def instanceof Advice) {
				img = EditorImages.getImage(EditorImages.XPAND_AROUND);
				type = AROUND;
			}
			l.add(new OutlineElement(def.toString(), def.getStart(), def
					.getEnd()
					- def.getStart(), img, type));
		}
		return l;
	}

	// to add a sort button to the outline's toolbar
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