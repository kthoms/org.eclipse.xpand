/*******************************************************************************
 * Copyright (c) 2005 - 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.xsd.ui;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandBuilder;
import org.eclipse.xtend.typesystem.xsd.builder.XSDManager;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class XSDBuilderConfigurator {
	private class PreferenceChangeListener implements IResourceChangeListener,
			IResourceDeltaVisitor {

		public void resourceChanged(IResourceChangeEvent event) {
			try {
				event.getDelta().accept(this);
			} catch (CoreException e) {
//				OawLog.logError(e);
				throw new RuntimeException(e);
			}

		}

		public boolean visit(IResourceDelta delta) throws CoreException {
			IResource res = delta.getResource();

			if (res.getProject() != null && !res.getProject().isAccessible()) {
				XSDMetamodelStore s = XSDToolsPlugin.getDefault().getXSDStore();
				XSDManager m = s.getXSDManager(res.getProject());
				if (m != null)
					m.clear();
				return false;
			}

			if (res.isAccessible() && ".settings".equals(res.getName())) {
				IProject proj = res.getProject();
				if (XSDToolsPlugin.isXSDProject(proj))
					addBuilder(proj);
				else
					removeBuilder(proj);
			}
			return true;
		}

	}

	private PreferenceChangeListener listener = new PreferenceChangeListener();

	private void addBuilder(IProject project) {
		IProjectDescription desc;
		try {
			desc = project.getDescription();
			ICommand[] commands = desc.getBuildSpec();

			int idx = commands.length;
			for (int i = 0; i < commands.length; ++i) {
				String n = commands[i].getBuilderName();
				if (n.equals(XSDBuilder.ID))
					return;
				if (n.equals(XtendXpandBuilder.getBUILDER_ID()))
					idx = i;
			}

			ICommand[] newCommands = new ICommand[commands.length + 1];
			System.arraycopy(commands, 0, newCommands, 0, idx);
			System.arraycopy(commands, idx, newCommands, idx + 1,
					commands.length - idx);
			ICommand command = desc.newCommand();
			command.setBuilderName(XSDBuilder.ID);
			newCommands[idx] = command;
			desc.setBuildSpec(newCommands);
			project.setDescription(desc, null);
			XSDToolsPlugin.traceLog("Added XSD Builder to Project "
					+ project.getName());
		} catch (CoreException e) {
//			OawLog.logError(e);
			throw new RuntimeException(e);
		}
	}

	private void configureAllBuilders() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProject[] projects = workspace.getRoot().getProjects();
		for (IProject proj : projects)
			if (proj.isOpen()) {
				if (XSDToolsPlugin.isXSDProject(proj))
					addBuilder(proj);
				else
					removeBuilder(proj);
			}
	}

	private void removeBuilder(IProject project) {
		IProjectDescription description;
		try {
			description = project.getDescription();
			ICommand[] commands = description.getBuildSpec();
			for (int i = 0; i < commands.length; ++i) {
				if (commands[i].getBuilderName().equals(XSDBuilder.ID)) {
					ICommand[] newCommands = new ICommand[commands.length - 1];
					System.arraycopy(commands, 0, newCommands, 0, i);
					System.arraycopy(commands, i + 1, newCommands, i,
							commands.length - i - 1);
					description.setBuildSpec(newCommands);
					project.setDescription(description, null);
					XSDToolsPlugin.traceLog("Removed XSD Builder from Project "
							+ project.getName());
					return;
				}
			}
		} catch (CoreException e) {
//			OawLog.logError(e);
			throw new RuntimeException(e);
		}
	}

	public void start() {
		configureAllBuilders();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(listener,
				IResourceChangeEvent.PRE_BUILD);
	}

	public void stop() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(listener);
	}
}
