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
package org.eclipse.internal.xpand2.model;

import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.ISyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;

public interface XpandAdvice extends ISyntaxElement, XpandDefinition {

    public boolean matches(XpandDefinition def, XpandExecutionContext ctx);

    DeclaredParameter[] getParams();

}
