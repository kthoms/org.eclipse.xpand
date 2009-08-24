/*******************************************************************************
 * Copyright (c) 2005, 2009 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.typesystem.emf.ui.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

public class AddAnnotationsAction extends AbstractCoreModelTransformerAction {

	@Override
    public void transform(final Resource r) {
        final Iterator<EObject> iter = r.getAllContents();
        while (iter.hasNext()) {
            final EObject object = iter.next();
            if (object instanceof EOperation) {
                final EOperation op = (EOperation) object;
                EAnnotation anno = op.getEAnnotation(ANNO_SOURCE);
                if (anno == null) {
                    anno = EcorePackage.eINSTANCE.getEcoreFactory().createEAnnotation();
                    anno.setSource(ANNO_SOURCE);
                }
                final String body = getBody(op);
                anno.getDetails().put(ANNO_KEY, body);
                op.getEAnnotations().add(anno);
            }
        }
    }

	private String getBody(final EOperation op) {
        final StringBuffer buff = new StringBuffer();
        if (op.getEType() != null) {
            buff.append("return ");
        }
        buff.append(getExtensionClassName(op)).append(".");
        buff.append(op.getName());
        buff.append("(");
        final List<EParameter> params = op.getEParameters();
        for (final Iterator<EParameter> iter = params.iterator(); iter.hasNext();) {
            final EParameter element = iter.next();
			buff.append(element.getName());
		}
        return buff.append("this);").toString();
    }

    private String getExtensionClassName(final EOperation op) {
        return op.getEContainingClass().getName() + "Logic";
    }

}
