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
package org.eclipse.xtend.util.uml2ecore;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class ParamChecker extends AbstractWorkflowComponent {

	private boolean resPerTlP;
	private String modelUri;

	public void setResourcePerToplevelPackage( boolean b ) {
		resPerTlP = b;
	}
	
	public void setUri( String uri ) {
		modelUri = uri;
	}
	
	public void checkConfiguration(Issues issues) {
		if ( modelUri.endsWith(".ecore")) {
			if ( resPerTlP ) {
				issues.addError(this, "if you specify resourcePerToplevelPackage='true', the uri parameter must point to a directory!");
			}
		} else {
			if ( !resPerTlP ) {
				issues.addError(this, "if you specify resourcePerToplevelPackage='false', the uri parameter must point to a .ecore file!");
			}
			
		}

	}

	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		// do nothin - this is ok.
	}

}
