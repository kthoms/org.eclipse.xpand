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
	
	public FutureResultHolder() {
	}

	public FutureResultHolder(QualifiedName name) {
		super();
		_name = name;
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
	
	@Override
	public String toString () {
		if (!_isReady)
			throw new FutureResultNotReadyException();
		if (_value == null)
			return "";
		return _value.toString();
	}
}
