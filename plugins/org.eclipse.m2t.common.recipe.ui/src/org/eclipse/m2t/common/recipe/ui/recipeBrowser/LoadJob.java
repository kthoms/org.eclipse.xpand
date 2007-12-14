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

package org.eclipse.m2t.common.recipe.ui.recipeBrowser;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.m2t.common.recipe.core.EvalTrigger;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;
import org.eclipse.m2t.common.recipe.io.CannotLoadChecksException;
import org.eclipse.m2t.common.recipe.io.CheckRegistry;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;

public class LoadJob extends Job {
	
	private TreeViewer treeViewer;
	private boolean evaluate;
	private IWorkbenchSiteProgressService siteService;
	
	public LoadJob( TreeViewer treeViewer, IWorkbenchSiteProgressService ss, boolean evaluate ) {
		super("Loading Recipe File");
		this.treeViewer = treeViewer;
		this.evaluate = evaluate;
		this.siteService = ss;
	}
	
	protected IStatus run(IProgressMonitor monitor) {
		monitor.beginTask( "Evaluating Recipes", IProgressMonitor.UNKNOWN );
		try {
			CheckRegistry.loadFromFile();
		} catch (final CannotLoadChecksException e) {
			Display.getDefault().asyncExec( new Runnable() {
				public void run() {
					MessageDialog.openError( null, "Error loading recipe file", "Reason: "+e.getMessage() );
				}
			});
		}
		Display.getDefault().asyncExec( new Runnable() {
			public void run() {
				treeViewer.setInput( CheckRegistry.getChecks() );
				siteService.warnOfContentChange();
			}
		});
		monitor.done();
		if ( evaluate ) {
			EvaluationContext ctx = new EvaluationContext();
			ctx.setEvaluateAll( true );
			ctx.setTrigger( EvalTrigger.ON_REQUEST );
			siteService.schedule(new EvalJob(CheckRegistry.getChecks(), treeViewer, siteService, ctx ), 0 , true );
		}
		return Status.OK_STATUS;
	}

}

