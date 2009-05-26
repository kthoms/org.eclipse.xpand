/*******************************************************************************
 * Copyright (c) 2005 - 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/

package org.eclipse.xtend.typesystem.xsd.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.xsd.XSDMetaModel;
import org.eclipse.xtend.typesystem.xsd.builder.XSDManager;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class XSDMetamodelStore {

	private XSDManager manager = XSDManager.Util.createManager();
	private HashMap<IProject, XSDManager> views = new HashMap<IProject, XSDManager>();

	private void collectReferencingProjects(IProject proj, Set<IProject> refs)
			throws CoreException {
		refs.add(proj);
		for (IProject p : proj.getReferencedProjects())
			if (!refs.contains(p))
				collectReferencingProjects(p, refs);
	}

//	private Log log = XSDLog.getLog(getClass());

	public XSDMetamodelStore() {
//		log.info(Msg.create("Created new ").scls(this).txt(" for ").txt(
//				manager.toString()));
	}

	public Collection<MetaModel> getMetamodels(IProject proj) {
		try {
			ArrayList<MetaModel> result = new ArrayList<MetaModel>();
			HashSet<IProject> refs = new HashSet<IProject>();
			collectReferencingProjects(proj, refs);
			for (IProject p : refs) {
				XSDManager man = getXSDManager(p);
				if (man != null)
					result.add(new XSDMetaModel(man));
			}
			return result;
		} catch (CoreException e) {
//			OawLog.logError(e);
			throw new RuntimeException(e);
//			return Collections.emptyList();
		}
	}

	public XSDManager getXSDManager(IProject project) {
		if (!XSDToolsPlugin.isXSDProject(project))
			return null;
		XSDManager m = views.get(project);
		if (m == null)
			views.put(project, m = XSDManager.Util.createView(manager));
		return m;
	}

}
