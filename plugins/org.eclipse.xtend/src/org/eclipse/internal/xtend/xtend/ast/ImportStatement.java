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
package org.eclipse.internal.xtend.xtend.ast;

import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;

public class ImportStatement extends SyntaxElement {

    private Identifier importedId;

    private boolean exported;

    public ImportStatement(final Identifier importedID,
            final boolean exported) {
        importedId = importedID;
        this.exported = exported;
    }

    public Identifier getImportedId() {
        return importedId;
    }

    public boolean isExported() {
        return exported;
    }

}
