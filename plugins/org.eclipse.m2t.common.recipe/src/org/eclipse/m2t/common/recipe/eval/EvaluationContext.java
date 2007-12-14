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

package org.eclipse.m2t.common.recipe.eval;

import org.eclipse.m2t.common.recipe.core.EvalTrigger;

public class EvaluationContext {

	private boolean evaluateAll = false;
	private int trigger = EvalTrigger.ON_REQUEST;
	private boolean batchOnly = false;
	private CheckEvaluator evaluator;

	public void setCheckEvaluator( CheckEvaluator e ) {
		this.evaluator = e;
	}
	
	public CheckEvaluator getEvaluator() {
		return evaluator;
	}
	
	public void setEvaluateAll( boolean b ) {
		this.evaluateAll = b;
	}
	
	public void setTrigger( int trigger ) {
		this.trigger = trigger;
	}
	
	public void setBatchOnly( boolean b ) {
		this.batchOnly = b;
	}
	
	public boolean reevaluateAlreadyEvaluated() {
		return evaluateAll;
	}
	
	public boolean evaluateOnRequestTriggeredCheck() {
		return trigger == EvalTrigger.ON_REQUEST;
	}
	
	public boolean evaluateOnChangeTriggeredCheck() {
		return trigger == EvalTrigger.ON_REQUEST ||
			   trigger == EvalTrigger.ON_CHANGE;
	}

	public boolean evaluateBatchOnly() {
		return batchOnly;
	}
}
