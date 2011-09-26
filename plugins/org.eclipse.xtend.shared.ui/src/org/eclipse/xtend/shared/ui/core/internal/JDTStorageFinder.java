/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.core.internal;

import org.eclipse.core.resources.IStorage;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend.shared.ui.StorageFinder;
import org.eclipse.xtend.shared.ui.StorageFinder2;

/**
 * @author jockel - Initial contribution and API
 */
public class JDTStorageFinder implements StorageFinder2 {
	
	public ResourceID findXtendXpandResourceID(IJavaProject project, IStorage file) {
		return JDTUtil.findXtendXpandResourceID(project, file);
	}

	public IStorage findStorage(IJavaProject project, ResourceID id, boolean searchJars) {
		return JDTUtil.findStorage(project, id, searchJars);
	}

	public int getPriority() {
		return 1;
	}

}
