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
package org.eclipse.xtend.ui.core.internal;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IStorage;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.internal.xtend.xtend.ast.Around;
import org.eclipse.internal.xtend.xtend.ast.Extension;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.expression.ResourceManager;
import org.eclipse.xtend.shared.ui.core.AbstractResource;
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

    public void analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
    	try {
    		resource().analyze(ctx, issues);
    	} catch (Exception e) {
    		// ignore
    	}
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

	public boolean internalRefresh() {
		Resource r = parser.parse(getUnderlyingStorage(),getFullyQualifiedName());
		if (r==null) {
			return false;
		}
		setExtXptResource(r);
		return true;
	}

	public List<Around> getArounds() {
		return Collections.EMPTY_LIST; // arounds are only used at runtime
	}
}
