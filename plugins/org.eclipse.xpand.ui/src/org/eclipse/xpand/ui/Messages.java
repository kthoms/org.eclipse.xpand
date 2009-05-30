/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/

package org.eclipse.xpand.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.xpand.ui.messages"; //$NON-NLS-1$
	public static String NewTemplateFileWizard_DefaultExtension;
	public static String NewTemplateFileWizard_DefaultFileName;
	public static String NewTemplateFileWizard_WizardDescription;
	public static String NewTemplateFileWizard_WizardTitle;
	public static String RefactorActionGroup_MenuName;
	public static String RefactorActionGroup_NoRefactoringsAvailable;
	public static String RenameDefineAction_Name;
	public static String RenameDefineProcessor_CompositeChangeName;
	public static String RenameDefineProcessor_FileReadonly;
	public static String RenameDefineProcessor_GroupDescription;
	public static String RenameDefineProcessor_ID;
	public static String RenameDefineProcessor_NoSuchFile;
	public static String RenameDefineProcessor_ProcessorName;
	public static String RenameDefineProcessor_TextFileChangeName;
	public static String RenameDefineRefactoringWizard_PageTitle;
	public static String RenameDefineRefactoringWizard_WizardPageTitle;
	public static String RenameDefineRefactoringWizardPage_label;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
