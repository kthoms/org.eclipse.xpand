/**
 * <copyright>
 * </copyright>
 *
 * $Id: CycleValidator.java,v 1.1 2009/09/08 09:39:40 hbehrens Exp $
 */
package org.eclipse.xtend.profiler.profilermodel.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtend.profiler.profilermodel.CallGroup;
import org.eclipse.xtend.profiler.profilermodel.Item;

/**
 * A sample validator interface for {@link org.eclipse.xtend.profiler.profilermodel.Cycle}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CycleValidator {
	boolean validate();

	boolean validateItems(EList<Item> value);
	boolean validateCallCountInbound(int value);
	boolean validateCallCountReentrant(int value);
	boolean validateOutgoingCallGroups(EList<CallGroup> value);
}
