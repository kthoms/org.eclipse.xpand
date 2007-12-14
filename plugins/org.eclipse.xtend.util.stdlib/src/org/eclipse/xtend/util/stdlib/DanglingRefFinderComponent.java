/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.util.stdlib;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class DanglingRefFinderComponent extends AbstractWorkflowComponent {
	
	private String modelSlot;

	public void setModelSlot( String slot ) {
		this.modelSlot = slot;
	}
	
	public void checkConfiguration(Issues issues) {
		if (modelSlot == null ) issues.addError(this, "'modelSlot' not specified,");
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		EObject root = (EObject)ctx.get(modelSlot);
		DanglingRefFinder finder = new DanglingRefFinder();
		finder.handle(root, issues);
	}

	
}
