package org.eclipse.xtend.backend.types.xsd.internal;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.xtend.backend.types.xsd.XsdTypesystem;

public class XMLFeatureMapType extends EFeatureMapType {

	public XMLFeatureMapType(final String name, XsdTypesystem ts, EClass owner) {
		super(name, owner, ts);
	}

	protected List<EStructuralFeature> getMapFeatures() {
		List<EStructuralFeature> r = new ArrayList<EStructuralFeature>();
		XMLTypePackage p = XMLTypePackage.eINSTANCE;
		r.add(p.getXMLTypeDocumentRoot_CDATA());
		r.add(p.getXMLTypeDocumentRoot_Comment());
		r.add(p.getXMLTypeDocumentRoot_ProcessingInstruction());
		r.add(p.getXMLTypeDocumentRoot_Text());
		return r;
	}

}
