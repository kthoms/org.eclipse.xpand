package org.eclipse.xtend.util.stdlib;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class MessageLogger extends AbstractWorkflowComponent {
	
	private String message;

	public void setMessage( String m ) {
		message = m;
	}
	
	public void checkConfiguration(Issues issues) {
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		System.err.println(message);
	}
	

}
