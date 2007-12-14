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

package org.eclipse.xtend.shared.ui.core.metamodel.jdt.oaw;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend.expression.TypeSystem;
import org.eclipse.xtend.shared.ui.MetamodelContributor;
import org.eclipse.xtend.shared.ui.core.metamodel.jdt.JdtMetaModel;
import org.eclipse.xtend.typesystem.MetaModel;

public class OawClassicMetamodelContributor implements MetamodelContributor {

    private static final JdtOawClassicTypeStrategy strategy = new JdtOawClassicTypeStrategy();

    public MetaModel[] getMetamodels(final IJavaProject project, final TypeSystem builtin) {
        return new MetaModel[] { JdtMetaModel.create("OAW", project, strategy) };
    }

}
