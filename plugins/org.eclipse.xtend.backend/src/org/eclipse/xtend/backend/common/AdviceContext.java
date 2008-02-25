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
import java.util.Map;

import org.eclipse.xtend.backend.aop.AdvisedFunction;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.util.ObjectWrapper;
import org.eclipse.xtend.backend.util.Triplet;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface AdviceContext {
    AdviceContext copyWithAdvice (AroundAdvice advice);
    AdvisedFunction getAdvice (String functionName, Function f);
    public Map<Triplet<Function, AroundAdvice, List<?>>, ObjectWrapper> getResultCache ();
}
