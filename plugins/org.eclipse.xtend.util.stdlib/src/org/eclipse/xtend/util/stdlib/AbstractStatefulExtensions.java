/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.util.stdlib;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.IExecutionContextAware;
import org.eclipse.xtend.expression.Variable;

/**
 * uses the global vars of an Xpand {@link ExecutionContext} to attach state to any object
 * 
 * @author Sven Efftinge - Initial contribution and API
 */
public class AbstractStatefulExtensions<T> implements IExecutionContextAware {

	protected T set(Object o, T value) {
		T previous = get(o);
		getVars().put(o, value);
		return previous;
	}
	
	protected T get(Object o) {
		Map<Object, T> vars = getVars();
		T value = vars.get(o);
		if (value == null) {
			return getDefault(o);
		}
		return value;
	}
	
	protected T getDefault(Object o) {
		return null;
	}

	@SuppressWarnings("unchecked")
	protected Map<Object, T> getVars() {
		Map<String, Variable> vars = exeCtx.getGlobalVariables();
		Variable variable = vars.get(getClass().getName());
		if (variable == null) {
			variable = new Variable(getClass().getName(), new HashMap<Object, Integer>());
			vars.put(getKey(), variable);
		}
		return (Map<Object, T>) variable.getValue();
	}

	protected String getKey() {
		return getClass().getName();
	}
	
	protected ExecutionContext exeCtx;

	public void setExecutionContext(ExecutionContext ctx) {
		this.exeCtx = ctx;
	}
	
}