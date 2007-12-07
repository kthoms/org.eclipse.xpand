/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Markus Voelter and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.simpleChecks.test;

import org.eclipse.m2t.common.recipe.core.AtomicCheck;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.core.EvalTrigger;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;

public class SimpleFailingCheck extends AtomicCheck {
	
	private static final long serialVersionUID = 1L;

	public SimpleFailingCheck() {
		super("test", "a simple failing test", EvalTrigger.ON_REQUEST);
		setLongDescription( "lfds saj fojroe toe ldxyjfoire utaldsfjoer utlfdjcosa iutoe jfdoure tojdfvsdtoösad htpewoirfadstzwer" );
	}

	public void evaluate( EvaluationContext ctx ) {
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setStatus( EvalStatus.FAILED );
	}

}
