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

package org.eclipse.xtend.shared.ui.core.preferences;

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceConstants {
	
    public static final String METAMODELCONTRIBUTORS = "metamodelContributor";
    
	/** Key for setting: project specific metamodels are used */
	public static final String PROJECT_SPECIFIC_METAMODEL = "project.specific.metamodel";
	
	public static final String INCREMENTAL_ANALYZER_STRATEGY = "incrementalAnalyzerStrategy";
	
	public static final int INCREMENTAL_ANALYZER_STRATEGY_PROJECT_AND_DEPENDENT = 0;
	public static final int INCREMENTAL_ANALYZER_STRATEGY_PROJECT = 1;
	public static final int INCREMENTAL_ANALYZER_STRATEGY_FILE_ONLY = 2;
	public static final int INCREMENTAL_ANALYZER_STRATEGY_FILE_ONLY_WITH_REVERSE_REFERENCE=3;
}
