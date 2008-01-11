package org.eclipse.xtend.backend.common;

import java.util.List;


/** 
 * This abstraction takes care of caching.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */ 
public interface FunctionInvoker {
    Object invoke (ExecutionContext ctx, Function f, List<?> params);

}
