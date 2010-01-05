/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xpand.internal.tests.ast;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.parser.XpandParseFacade;
import org.eclipse.xpand.internal.tests.evaluate.OutputStringImpl;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xtend.expression.AnalysationIssue;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.expression.ResourceManager;
import org.eclipse.xtend.expression.ResourceManagerDefaultImpl;
import org.eclipse.xtend.type.impl.java.JavaMetaModel;
import org.eclipse.xtend.type.impl.java.beans.JavaBeansStrategy;

/**
 * @author Karsten Thoms - Initial contribution and API
 */
public abstract class AbstractXpandASTTest extends TestCase {
	protected XpandExecutionContextImpl execCtx;
	protected Set<AnalysationIssue> issues;
	protected Output output;
	private Set<Template> parsedTemplates;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		ResourceManager resourceManager = new ResourceManagerDefaultImpl() {
			@Override
			public Resource loadResource(String fullyQualifiedName, String extension) {
				for (Template tpl : parsedTemplates) {
					if (fullyQualifiedName.equals(tpl.getFullyQualifiedName())) {
						return tpl;
					}
				}
				return super.loadResource(fullyQualifiedName, extension);
			}
		};
		resourceManager.setFileEncoding("ISO-8859-1");
		
		output = new OutputStringImpl();
		execCtx = new XpandExecutionContextImpl(
				resourceManager,
				output,
				null,
				null,
				null,
				null,
				null, 
				null);

		execCtx.registerMetaModel(new JavaMetaModel("JavaBeans", new JavaBeansStrategy()));

		// ADDED encoding
		execCtx.getResourceManager().setFileEncoding("ISO-8859-1");
		issues = new HashSet<AnalysationIssue>();
		parsedTemplates = new HashSet<Template>();
	}

	protected Template parse(final String template, String filename) {
		Template tpl = XpandParseFacade.file(new StringReader(template), filename);
		parsedTemplates.add(tpl);
		execCtx = (XpandExecutionContextImpl) execCtx.cloneWithResource(tpl);
		return tpl;
	}

	protected void dumpIssues() {
		for (AnalysationIssue issue : issues) {
			String line = issue.getElement() != null ? "" + issue.getElement().getLine() : "";
			System.out.println(issue.getType() + " : " + issue.getMessage() + " on line " + line);
		}
	}


}
