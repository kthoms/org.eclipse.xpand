/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
*/
package org.eclipse.xtend.backend;

import java.util.List;

import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.backend.internal.ExecutionContextImpl;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public class BackendFacade {
	public static ExecutionContext createExecutionContext (FunctionDefContext initialContext, BackendTypesystem typesystem, boolean logStacktrace) {
		return new ExecutionContextImpl (initialContext, typesystem, logStacktrace);
	}
	
	public static Object invoke (ExecutionContext ctx, String functionName, List<? extends Object> params) {
		return ctx.getFunctionDefContext().invoke(ctx, functionName, params);
	}
}
