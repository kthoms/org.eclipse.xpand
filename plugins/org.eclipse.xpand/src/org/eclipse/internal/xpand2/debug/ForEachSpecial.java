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
package org.eclipse.internal.xpand2.debug;

import org.eclipse.emf.mwe.core.debug.model.SyntaxElement;
import org.eclipse.internal.xpand2.ast.ForEachStatement;
import org.eclipse.internal.xpand2.type.XpandIterator;
import org.eclipse.internal.xtend.expression.ast.ISyntaxElement;
import org.eclipse.internal.xtend.expression.debug.BaseSpecialTreatment;
import org.eclipse.xtend.expression.ExecutionContext;

/**
 * Adapter to handle FOREACH statement special stuff.
 * 
 * @author Clemens Kadura (zAJKa)
 */
public class ForEachSpecial extends BaseSpecialTreatment {

	private ForEachStatement lastForEach;

	// -------------------------------------------------------------------------

	/**
	 * A ForEachStatement calls monitor.preTask() always twice. First time for the (outer) statement and 2nd time
	 * for each loop. We disable suspension the first time.
	 * 
	 * @see org.eclipse.internal.xtend.expression.debug.BaseSpecialTreatment#shallNotSuspend(java.lang.Object, int)
	 */
	@Override
	public boolean shallNotSuspend(Object element, int flag, ExecutionContext ctx) {
		// in the outer loop the iterator is null, so we don't suspend
		return element instanceof ForEachStatement; // && ((ForEachStatement) element).getIterator() == null;
	}

	/**
	 * Don't show frame in Launch view, if the ForEachStatement is the 1st time in the stack.
	 * 
	 * @see org.eclipse.internal.xtend.expression.debug.BaseSpecialTreatment#adaptSyntaxElement(org.eclipse.emf.mwe.core.debug.model.SyntaxElement,
	 *      java.lang.Object)
	 */
	@Override
	public void adaptSyntaxElement(SyntaxElement to, Object element) {
		if (element instanceof ForEachStatement)
			if (!element.equals(lastForEach)) {
				to.visible = false;
				lastForEach = (ForEachStatement) element;
			}
	}

	@Override
	public String adaptElementName(ISyntaxElement se, ExecutionContext context) {
		if (se instanceof ForEachStatement) {
			String name = "FOREACH";
			// add counter to the FOREACH name
			XpandIterator it = null; //((ForEachStatement) se).getIterator();
			if (it != null)
				// Hint: We can ignore it == null (the outer call), since it isn't visible anyway
				return name + " " + it.counter1() + " of " + it.elements();
		}
		return "";
	}

}
