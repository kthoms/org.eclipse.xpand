/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.shared.ui;

import org.eclipse.core.resources.IStorage;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend.shared.ui.core.internal.ResourceID;

/**
 * @author niehues - Initial contribution and API
 */
public interface StorageFinder2 extends StorageFinder {
	public ResourceID findXtendXpandResourceID(IJavaProject project, IStorage file);
}
