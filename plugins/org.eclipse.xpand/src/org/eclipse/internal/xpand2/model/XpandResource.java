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
package org.eclipse.internal.xpand2.model;

import org.eclipse.internal.xpand2.ast.XpandAnalyzable;
import org.eclipse.xtend.expression.Resource;

public interface XpandResource extends Resource, XpandAnalyzable {

    XpandDefinition[] getDefinitions();

    public XpandDefinition[] getDefinitionsByName(String name);

    XpandAdvice[] getAdvices();

}
