/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.syslib;

/**
 * This interface represents a postprocessor that is given access to
 *  the contents of a file before it is written.<br>
 *  
 * The unprocessed CharSequence may be an EfficientLazyString that
 *  is not yet serialized, waiting for streaming. It should be noted
 *  that in this - common - case any postprocessing may impact 
 *  performance.<br>
 *  
 * The returned CharSequence is used. It is okay to modify the parameter
 *  that was passed in, but the returned object is what will be 
 *  processed by the subsequent steps in the pipeline.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface InMemoryPostprocessor {
    CharSequence process (CharSequence unprocessed, String uri);
}
