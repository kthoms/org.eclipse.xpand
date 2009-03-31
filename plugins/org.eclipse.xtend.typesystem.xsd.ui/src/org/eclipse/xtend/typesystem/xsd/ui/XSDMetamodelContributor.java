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

import java.util.Collection;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.shared.ui.MetamodelContributor;
import org.eclipse.xtend.typesystem.MetaModel;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class XSDMetamodelContributor implements MetamodelContributor {

	public XSDMetamodelContributor() {
		//XSDToolsPlugin.traceLog("XsdMetaModelContributor constructed");
	}

	public MetaModel[] getMetamodels(IJavaProject project, TypeSystem ctx) {
		XSDToolsPlugin plugin = XSDToolsPlugin.getDefault();
		XSDMetamodelStore store = plugin.getXSDStore();
		Collection<MetaModel> mms = store.getMetamodels(project.getProject());

		XSDToolsPlugin.traceLog("getMetaModels("
				+ project.getProject().getName() + ") -> " + mms);

		return mms.toArray(new MetaModel[mms.size()]);
	}
}
