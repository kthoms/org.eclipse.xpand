/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.core.builder;


/**
 * @author Benedikt Niehues - Initial contribution and API
 */
public class MarkerObject{
	private String message;
	private int severity;
	private int start;
	private int end;
	
	public MarkerObject(final String message,
        final int severity, final int start, final int end){
		setMessage(message);
		setSeverity(severity);
		setStart(start);
		setEnd(end);
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	@Override
	public int hashCode() {
			final int prime = 15;
			int result = 1;
			result = prime * result + ((message == null) ? 0 : message.hashCode());
			result = prime * result + end;
			result = prime * result + start;
			result = prime * result + severity;
			return result;
	}

	@Override
	public boolean equals(Object obj) {
			if (this==obj)return true;
			if (obj instanceof MarkerObject){
				MarkerObject other = (MarkerObject)obj;
				if (other.end == end && other.start == start && other.severity==severity && other.message.equals(message)) return true;
			}
			return false;
	}
}