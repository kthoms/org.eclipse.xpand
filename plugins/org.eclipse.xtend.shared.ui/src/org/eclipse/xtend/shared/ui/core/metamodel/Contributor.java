/*******************************************************************************
 * Copyright (c) 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.core.metamodel;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.xtend.shared.ui.MetamodelContributor;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

/**
 * Private class representing a metamodel contributor.
 * 
 * @author Peter Friese
 */
public class Contributor {
	private String displayName;

	private String className;

	private IConfigurationElement element;
	
	/**
	 * Creates a new Contributor instance.
	 * 
	 * @param displayName
	 *            The display name of the metamodel contributor.
	 * @param className
	 *            The class name of the metamodel contributor.
	 * @param element 
	 */
	public Contributor(String displayName, String className, IConfigurationElement element, boolean enabled) {
		super();
		this.displayName = displayName;
		this.className = className;
		this.element = element;
	}

	public String getDisplayName() {
		return displayName;
	}

	public String getClassName() {
		return className;
	}

	@Override
	public boolean equals(Object other) {
		if (other instanceof Contributor) {
			Contributor otherContributor = (Contributor) other;
			if (otherContributor.getClassName().equals(this.getClassName()) && otherContributor.getDisplayName().equals(this.getDisplayName())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return getClassName().hashCode() + getDisplayName().hashCode();
	}

	@Override
	public String toString() {
		return "Metamodel contributor '" + displayName + "'" + " [" + className + "]";
	}
	
	public MetamodelContributor getMetaModelContributor() {
		try {
			return (MetamodelContributor) element.createExecutableExtension("class");
		} catch (CoreException e) {
			XtendLog.logError(e);
			return null;
		}
	}
}