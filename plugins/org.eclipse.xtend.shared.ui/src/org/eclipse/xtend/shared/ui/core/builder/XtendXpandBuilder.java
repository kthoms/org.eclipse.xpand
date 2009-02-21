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

package org.eclipse.xtend.shared.ui.core.builder;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.JarPackageFragmentRoot;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.ResourceContributor;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.core.internal.JDTUtil;
import org.eclipse.xtend.shared.ui.core.internal.ResourceID;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

public class XtendXpandBuilder extends IncrementalProjectBuilder {

	class XtendXpandDeltaVisitor implements IResourceDeltaVisitor, IResourceVisitor {
		private final IProgressMonitor monitor;
		private final Set<String> extensions;

		public XtendXpandDeltaVisitor(final IProgressMonitor monitor) {
			this.monitor = monitor;
			extensions = new HashSet<String>();
			final ResourceContributor[] contributors = Activator.getRegisteredResourceContributors();
			for (final ResourceContributor resourceContributor : contributors) {
				extensions.add(resourceContributor.getFileExtension());
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.core.resources.IResourceDeltaVisitor#visit(org.eclipse
		 * .core.resources.IResourceDelta)
		 */
		public boolean visit(final IResourceDelta delta) throws CoreException {
			final IResource resource = delta.getResource();
			if (isXtendXpandResource(resource)) {
				switch (delta.getKind()) {
					case IResourceDelta.ADDED:
						// handle added resource
						XtendXpandMarkerManager.deleteMarkers(resource);
						reloadResource((IFile) resource);
						break;
					case IResourceDelta.REMOVED:
						// handle removed resource
						handleRemovement((IFile) resource);
						break;
					case IResourceDelta.CHANGED:
						// handle changed resource
						reloadResource((IFile) resource);
						break;
				}
			}
			monitor.worked(1);
			return true;
		}

		private boolean isXtendXpandResource(final IResource resource) {
			return resource instanceof IFile && extensions.contains(((IFile) resource).getFileExtension())
					&& isOnJavaClassPath(resource);
		}

		public boolean visit(final IResource resource) {
			if (isXtendXpandResource(resource)) {
				reloadResource((IFile) resource);
			}
			monitor.worked(1);
			return true;
		}

	}

	boolean isOnJavaClassPath(final IResource resource) {
		final IJavaProject jp = JavaCore.create(resource.getProject());
		if (jp != null)
			return jp.isOnClasspath(resource);
		return false;
	}

	public static final String getBUILDER_ID() {
		return Activator.getId() + ".xtendBuilder";
	}

	private Set<IXtendXpandResource> toAnalyze = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.internal.events.InternalBuilder#build(int,
	 * java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IProject[] build(final int kind, final Map args, final IProgressMonitor monitor) throws CoreException {
		toAnalyze = new HashSet<IXtendXpandResource>();
		try {
			if (kind == FULL_BUILD) {
				fullBuild(monitor);
			}
			else {
				final IResourceDelta delta = getDelta(getProject());
				if (delta == null) {
					fullBuild(monitor);
				}
				else {
					incrementalBuild(delta, monitor);
				}
			}
		}
		catch (final Throwable e) {
			e.printStackTrace();
		}
		for (final Object name : toAnalyze) {
			final IXtendXpandResource res = (IXtendXpandResource) name;
			final IStorage underlyingStorage = res.getUnderlyingStorage();
			if (underlyingStorage instanceof IResource) {
				final IResource resource = (IResource) underlyingStorage;
				final IProject project = resource.getProject();
				if (project.isLinked()) {
					continue;
				}
			}
			res.analyze();
		}
		final IXtendXpandProject p = Activator.getExtXptModelManager().findProject(getProject());
		p.analyze(monitor);
		return null;
	}

	void reloadResource(final IFile resource) {
		if (resource.exists()) {
			final IXtendXpandProject project = Activator.getExtXptModelManager().findProject(resource);
			if (project != null) {
				final IXtendXpandResource r = project.findXtendXpandResource(resource);
				if (r != null) {
					if (r.refresh()) {
						resource.getLocalTimeStamp();
					}
					toAnalyze.add(r);
				}
			}
		}
	}

	public void handleRemovement(final IFile resource) {
		final IXtendXpandProject project = Activator.getExtXptModelManager().findProject(resource);
		if (project != null) {
			project.unregisterXtendXpandResource(project.findXtendXpandResource(resource));
		}
		else {
			XtendLog.logInfo("No Xpand project found for " + resource.getProject().getName());
		}
	}

	protected void fullBuild(final IProgressMonitor monitor) throws CoreException {
		final IXtendXpandProject project = Activator.getExtXptModelManager().findProject(getProject().getFullPath());
		if (project != null) {
			getProject().accept(new XtendXpandDeltaVisitor(monitor));
			final IJavaProject jp = JavaCore.create(getProject());
			final IPackageFragmentRoot[] roots = jp.getPackageFragmentRoots();
			final Set<String> extensions = new HashSet<String>();
			final ResourceContributor[] contributors = Activator.getRegisteredResourceContributors();
			for (final ResourceContributor resourceContributor : contributors) {
				extensions.add(resourceContributor.getFileExtension());
			}
			for (final IPackageFragmentRoot root : roots) {
				if (root.isArchive()) {
					root.open(monitor);
					try {
						final ZipFile zip = ((JarPackageFragmentRoot) root).getJar();
						final Enumeration<? extends ZipEntry> entries = zip.entries();
						while (entries.hasMoreElements()) {
							final ZipEntry entry = entries.nextElement();
							for (final String ext : extensions) {
								final String name = entry.getName();
								if (name.endsWith(ext)) {
									final String fqn = name.substring(0, name.length() - ext.length() - 1).replaceAll(
											"/", "::");
									final ResourceID resourceID = new ResourceID(fqn, ext);
									final IStorage findStorage = JDTUtil.loadFromJar(resourceID, root);
									project.findXtendXpandResource(findStorage);
								}
							}
						}
					}
					finally {
						root.close();
					}
				}
			}
		}
		else {
			XtendLog.logInfo("Couldn't create Xpand project for project " + getProject().getName());
		}
	}

	protected void incrementalBuild(final IResourceDelta delta, final IProgressMonitor monitor) throws CoreException {
		final XtendXpandDeltaVisitor visitor = new XtendXpandDeltaVisitor(monitor);
		delta.accept(visitor);
	}
}
