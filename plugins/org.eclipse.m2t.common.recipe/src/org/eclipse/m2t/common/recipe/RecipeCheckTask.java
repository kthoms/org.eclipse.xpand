/*******************************************************************************
 * Copyright (c) 2005, 2006 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.m2t.common.recipe;


import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.CompositeCheck;
import org.eclipse.m2t.common.recipe.core.EvalStatus;
import org.eclipse.m2t.common.recipe.eval.CheckEvaluationListener;
import org.eclipse.m2t.common.recipe.eval.CheckEvaluator;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;
import org.eclipse.m2t.common.recipe.io.CannotLoadChecksException;
import org.eclipse.m2t.common.recipe.io.CheckRegistry;

public class RecipeCheckTask extends Task implements CheckEvaluationListener {
	
	static Log logger = LogFactory.getLog(RecipeCheckTask.class);
	private String recipeFileName;
	
	public void execute() throws BuildException {
		File f = new File( recipeFileName );
		if  ( !f.exists() ) {
			logger.error("recipe file not found: "+recipeFileName);
			return;
		}
		logger.info("checking recipes from file: "+recipeFileName);
		CheckRegistry.setChecksFileName( recipeFileName );
		try {
			CheckRegistry.loadFromFile();
		} catch (CannotLoadChecksException e1) {
			logger.error("cannot load recipe file: "+recipeFileName);
			return;
		}
		EvaluationContext ctx = new EvaluationContext();
		ctx.setBatchOnly(true);
		CheckEvaluator e = new CheckEvaluator(ctx);
		e.addListener( this );
		e.evaluate( CheckRegistry.getChecks() );
		
	}

	public void evaluated(Check c, boolean actuallyChecked) {
		if ( c instanceof CompositeCheck ) return; 
		if ( c.getStatus() == EvalStatus.OK ) {
			logger.debug( "[ok] "+c.getName() + " -- "+c.getShortDescription() );
		}
		if ( c.getStatus() == EvalStatus.SKIPPED ) {
			logger.debug( "[skipped] "+c.getName()+" -- "+c.getStatusMessage() );
		}
		if ( c.getStatus() == EvalStatus.FAILED ) {
			logger.error( "[error] "+c.getShortDescription()+" -- "+c.getStatusMessage() );
		}
	}
	
	public void setRecipeFile( String recipeFileName ) {
		this.recipeFileName = recipeFileName;
	}
	
	

}
