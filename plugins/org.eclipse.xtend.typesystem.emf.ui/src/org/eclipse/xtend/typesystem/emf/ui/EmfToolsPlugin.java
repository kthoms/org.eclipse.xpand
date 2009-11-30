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

package org.eclipse.xtend.typesystem.emf.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.typesystem.emf.ui.internal.EmfToolsLog;
import org.osgi.framework.BundleContext;

public class EmfToolsPlugin extends AbstractUIPlugin {

	// The shared instance.
	private static EmfToolsPlugin plugin;

	// project analyzer per project
	private final Map<IJavaProject, ProjectAnalyzer> projectAnalyzerCache = new HashMap<IJavaProject, ProjectAnalyzer>();

	// get trace state
	public static boolean trace = false;
	static {
		final String value = Platform.getDebugOption("org.eclipse.internal.xtend.emftools/trace");
		if (value != null && value.equals("true")) {
			trace = true;
		}
	}

	public ProjectAnalyzer getProjectAnalyzer(final IProject p) {
		final IJavaProject jp = JavaCore.create(p);
		if (jp == null || !jp.exists())
			return null;
		ProjectAnalyzer analyzer = projectAnalyzerCache.get(jp);
		if (analyzer == null) {
			analyzer = new ProjectAnalyzer(jp);
			projectAnalyzerCache.put(jp, analyzer);
		}
		return analyzer;
	}

	private final IResourceChangeListener resourceListener = new IResourceChangeListener() {
		public void resourceChanged(final IResourceChangeEvent event) {
			try {
				// under special circumstances (e.g. renaming a project) the
				// event.getDelta() can be null. Avoid NPE.
				if (event.getDelta() == null)
					return;

				// collect changed projects. only ecore files and jars in the
				// classpath are relevant
				final Set<IProject> changedProjects = new HashSet<IProject>();
				event.getDelta().accept(new IResourceDeltaVisitor() {
					public boolean visit(final IResourceDelta delta) throws CoreException {
						if ((isEcoreFile(delta.getResource()) || isJarFile(delta.getResource()))
								&& JavaCore.create(delta.getResource().getProject()).isOnClasspath(delta.getResource())) {
							changedProjects.add(delta.getResource().getProject());
						}
						return true;
					}
				});

				analyzeAndRebuildProjects(changedProjects);
			}
			catch (final CoreException e) {
				EmfToolsLog.logError(e);
			}
		}
	};

	private final IElementChangedListener classpathListener = new IElementChangedListener() {
		public void elementChanged(final ElementChangedEvent event) {
			final Set<IProject> projects = new HashSet<IProject>();
			collectChangedProjects(event.getDelta(), projects);
			analyzeAndRebuildProjects(projects);
		}

		private void collectChangedProjects(final IJavaElementDelta delta, final Set<IProject> projects) {
			// we're interested in classpath changes. classpath reordering is
			// not of interest since we wont find any other metamodels than
			// before
			if ((delta.getFlags() & IJavaElementDelta.F_ADDED_TO_CLASSPATH) != 0
					|| (delta.getFlags() & IJavaElementDelta.F_REMOVED_FROM_CLASSPATH) != 0
					|| (delta.getFlags() & IJavaElementDelta.F_CLASSPATH_CHANGED) != 0) {
				final IJavaProject javaProject = delta.getElement().getJavaProject();
				if (javaProject != null) {
					projects.add(javaProject.getProject());
				}
			}
			for (final IJavaElementDelta d : delta.getAffectedChildren()) {
				collectChangedProjects(d, projects);
			}
		}
	};

	/**
	 * The constructor.
	 */
	public EmfToolsPlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	@Override
	public void start(final BundleContext context) throws Exception {
		super.start(context);

		final IWorkspace workspace = ResourcesPlugin.getWorkspace();

		// avoid deadlock with JDT by starting JDT's classpath resolution job
		JavaCore.initializeAfterLoad(new NullProgressMonitor());
		
		// traverse all Xpans projects in workspace and analyze their MMs in
		// classpath
		for (final IProject p : workspace.getRoot().getProjects()) {
			if (Activator.getExtXptModelManager().findProject(p) != null) {
				final ProjectAnalyzer pa = getProjectAnalyzer(p);
				if (pa != null) {
					if (pa.getState() != Job.WAITING) {
						pa.schedule();
					}
				}
			}
		}
		// add listener for contents of files which contain metamodels
		workspace.addResourceChangeListener(resourceListener);
		// add listener for changes in a project's classpath
		JavaCore.addElementChangedListener(classpathListener);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	@Override
	public void stop(final BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
		// remove listeners
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(resourceListener);
		JavaCore.removeElementChangedListener(classpathListener);
		projectAnalyzerCache.clear();
	}

	/**
	 * Retrieves the list of EPackages that are accessible for the given
	 * project, i.e. that are in the project's classpath.
	 * 
	 * @param project
	 *            The project to retrieve the metamodels for. Must not be null,
	 * @return The metamodels for the given project. An empty array if none are
	 *         accessible.
	 */
	public EPackage[] getMetamodelsForProject(final IJavaProject project) {
		final Set<String> visited = new HashSet<String>();
		return getMetamodelsForProjectInternal(project, visited);
	}

	/**
	 * Retrieves the list of EPackages that are accessible for the given
	 * project, i.e. that are in the project's classpath. The referenced
	 * projects are searched recursively, but loops are detected.
	 * 
	 * @param project
	 *            The project to retrieve the metamodels for. Must not be null.
	 * @param visited
	 *            The names of the projects that have already been visited.
	 * @return The metamodels for the given project. An empty array if none are
	 *         accessible.
	 */
	private EPackage[] getMetamodelsForProjectInternal(final IJavaProject project, final Set<String> visited) {
		if (visited.contains(project.getProject().getName()))
			return new EPackage[0];
		visited.add(project.getProject().getName());

		final ProjectAnalyzer projectAnalyzer = getProjectAnalyzer(project.getProject());
		if (projectAnalyzer == null)
			return new EPackage[0];
		// wait if analyzation is currently executed
		try {
			Job.getJobManager().join(BuildJob.FAMILY, new NullProgressMonitor());
		}
		catch (OperationCanceledException e) {
			EmfToolsLog.logError(e);
		}
		catch (InterruptedException e) {
			EmfToolsLog.logError(e);
		}

		final Map<String, EPackage> packages = new HashMap<String, EPackage>(projectAnalyzer.getNamedEPackageMap());
		try {
			for (final IProject p : project.getProject().getReferencedProjects()) {
				final IJavaProject jp = JavaCore.create(p);
				final EPackage[] ps = getMetamodelsForProjectInternal(jp, visited);
				for (final EPackage package1 : ps) {
					if (!packages.containsKey(package1.getNsURI())) {
						packages.put(package1.getNsURI(), package1);
					}
				}
			}
		}
		catch (final CoreException e) {
			EmfToolsLog.logError(e);
		}
		return packages.values().toArray(new EPackage[packages.values().size()]);
	}

	/**
	 * Returns the shared instance.
	 */
	public static EmfToolsPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path.
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(final String path) {
		return AbstractUIPlugin.imageDescriptorFromPlugin(getId(), path);
	}

	public static String getId() {
		return getDefault().getBundle().getSymbolicName();
	}

	protected boolean isEcoreFile(final IResource f) {
		return f instanceof IFile && !f.isDerived() && "ecore".equalsIgnoreCase(f.getFileExtension());
	}

	protected boolean isJarFile(final IResource f) {
		return f instanceof IFile && !f.isDerived() && "jar".equalsIgnoreCase(f.getFileExtension());
	}

	/**
	 * Finds Xpand projects that depend on the given project, recursively. Uses
	 * a Map to collect projects since sometimes the same project is referenced
	 * through different IProject objects.
	 * 
	 * @param project
	 *            The project whose referenced projects should be retrieved
	 * @param referencingProjects
	 *            Result map where the assignment of a project to its
	 *            referencing projects is stored
	 * @param visited
	 *            All project names that where already visited during this
	 *            recursion. This is to avoid loops when having circular
	 *            dependencies.
	 */
	private void collectReferencingExtXptProjects(final IProject project,
			final Map<String, IProject> referencingProjects, final Set<String> visited) {
		if (visited.contains(project.getName()))
			return;
		visited.add(project.getName());

		for (final IProject p : project.getReferencingProjects()) {
			if (Activator.getExtXptModelManager().findProject(p) != null) {
				referencingProjects.put(p.getName(), p);
			}
			collectReferencingExtXptProjects(p, referencingProjects, visited);
		}
	}

	/**
	 * Analyzes the given projects, finds all Xpand projects that depend on
	 * these, and rebuild those. The given projects themselves are built in
	 * their ProjectAnalyers
	 * 
	 * @param projects
	 *            The projects to analyze.
	 */
	private void analyzeAndRebuildProjects(final Set<IProject> projects) {
		final Map<String, IProject> referencingProjects = new HashMap<String, IProject>();
		final Set<String> visited = new HashSet<String>();
		for (final IProject p : projects) {
			final ProjectAnalyzer pa = getProjectAnalyzer(p);
			if (pa != null) {
				if (pa.getState() != Job.WAITING) {
					pa.schedule();
				}
			}
			collectReferencingExtXptProjects(p, referencingProjects, visited);
		}
		// remove those projects that we just analyzed. they will be built in
		// their ProjectAnalyzer.
		// so we shouldn't start another builder here.
		final ArrayList<IProject> relevantProjects = new ArrayList<IProject>(referencingProjects.values());
		relevantProjects.removeAll(projects);
		for (final IProject refProject : relevantProjects) {
			new BuildJob(refProject).schedule();
		}
	}
}
