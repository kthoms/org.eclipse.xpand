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

import org.eclipse.m2t.common.recipe.core.CompositeCheck;

public class DummyCompCheck extends CompositeCheck {
	
	private static final long serialVersionUID = 1L;

	public DummyCompCheck() {
		super("comp", "a simple comp test" );
		setParameter("cc", "yy");
		
	}

}
