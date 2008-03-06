/**
 * <copyright>
 * </copyright>
 *
 * $Id: ErrorStatementValidator.java,v 1.1 2008/03/06 15:35:10 jkohnlein Exp $
 */
package org.eclipse.xpand3.statement.validation;

import org.eclipse.xpand3.expression.AbstractExpression;

/**
 * A sample validator interface for {@link org.eclipse.xpand3.statement.ErrorStatement}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ErrorStatementValidator {
	boolean validate();

	boolean validateMessage(AbstractExpression value);
}
