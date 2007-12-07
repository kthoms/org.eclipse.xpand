package org.eclipse.xtend.util.stdlib;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class CloningExtensions {

	public static Object clone(Object original) {
		EObject context = (EObject) original;
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		EObject copy = copier.copy(context);
		copier.copyReferences();
		return copy;
	}

}
