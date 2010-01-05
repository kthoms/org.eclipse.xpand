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

package org.eclipse.internal.xpand2.ast;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.internal.xpand2.XpandTokens;
import org.eclipse.internal.xpand2.XpandUtil;
import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.internal.xtend.expression.ast.Identifier;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.TypeNameUtil;
import org.eclipse.xtend.typesystem.Type;

/**
 * 
 * 
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Karsten Thoms
 */
public class ImportDeclaration extends SyntaxElement implements XpandAnalyzable {

    private Identifier importString;

    public ImportDeclaration(final Identifier importString) {
        this.importString = importString;
    }

    public Identifier getImportString() {
        return importString;
    }

	public void analyze(XpandExecutionContext ctx, Set<AnalysationIssue> issues) {
		try {
			if (ctx.getCallback() != null)
				if (!ctx.getCallback().pre(this, ctx))
					return;
			boolean knownNamespace = false;
			if (!ctx.getNamespaces().contains(importString.getValue())) {
				for (Type t : ctx.getAllTypes()) {
					if (importString.getValue().equals(TypeNameUtil.withoutLastSegment(t.getName()))) {
						knownNamespace = true;
						break;
					}
				}
			} else {
				knownNamespace = true;
			}
			if (!knownNamespace) {
				Template tpl = (Template) ctx.currentResource();
		    	final Set<XpandDefinition> calledDefs = new HashSet<XpandDefinition>();
		    	for (AbstractDefinition def : tpl.getAllDefinitions()) {
		    		def.accept(new AbstractXpandVisitor() {
		    			@Override
		    			protected Object visitExpandStatement(ExpandStatement node) {
		    				XpandDefinition targetDefinition = node.getTargetDefinition();
		    				if (targetDefinition != null) {
		    					calledDefs.add(targetDefinition);
		    				}
		    				return super.visitExpandStatement(node);
		    			}
		    		});
		    	}
				for (XpandDefinition calledDef : calledDefs) {
					final String namespace = XpandUtil.withoutLastSegment(calledDef.getOwner().getFullyQualifiedName()); 
					if (importString.getValue().equals(namespace)) {
						knownNamespace = true;
						break;
					}
				}
			}
			if (!knownNamespace) {
				final String msg = "Namespace " + this.importString.getValue() + " is unknown or unused.";
				issues.add(new AnalysationIssue(AnalysationIssue.INTERNAL_ERROR, msg, this));
			}
		}
		finally {
			if (ctx.getCallback() != null)
				ctx.getCallback().post(this, ctx, null);
		}
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
			.append(XpandTokens.LT)
			.append(XpandTokens.IMPORT)
			.append(" ")
			.append(importString)
			.append(XpandTokens.RT)
			.append(" (")
			.append(this.getFileName())
			.append('@')
			.append(getLine())
			.append(':')
			.append(getStart())
			.append('-')
			.append(getEnd())
			.append(")")
			.toString();
	}
}
