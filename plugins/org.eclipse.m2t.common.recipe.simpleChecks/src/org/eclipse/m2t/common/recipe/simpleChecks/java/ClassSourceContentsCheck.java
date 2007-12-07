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
package org.eclipse.m2t.common.recipe.simpleChecks.java;

import org.eclipse.m2t.common.recipe.eval.EvaluationContext;
import org.eclipse.m2t.common.recipe.simpleChecks.file.FileContentsHelper;

public class ClassSourceContentsCheck extends ClassSourceExistenceCheck {

	private static final long serialVersionUID = -7129376022523632888L;

	private String substring;

	public ClassSourceContentsCheck(String message, String srcDir, String fqClassName, String substr) {
		super(message, srcDir, fqClassName);
		setSubstring(substr);
	}

	private void setSubstring(String substr) {
		this.substring = substr;
		setParameter("substring", substring);
	}

	public void evaluate(EvaluationContext ctx) {
		super.evaluate(ctx);
		FileContentsHelper.checkContent(this, absoluteFileName, substring);
	}

}
