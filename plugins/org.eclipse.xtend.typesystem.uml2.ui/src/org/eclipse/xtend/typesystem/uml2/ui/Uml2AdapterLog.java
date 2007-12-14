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

package org.eclipse.xtend.typesystem.uml2.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class Uml2AdapterLog {
	public final static void logInfo(String msg) {
		log(IStatus.INFO, IStatus.OK, msg, null);
	}
	public final static void logError(Throwable t) {
		logError(t.getMessage(), t);
	}
	public final static void logError(String msg,Throwable t) {
		t.printStackTrace();
		log(IStatus.ERROR, IStatus.OK, msg, t);
	}
	
	private final static void log(int severity, int code, String message,Throwable exception) {
		log(createStatus(severity,code,message,exception));
	}

	private final static IStatus createStatus(int severity, int code, String message, Throwable exception) {
		return new Status(severity,Uml2AdapterPlugin.getDefault().getBundle().getSymbolicName(), code, message!=null?message:"",exception);
	}
	
	private final static void log(IStatus status) {
      Uml2AdapterPlugin.getDefault().getLog().log(status);
	}
}
