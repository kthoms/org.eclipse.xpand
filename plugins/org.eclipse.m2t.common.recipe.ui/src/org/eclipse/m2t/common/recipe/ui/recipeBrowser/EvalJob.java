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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.CheckSet;
import org.eclipse.m2t.common.recipe.core.EvalTrigger;
import org.eclipse.m2t.common.recipe.eval.CheckEvaluationListener;
import org.eclipse.m2t.common.recipe.eval.CheckEvaluator;
import org.eclipse.m2t.common.recipe.eval.EvaluationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;

public class EvalJob extends Job implements CheckEvaluationListener {

	private IProgressMonitor monitor;

	private CheckSet set = null;

	private Check check = null;

	private TreeViewer treeViewer;

	private IWorkbenchSiteProgressService siteService;

	private EvaluationContext context;

	public EvalJob(CheckSet set, TreeViewer v, IWorkbenchSiteProgressService ss, EvaluationContext ctx) {
		super("Evaluating Recipes");
		this.set = set;
		this.treeViewer = v;
		this.siteService = ss;
		this.context = ctx;
	}

	public EvalJob(Check check, TreeViewer v, IWorkbenchSiteProgressService ss) {
		super("Evaluating Recipes");
		this.check = check;
		this.treeViewer = v;
		this.siteService = ss;
		context = new EvaluationContext();
		context.setBatchOnly(false);
		context.setEvaluateAll(true);
		context.setTrigger(EvalTrigger.ON_REQUEST);
	}

	protected IStatus run(IProgressMonitor monitor) {
		if (check == null && set == null)
			return Status.OK_STATUS;
		this.monitor = monitor;
		int count = 0;
		CheckEvaluator e = null;
		if (set != null) {
			count = set.getCheckCount();
			e = new CheckEvaluator(context);
		} else {
			count = check.getCheckCount();
			e = new CheckEvaluator(context);
		}
		monitor.beginTask("Evaluating Recipes", count);
		e.addListener(this);
		if (set != null)
			e.evaluate(set);
		if (check != null)
			e.evaluate(check);
		monitor.done();
		Display.getDefault().asyncExec(new Runnable() {
			public void run() {
				if (!treeViewer.getControl().isDisposed()) {
					if (set != null) {
						treeViewer.refresh();
					} else {
						treeViewer.refresh(check);
						List<Check> nodes = new ArrayList<Check>();
						check.collectParents(nodes);
						check.collectChildren(nodes);
						for (Iterator<Check> iter = nodes.iterator(); iter.hasNext();) {
							treeViewer.refresh(iter.next());
						}
					}
				}
				siteService.warnOfContentChange();
			}
		});
		return Status.OK_STATUS;
	}

	public void evaluated(Check check, boolean evaluated) {
		monitor.worked(check.getCheckCount());
	}
}
