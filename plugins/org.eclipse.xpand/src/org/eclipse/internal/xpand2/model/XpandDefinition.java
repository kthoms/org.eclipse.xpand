/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.internal.xpand2.model;

import org.eclipse.internal.xpand2.ast.XpandAnalyzable;
import org.eclipse.internal.xpand2.ast.XpandEvaluatable;
import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.ISyntaxElement;

public interface XpandDefinition extends ISyntaxElement, XpandAnalyzable, XpandEvaluatable {

    XpandResource getOwner();

    DeclaredParameter[] getParams();

    String getTargetType();

    String getName();

	String getQualifiedName();

	public String getParamString(boolean typesOnly);
}
