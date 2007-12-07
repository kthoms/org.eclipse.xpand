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
package org.eclipse.m2t.common.recipe.core;

public class EvalStatus {

	public static final int UNDETERMINED = 0;
	public static final int OK = 1;
	public static final int FAILED = 2;
	public static final int SOMECHILDRENFAILED = 3;
	public static final int SKIPPED = 4;
	
}
