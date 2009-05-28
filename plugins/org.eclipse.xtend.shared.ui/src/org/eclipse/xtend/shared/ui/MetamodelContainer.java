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

package org.eclipse.xtend.shared.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend.shared.ui.internal.XtendLog;
import org.eclipse.xtend.typesystem.MetaModel;

public class MetamodelContainer implements IElementChangedListener, IResourceChangeListener {

	List<IJavaProject> projects;

	boolean changed = false;

	private final Set<MetaModel> metaModels;

	Set<IResource> resources;

	public MetamodelContainer(final List<IJavaProject> project, final Set<IResource> resource,
			final Set<MetaModel> metamodels) {
		projects = project;
		metaModels = metamodels;
		resources = resource;
	}

	public void elementChanged(final ElementChangedEvent event) {
		for (final Iterator<IJavaProject> iter = projects.iterator(); !changed && iter.hasNext();) {
			final IJavaProject project = iter.next();
			if (project.isOnClasspath(event.getDelta().getElement())) {
				changed = true;
			}
		}
	}

	public boolean hasChanged() {
		return changed;
	}

	public Set<MetaModel> getMetaModels() {
		return metaModels;
	}

	public void resourceChanged(final IResourceChangeEvent event) {
		if (changed)
			return;
		// we are only interested in POST_CHANGE events
		if (event.getType() != IResourceChangeEvent.POST_CHANGE)
			return;
		final IResourceDelta rootDelta = event.getDelta();
		try {
			rootDelta.accept(new IResourceDeltaVisitor() {

				public boolean visit(final IResourceDelta delta) throws CoreException {
					if (!changed && delta.getResource() != null) {
						if (resources.contains(delta.getResource())) {
							changed = true;
						}
						if (delta.getResource() instanceof IProject) {
							for (final Iterator<IJavaProject> iter = projects.iterator(); !changed && iter.hasNext();) {
								final IJavaProject project = iter.next();
								if (project.getProject().equals(delta.getResource())) {
									changed = true;
								}
							}
						}
					}
					return true;
				}
			});
		}
		catch (final CoreException e) {
			XtendLog.logError(e);
		}
	}

}
