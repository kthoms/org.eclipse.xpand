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

import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.shared.ui.MetamodelContributor2;
import org.eclipse.xtend.typesystem.MetaModel;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

/**
 * Contributes EPackages that are accessible from a project's classpath. The
 * actual work of finding accessible metamodels is done by the EmfToolsPlugin
 * class.
 * 
 * @see EmfToolsPlugin
 */
public class EmfMetamodelContributor implements MetamodelContributor2 {

	public MetaModel[] getMetamodels(final IJavaProject project,
			final TypeSystem builtin) {
		final EPackage[] metamodelsForProject = EmfToolsPlugin.getDefault().getMetamodelsForProject(
				project);
		return new MetaModel[] { new EmfRegistryMetaModel() {
			@Override
			protected EPackage[] allPackages() {
				return metamodelsForProject;
			}
		} };
	}

	public IStorage getUnderlyingStorage(final IJavaProject project, String typeName) {
		EmfToolsPlugin.getDefault().getMetamodelsForProject(project);
		//TODO implement it
		return null;
	}

}
