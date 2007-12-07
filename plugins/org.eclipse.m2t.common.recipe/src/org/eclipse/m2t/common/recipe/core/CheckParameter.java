/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Markus Voelter and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.core;

import java.io.Serializable;

public class CheckParameter implements Serializable {

	private static final long serialVersionUID = -8611695933417502115L;

	private String key;

	private Serializable value;

	private Check owner;

	public CheckParameter(Check owner, String key, Serializable value) {
		this.owner = owner;
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Serializable getValue() {
		return value;
	}

	public void setValue(Serializable value) {
		this.value = value;
	}

	public Check getOwner() {
		return owner;
	}

	public String toString() {
		return getKey() + ": " + getValue().toString();
	}

}
