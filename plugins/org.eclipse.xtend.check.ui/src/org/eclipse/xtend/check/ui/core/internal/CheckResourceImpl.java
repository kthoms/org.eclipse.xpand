/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.check.ui.core.internal;

import java.util.Set;

import org.eclipse.core.resources.IStorage;
import org.eclipse.internal.xtend.xtend.XtendFile;
import org.eclipse.xtend.check.ui.core.internal.builder.CheckResourceParser;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.shared.ui.core.AbstractResource;

public class CheckResourceImpl extends AbstractResource {

    private CheckResourceParser parser;

	public CheckResourceImpl(final XtendFile res, final IStorage source, final CheckResourceParser parser) {
        super(source);
        setExtXptResource(res);
        this.parser = parser;
    }

    private XtendFile resource() {
        return (XtendFile) getExtXptResource();
    }

    @Override
	public void analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
        try {
        	resource().analyze(ctx, issues);
        } catch (Exception e) {
        	// ignore
        }
    }

	public String getFileExtension() {
		return parser.getFileExtension();
	}

	@Override
	public boolean internalRefresh() {
		Resource o = parser.parse(getUnderlyingStorage(),getFullyQualifiedName());
		if (o==null)
			return false;
		setExtXptResource(o);
		return true;
	}

}
