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

package org.eclipse.m2t.common.recipe.simpleChecks.java;

import org.eclipse.m2t.common.recipe.simpleChecks.file.FileExistenceCheck;

public class ClassSourceExistenceCheck extends FileExistenceCheck {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6785439681285163193L;

	public ClassSourceExistenceCheck(String message, String srcDir, String fqClassName) {
		super(message, "");
		setParameter("class name", fqClassName);
		setParameter("src dir", srcDir);
		setAbsoluteFileName(srcDir + "/" + classNameToFileName(fqClassName));
	}

	private String classNameToFileName(String fqClassName) {
		String s = fqClassName.replace('.', '/');
		return s + ".java";
	}

}
