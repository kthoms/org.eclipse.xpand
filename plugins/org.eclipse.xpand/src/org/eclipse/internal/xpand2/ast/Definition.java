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
package org.eclipse.internal.xpand2.ast;

import org.eclipse.internal.xtend.expression.ast.DeclaredParameter;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.xtend.expression.ExecutionContext;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 */
public class Definition extends AbstractDefinition {
	public Definition(final Identifier name, final Identifier type, final DeclaredParameter[] params, final Statement[] body) {
		super(name, type, params, body);
	}

	@Override
	public String getNameString(ExecutionContext context) {
		return "DEFINE";
	}

}
