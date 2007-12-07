/**
 * <copyright>
 *
 * Copyright (c) 2005-2006 Bernd Kolb and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bernd Kolb - implementation
 *
 * </copyright>
 */

package org.eclipse.m2t.common.recipe.astChecks.checks;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.m2t.common.recipe.core.AtomicCheck;
import org.eclipse.m2t.common.recipe.util.ICheckEvaluator;

public abstract class EclipseResourceCheckEvaluator implements ICheckEvaluator {

	public IWorkspace refreshWorkspace(AtomicCheck check) {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		try {
			workspace.getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e1) {
			check.fail("could not refresh workspace");
		}
		return workspace;
	}
}
