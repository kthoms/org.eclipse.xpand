/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
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
		String value = Platform.getDebugOption("org.eclipse.internal.xtend.emftools/trace");
		if (value != null && value.equals("true")) {
			trace = true;
		}
	}
	
	public ProjectAnalyzer getProjectAnalyzer(IProject p) {
		IJavaProject jp = JavaCore.create(p);
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
		public void resourceChanged(IResourceChangeEvent event) {
			try {
				// under special circumstances (e.g. renaming a project) the
				// event.getDelta() can be null. Avoid NPE.
				if (event.getDelta() == null)
					return;

				// collect changed projects. only ecore files and jars in the classpath are relevant
				final Set<IProject> changedProjects = new HashSet<IProject>();
				event.getDelta().accept(new IResourceDeltaVisitor() {
					public boolean visit(IResourceDelta delta) throws CoreException {
						if ((isEcoreFile(delta.getResource()) || isJarFile(delta.getResource())) &&
								JavaCore.create(delta.getResource().getProject()).isOnClasspath(delta.getResource())) {
							changedProjects.add(delta.getResource().getProject());
						}
						return true;
					}
				});

				analyzeAndRebuildProjects(changedProjects);
			} catch (CoreException e) {
				EmfToolsLog.logError(e);
			}
		}		
	};

	private final IElementChangedListener classpathListener = new IElementChangedListener() {
		public void elementChanged(ElementChangedEvent event) {
			Set<IProject> projects = new HashSet<IProject>();
			collectChangedProjects(event.getDelta(), projects);
			analyzeAndRebuildProjects(projects);
		}

		private void collectChangedProjects(IJavaElementDelta delta, Set<IProject> projects) {
			// we're interested in classpath changes. classpath reordering is
			// not of interest since we wont find any other metamodels than
			// before
			if ((delta.getFlags() & IJavaElementDelta.F_ADDED_TO_CLASSPATH) != 0
					|| (delta.getFlags() & IJavaElementDelta.F_REMOVED_FROM_CLASSPATH) != 0
					|| (delta.getFlags() & IJavaElementDelta.F_CLASSPATH_CHANGED) != 0) {
				IJavaProject javaProject = delta.getElement().getJavaProject();
				if (javaProject != null) {
					projects.add(javaProject.getProject());
				}
			}
			for (IJavaElementDelta d : delta.getAffectedChildren()) {
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

		// traverse all oaw projects in workspace and analyze their MMs in classpath
		for (IProject p : workspace.getRoot().getProjects()) {
			if (Activator.getExtXptModelManager().findProject(p) != null) {
				ProjectAnalyzer pa = getProjectAnalyzer(p);
				if (pa!=null) {
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
	 * @return The metamodels for the given project. An empty array if none
	 *         are accessible.
	 */
	public EPackage[] getMetamodelsForProject(IJavaProject project) {
		ProjectAnalyzer projectAnalyzer = getProjectAnalyzer(project.getProject());
		if (projectAnalyzer == null) {
			return new EPackage[0];
		}
		// wait if analyzation is currently executed
		while (projectAnalyzer.getState() == Job.RUNNING ||
				projectAnalyzer.getState() == Job.WAITING) {
			try {
				Thread.sleep(500l);
				if (EmfToolsPlugin.trace)
					System.out.println("Waiting 500ms for ProjectAnalyzer of project " + project.getProject().getName() + " to finish.");				
			} catch (InterruptedException e) {
				EmfToolsLog.logError(e);
			}
		}
		Map<String, EPackage> packages = new HashMap<String, EPackage>(projectAnalyzer.getNamedEPackageMap());
		try {
			for (IProject p : project.getProject().getReferencedProjects()) {
				IJavaProject jp = JavaCore.create(p);
				EPackage[] ps = getMetamodelsForProject(jp);
				for (EPackage package1 : ps) {
					if (!packages.containsKey(package1.getNsURI())) {
						packages.put(package1.getNsURI(), package1);
					}
				}
			}
		} catch (CoreException e) {
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
		return f instanceof IFile && !f.isDerived()	&& "jar".equalsIgnoreCase(f.getFileExtension());
	}

	/**
	 * Finds oaw projects that depend on the given project, recursively. Uses a Map to collect projects
	 * since sometimes the same project is referenced through different IProject objects.
	 */
	private void collectReferencingExtXptProjects(IProject project, Map<String, IProject> referencingProjects) {
		for (IProject p : project.getReferencingProjects()) {
			if (Activator.getExtXptModelManager().findProject(p) != null) {
				referencingProjects.put(p.getName(), p);
			}
			collectReferencingExtXptProjects(p, referencingProjects);
		}
	}

	/**
	 * Analyzes the given projects, finds all oaw projects that depend on these, and rebuild those.
	 * The given projects themselves are built in their ProjectAnalyers
	 *  
	 * @param projects The projects to analyze.
	 */
	private void analyzeAndRebuildProjects(Set<IProject> projects) {
		Map<String, IProject> referencingProjects = new HashMap<String, IProject>();
		for (IProject p : projects) {
			ProjectAnalyzer pa = getProjectAnalyzer(p);
			if (pa!=null) {
				if (pa.getState() != Job.WAITING) {
					pa.schedule();
				}
			}
			collectReferencingExtXptProjects(p, referencingProjects);
		}
		// remove those projects that we just analyzed. they will be built in their ProjectAnalyzer.
		// so we shouldn't start another builder here.
		ArrayList<IProject> relevantProjects = new ArrayList<IProject>(referencingProjects.values());
		relevantProjects.removeAll(projects);
		for (IProject refProject : relevantProjects) {
			new BuildJob(refProject).schedule();
		}
	}
}
