/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.m2t.common.recipe.util;

import org.eclipse.m2t.common.recipe.core.AtomicCheck;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.core.EvalTrigger;
import org.eclipse.m2t.common.recipe.core.EvaluationStop;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;

public abstract class EclipseCheck extends AtomicCheck {

	private static final long serialVersionUID = 1L;
//	private static List classloaders;
	
	public EclipseCheck( String name, String description, int trigger ) {
		super(name, description, trigger);
	}
	
	public EclipseCheck( String name, String description ) {
		this(name, description, EvalTrigger.ON_REQUEST);
	}	
	
//	public static void setClassloaders( List list ) {
//		classloaders = list;
//	}
	
	
	public final void evaluate(EvaluationContext ctx) {
		if ( ctx.evaluateBatchOnly() ) {
			setStatus( EvalStatus.SKIPPED );
			setStatusMessage( "skipped - mode was batch only." );
			return;
		}
		String cn = this.getClass().getName();
		Class<?> cls = null;
		try {
			cls = resolveClass( cn+"Evaluator" );
			if ( cls == null ) {
				fail("ERROR: cannot load evaluator class: "+cn);
			}
		} catch ( Throwable t ) {
			fail("ERROR: cannot load evaluator class: "+cn);
		}
		Object o = null;
		try {
			o = cls.newInstance();
		} catch ( Throwable t ) {
			fail("ERROR: cannot instantiate evaluator class: "+cn);
		}
		try {
			ICheckEvaluator eval = (ICheckEvaluator)o;
			eval.evaluate(this);
		} catch ( ClassCastException t ) {
			fail("ERROR: cannot cast evaluator object to ICheckEvaluator");
		} catch ( EvaluationStop t ) {
			throw t;
		}
	}

	private Class<?> resolveClass(String cn) {
			try {
				return Class.forName(cn);
			} catch (ClassNotFoundException ignore) {}
		return null;
	}

	public boolean isInteractive() {
		return true;
	}
	
}
