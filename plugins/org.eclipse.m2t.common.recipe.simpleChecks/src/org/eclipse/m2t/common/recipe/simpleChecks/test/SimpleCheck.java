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

package org.eclipse.m2t.common.recipe.simpleChecks.test;

import org.eclipse.m2t.common.recipe.core.AtomicCheck;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.core.EvalTrigger;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;

public class SimpleCheck extends AtomicCheck {
	
	private static final long serialVersionUID = 1L;

	public SimpleCheck() {
		super("test", "a simple test", EvalTrigger.ON_REQUEST);
		setParameter( "p1", "v1" );
		setParameter( "p2", "v2" );
	}

	public void evaluate( EvaluationContext ctx ) {
		setStatus( EvalStatus.OK );
	}

}
