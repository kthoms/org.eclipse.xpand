/**
 * <copyright>
 * </copyright>
 *
 * $Id: CaseValidator.java,v 1.3 2008/03/07 11:10:57 jkohnlein Exp $
 */
package org.eclipse.xpand3.expression.validation;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * A sample validator interface for {@link org.eclipse.xpand3.expression.Case}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CaseValidator {
	boolean validate();

	boolean validateCondition(AbstractExpression value);
	boolean validateThenPart(AbstractExpression value);
}
