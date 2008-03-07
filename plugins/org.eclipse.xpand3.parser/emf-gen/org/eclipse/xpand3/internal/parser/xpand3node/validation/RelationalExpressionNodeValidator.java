/**
 * <copyright>
 * </copyright>
 *
 * $Id: RelationalExpressionNodeValidator.java,v 1.4 2008/03/07 11:11:14 jkohnlein Exp $
 */
package org.eclipse.xpand3.internal.parser.xpand3node.validation;

import org.eclipse.tmf.common.node.CompositeNode;
import org.eclipse.tmf.common.node.LeafNode;

/**
 * A sample validator interface for {@link org.eclipse.xpand3.internal.parser.xpand3node.RelationalExpressionNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RelationalExpressionNodeValidator {
	boolean validate();

	boolean validateOperator(CompositeNode value);

	boolean validateOperator(LeafNode value);
	boolean validateRightOperand(CompositeNode value);
	boolean validateLeftOperand(CompositeNode value);
}
