/**
 * <copyright> 
 *
 * Copyright (c) 2009 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.emf.editor;

import java.util.List;

import org.eclipse.swt.widgets.Control;

/**
 * @author Dennis Huebner
 * 
 */
public class MessageData {
	private Object key;
	private String message;
	private List<?> data;
	private int status;
	private Control control;

	public MessageData(Object key, String message, List<?> data, int status, Control control) {
		super();
		this.key = key;
		this.message = message;
		this.data = data;
		this.status = status;
		this.control = control;
	}

	public MessageData(Object key, String message, List<?> data, int status) {
		this(key, message, data, status, null);
	}

	public Object getKey() {
		return key;
	}

	public void setKey(Object key) {
		this.key = key;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control c) {
		this.control = c;
	}

}