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

package org.eclipse.m2t.common.recipe.astChecks.checks;

import org.eclipse.m2t.common.recipe.core.EvalTrigger;
import org.eclipse.m2t.common.recipe.util.EclipseCheck;

public class PropertyFileExistenceCheck extends EclipseCheck {

	private static final long serialVersionUID = 2L;

	public PropertyFileExistenceCheck(String message, String projectName, String resourceName, String propertyName,
			String propertyVal) {
		super("property file exists", message, EvalTrigger.ON_CHANGE);
		setProjectName(projectName);
		setResourceName(resourceName);
		setPropertyName(propertyName);
		setPropertyVal(propertyVal);
	}

	public PropertyFileExistenceCheck(String message, String projectName, String resourceName, String propertyName) {
		this(message, projectName, resourceName, propertyName, null);
	}

	public PropertyFileExistenceCheck(String message, String projectName, String resourceName) {
		this(message, projectName, resourceName, null);
	}

	private void setPropertyName(String propertyName) {
		setParameter("propertyName", propertyName);
	}

	private void setPropertyVal(String propertyVal) {
		setParameter("propertyVal", propertyVal);
	}

	private void setProjectName(String projectName) {
		setParameter("projectName", projectName);
	}

	private void setResourceName(String resourceName) {
		setParameter("propertyFileLoc", resourceName);
	}

}
