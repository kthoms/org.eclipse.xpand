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
package org.eclipse.xpand.ui.wizard;

import org.eclipse.xpand.ui.Messages;
import org.eclipse.xtend.shared.ui.wizards.NewExtXptResourceWizard;


public class NewTemplateFileWizard extends NewExtXptResourceWizard {
	
    public NewTemplateFileWizard() {
        super(Messages.NewTemplateFileWizard_DefaultFileName, Messages.NewTemplateFileWizard_DefaultExtension, Messages.NewTemplateFileWizard_WizardTitle, Messages.NewTemplateFileWizard_WizardDescription, null);
    }

}
