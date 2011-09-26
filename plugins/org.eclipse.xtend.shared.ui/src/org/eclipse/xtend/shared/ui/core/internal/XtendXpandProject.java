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

package org.eclipse.xtend.shared.ui.core.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.IJarEntryResource;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.ResourceContributor;
import org.eclipse.xtend.shared.ui.core.AbstractResource;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.IXtendXpandResource;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandBuilder;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandMarkerManager;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandNature;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

public class XtendXpandProject implements IXtendXpandProject {

	private static final Set<IJavaProject> initializing = new HashSet<IJavaProject>();
	private static final IXtendXpandResource NULL_RESOURCE = new AbstractResource(null) {
		public String getFileExtension() { return null; }
		@Override
		protected void analyze(ExecutionContext ctx, Set<AnalysationIssue> issues) {}
		@Override
		protected boolean internalRefresh() { return false; }
	};

	final IJavaProject project;

	public XtendXpandProject(final IJavaProject resource) {
		project = resource;
		try {
			final IProject[] ps = project.getProject().getReferencedProjects();
			for (int i = 0; i < ps.length; i++) {
				if (initializing.add(project)) {
					try {
						Activator.getExtXptModelManager().findProject(ps[i]);
					}
					finally {
						initializing.remove(project);
					}
				}
			}
		}
		catch (final CoreException e) {
			XtendLog.logError(e);
		}
		JavaCore.addElementChangedListener(new IElementChangedListener() {

			public void elementChanged(ElementChangedEvent event) {
				if (fromJar.isEmpty())
					return;
				if (containsRemovedClassPathEntry(event.getDelta().getAffectedChildren()))
					removeResourcesFromJar();
			}
		}, ElementChangedEvent.POST_CHANGE);

		Job j = new Job("Initializing " + project.getElementName()) {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				try {
					final IProject p = project.getProject();
					if (p.isAccessible() && p.isNatureEnabled(XtendXpandNature.NATURE_ID)) {
						p.build(IncrementalProjectBuilder.CLEAN_BUILD, XtendXpandBuilder.getBUILDER_ID(),
								new HashMap<String, String>(), monitor);
					}
				}
				catch (final CoreException e) {
					XtendLog.logError(e);
				}
				return Status.OK_STATUS;
			}
		};
		j.setRule(project.getResource().getWorkspace().getRuleFactory().buildRule());
		j.schedule();
	}

	protected boolean containsRemovedClassPathEntry(IJavaElementDelta[] affectedChildren) {
		for (int i = 0; i < affectedChildren.length; i++) {
			IJavaElementDelta delta = affectedChildren[i];
			if ((delta.getFlags() & IJavaElementDelta.F_REMOVED_FROM_CLASSPATH) != 0) {
				return true;
			}
			if (containsRemovedClassPathEntry(delta.getAffectedChildren())) {
				return true;
			}
		}
		return false;
	}

	protected void removeResourcesFromJar() {
		for (ResourceID id : fromJar) {
			for(Map<ResourceID, IXtendXpandResource> values : resources.values()){
				if(values.remove(id) != null){
					break;
				}
			}
		}
	}

	private final Map<String, Map<ResourceID, IXtendXpandResource>> resources = new HashMap<String, Map<ResourceID, IXtendXpandResource>>();

	private final Set<ResourceID> fromJar = new HashSet<ResourceID>();

	/**
	 * @see IXtendXpandProject#getRegisteredResources()
	 */
	public IXtendXpandResource[] getRegisteredResources() {
		List<IXtendXpandResource> result = new ArrayList<IXtendXpandResource>();
		int size = 0;
		Collection<Map<ResourceID, IXtendXpandResource>> values = resources.values();
		for(Map<ResourceID, IXtendXpandResource> value : values){
			size = size + value.values().size();
			result.addAll(value.values());
		}
		return result.toArray(new IXtendXpandResource[size]);
	}

	/**
	 * @see IXtendXpandProject#getAllRegisteredResources()
	 */
	public IXtendXpandResource[] getAllRegisteredResources() {
		Set<IXtendXpandResource> result = new HashSet<IXtendXpandResource>();
		result.addAll(Arrays.asList(getRegisteredResources()));
		for (IXtendXpandProject p : getAllReferencedProjects()) {
			result.addAll(Arrays.asList(p.getRegisteredResources()));
		}
		return result.toArray(new IXtendXpandResource[result.size()]);
	}

	/**
	 * @see IXtendXpandProject#getReferencedProjects()
	 */
	public IXtendXpandProject[] getReferencedProjects() {
		Set<IXtendXpandProject> result = new HashSet<IXtendXpandProject>();
		try {
			IProject[] projects = getProject().getProject().getReferencedProjects();
			for (IProject project : projects) {
				IXtendXpandProject p = Activator.getExtXptModelManager().findProject(project);
				if (p != null)
					result.add(p);
			}
		}
		catch (CoreException e) {
			XtendLog.logError(e);
		}
		return result.toArray(new IXtendXpandProject[result.size()]);
	}

	/**
	 * @see IXtendXpandProject#getAllReferencedProjects()
	 */
	public IXtendXpandProject[] getAllReferencedProjects() {
		Set<IXtendXpandProject> result = new HashSet<IXtendXpandProject>();
		IXtendXpandProject[] projects = getReferencedProjects();
		result.addAll(Arrays.asList(projects));
		for (IXtendXpandProject project : projects) {
			result.addAll(Arrays.asList(project.getAllReferencedProjects()));
		}
		return result.toArray(new IXtendXpandProject[result.size()]);
	}

	public IJavaProject getProject() {
		return project;
	}

	/**
	 * @see IXtendXpandProject#unregisterXtendXpandResource(IXtendXpandResource)
	 */
	public void unregisterXtendXpandResource(final IXtendXpandResource res) {
		if (res != null) {
			if (res.getUnderlyingStorage() instanceof IFile){
				IFile file = (IFile)res.getUnderlyingStorage();
				XtendXpandMarkerManager.deleteMarkers(file);
				for(Map<ResourceID, IXtendXpandResource> values : resources.values()){
					if(values.remove(Activator.findXtendXpandResourceID(project, file)) != null){
						break;
					}
				}
			}
		}
	}

	/**
	 * @see IXtendXpandProject#findExtXptResource(String, String)
	 */
	public IXtendXpandResource findExtXptResource(final String fqn, final String extension) {
		assert (fqn != null);
		assert (extension != null);
		
		if (Activator.getRegisteredResourceContributorFor(extension) == null)
			return null;
		// for performance reasons ask the cache first
		IXtendXpandResource res = findCachedXtendXpandResource(fqn, extension);
		if (res == NULL_RESOURCE)
			return null;
		if (res != null){
			// ignore stale resources, i.e., resources corresponding to workspace resources that don't exist anymore  
			if (res.getUnderlyingStorage() instanceof IFile) {
				IFile workspaceFile = (IFile)res.getUnderlyingStorage();
				if (!workspaceFile.exists()) {
					return null;
				}
			}
			return res;
		}
		// ask to load the resource without looking into jars
		res = loadXtendXpandResource(fqn, extension, false);
		if (res != null)
			return res;
		// look into jars
		res = loadXtendXpandResource(fqn, extension, true);
		//caching NULL_RESOURCE
		if (res == null) {
			Map<ResourceID, IXtendXpandResource> map = new HashMap<ResourceID, IXtendXpandResource>();
			map.put(new ResourceID(fqn, extension), NULL_RESOURCE);
			resources.put(fqn, map);
		}
		return res;
	}

	/**
	 *
	 * @param fqn
	 *            Full qualified name of the searched resource
	 * @param extension
	 * @return The cached resource or <code>null</code> if the resource is not
	 *         known
	 */
	private IXtendXpandResource findCachedXtendXpandResource(String fqn, String extension) {
		// fqn is a simple name
		Map<ResourceID, IXtendXpandResource> map = resources.get(fqn);
		if(map != null){
			if(map.entrySet().size() == 1){
				return map.values().iterator().next();
			}else{
				List<ResourceID> idsWithSameExtension = new ArrayList<ResourceID>();
				for(ResourceID id : map.keySet()){
					if(extension.equals(id.extension)){
						idsWithSameExtension.add(id);
					}
				}
				if(idsWithSameExtension.size() == 1){
					return map.get(idsWithSameExtension.get(0));
				}
				return null;
			}
		}
		
		// fqn is a qualified name
		ResourceID searchedID = new ResourceID(fqn, extension);
		for(Map<ResourceID, IXtendXpandResource> values : resources.values()){
			if(values.containsKey(searchedID)){
				return values.get(searchedID);
			}
		}
		return null;
	}

	/**
	 * Loads an Xtend Resource. Searches the project and all referenced projects.
	 *
	 * @param fqn
	 *            Qualified name of the resource, e.g. '<tt>org::eclipse::xtend::util::stdlib::io.ext'
	 * @param extension
	 *            The resource's file extension
	 * @param searchJars
	 *            <tt>true</tt> search also in referenced Jar files on the
	 *            classpath
	 * @return The resource or <code>null</code> if not found
	 */
	private IXtendXpandResource loadXtendXpandResource(final String fqn, final String extension, boolean searchJars) {
		return loadXtendXpandResource(fqn, extension, searchJars, new HashSet<XtendXpandProject>(5));
	}

	private IXtendXpandResource loadXtendXpandResource(final String fqn, final String extension, boolean searchJars, Set<XtendXpandProject> projects) {
		assert (fqn != null);
		assert (extension != null);

		// prevent stackoverflow with recursive project dependencies and resources that could not be found
		if (!projects.add(this))
			return null;

		// search the resource. ResourceFinder can be registered using the extension point org.eclipse.xtend.shared.ui.storageFinder
		IStorage storage = Activator.findStorage(project, new ResourceID(fqn, extension), searchJars);

		// Found in this project?
		if (storage != null && (searchJars || (storage instanceof IFile))) {
			//Find out if the storage is already under another key in the cache
			ResourceID jdtResourceID = JDTUtil.findXtendXpandResourceID(getProject(), storage);
			Map<ResourceID, IXtendXpandResource> resourcesWithSameResourceID = resources.get(jdtResourceID);
			IXtendXpandResource result = null;
			if (resourcesWithSameResourceID != null){
				result = resourcesWithSameResourceID.get(jdtResourceID);
			}
			//if the storage is already in cache with another resourceID return this xtendXpandResource
			if (result!=null&&result.getUnderlyingStorage()!=null){
				cacheXtendXpandResource(storage, result);
				return result;
			}
			
			// get the file extension and find the appropriate
			// ResourceContributor for this
			// kind of resource (Xpand/Xtend)
			String fileExtension = storage.getFullPath().getFileExtension();
			final ResourceContributor contr = Activator.getRegisteredResourceContributorFor(fileExtension);

			// we have a registered contributor for this resource
			if (contr != null) {
				// load the resource using the ResourceContributor
				result = contr.create(storage, fqn);
				if (result != null) {
					// cache this resource
					cacheXtendXpandResource(storage, result);
					// remember, because we need to clean the cache, if
					// a jar has been removed
					if (!(storage instanceof IFile)) {
						fromJar.add(new ResourceID(fqn, extension));
					}
					return result;
				}
			}
		}

		// if reached here then the resource was not found in the current
		// project.
		// Now we perform the same search on all referenced projects.
		try {
			final IProject[] p = project.getProject().getReferencedProjects();
			for (int i = 0; i < p.length; i++) {
				IProject project = p[i];
				final XtendXpandProject extxptp = (XtendXpandProject) Activator.getExtXptModelManager().findProject(
						project);
				if (extxptp != null) {
					IXtendXpandResource result = extxptp.loadXtendXpandResource(fqn, extension, searchJars, projects);
					if (result != null) {
						// cache this resource
						cacheXtendXpandResource(storage, result);
						return result;
					}
				}
			}
		}
		catch (final CoreException e) {
			XtendLog.logError(e);
		}
		return null;
	}
	
	private void cacheXtendXpandResource(IStorage storage, IXtendXpandResource result) {
		String baseName = storage.getName().substring(0, storage.getName().lastIndexOf("."));
		Map<ResourceID, IXtendXpandResource> resourcesWithSameBaseName = resources.get(baseName);
		if (resourcesWithSameBaseName == null) {
			resourcesWithSameBaseName = new HashMap<ResourceID, IXtendXpandResource>();
			resources.put(baseName, resourcesWithSameBaseName);
		}
		resourcesWithSameBaseName.put(Activator.findXtendXpandResourceID(project, storage), result);
	}
	
	/**
	 * @see IXtendXpandProject#findExtXptResource(IPath, boolean)
	 */
	public IXtendXpandResource findXtendXpandResource(final IStorage file) {
		if (file == null)
			return null;
		
		// search the resource ID using storage finders. New resource finders can be registered using the extension point org.eclipse.xtend.shared.ui.storageFinder
		ResourceID id =  Activator.findXtendXpandResourceID(project, file);
		if (id == null) {
			return null;
		}
		return findExtXptResource(id.name, id.extension);
	}

	/**
	 * @see IXtendXpandProject#analyze(IProgressMonitor)
	 */
	public void analyze(final IProgressMonitor monitor, ExecutionContext ctx) {
		int size = 0;
		Collection<Map<ResourceID, IXtendXpandResource>> resourceValues = resources.values();
		for(Map<ResourceID, IXtendXpandResource> value : resourceValues){
			size = size + value.values().size();
		}
//		monitor.subTask("analyzing project "+this.toString());
		monitor.beginTask("analyzing project "+this.toString(), size);
		for (final Iterator<IXtendXpandResource> iter = Arrays.asList(getRegisteredResources())
				.iterator(); iter.hasNext();) {
			if (monitor.isCanceled())
				return;

			IXtendXpandResource resource = iter.next();
			synchronized (resource) {
				if (!isInExternalPackageFragmentRoot(resource)) {
					resource.analyze(ctx);
				}
			}
			monitor.worked(1);
		}
	}

	private boolean isInExternalPackageFragmentRoot(IXtendXpandResource resource) {
		IStorage underlyingStorage = resource.getUnderlyingStorage();
		IProject containerProject = null;
		if (underlyingStorage instanceof IJarEntryResource) {
			containerProject = ((IJarEntryResource) underlyingStorage).getPackageFragmentRoot().getJavaProject()
					.getProject();
		}
		if (underlyingStorage instanceof IFile) {
			containerProject = ((IFile) underlyingStorage).getProject();
		}
		return (containerProject != null) && containerProject.isHidden();
	}

	/**
	 * Returns the name of the underlying project.
	 */
	@Override
	public String toString() {
		return project.getPath().toString();
	}

}
