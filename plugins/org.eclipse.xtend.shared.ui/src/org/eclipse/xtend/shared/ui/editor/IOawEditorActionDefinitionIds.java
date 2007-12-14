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
package org.eclipse.xtend.shared.ui.editor;

import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;

/**
 * Defines the definition IDs for the Java editor actions.
 * 
 * <p>
 * This interface is not intended to be implemented or extended.
 * </p>.
 * 
 * @since 2.0
 */
public interface IOawEditorActionDefinitionIds extends ITextEditorActionDefinitionIds {

	// search

	/**
	 * Action definition ID of the search -> references in workspace action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.references.in.workspace"</code>).
	 */
	public static final String SEARCH_REFERENCES_IN_WORKSPACE = "org.eclipse.internal.xtend.editor.search.references.in.workspace"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> references in project action (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.references.in.project"</code>).
	 */
	public static final String SEARCH_REFERENCES_IN_PROJECT = "org.eclipse.jdt.ui.edit.text.java.search.references.in.project"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> references in hierarchy action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.references.in.hierarchy"</code>).
	 */
	public static final String SEARCH_REFERENCES_IN_HIERARCHY = "org.eclipse.jdt.ui.edit.text.java.search.references.in.hierarchy"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> references in working set action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.references.in.working.set"</code>).
	 */
	public static final String SEARCH_REFERENCES_IN_WORKING_SET = "org.eclipse.jdt.ui.edit.text.java.search.references.in.working.set"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> read access in workspace action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.read.access.in.workspace"</code>).
	 */
	public static final String SEARCH_READ_ACCESS_IN_WORKSPACE = "org.eclipse.jdt.ui.edit.text.java.search.read.access.in.workspace"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> read access in project action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.read.access.in.project"</code>).
	 */
	public static final String SEARCH_READ_ACCESS_IN_PROJECT = "org.eclipse.jdt.ui.edit.text.java.search.read.access.in.project"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> read access in hierarchy action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.read.access.in.hierarchy"</code>).
	 */
	public static final String SEARCH_READ_ACCESS_IN_HIERARCHY = "org.eclipse.jdt.ui.edit.text.java.search.read.access.in.hierarchy"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> read access in working set action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.read.access.in.working.set"</code>).
	 */
	public static final String SEARCH_READ_ACCESS_IN_WORKING_SET = "org.eclipse.jdt.ui.edit.text.java.search.read.access.in.working.set"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> write access in workspace action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.write.access.in.workspace"</code>).
	 */
	public static final String SEARCH_WRITE_ACCESS_IN_WORKSPACE = "org.eclipse.jdt.ui.edit.text.java.search.write.access.in.workspace"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> write access in project action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.write.access.in.project"</code>).
	 */
	public static final String SEARCH_WRITE_ACCESS_IN_PROJECT = "org.eclipse.jdt.ui.edit.text.java.search.write.access.in.project"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> write access in hierarchy action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.write.access.in.hierarchy"</code>).
	 */
	public static final String SEARCH_WRITE_ACCESS_IN_HIERARCHY = "org.eclipse.jdt.ui.edit.text.java.search.write.access.in.hierarchy"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> write access in working set action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.write.access.in.working.set"</code>).
	 */
	public static final String SEARCH_WRITE_ACCESS_IN_WORKING_SET = "org.eclipse.jdt.ui.edit.text.java.search.write.access.in.working.set"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> declarations in workspace action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.declarations.in.workspace"</code>).
	 */
	public static final String SEARCH_DECLARATIONS_IN_WORKSPACE = "org.eclipse.jdt.ui.edit.text.java.search.declarations.in.workspace"; //$NON-NLS-1$
	/**
	 * Action definition ID of the search -> declarations in project action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.declarations.in.project"</code>).
	 */
	public static final String SEARCH_DECLARATIONS_IN_PROJECTS = "org.eclipse.jdt.ui.edit.text.java.search.declarations.in.project"; //$NON-NLS-1$
	/**
	 * Action definition ID of the search -> declarations in hierarchy action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.declarations.in.hierarchy"</code>).
	 */
	public static final String SEARCH_DECLARATIONS_IN_HIERARCHY = "org.eclipse.jdt.ui.edit.text.java.search.declarations.in.hierarchy"; //$NON-NLS-1$
	/**
	 * Action definition ID of the search -> declarations in working set action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.declarations.in.working.set"</code>).
	 */
	public static final String SEARCH_DECLARATIONS_IN_WORKING_SET = "org.eclipse.jdt.ui.edit.text.java.search.declarations.in.working.set"; //$NON-NLS-1$
	/**
	 * Action definition ID of the search -> implementors in workspace action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.implementors.in.workspace"</code>).
	 */
	public static final String SEARCH_IMPLEMENTORS_IN_WORKSPACE = "org.eclipse.jdt.ui.edit.text.java.search.implementors.in.workspace"; //$NON-NLS-1$
	/**
	 * Action definition ID of the search -> implementors in working set action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.implementors.in.working.set"</code>).
	 */
	public static final String SEARCH_IMPLEMENTORS_IN_WORKING_SET = "org.eclipse.jdt.ui.edit.text.java.search.implementors.in.working.set"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> implementors in project action
	 * (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.implementors.in.project"</code>).
	 * 
	 * @since 3.0
	 */
	public static final String SEARCH_IMPLEMENTORS_IN_PROJECT = "org.eclipse.jdt.ui.edit.text.java.search.implementors.in.project"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> occurrences in file quick menu
	 * action (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.occurrences.in.file.quickMenu"</code>).
	 * 
	 * @since 3.1
	 */
	public static final String SEARCH_OCCURRENCES_IN_FILE_QUICK_MENU = "org.eclipse.jdt.ui.edit.text.java.search.occurrences.in.file.quickMenu"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> occurrences in file > elements
	 * action (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.occurrences.in.file"</code>).
	 * 
	 * @since 3.1
	 */
	public static final String SEARCH_OCCURRENCES_IN_FILE = "org.eclipse.jdt.ui.edit.text.java.search.occurrences.in.file"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> occurrences in file > exceptions
	 * action (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.exception.occurrences"</code>).
	 * 
	 * @since 3.1
	 */
	public static final String SEARCH_EXCEPTION_OCCURRENCES_IN_FILE = "org.eclipse.jdt.ui.edit.text.java.search.exception.occurrences"; //$NON-NLS-1$

	/**
	 * Action definition ID of the search -> occurrences in file > implements
	 * action (value
	 * <code>"org.eclipse.jdt.ui.edit.text.java.search.implement.occurrences"</code>).
	 * 
	 * @since 3.1
	 */
	public static final String SEARCH_IMPLEMENT_OCCURRENCES_IN_FILE = "org.eclipse.jdt.ui.edit.text.java.search.implement.occurrences"; //$NON-NLS-1$

}
