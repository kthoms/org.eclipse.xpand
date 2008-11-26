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

package org.eclipse.xtend.typesystem.uml2.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.shared.ui.MetamodelContainer;
import org.eclipse.xtend.shared.ui.MetamodelContributor;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.uml2.UML2MetaModel;
import org.eclipse.xtend.typesystem.uml2.profile.ProfileMetaModel;

public class Uml2MetamodelContributor implements MetamodelContributor {

	public Uml2MetamodelContributor() {
	}

	private static Map<IJavaProject,MetamodelContainer> metamodels = new HashMap<IJavaProject,MetamodelContainer>();

	public MetaModel[] getMetamodels(IJavaProject project, TypeSystem builtin) {
        MetamodelContainer container = metamodels.get(project);
		if (container == null || container.hasChanged()) {
			if (container!=null) {
				metamodels.remove(project);
				JavaCore.removeElementChangedListener(container);
				ResourcesPlugin.getWorkspace().removeResourceChangeListener(container);
			}
			Map<Profile,MetaModel> result = new HashMap<Profile,MetaModel>();
			List<IJavaProject> projects = new ArrayList<IJavaProject>();
			projects.add(project);
			
			try {
				IProject[] ps = project.getProject().getReferencedProjects();
				for (int i = 0; i < ps.length; i++) {
					IProject p = ps[i];
					IJavaProject jp = JavaCore.create(p);
					if (jp!=null) {
						projects.add(jp);
					}
				}
			} catch (CoreException e1) {
				Uml2AdapterLog.logError(e1);
			}
			
			
			Set<IResource> resources = new HashSet<IResource>();
			Map<IResource, Profile> models = Uml2AdapterPlugin.getFileModels();
			if (!models.isEmpty()) {
				
				Set<IJavaProject> jps = new HashSet<IJavaProject>();
				for (Iterator<IResource> iter = models.keySet().iterator(); iter.hasNext();) {
					IFile f = (IFile) iter.next();
					if (project.isOnClasspath(f) || isOnProjectsClasspath(f,jps)) {
                  Profile profile = (Profile) models.get(f);
						result.put(profile, new ProfileMetaModel(profile));
						resources.add(f);
					}
				}
			}
            container = new MetamodelContainer(projects, resources, new HashSet<MetaModel>(result.values()));
			JavaCore.addElementChangedListener(container);
			ResourcesPlugin.getWorkspace().addResourceChangeListener(container);
			metamodels.put(project, container);
		}
        List<MetaModel> all = new ArrayList<MetaModel>();
        all.add(new UML2MetaModel());
        all.addAll(container.getMetaModels());
        return all.toArray(new MetaModel[all.size()]);
	}

	private boolean isOnProjectsClasspath(IFile f, Set<IJavaProject> jps) {
		for (Iterator<IJavaProject> iter = jps.iterator(); iter.hasNext();) {
			IJavaProject element = (IJavaProject) iter.next();
			if (element.isOnClasspath(f)) {
				return true;
			}
		}
		return false;
	}
}
