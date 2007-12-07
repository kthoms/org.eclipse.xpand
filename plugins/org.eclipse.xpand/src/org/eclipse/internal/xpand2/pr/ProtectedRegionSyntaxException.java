/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.internal.xpand2.pr;

public class ProtectedRegionSyntaxException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -1949446920364589329L;

	public ProtectedRegionSyntaxException(final String string) {
        super(string);
    }

    public ProtectedRegionSyntaxException(final String string, final Throwable ie) {
        super(string, ie);
    }

}
