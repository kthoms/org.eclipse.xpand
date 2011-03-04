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

package org.eclipse.xpand.ui.core.internal;

import java.util.Set;

import org.eclipse.core.resources.IStorage;
import org.eclipse.internal.xpand2.model.XpandAdvice;
import org.eclipse.internal.xpand2.model.XpandDefinition;
import org.eclipse.internal.xpand2.model.XpandResource;
import org.eclipse.xpand.ui.core.IXpandResource;
import org.eclipse.xpand.ui.core.internal.builder.XpandResourceParser;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.shared.ui.core.AbstractResource;

public class XpandResourceImpl extends AbstractResource implements IXpandResource {

	private XpandResourceParser parser;

	public XpandResourceImpl(final XpandResource tpl, final IStorage source, XpandResourceParser parser) {
		super(source);
		setExtXptResource(tpl);
		this.parser = parser;
	}

	private XpandResource resource() {
		return (XpandResource) getExtXptResource();
	}

	@Override
	public void analyze(final ExecutionContext ctx, final Set<AnalysationIssue> issues) {
		try {
			resource().analyze((XpandExecutionContext) ctx, issues);
		} catch (Exception e) {
			// ignore
		}
	}

	public void analyze(final XpandExecutionContext ctx, final Set<AnalysationIssue> issues) {
		try {
			resource().analyze(ctx, issues);
		} catch (Exception e) {
			// ignore
		}
	}

	public XpandDefinition[] getDefinitions() {
		return resource().getDefinitions();
	}

	public XpandDefinition[] getDefinitionsByName(final String name) {
		return resource().getDefinitionsByName(name);
	}

	public XpandAdvice[] getAdvices() {
		return resource().getAdvices();
	}

	public String getFileExtension() {
		return parser.getFileExtension();
	}

	@Override
	public boolean internalRefresh() {
		Resource r = parser.parse(getUnderlyingStorage(), getFullyQualifiedName());
		if (r == null)
			return false;
		setExtXptResource(r);
		return true;
	}

}
