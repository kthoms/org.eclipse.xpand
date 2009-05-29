/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xtend.shared.ui.core;

import org.eclipse.core.resources.IStorage;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Resource;

public interface IXtendXpandResource extends Resource {

    public IStorage getUnderlyingStorage();

    /**
     * analyzes the underlying AST and adds respective markers to the
     * underlying IFile (getCorrspondingFile())
     */
    public void analyze(ExecutionContext ctx);

    /**
     * updates the underlying AST
     * @return true if the source could be parsed and an AST is available
     */
    public boolean refresh();

    /**
     * returns the root element of the AST
     * @return
     */
	public Resource getExtXptResource();
	
	public String getFileExtension();
}
