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
package org.eclipse.m2t.common.recipe.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.m2t.common.recipe.eval.EvaluationContext;


public class CompositeCheck extends Check {
	
	private static final long serialVersionUID = 1L;

	private List<Check> children = new ArrayList<Check>();
	
	public CompositeCheck( String name, String description ) {
		super(name, description );
	}
	
	public void evaluate( EvaluationContext ctx ) {
		if ( children == null ) return;
		for (Iterator<Check> iter = children.iterator(); iter.hasNext();) {
			Check c = iter.next();
			try {
				ctx.getEvaluator().evaluate( c );
			} catch ( EvaluationStop ignore ) {}
		}
	}
	
	public int getStatus() {
		int stat = EvalStatus.OK;
		for (Iterator<Check> iter = children.iterator(); iter.hasNext();) {
			Check c = iter.next();
			int s = c.getStatus();
			if ( s == EvalStatus.FAILED ) stat = EvalStatus.SOMECHILDRENFAILED;
			if ( s == EvalStatus.SOMECHILDRENFAILED ) stat = EvalStatus.SOMECHILDRENFAILED;
			if ( s == EvalStatus.UNDETERMINED ) stat = EvalStatus.SOMECHILDRENFAILED;
		}
		return stat;
	}
	
	public List<Check> getChildren() {
		return children;
	}
	
	public void addChild(Check c) {
		children.add( c );
		c.setParent( this );
	}
	
	public boolean hasChildren() {
		return children != null;
	}
	
	public void collectChildren( List<Check> l ) {
		for (Iterator<Check> iter = children.iterator(); iter.hasNext();) {
			Check c = iter.next();
			l.add( c );
			c.collectChildren(l);
		}
	}
	
	public int getCheckCount() {
		int count = 0;
		for (Iterator<Check> iter = children.iterator(); iter.hasNext();) {
			Check c = iter.next();
			count += c.getCheckCount();
		}
		return count;
	}
	
	public int getTrigger() {
		for (Iterator<Check> iter = children.iterator(); iter.hasNext();) {
			Check c = iter.next();
			if ( c.getTrigger() == EvalTrigger.ON_CHANGE ) return EvalTrigger.ON_CHANGE;
		}
		return EvalTrigger.ON_REQUEST;
	}
	
}
