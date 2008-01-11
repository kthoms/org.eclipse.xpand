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
