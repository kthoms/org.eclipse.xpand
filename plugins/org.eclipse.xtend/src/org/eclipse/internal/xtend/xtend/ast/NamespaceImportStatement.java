/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.internal.xtend.xtend.ast;

import java.util.Set;

import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;

/**
 * @author Karsten Thoms - Initial contribution and API
 */
public class NamespaceImportStatement extends SyntaxElement {

	private Identifier importedId;

	public NamespaceImportStatement(final Identifier importedID) {
		importedId = importedID;
	}

	public Identifier getImportedId() {
		return importedId;
	}

	public void analyze(ExecutionContext ctx, Set<AnalysationIssue> issues) {
		try {
			if (ctx.getCallback() != null)
				if (!ctx.getCallback().pre(this, ctx))
					return;
			if (!ctx.getNamespaces().contains(importedId.getValue())) {
				final String msg = "Namespace " + this.getImportedId().getValue() + " not found.";
				issues.add(new AnalysationIssue(AnalysationIssue.INTERNAL_ERROR, msg, this));
			}
		}
		finally {
			if (ctx.getCallback() != null)
				ctx.getCallback().post(this, ctx, null);
		}
	}

}
