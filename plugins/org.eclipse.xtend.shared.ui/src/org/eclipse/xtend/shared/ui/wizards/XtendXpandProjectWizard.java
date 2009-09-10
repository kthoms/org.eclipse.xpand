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
package org.eclipse.xtend.shared.ui.wizards;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.eclipse.xtend.shared.ui.Messages;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

public class XtendXpandProjectWizard extends Wizard implements INewWizard, IExecutableExtension {
	private XtendXpandProjectWizardPage page;

	private IConfigurationElement configElement;

	public XtendXpandProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}

	@Override
	public void addPages() {
		page = new XtendXpandProjectWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		final String name = page.getProjectName();
		final boolean genExample = page.isCreateExample();
		final IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(final IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(name, genExample, monitor);
				}
				finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		}
		catch (final InterruptedException e) {
			return false;
		}
		catch (final InvocationTargetException e) {
			final Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), Messages.XtendXpandProjectWizard_ErrorLabel, realException.getMessage());
			return false;
		}
		BasicNewProjectResourceWizard.updatePerspective(configElement);
		return true;
	}

	void doFinish(final String name, final boolean genExample, final IProgressMonitor monitor) {
		final String projectName = name;
		monitor.beginTask(Messages.XtendXpandProjectWizard_ProjectCreationMessage + name, 2);

		final Set<String> refs = new HashSet<String>();
		final List<String> srcfolders = new ArrayList<String>();
		srcfolders.add("src");
		srcfolders.add("src-gen");

		refs.add("org.eclipse.jdt.core;bundle-version=\"3.5.0\"");
		refs.add("org.apache.commons.logging");
		refs.add("org.apache.log4j;resolution:=optional");
		refs.add("org.eclipse.xtend.profiler;resolution:=optional");
		final IProject p = EclipseHelper.createExtXptProject(projectName, srcfolders, Collections
				.<IProject> emptyList(), refs, null, monitor, getShell());

		if (p == null)
			return;
		if (genExample) {
			EclipseHelper.createFile("src/metamodel/Checks.chk", p, getContents("Checks.chk"), monitor);
			EclipseHelper.createFile("src/metamodel/Extensions.ext", p, getContents("Extensions.ext"), monitor);
			EclipseHelper.createFile("src/metamodel/metamodel.ecore", p, getContents("metamodel.ecore"), monitor);
			EclipseHelper.createFile("src/template/GeneratorExtensions.ext", p, getContents("GeneratorExtensions.ext"),
					monitor);
			EclipseHelper.createFile("src/template/Template.xpt", p, getContents("Template.xpt"), monitor);
			EclipseHelper.createFile("src/workflow/generator.mwe", p, getContents("generator.mwe").replace(
					"PROJECTNAME", projectName), monitor);
			EclipseHelper.createFile("src/workflow/generatorWithProfiler.mwe", p, getContents("generatorWithProfiler.mwe").replace(
					"PROJECTNAME", projectName), monitor);
			EclipseHelper.createFile("src/Model.xmi", p, getContents("Model.xmi"), monitor);
			EclipseHelper.createFile(".settings/org.eclipse.core.resources.prefs", p,
					"eclipse.preferences.version=1\nencoding/<project>=ISO-8859-1\n", monitor);
		}
		monitor.worked(1);
	}

	private String getContents(final String resource) {
		try {
			final InputStream inputStream = getClass().getClassLoader().getResourceAsStream(
					"org/eclipse/xtend/shared/ui/wizards/example/" + resource);

			final byte[] buffer = new byte[4096];
			final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

			while (true) {
				int read;
				read = inputStream.read(buffer);

				if (read == -1) {
					break;
				}

				outputStream.write(buffer, 0, read);
			}

			outputStream.close();
			inputStream.close();

			return outputStream.toString("iso-8859-1");
		}
		catch (final IOException e) {
			XtendLog.logError(e);
			return "";
		}
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(final IWorkbench workbench, final IStructuredSelection selection) {
	}

	public void setInitializationData(final IConfigurationElement config, final String propertyName, final Object data)
			throws CoreException {
		this.configElement = config;
	}
}