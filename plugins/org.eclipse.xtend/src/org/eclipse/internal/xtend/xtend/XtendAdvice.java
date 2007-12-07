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
package org.eclipse.internal.xtend.xtend;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowComponent;
import org.eclipse.emf.mwe.core.ao.AbstractWorkflowAdvice;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtend.XtendComponent;

public class XtendAdvice extends AbstractWorkflowAdvice {

    private List<String> extensionAdvices = new ArrayList<String>();

    public void addExtensionAdvices(String extensionAdvices) {
		this.extensionAdvices.add( extensionAdvices );
	}

    public void addExtensionAdvice(String extensionAdvices) {
		this.extensionAdvices.add( extensionAdvices );
	}

	@Override
	public void weave(WorkflowComponent c, Issues issues) {
		if ( !(c instanceof XtendComponent) ) {
			issues.addError(this, "advice target is not an XtendComponent.");
		} else {
			XtendComponent xc = (XtendComponent)c;
			for (String advice : extensionAdvices) {
				xc.addExtensionAdvice(advice);
			}
		}
	}
	
	@Override
	public String getLogMessage() {
		return "extensionAdvices: "+buildList( extensionAdvices );
	}

	
}
