/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.shared.ui.core;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

public interface IModelManager {

    public abstract IXtendXpandResource findExtXptResource(IStorage storage);

    public abstract IXtendXpandProject findProject(IPath path);

    public abstract IXtendXpandProject findProject(IResource resource);

    public abstract void analyze(IProgressMonitor monitor);

	public IXtendXpandResource findOawResource(String oawNamespace, String extension);

}