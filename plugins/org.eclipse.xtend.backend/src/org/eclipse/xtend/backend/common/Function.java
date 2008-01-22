/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.common;

import java.util.List;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface Function {
    List<? extends BackendType> getParameterTypes ();
    
    /**
     * this method is permitted to modify the param array that is passed in
     */
    Object invoke (ExecutionContext ctx, Object[] params);
    boolean isCached ();
    
    /** returns the expression that guards this function - or null, if there is no guard.*/
    ExpressionBase getGuard();
}
