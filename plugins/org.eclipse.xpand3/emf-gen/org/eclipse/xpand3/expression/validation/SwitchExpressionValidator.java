/**
 * <copyright>
 * </copyright>
 *
 * $Id: SwitchExpressionValidator.java,v 1.3 2008/03/07 11:10:57 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.expression.AbstractExpression;
import org.eclipse.xpand3.expression.Case;

/**
 * A sample validator interface for {@link org.eclipse.xpand3.expression.SwitchExpression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SwitchExpressionValidator {
	boolean validate();

	boolean validateSwitchExpr(AbstractExpression value);
	boolean validateDefaultExpr(AbstractExpression value);
	boolean validateCases(EList<Case> value);
}
