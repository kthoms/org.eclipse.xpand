/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.internal.xtend.expression.debug;

import java.util.Set;

import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;
import org.eclipse.internal.xtend.expression.ast.FeatureCall;
import org.eclipse.internal.xtend.expression.ast.ISyntaxElement;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.ExpressionFacade;
import org.eclipse.xtend.expression.Variable;

/**
 * This class is responsible for all presentation topics for expressions in the
 * debugger views.
 * 
 * @author Clemens Kadura (zAJKa)
 */
public class ExpressionModelPresentation {

	protected Set<BaseSpecialTreatment> specials;

	// -------------------------------------------------------------------------

	public ExpressionModelPresentation(final Set<BaseSpecialTreatment> specials) {
		this.specials = specials;
	}

	// -------------------------------------------------------------------------

	public SyntaxElement getStartPresentation(final ISyntaxElement se, final ExecutionContext context) {
		final SyntaxElement to = new SyntaxElement();

		to.containerName = getContainerName(se);
		to.elementName = se.getNameString(context);
		to.resource = getResource(se);
		to.start = getStart(se);
		to.end = se.getEnd();
		to.line = se.getLine();
		return to;
	}

	public SyntaxElement getEndPresentation(final ISyntaxElement se, final ExecutionContext context) {
		return getStartPresentation(se, context);
	}

	public String getVariableSimpleRep(final Object element, final ExecutionContext context) {
		if (element == null)
			return "null";
		if (element instanceof String)
			return (String) element;
		return (String) new ExpressionFacade(context.cloneWithVariable(new Variable("this", element)))
				.evaluate("metaType.name");
	}

	// -------------------------------------------------------------------------

	public int getStart(final ISyntaxElement se) {
		if (se instanceof FeatureCall)
			return ((FeatureCall) se).getName().getStart();
		return se.getStart();
	}

	public int getStartingEndPosition(final ISyntaxElement se) {
		return se.getEnd();
	}

	// -------------------------------------------------------------------------

	protected String getContainerName(final ISyntaxElement se) {
		return getTemplateName(se);
	}

	protected String getTemplateName(final ISyntaxElement se) {
		final String fileName = se.getFileName();
		if (fileName == null)
			return "";
		return fileName.substring(fileName.lastIndexOf('/') + 1, fileName.length() - 4);
	}

	protected String getResource(final ISyntaxElement se) {
		if (se.getFileName() == null)
			return "";
		return se.getFileName();
	}

	public String getStringRep(final Object element) {
		if (element == null)
			return "null";
		return element.toString();
	}

}
