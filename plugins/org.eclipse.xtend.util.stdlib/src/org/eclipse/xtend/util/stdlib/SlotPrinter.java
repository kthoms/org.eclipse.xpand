package org.eclipse.xtend.util.stdlib;

import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class SlotPrinter extends AbstractWorkflowComponent {
	
	private String slotName;
	private String message;
	
	public void setMessage( String m ) {
		this.message = m;
	}
	
	public void setSlotName( String name ) {
		this.slotName = name;
	}
	
	public void checkConfiguration(Issues issues) {
		if ( slotName == null ) {
			issues.addError(this, "slotName not specified");
		}
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor monitor, Issues issues) {
		StringBuffer b = new StringBuffer();
		if ( message != null ) b.append(message+": ");
		b.append("(slot: "+slotName+")");
		b.append( ctx.get(slotName) );
		System.err.println(b.toString());
	}
	

}
