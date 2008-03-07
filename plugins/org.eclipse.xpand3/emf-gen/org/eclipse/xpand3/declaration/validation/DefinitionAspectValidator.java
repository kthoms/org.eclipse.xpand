/**
 * <copyright>
 * </copyright>
 *
 * $Id: DefinitionAspectValidator.java,v 1.3 2008/03/07 11:10:49 jkohnlein Exp $
 */
package org.eclipse.xpand3.declaration.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xpand3.statement.AbstractStatement;

/**
 * A sample validator interface for {@link org.eclipse.xpand3.declaration.DefinitionAspect}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DefinitionAspectValidator {
	boolean validate();

	boolean validateBody(EList<AbstractStatement> value);
}
