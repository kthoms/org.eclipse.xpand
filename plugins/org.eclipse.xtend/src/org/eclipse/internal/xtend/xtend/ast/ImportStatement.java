/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.internal.xtend.xtend.ast;

import org.eclipse.internal.xtend.expression.ast.Identifier;

/**
 * @deprecated Replaced by ExtensionImportStatement
 */
@Deprecated
public class ImportStatement extends ExtensionImportStatement {

	public ImportStatement(Identifier importedID, boolean exported) {
		super(importedID, exported);
	}

}
