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
package org.eclipse.m2t.common.recipe.astChecks.checks;

import org.eclipse.m2t.common.recipe.core.EvalTrigger;
import org.eclipse.m2t.common.recipe.util.EclipseCheck;

public class ResourceExistenceCheck extends EclipseCheck {
	
	private static final long serialVersionUID = 2L;

	public ResourceExistenceCheck( String message, String projectName, String resourceName ) {
		super( "resource exists", message, EvalTrigger.ON_CHANGE );
		setProjectName( projectName );
		setResourceName( resourceName );
	}

	private void setProjectName(String projectName) {
		setParameter( "projectName", projectName );
	}

	private void setResourceName(String resourceName) {
		setParameter( "resourceName", resourceName );
	}

}
