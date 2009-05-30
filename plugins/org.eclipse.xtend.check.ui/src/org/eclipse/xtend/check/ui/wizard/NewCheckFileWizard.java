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
package org.eclipse.xtend.check.ui.wizard;

import org.eclipse.xtend.check.ui.Messages;
import org.eclipse.xtend.shared.ui.wizards.NewExtXptResourceWizard;


public class NewCheckFileWizard extends NewExtXptResourceWizard {
	
    public NewCheckFileWizard() {
        super(Messages.NewCheckFileWizard_DefaultFileName, Messages.NewCheckFileWizard_DefaultExtension, Messages.NewCheckFileWizard_WizardTitle, Messages.NewCheckFileWizard_WizardDescription, null);
    }

}
