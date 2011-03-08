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

package org.eclipse.xtend.ui.core.internal;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IStorage;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.internal.xtend.xtend.ast.ExtensionImportStatement;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.expression.ResourceManager;
import org.eclipse.xtend.shared.ui.core.AbstractResource;
import org.eclipse.xtend.shared.ui.core.internal.BuildState;
import org.eclipse.xtend.shared.ui.core.internal.ResourceID;
import org.eclipse.xtend.ui.core.IXtendResource;
import org.eclipse.xtend.ui.core.internal.builder.XtendResourceParser;

public class XtendResourceImpl extends AbstractResource implements IXtendResource {
    private XtendResourceParser parser;

	public XtendResourceImpl(final XtendFile tpl, final IStorage res, XtendResourceParser parser) {
        super(res);
        setExtXptResource(tpl);
        this.parser = parser;
    }

    private XtendFile resource() {
        return (XtendFile) getExtXptResource();
    }

    @Override
	public void analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
    	Set<AnalysationIssue> issuesFromThisResource = new HashSet<AnalysationIssue>();
    	try {
    		BuildState buildState = BuildState.get(ctx);
			if (buildState != null) {
				final ResourceID id = new ResourceID(resource().getFullyQualifiedName(), getFileExtension());
				Set<AnalysationIssue> internalIssues = buildState.getIssuesPerResource().get(id);
				if (internalIssues == null) {
					internalIssues = new HashSet<AnalysationIssue>();
					resource().analyze(ctx, internalIssues);
					issuesFromThisResource.addAll(internalIssues);
					buildState.getIssuesPerResource().put(id, internalIssues);
				}
			} else {
	    		resource().analyze(ctx, issuesFromThisResource);
			}
    	} catch (Exception e) {
    		// ignore
    	}
    	// remove tons of annoying errors
    	// filter all the 'Error parsing resource' issues that arised from a broken import
		Set<AnalysationIssue> issuesToRemove = new HashSet<AnalysationIssue>();
		for (AnalysationIssue issue : issuesFromThisResource) {
			if (issue.getType().equals(AnalysationIssue.RESOURCE_NOT_FOUND)) {
				ExtensionImportStatement importStmt = (ExtensionImportStatement) issue.getElement();
				for (AnalysationIssue issue2 : issuesFromThisResource) {
					if (issue2.getType().equals(AnalysationIssue.INTERNAL_ERROR) && issue2.getMessage().matches("Error parsing extensions.*"+importStmt.getImportedId()+"$")) {
						issuesToRemove.add(issue2);
					}
				}
			}
		}
		issuesFromThisResource.removeAll(issuesToRemove);
		issues.addAll(issuesFromThisResource);
    }

    public List<Extension> getExtensions() {
        return resource().getExtensions();
    }

    public List<Extension> getPublicExtensions(final ResourceManager rm, ExecutionContext ctx) {
        return resource().getPublicExtensions(rm, ctx);
    }

    public List<Extension> getPublicExtensions(ResourceManager resourceManager, ExecutionContext ctx, Set<String> flowoverCache) {
        return resource().getPublicExtensions(resourceManager,ctx, flowoverCache);
    }

	public String getFileExtension() {
		return parser.getFileExtension();
	}

	@Override
	public boolean internalRefresh() {
		Resource r = parser.parse(getUnderlyingStorage(),getFullyQualifiedName());
		if (r==null) {
			return false;
		}
		setExtXptResource(r);
		return true;
	}

	public List<Around> getArounds() {
		return Collections.emptyList(); // arounds are only used at runtime
	}

	@Override
	public String toString() {
		return getFullyQualifiedName();
	}
}
