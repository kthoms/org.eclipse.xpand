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
package org.eclipse.xtend.shared.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

public abstract class NewExtXptResourceWizard extends BasicNewResourceWizard {

	private NewOAWResourcePage mainPage;

	private String extension;

	private String title;

	private String description;

	private String initial;

	private String initialContents;

	/**
	 * Creates a wizard for creating a new file resource in the workspace.
	 */
	public NewExtXptResourceWizard(String initial, String extension, String title, String description, String initialContents) {
		super();
		this.initial = initial;
		this.extension = extension;
		this.title = title;
		this.description = description;
		this.initialContents = initialContents;
	}

	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	@Override
	public void addPages() {
		super.addPages();
		mainPage = new NewOAWResourcePage("newFilePage1", getSelection(), initial, extension, initialContents);//$NON-NLS-1$
		mainPage.setTitle(title);
		mainPage.setDescription(description);
		addPage(mainPage);
	}

	/*
	 * (non-Javadoc) Method declared on IWorkbenchWizard.
	 */

	@Override
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("New File");
		setNeedsProgressMonitor(true);
	}

	/*
	 * (non-Javadoc) Method declared on BasicNewResourceWizard.
	 */
	@Override
	protected void initializeDefaultPageImageDescriptor() {
		ImageDescriptor desc = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.ui.ide", "$nl$/icons/full/wizban/newfile_wiz.png");
		setDefaultPageImageDescriptor(desc);
	}

	@Override
	public boolean canFinish() {
		return mainPage.getFileName().endsWith("." + extension);
	}

	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	@Override
	public boolean performFinish() {
		IFile file = mainPage.createNewFile();
		if (file == null) {
			return false;
		}

		selectAndReveal(file);
		// Open editor on new file.
		EclipseHelper.openFileToEdit(getShell(), file);
		return true;
	}
}
