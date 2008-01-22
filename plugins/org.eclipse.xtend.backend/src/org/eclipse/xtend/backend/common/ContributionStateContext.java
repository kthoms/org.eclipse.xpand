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

import java.util.HashMap;
import java.util.Map;


/**
 * This class serves as "black box" storage for runtime state contributors may wish to store. It is
 *  accessed by a "unique key" which must be chosen by the contributor to be guaranteed unique. The
 *  recommended best practice is to use a Class object specific to the contributor.<br>
 *  
 * This state is re-initialized for every new ExecutionContext.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class ContributionStateContext {
    private Map<Object, Object> _state = new HashMap<Object, Object>();
    
    public Object retrieveState (Object uniqueKey) {
        return _state.get (uniqueKey);
    }
     
    public void storeState (Object uniqueKey, Object state) {
        _state.put (uniqueKey, state);
    }
}
