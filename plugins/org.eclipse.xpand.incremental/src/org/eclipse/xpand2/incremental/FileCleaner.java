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
package org.eclipse.xpand2.incremental;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xpand.incremental.trace.OutputFile;
import org.eclipse.xpand.incremental.trace.Trace;
import org.eclipse.xpand2.output.Outlet;

public class FileCleaner extends AbstractWorkflowComponent {
	private String oldTraceModelSlot;
	private String newTraceModelSlot;
	private Map<String, Outlet> outlets = new HashMap<String, Outlet>();
	private Outlet defaultOutlet;
	
	
	public void setOldTraceModelSlot(String oldTraceModelSlot) {
		this.oldTraceModelSlot = oldTraceModelSlot;
	}
	
	public void setNewTraceModelSlot(String newTraceModelSlot) {
		this.newTraceModelSlot = newTraceModelSlot;
	}

	
	public void addOutlet(Outlet outlet) {
		if (outlet == null) {
			return;
		}
		if (outlet.getName() == null) {
			defaultOutlet = outlet;
		} else {
			outlets.put(outlet.getName(), outlet);
		}
	}

	public void checkConfiguration(Issues issues) {
		if (oldTraceModelSlot == null) {
			issues.addError("oldTraceModelSlot must be set.");
		}
		if (newTraceModelSlot == null) {
			issues.addError("newTraceModelSlot must be set.");
		}
		if (outlets.isEmpty() && defaultOutlet == null) {
			issues.addError("outlets must be given.");
		}
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		Trace oldTraceModel = (Trace) ctx.get(oldTraceModelSlot);
		if (oldTraceModel == null) {
			issues.addWarning(this, "oldTraceModelSlot " + oldTraceModelSlot + " is empty. Not cleaning any files.");
			return;
		}
		Trace newTraceModel = (Trace) ctx.get(newTraceModelSlot);
		if (newTraceModel == null) {
			issues.addWarning(this, "newTraceModelSlot " + newTraceModelSlot + " is empty. Not cleaning any files.");
			return;
		}
		
		// collect files to delete. that's all files that were generated in the old run (i.e. are
		// contained in the oldTraceModel), but are no longer generated in the new run
		List<OutputFile> toDelete = new ArrayList<OutputFile>(oldTraceModel.getOutputFiles());
		for (OutputFile oldFile : oldTraceModel.getOutputFiles()) {
			for (OutputFile newFile : newTraceModel.getOutputFiles()) {
				if (isSameFile(oldFile, newFile)) {
					toDelete.remove(oldFile);
				}
			}
		}
		
		// now delete that
		int count = 0;
		for (OutputFile f : toDelete) {
			Outlet o = f.getOutlet() == null ? defaultOutlet : outlets.get(f.getOutlet());
			File deleteMe= new File(o.getPath() + File.separator + f.getFileName());
			if (!deleteMe.delete()) {
				issues.addWarning(this, "Could not delete file " + deleteMe.getAbsolutePath());
			} else {
				count++;
			}
		}
		
		// and give some feedback
		if (count > 0) {
			issues.addInfo(this, "Deleted " + count + " files.");
		}
	}

	private boolean isSameFile(OutputFile oldFile, OutputFile newFile) {
		return oldFile.getFileName().equals(newFile.getFileName()) &&
			(oldFile.getOutlet() == null ? newFile.getOutlet() == null : oldFile.getOutlet().equals(newFile.getOutlet()));
	}
}
