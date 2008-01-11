package org.eclipse.xtend.backend.common;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class LocalVarContext {
    private final Map<String, Object> _localVars = new HashMap<String, Object>();
    
    public LocalVarContext () {
    }
    
    public LocalVarContext (Object thisValue) {
        _localVars.put(Constants.THIS_NAME, thisValue);
    }
    
    public Map<String, Object> getLocalVars() {
        return _localVars;
    }
    
    public boolean hasThis() {
        return _localVars.containsKey(Constants.THIS_NAME);
    }
    
    public Object getThis() {
        return _localVars.get(Constants.THIS_NAME);
    }
}
