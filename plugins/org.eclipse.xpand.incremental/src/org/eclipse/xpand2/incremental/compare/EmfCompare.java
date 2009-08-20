/*******************************************************************************
 * Copyright (c) 2005, 2009 eXXcellent solution gmbh and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Achim Demelt - initial API and implementation
 *******************************************************************************/
package org.eclipse.xpand2.incremental.compare;

import org.eclipse.emf.compare.diff.metamodel.ComparisonResourceSnapshot;
import org.eclipse.emf.compare.diff.metamodel.DiffFactory;
import org.eclipse.emf.compare.diff.metamodel.DiffModel;
import org.eclipse.emf.compare.diff.service.DiffService;
import org.eclipse.emf.compare.match.metamodel.MatchModel;
import org.eclipse.emf.compare.match.service.MatchService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * This component performs an EMF Compare comparison for the two models given in
 * the <code>oldModelSlot</code> and <code>newModelSlot</code> parameters. The
 * raw diff model is stored in the slot specified by <code>diffModelSlot</code>.
 * A comparison snapshot is optionally stored in <code>snapshotModelSlot</code>.
 * This is useful for diagnostics, since you can write this model with a
 * <code>Writer</code> component and open it with the EMF compare UI.
 * <p>
 * If either the oldModel or newModel slots are empty (i.e. contain no model),
 * the EmfCompare component raises a <i>warning</i>, not an error so as not to
 * halt workflow execution.
 * </p>
 * 
 * @author Achim Demelt
 */
public class EmfCompare extends AbstractWorkflowComponent {
	private String oldModelSlot;
	private String newModelSlot;
	private String diffModelSlot;
	private String snapshotModelSlot;

	public void setOldModelSlot(String oldModelSlot) {
		this.oldModelSlot = oldModelSlot;
	}

	public void setNewModelSlot(String newModelSlot) {
		this.newModelSlot = newModelSlot;
	}

	public void setDiffModelSlot(String diffModelSlot) {
		this.diffModelSlot = diffModelSlot;
	}

	public void setSnapshotModelSlot(String snapshotModelSlot) {
		this.snapshotModelSlot = snapshotModelSlot;
	}

	public void checkConfiguration(Issues issues) {
		if (oldModelSlot == null) {
			issues.addError("No oldModelSlot given.");
		}
		if (newModelSlot == null) {
			issues.addError("No newModelSlot given.");
		}
		if (diffModelSlot == null) {
			issues.addError("No diffModelSlot given.");
		}
	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		// get models from slots. exit with warning if either one is not set
		EObject newModel = (EObject) ctx.get(newModelSlot);
		if (newModel == null) {
			issues.addWarning(this, "Sot '" + newModelSlot + "' is empty. Not computing model diff.");
			return;
		}
		EObject oldModel = (EObject) ctx.get(oldModelSlot);
		if (oldModel == null) {
			issues.addWarning(this, "Sot '" + oldModelSlot + "' is empty. Not computing model diff.");
			return;
		}

		// compute diff
		MatchModel matchModel;
		try {
			matchModel = MatchService.doMatch(newModel, oldModel, null);
		} catch (InterruptedException e) {
			issues.addError(this, "cannot compute diff", e);
			return;
		}
		DiffModel diffModel = DiffService.doDiff(matchModel);
		ctx.set(diffModelSlot, diffModel);

		// creates snapshot of diffModel containing diffModel and matchModel
		// can be used for diagnostics
		if (snapshotModelSlot != null) {
			ComparisonResourceSnapshot snapshotModel = DiffFactory.eINSTANCE.createComparisonResourceSnapshot();
	        snapshotModel.setMatch(matchModel);
	        snapshotModel.setDiff(diffModel);
	        ctx.set(snapshotModelSlot, snapshotModel);
		}
	}
}
