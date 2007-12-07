package org.eclipse.xtend.util.stdlib;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class SlotCopier extends AbstractWorkflowComponent {

	private String fromSlot;
	private String toSlot;
	private boolean removeTopLevelList = false;

	private Log log = LogFactory.getLog(getClass());

	
	public void checkConfiguration(Issues issues) {
		if ( (fromSlot == null) || fromSlot.trim().equals("") ) {
			issues.addError(this, "fromSlot not specified");
		}
		if ( (toSlot == null) || toSlot.trim().equals("") ) {
			issues.addError(this, "toSlot not specified");
		}
	}

	@Override
	public String getLogMessage() {
		return "slot '"+fromSlot+"' -> slot '"+toSlot+"'";
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor mon, Issues issues) {
		Object content = ctx.get(fromSlot);
		if ( content == null ) {
			issues.addWarning(this, "fromSlot is null!");
 		} else {
 			if ( (content instanceof List) && removeTopLevelList ) {
 	 			log.info("copying first element of "+content+" ["+content.getClass().getName()+"]");
 	 			ctx.set( toSlot , ((List)content).get(0));
 			} else {
 	 			log.info("copying "+content+" ["+content.getClass().getName()+"]");
 	 			ctx.set( toSlot , content);
 			}
 		}
	}

	public void setFromSlot(String fromSlot) {
		this.fromSlot = fromSlot;
	}



	public void setToSlot(String toSlot) {
		this.toSlot = toSlot;
	}

	public void setRemoveTopLevelList(boolean removeTopLevelList) {
		this.removeTopLevelList = removeTopLevelList;
	}

}
