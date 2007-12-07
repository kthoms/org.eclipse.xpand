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
package org.eclipse.xtend.shared.ui.editor.search.view;

/**
 * <code>IFileSearchContentProvider</code> provides extra methods for updating
 * result sets.
 * 
 * @author Peter Friese
 */
public interface IFileSearchContentProvider {

	public abstract void elementsChanged(Object[] updatedElements);

	public abstract void clear();

}