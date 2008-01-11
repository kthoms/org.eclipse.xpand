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
