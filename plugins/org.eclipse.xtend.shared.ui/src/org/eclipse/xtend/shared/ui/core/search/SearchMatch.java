/*******************************************************************************
 * Copyright (c) 2005 - 2007 committers of openArchitectureWare and others. All
 * rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: committers of openArchitectureWare - initial API and
 * implementation
 ******************************************************************************/
package org.eclipse.xtend.shared.ui.core.search;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IStorage;

/**
 * @author Sven Efftinge (http://www.efftinge.de)
 */
public class SearchMatch {
	private int offSet;
	private int length;
	private IStorage storage;
	public SearchMatch(int offSet, int length, IStorage file) {
		super();
		this.offSet = offSet;
		this.length = length;
		this.storage = file;
	}
	public int getOffSet() {
		return offSet;
	}
	public int getLength() {
		return length;
	}
	public IFile getFile() {
		return storage instanceof IFile ? (IFile) storage : null;
	}

	public IStorage getStorage() {
		return storage;
	}
	
	@Override
	public int hashCode() {
		return storage.getFullPath().hashCode()*offSet*length;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj==null)
			return false;
		if (obj == this)
			return true;
		if (obj instanceof SearchMatch) {
			SearchMatch tc = (SearchMatch) obj;
			return tc.getFile().equals(getFile()) && tc.getOffSet() == getOffSet() && tc.getLength() == getLength();
		}
		return false;
	}
	
	@Override
	public String toString() {
		return getFile().getFullPath()+":"+getOffSet()+"(+"+getLength()+")";
	}
}
