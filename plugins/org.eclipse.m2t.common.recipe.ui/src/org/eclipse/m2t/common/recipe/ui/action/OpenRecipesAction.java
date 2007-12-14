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

package org.eclipse.m2t.common.recipe.ui.action;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2t.common.recipe.ui.RecipePlugin;
import org.eclipse.m2t.common.recipe.ui.recipeBrowser.RecipeBrowserView;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class OpenRecipesAction implements IObjectActionDelegate {

	private IResource selectedResource = null;

	public OpenRecipesAction() {
		super();
	}

	public OpenRecipesAction(IFile file) {
		selectedResource = file;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void run(IAction action) {
		if (selectedResource instanceof IFile) {
			RecipeBrowserView v;
			try {
				v = (RecipeBrowserView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(RecipeBrowserView.ID);
				v.openRecipeFile((IFile) selectedResource);
			} catch (PartInitException e) {
				RecipePlugin.log(e);
			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection != null) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			if (sel.getFirstElement() != null) {
				selectedResource = (IResource) sel.getFirstElement();
			}
		}
	}

}