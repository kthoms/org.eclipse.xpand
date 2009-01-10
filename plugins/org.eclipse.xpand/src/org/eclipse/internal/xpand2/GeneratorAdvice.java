/*******************************************************************************
 * Copyright (c) 2005-2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 *******************************************************************************/
package org.eclipse.internal.xpand2;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xpand2.Generator;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowAdvice;

/**
 * Weaves aspect templates into a generator component.
 * <p>
 * <h2>Parameters</h2>
 * <table border="1">
 * <tr>
 * <th>Name</th>
 * <th>Multiplicity</th>
 * <th>Type</th>
 * <th>Description</th>
 * </tr>
 * 
 * <tr>
 * <td>adviceTarget</td>
 * <td>1</td>
 * <td>String</td>
 * <td>The id of a {@link Generator} component</td>
 * </tr>
 * 
 * <tr>
 * <td>advices</td>
 * <td>0..n</td>
 * <td>String</td>
 * <td>Comma seperated list of qualified aspect templates</td>
 * </tr>
 * 
 * <tr>
 * <td>advice</td>
 * <td>0..n</td>
 * <td>String</td>
 * <td>Qualified name of an aspect template</td>
 * </tr>
 * 
 * 
 * <tr>
 * <td>extensionAdvice</td>
 * <td>0..n</td>
 * <td>String</td>
 * <td>Comma seperated list of qualified aspect extensions</td>
 * </tr>
 * 
 * <tr>
 * <td>metaModel</td>
 * <td>0..n</td>
 * <td>org.openarchitectureware.type.MetaModel</td>
 * <td>Additional metamodels needed for the advices.</td>
 * </tr>
 * 
 * <tr>
 * <td>globalVarDef</td>
 * <td>0..n</td>
 * <td>GlobalVarDef</td>
 * <td>Additional global vars needed for the advices.</td>
 * </tr>
 * </table>
 */
public class GeneratorAdvice extends AbstractExpressionsUsingWorkflowAdvice {

	private static final String COMPONENT_NAME = "Xpand Generator Advice";

	private List<String> advices = new ArrayList<String>();

	private List<String> extensionAdvices = new ArrayList<String>();

	private String fileEncoding;

	/**
	 * @deprecated Use <code>addAdvice(String)</code> instead.
	 */
	@Deprecated
	public void addAdvices(String advices) {
		this.advices.add(advices);
	}

	/**
	 * @deprecated Use <code>addExtensionAdvice(String)</code> instead.
	 */
	@Deprecated
	public void addExtensionAdvices(String extensionAdvices) {
		addExtensionAdvice(extensionAdvices);
	}

	/**
	 * Adds an advice.
	 * 
	 * @param advice
	 *            the advice
	 */
	public void addAdvice(String advice) {
		this.advices.add(advice);
	}

	/**
	 * Adds an extension advice,
	 * 
	 * @param extensionAdvice
	 *            the extension advice
	 */
	public void addExtensionAdvice(String extensionAdvice) {
		this.extensionAdvices.add(extensionAdvice);
	}

	/**
	 * Sets the file encoding to use for the target generator.
	 * 
	 * @param fileEncoding
	 *            Encoding string, e.g. 'ISO-8859-1'
	 * @since 4.2
	 * @see https://bugs.eclipse.org/bugs/show_bug.cgi?id=195042
	 */
	public void setFileEncoding(String fileEncoding) {
		this.fileEncoding = fileEncoding;
	}

	/**
	 * @see org.openarchitectureware.workflow.ao.AbstractWorkflowAdvice#checkConfiguration(org.openarchitectureware.workflow.issues.Issues)
	 */
	@Override
	public void checkConfiguration(Issues issues) {
		super.checkConfiguration(issues);
		if (advices.isEmpty() && extensionAdvices.isEmpty()) {
			issues.addError("Neither 'advices' nor 'extensionAdvices' configured.");
		}
	}

	/**
	 * @see org.openarchitectureware.expression.AbstractExpressionsUsingWorkflowAdvice#weave(org.openarchitectureware.workflow.WorkflowComponent,
	 *      org.openarchitectureware.workflow.issues.Issues)
	 */
	@Override
	public void weave(WorkflowComponent c, Issues issues) {
		super.weave(c, issues);
		if (!(c instanceof Generator)) {
			issues.addError(this, "advice target is not a Generator component.");
		}
		else {
			Generator gen = (Generator) c;
			for (String advice : advices) {
				gen.addAdvice(advice);
			}
			for (String advice : extensionAdvices) {
				gen.addExtensionAdvice(advice);
			}
			if (fileEncoding != null) {
				gen.setFileEncoding(fileEncoding);
			}
		}
	}

	@Override
	public String getLogMessage() {
		return "extension-advices: " + buildList(extensionAdvices) + "   template-advices: " + buildList(advices);
	}

	@Override
	public String getComponentName() {
		return COMPONENT_NAME;
	}
}
