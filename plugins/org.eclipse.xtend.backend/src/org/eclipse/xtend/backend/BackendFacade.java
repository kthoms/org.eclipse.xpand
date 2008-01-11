package org.eclipse.xtend.backend;

import java.util.List;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.FunctionDefContext;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class BackendFacade {
	public static ExecutionContext createExecutionContext (FunctionDefContext initialContext, BackendTypesystem typesystem) {
		return new ExecutionContextImpl (initialContext, typesystem);
	}
	
	public static Object invoke (ExecutionContext ctx, String functionName, List<? extends Object> params) {
		return ctx.getFunctionDefContext().invoke(ctx, functionName, params);
	}
}
