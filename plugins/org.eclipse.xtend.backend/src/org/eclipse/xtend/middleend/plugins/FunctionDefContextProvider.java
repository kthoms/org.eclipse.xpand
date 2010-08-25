/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.middleend.plugins;

import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.middleend.MiddleEnd;

/**
 * @author aarnold - Initial contribution and API
 */
public interface FunctionDefContextProvider {
	
    /**
     * This method is used to break the circular dependency between MiddleEnd and the
     *  language specific handlers. It is called by the MiddleEnd on creation.
     */
    void setMiddleEnd (MiddleEnd middleEnd);
    
    String getName ();
    
    /**
     * gives the middle end a way to declare if it can and wants to handle a given
     *  source file / resource. If and only if it returns true, it will be asked for
     *  the functions and advice provided in this resource.
     */
    boolean canHandle (String resourceName);

	public FunctionDefContext getFdc (String resourceName);

}
