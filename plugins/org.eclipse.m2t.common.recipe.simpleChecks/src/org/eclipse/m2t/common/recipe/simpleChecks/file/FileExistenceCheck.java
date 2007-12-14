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

package org.eclipse.m2t.common.recipe.simpleChecks.file;

import java.io.File;

import org.eclipse.m2t.common.recipe.core.AtomicCheck;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;

public class FileExistenceCheck extends AtomicCheck {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2078121954544879502L;
	protected String absoluteFileName;

	public FileExistenceCheck( String message, String absoluteFileName ) {
		super( "file exists", message );
		setAbsoluteFileName( absoluteFileName );
	}
	
	protected void setAbsoluteFileName(String fn) {
		this.absoluteFileName = fn;
		setParameter( "file name", absoluteFileName );
	}

	public void evaluate(EvaluationContext ctx) {
		if ( new File( absoluteFileName ).exists() ) ok();
		else fail("file not found: "+absoluteFileName);
	}

}
