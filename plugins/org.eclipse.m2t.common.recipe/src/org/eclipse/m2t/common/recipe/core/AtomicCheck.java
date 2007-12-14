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

package org.eclipse.m2t.common.recipe.core;


public abstract class AtomicCheck extends Check {
	
	private static final long serialVersionUID = 1L;
	private int status = EvalStatus.UNDETERMINED;
	private String statusMessage = null;
	private int trigger = EvalTrigger.ON_REQUEST;
	
	
	public AtomicCheck( String name, String description, int trigger ) {
		super(name, description);
		setTrigger( trigger );
	}
	
	public AtomicCheck( String name, String description ) {
		this(name, description, EvalTrigger.ON_REQUEST);
	}
	
	public int getCheckCount() {
		return 1;
	}
	
	public int getStatus() {
		return status;
	}	
	
	public String getStatusMessage() {
		return statusMessage;
	}	
	
	protected void setStatusMessage(String message) {
		this.statusMessage = message; 
	}
	
	protected void setStatus( int s ) {
		this.status = s;
	}
	
	public void ok() {
		setStatus( EvalStatus.OK );
		setStatusMessage(null);
	}
	
	public void fail( String reason ) {
		setStatus( EvalStatus.FAILED );
		setStatusMessage(reason);
		throw new EvaluationStop();
	}
	
	public int getTrigger() {
		return trigger;
	}
	
	protected void setTrigger( int trigger ) {
		this.trigger = trigger;
	}
	

	
}
