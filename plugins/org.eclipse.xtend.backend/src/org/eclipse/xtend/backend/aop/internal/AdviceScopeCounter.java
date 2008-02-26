/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
*/
package org.eclipse.xtend.backend.aop.internal;


/**
 * This abstraction serves to keep track of whether execution currently is within advice or not.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface AdviceScopeCounter {
    void enterAdvice ();
    void leaveAdvice ();
    
    boolean isWithinAdvice ();
}
