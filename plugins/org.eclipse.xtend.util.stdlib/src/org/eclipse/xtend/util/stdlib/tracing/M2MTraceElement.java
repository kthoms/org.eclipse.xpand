package org.eclipse.xtend.util.stdlib.tracing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

public class M2MTraceElement extends TraceElement {

	private List<EObject> targets = new ArrayList<EObject>();
	
	public M2MTraceElement( String kind, EObject from, EObject to ) {
		super(from, kind);
		targets.add( to );
	}
	
	public M2MTraceElement( String kind, EObject from, Collection<EObject> to ) {
		super(from, kind);
		targets.addAll( to );
	}
	
	public M2MTraceElement( String kind, Collection<EObject> from, EObject to ) {
		super(from, kind);
		targets.add( to );
	}

	public List<EObject> getTargets() {
		return targets;
	}
	
	public boolean isSingleTarget() {
		return targets.size() == 1;
	}
	
	
}
