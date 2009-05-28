/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xpand.internal.tests.util;

import java.io.IOException;
import java.io.InputStream;

/**
 * This Class wraps an InputStream and prints each read character to system out.
 * Special characters like \\r, \\n and EOF are treated specially.
 */
/**
 * *
 * 
 * @author Sven Efftinge (http://www.efftinge.de) *
 */
public class InputStreamLogger extends InputStream {

    private InputStream is;

    public InputStreamLogger(final InputStream is) {
        this.is = is;
    }

    @Override
    public int read() throws IOException {
        final int t = is.read();
        if (t == 13) {
		} else if (t == 10) {
		} else if (t == -1) {
		} else if (t < 32) {
		} else
			String.valueOf((char) t);

        return t;
    }

}
