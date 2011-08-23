/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.expression;

import junit.framework.Assert;

import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.IExecutionContextAware;

/**
 * @author Karsten Thoms - Initial contribution and API
 */
public class ExecutionContextAwareTestBean implements IExecutionContextAware {
	private ExecutionContext ctx;
	
	public Object getVariableFromExecCtx (String varName) {
		Assert.assertNotNull("ExecutionContext not set", ctx);
		return ctx.getVariable(varName).getValue();
	}

	public ExecutionContext getExecutionContext() {
		return ctx;
	}

	public void setExecutionContext(ExecutionContext ctx) {
		this.ctx = ctx;
	}
}
