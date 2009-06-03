/*
Copyright (c) 2009 Andr� Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Andr� Arnold - initial API and implementation
*/
package org.eclipse.xtend.middleend.javaannotations;

import java.util.List;

import org.eclipse.xtend.backend.aop.ThisJoinPoint;

public class TestAdvice {

	@M2tAroundAdvice (pointcut = @M2tPointcut (namePattern = "someFunction"))
	public Object simpleAspect (ThisJoinPoint jp) {
		return "pre " + jp.proceed (jp.getParameters ()) + " post";
	}
	
	@M2tAroundAdvice (pointcut = @M2tPointcut (namePattern = "testJavaAnnAdv*", paramTypeNames = {"String", "String"}, hasVarArgs = true))
	public Object paramAspect (ThisJoinPoint jp) {
		List<?> params = jp.getParameters ();
		return "pre2 " + jp.proceed (params) + " post2";
	}
}
