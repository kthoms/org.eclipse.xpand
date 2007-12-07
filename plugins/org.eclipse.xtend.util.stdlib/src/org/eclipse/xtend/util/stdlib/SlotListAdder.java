package org.eclipse.xtend.util.stdlib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class SlotListAdder extends AbstractWorkflowComponent {

	private String modelSlot;
	private String listSlot;
	private Set nameSet = new HashSet();
	private boolean uniqueNames;
	
	public void setListSlot(String listSlot) {
		this.listSlot = listSlot;
	}
	
	public void setModelSlot(String modelSlot) {
		this.modelSlot = modelSlot;
	}
	
	public void setUniqueNames( boolean b ) {
		uniqueNames = b;
	}
	
	public void checkConfiguration(Issues issues) {
		if ( modelSlot == null ) {
			issues.addError(this, "no modelSlot specified.");
		}
		if ( listSlot == null ) {
			issues.addError(this, "no listSlot specified.");
		}
	}

	@Override
	public String getLogMessage() {
		return "adding contents of slot '"+modelSlot+"' to the list of stuff in '"+listSlot+"'";
	}
	
	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor mon, Issues issues) {
		Object listContent = ctx.get(listSlot);
		if ( listContent == null ) {
			issues.addWarning(this, "'"+listSlot+"' is empty, creating a new list.");
			listContent = new ArrayList();
			ctx.set( listSlot , listContent);
		}
		if ( !(listContent instanceof Collection) ) {
			issues.addError(this, "contents of '"+listSlot+"' slot is not a collection, but rather a '"+listSlot.getClass().getName()+"'");
			return;
		}
		Object modelContent = ctx.get(modelSlot);
		if ( modelContent == null ) {
			issues.addWarning(this, "'"+modelSlot+"' is empty; not adding anything to the '"+listSlot+"' slot.");
			return;
		}
		if ( uniqueNames ) {
			EObject eo = (EObject)modelContent;
			DynamicEcoreHelper h = new DynamicEcoreHelper( eo );
			String name = h.getName( eo );
			if ( !nameSet.contains(name) ) {
				((Collection)listContent).add( modelContent );
				nameSet.add( name );
			} 
		} else {
			((Collection)listContent).add( modelContent );
		}
	}


}
