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
package org.eclipse.m2t.common.recipe.eval;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.CheckSet;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.core.EvalTrigger;
import org.eclipse.m2t.common.recipe.core.EvaluationStop;

public class CheckEvaluator {

	private List<CheckEvaluationListener> listeners;
	private EvaluationContext context;

	public CheckEvaluator( EvaluationContext c ) {
		this.context = c;
	}
	
	public void addListener( CheckEvaluationListener l ) {
		if ( listeners == null ) listeners = new ArrayList<CheckEvaluationListener>();
		listeners.add( l );
	}
	
	protected void notify( Check c, boolean checked ) {
		if ( listeners == null ) return;
		for (Iterator<CheckEvaluationListener> iter = listeners.iterator(); iter.hasNext();) {
			CheckEvaluationListener l = iter.next();
			l.evaluated(c, checked);
		}
	}
	
	public void evaluate( CheckSet checks ) {
		context.setCheckEvaluator(this);
		if ( checks != null ) {
			for (Iterator<Check> iter = checks.getChecks().iterator(); iter.hasNext();) {
				Check c = iter.next();
				evaluate( c );
			}
		}
	}
	
	public void evaluate( Check c ) {
		context.setCheckEvaluator(this);
		if ( ( c.getTrigger() == EvalTrigger.ON_CHANGE && context.evaluateOnChangeTriggeredCheck() ) || 
			 ( c.getTrigger() == EvalTrigger.ON_REQUEST && context.evaluateOnRequestTriggeredCheck() ) ) {
			if ( context.reevaluateAlreadyEvaluated() ) {
				try {
					c.evaluate( context );
				} catch ( EvaluationStop ignore ) {}
				notify(c, true);
			} else {
				if ( c.getStatus() != EvalStatus.OK ) {
					try {
						c.evaluate( context );
					} catch ( EvaluationStop ignore ) {}
					notify(c, true);
				} else {
					notify(c,false);  
				}	
			}
		}
	}
	
}
