/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.util.stdlib;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Java helper class for Stdlib extension <tt>org::openarchitectureware::util::stdlib::cloning</tt>.
 * Contains extension functions for logging messages and errors.
 */
public class IOExtensions {
    private final static Log log = LogFactory.getLog(IOExtensions.class);

    public final static void syserr(final Object s) {
    	System.err.println(s);
    }

    public final static void syserr(final Object s, String prefix) {
    	System.err.println("["+prefix+"] "+s);
    }

    public final static void debug(final Object s) {
        log.debug(s);
    }

    public final static void info(final Object s) {
        log.info(s);
    }

    public final static void error(final Object s) {
        log.error(s);
    }
    public final static void throwError(final Object s) {
    	throw new IllegalStateException(""+s);
    }

}
