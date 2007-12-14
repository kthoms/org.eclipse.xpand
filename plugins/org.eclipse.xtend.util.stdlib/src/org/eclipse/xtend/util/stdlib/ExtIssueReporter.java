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

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;


public class ExtIssueReporter extends AbstractWorkflowComponent {

	static ThreadLocal tl = new ThreadLocal();
	
	protected void checkConfigurationInternal(Issues arg0) {
	}

	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor mon, Issues issues) {
		tl.set( issues );
	}
	
	@Override
	public String getLogMessage() {
		return "setting up issue logging from within .ext and .xpt files";
	}
	
	public static String reportError( String message ) {
		getIssues().addError( message );
		return message;
	}

	private static Issues getIssues() {
		return ((Issues)tl.get());
	}

	public static String reportWarning( String message ) {
		getIssues().addWarning( message );
		return message;
	}

	public static String reportError( String qfn, String message ) {
		if ( tl.get() == null ) {
			System.err.println("you've forgotten to run the org.eclipse.internal.xtend.util.stdlib.ExtIssueReporter component before using the issue reporting utilities.");
		}
		getIssues().addError( "["+qfn+"] "+message );
		return message;
	}

	public static String reportWarning( String qfn, String message ) {
		if ( tl.get() == null ) {
			System.err.println("you've forgotten to run the org.eclipse.internal.xtend.util.stdlib.ExtIssueReporter component before using the issue reporting utilities.");
		}
		getIssues().addWarning( "["+qfn+"] "+message );
		return message;
	}

	public void checkConfiguration(Issues issues) {
		
	}

}
