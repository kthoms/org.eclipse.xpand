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

package org.eclipse.m2t.common.recipe.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.m2t.common.recipe.eval.EvaluationContext;

public abstract class Check implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private CompositeCheck parent;
	private String name;
	private String shortDescription;
	private String longDescription;
	private Map<String, CheckParameter> params = null;
	
	public Check( String name, String description ) {
		this.name = name;
		this.shortDescription = description;
		setParameter( "_type", getClass().getName() );
	}
	
	public void setParameter( String name, Serializable value ) {
		if ( params == null ) params = new HashMap<String, CheckParameter>();
		params.put( name, new CheckParameter( this, name, value ) );
	}
	
	public Collection<CheckParameter> getParameters() {
		if ( params == null ) params = new HashMap<String, CheckParameter>();
		return params.values();
	}
	
	public CheckParameter getParameter( String name ) {
		CheckParameter ret = null;
		if ( params != null ) {
			ret = params.get(name);
			if ( ret != null ) return ret;
		}
		Map<String, CheckParameter> m = getIndirectParameterMap();
		return m.get(name);
	}
	
	public String getParameterString( String name ) {
		CheckParameter p = getParameter(name);
		if ( p.getValue() != null ) return p.getValue().toString();
		return null;
	}
	
	private Map<String, CheckParameter> getIndirectParameterMap() {
		List<Check> l = new ArrayList<Check>();
		collectParents(l);
		Map<String, CheckParameter> map = new HashMap<String, CheckParameter>();
		Collections.reverse(l);
		for (Iterator<Check> iter = l.iterator(); iter.hasNext();) {
			Check c = iter.next();
			for (Iterator<CheckParameter> iterator = c.getParameters().iterator(); iterator.hasNext();) {
				CheckParameter p = iterator.next();
				map.put( p.getKey(), p );
			}
		}
		return map;
	}
	
	public Collection<CheckParameter> getIndirectParameters() {
		return getIndirectParameterMap().values();
	}
	
	public void setParent( CompositeCheck c ) {
		parent = c;
	}
	
	public CompositeCheck getParent() {
		return parent;
	}
	
	public void collectParents( List<Check> l ) {
		if ( getParent() != null ) {
			l.add( getParent() );
			getParent().collectParents( l );
		}
	}
	
	public void collectChildren( List<Check> l ) {
	}
	
	public abstract void evaluate( EvaluationContext c );

	public abstract int getStatus();

	public String getStatusMessage() {
		return null;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription( String d ) {
		longDescription = d;
	}

	public String getName() {
		return name;
	}
	
	public abstract int getTrigger();
	
	public abstract int getCheckCount();
	
	public boolean isInteractive() {
		return false;
	}	
	
	
}
