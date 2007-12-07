package org.eclipse.xtend.typesystem.emf.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.xtend.shared.ui.core.builder.XtendXpandBuilder;

public class BuildJob extends Job {
	private IProject project;

	public BuildJob(IProject project) {
		super("Building " + project.getName());
		setRule(ResourcesPlugin.getWorkspace().getRuleFactory().buildRule());
		this.project = project;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		if (EmfToolsPlugin.trace)
			System.out.println("Running oAW builder for project " + project.getName());

		try {
			project.getProject().build(IncrementalProjectBuilder.CLEAN_BUILD,
					XtendXpandBuilder.getBUILDER_ID(), null, monitor);
		} catch (CoreException e) {
			if (EmfToolsPlugin.trace)
				e.printStackTrace();
		}
		return Status.OK_STATUS;
	}
}
