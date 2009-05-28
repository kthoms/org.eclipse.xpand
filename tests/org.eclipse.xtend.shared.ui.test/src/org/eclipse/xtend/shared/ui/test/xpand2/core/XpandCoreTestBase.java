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

package org.eclipse.xtend.shared.ui.test.xpand2.core;

import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.IPath;
import org.eclipse.xtend.shared.ui.test.PluginTestBase;

/**
 * Base class for Xpand plugin tests.
 * @author Sven Efftinge (http://www.efftinge.de)
 * @author Karsten Thoms
 * @since 03-02-2006
 */
public abstract class XpandCoreTestBase extends PluginTestBase {

	/**
	 * Returns a string encapsuled within Xpand guillemot brackets
	 * @param s Some string
	 * @return String with brackets - <code<b>«s»</b></code>
	 */
    protected String tag(final String s) {
        return '\u00ab' + s + '\u00bb';
    }

	protected IStorage storage(IPath tpl2) {
		return (IStorage) env.getWorkspace().getRoot().findMember(tpl2);
	}
}
