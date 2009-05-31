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
package org.eclipse.xtend.shared.ui.core.builder;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

public class XtendXpandNatureUtil {

	public final static boolean addExtXptNature(final IProject project) {
		try {
			final IProjectDescription description = project.getDescription();
			final String[] natures = description.getNatureIds();

			boolean containsNature = false;
			for (int i = 0; i < natures.length; ++i) {
				if (XtendXpandNature.NATURE_ID.equals(natures[i])) {
					containsNature = true;
				}
			}
			if (!containsNature) {
				// Add the nature
				final String[] newNatures = new String[natures.length + 1];
				System.arraycopy(natures, 0, newNatures, 0, natures.length);
				newNatures[natures.length] = XtendXpandNature.NATURE_ID;
				description.setNatureIds(newNatures);
				project.setDescription(description, null);
				try {
					PlatformUI.getWorkbench().getProgressService().busyCursorWhile(new IRunnableWithProgress() {
						public void run(final IProgressMonitor monitor) throws InvocationTargetException {
							try {
								project.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
							}
							catch (final CoreException e) {
								throw new InvocationTargetException(e);
							}
						}
					});
				}
				catch (final InvocationTargetException e) {
					XtendLog.logError(e);
				}
				catch (final InterruptedException e) {
					XtendLog.logError(e);
				}
				return true;
			}
		}
		catch (final CoreException e) {
			XtendLog.logError(e);
		}
		return false;
	}

	public final static boolean removeExtXptNature(final IProject project) {
		try {
			final IProjectDescription description = project.getDescription();
			final String[] natures = description.getNatureIds();
			for (int i = 0; i < natures.length; ++i) {
				if (XtendXpandNature.NATURE_ID.equals(natures[i])) {
					// Remove the nature
					final String[] newNatures = new String[natures.length - 1];
					System.arraycopy(natures, 0, newNatures, 0, i);
					System.arraycopy(natures, i + 1, newNatures, i, natures.length - i - 1);
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
					try {
						new WorkspaceModifyOperation() {
							@Override
							protected void execute(final IProgressMonitor monitor) throws CoreException,
									InvocationTargetException, InterruptedException {
								XtendXpandMarkerManager.deleteMarkers(project);
							}
						}.run(new NullProgressMonitor());
					}
					catch (final InvocationTargetException e) {
						XtendLog.logError(e);
					}
					catch (final InterruptedException e) {
						XtendLog.logError(e);
					}
					return true;
				}
			}
		}
		catch (final CoreException e) {
			XtendLog.logError(e);
		}
		return false;
	}
}
