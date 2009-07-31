/*
Copyright (c) 2009 André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    André Arnold - initial API and implementation
 */
package org.eclipse.xtend.middleend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEndFactory;

public class LanguageSetup extends AbstractWorkflowComponent {
	
	private final List<String> _middleEndFactories = new ArrayList<String>();
	
	public void addLanguageContributor (String contributorClassName) {
		_middleEndFactories.add(contributorClassName);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor,
			Issues issues) {
		for (String _middleEndFactoryClassName : _middleEndFactories) {
			final Class<? extends LanguageSpecificMiddleEndFactory> middleEndFactory;
			try {
				middleEndFactory = (Class<? extends LanguageSpecificMiddleEndFactory>) Class.forName(_middleEndFactoryClassName);
				LanguageContributor.INSTANCE.addLanguageContribution(middleEndFactory);
			} catch (ClassNotFoundException e) {
				issues.addError("The class " + _middleEndFactoryClassName + " has not been found");
				
			} catch (ClassCastException cce) {
				issues.addError("The class " +_middleEndFactoryClassName + " is not a language contributor");
			}
				
		}
	}

	@Override
	public void checkConfiguration(Issues issues) {
		if (_middleEndFactories.isEmpty())
			issues.addError ("No LanguageContributors defined");
	}

}
