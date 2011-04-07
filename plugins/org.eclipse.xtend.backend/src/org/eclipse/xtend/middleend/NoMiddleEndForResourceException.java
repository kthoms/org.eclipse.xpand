/*******************************************************************************
 * Copyright (c) 2011 André Arnold and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.middleend;

/**
 * @author André Arnold - Initial contribution and API
 */
public class NoMiddleEndForResourceException extends RuntimeException {

	public NoMiddleEndForResourceException(String message) {
		super (message);
	}

	public NoMiddleEndForResourceException(String message, Throwable cause) {
		super(message, cause);
	}

	private static final long serialVersionUID = 1L;

}
