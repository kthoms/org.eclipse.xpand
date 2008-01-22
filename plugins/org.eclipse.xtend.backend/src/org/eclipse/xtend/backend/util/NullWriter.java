/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.util;

import java.io.IOException;
import java.io.Writer;


/**
 * This writer ignores all written data.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class NullWriter extends Writer {

    @Override
    public void close () throws IOException {
    }

    @Override
    public void flush () throws IOException {
    }

    @Override
    public void write (char[] cbuf, int off, int len) throws IOException {
    }
}
