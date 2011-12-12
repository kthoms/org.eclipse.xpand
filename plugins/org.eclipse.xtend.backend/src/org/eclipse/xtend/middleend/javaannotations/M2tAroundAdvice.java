/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.middleend.javaannotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * Methods marked with this annotation are treated as "around" advice
 *  rather than functions. They must take exactly two parameters of the
 *  types ThisJoinPointStaticPart and ThisJoinPoint, respectively.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.METHOD)
public @interface M2tAroundAdvice {
	M2tPointcut pointcut();
    //TODO add name matching pattern
    //TODO add type parameters for the function params, including support for wildcard arguments
}
