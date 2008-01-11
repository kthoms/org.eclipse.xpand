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
