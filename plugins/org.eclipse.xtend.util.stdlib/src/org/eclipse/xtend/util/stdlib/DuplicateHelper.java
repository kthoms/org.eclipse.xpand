package org.eclipse.xtend.util.stdlib;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

public class DuplicateHelper {

	public static Set<EObject> removeDuplicatesByName( Set<EObject> coll ) {
		Set<String> duplicateDetector = new HashSet<String>();
		Set<EObject> newColl = new HashSet<EObject>();
		for (Iterator<EObject> iterator = coll.iterator(); iterator.hasNext();) {
			EObject o = iterator.next();
			String name = (String)o.eGet( o.eClass().getEStructuralFeature("name") );
			if ( !duplicateDetector.contains(name)) {
				newColl.add( o );
			}
			duplicateDetector.add( name );
		}
		return newColl;
	}
	
}
