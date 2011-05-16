/*******************************************************************************
 * Copyright (c) 2010 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend.common;

/**
 * @author André Arnold - Initial contribution and API
 */
public class FutureResultHolder {
	
	private Object _value;
	private QualifiedName _name;
	private boolean _isReady = false;
	private Function _function;
	private ExpressionBase _expression;
	
	public FutureResultHolder() {
		
	}
	
	public FutureResultHolder(Function function) {
		_function = function;
	}
	
	public FutureResultHolder(ExpressionBase expression) {
		_expression = expression;
	}

	public FutureResultHolder(QualifiedName name, Function function) {
		super();
		_name = name;
		_function = function;
	}
	
	public Object evaluate (ExecutionContext ctx) throws FutureResultNotReadyException {
		if (_function != null) {
			return _function.invoke (ctx, new Object[]{});
		} else if (_expression != null) {
			_expression.evaluate (ctx);
		} else {
			throw new FutureResultNotReadyException();
		}
		return null;
	}

	public Object getValue () throws FutureResultNotReadyException {
		if (!_isReady)
			throw new FutureResultNotReadyException();
		return _value;
	}

	public void setValue (Object value) {
		_value = value;
		_isReady = true;
	}
	
	public QualifiedName getName() {
		return _name;
	}

	public boolean isReady () {
		return _isReady;
	}
	
	public Function getFunction() {
		return _function;
	}

	public void setFunction(Function _function) {
		this._function = _function;
	}

	public ExpressionBase getExpression() {
		return _expression;
	}

	public void setExpression(ExpressionBase _expression) {
		this._expression = _expression;
	}

	@Override
	public String toString () {
		if (!_isReady)
			throw new FutureResultNotReadyException();
		if (_value == null)
			return "";
		return _value.toString();
	}
}
