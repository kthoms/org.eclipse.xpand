/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.expression;

/**
 * @author Karsten Thoms - Initial contribution and API
 */
public final class Encoding {
	private String encoding;
	
	public Encoding (String encoding) {
		if (encoding == null) {
			throw new IllegalArgumentException(encoding);
		}
		this.encoding = encoding; 
	}
	
	@Override
	public String toString() {
		return encoding;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof Encoding) {
			return ((Encoding)other).encoding.equals(this.encoding);
		} else {
			return false;
		}
	}
}
