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
package org.eclipse.m2t.common.recipe.workflow;

import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowComponentHelper;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.io.CheckRegistry;

public abstract class RecipeCreationComponent extends AbstractWorkflowComponent {

	private org.apache.commons.logging.Log log = LogFactory.getLog(getClass());
	private String recipeFileName;
	private String appProject;
	private String modelSlot;

	public String getLogMessage() {
		return "recipes => '"+recipeFileName+"'";
	}
	
	public final void setRecipeFile( String recipeFile ) {
		this.recipeFileName = recipeFile;
	}
	
	public final void setAppProject( String pname ) {
		this.appProject = pname;
	}
	
	public final void setModelSlot( String s ) {
		this.modelSlot = s;
	}
	
	protected final void checkConfigurationInternal(Issues issues) {
		if ( !WorkflowComponentHelper.isParamSet( recipeFileName )) issues.addError( this, "no recipeFile specified. " );
		if ( !WorkflowComponentHelper.isParamSet( appProject )) issues.addError( this, "no appProjectName specified. " );
		if ( !WorkflowComponentHelper.isParamSet( modelSlot )) issues.addError( this, "no modelSlot specified. " );
	}
	
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		Object modelSlotContent = ctx.get(modelSlot);
		Collection<Check> l = createRecipes(modelSlotContent, appProject);
		if ( l == null ) return;
		for (Iterator<Check> iter = l.iterator(); iter.hasNext();) {
			Check c = (Check) iter.next();
			CheckRegistry.addCheck( c );
		}
		CheckRegistry.setChecksFileName( recipeFileName );
		log.info( "writing recipes to "+recipeFileName);
		CheckRegistry.dumpToFile();
	}

	protected abstract Collection<Check> createRecipes(Object modelSlotContent, String appProject2);


	
}
