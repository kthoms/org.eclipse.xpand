/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xpand.ui.editor;

import org.eclipse.xpand.ui.XpandEditorPlugin;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Peter Friese
 */
public interface IXpandEditorActionDefinitionIds {

	final static String INSERT_LT = XpandEditorPlugin.getId() + ".insertLT";

	final static String INSERT_RT = XpandEditorPlugin.getId() + ".insertRT";

	final static String REFACTORING = XpandEditorPlugin.getId() + ".refactoring";

	final static String REFACTOR_RENAME_DEFINE = IXpandEditorActionDefinitionIds.REFACTORING + ".rename.define";

}
