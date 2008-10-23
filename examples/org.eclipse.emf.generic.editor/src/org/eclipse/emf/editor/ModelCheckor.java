/**
 * <copyright> 
 *
 * Copyright (c) 2008 itemis AG and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   itemis AG - Initial API and implementation
 *
 * </copyright>
 *
 */
package org.eclipse.emf.editor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.ui.action.ValidateAction.EclipseResourcesUtil;
import org.eclipse.jface.dialogs.IMessageProvider;

/**
 * @author Dennis Huebner
 * 
 */
public class ModelCheckor {

	private EclipseResourcesUtil eclipseResourcesUtil = EMFPlugin.IS_RESOURCES_BUNDLE_AVAILABLE ? new EclipseResourcesUtil()
			: null;

	public List<MessageData> check(ResourceSet toCheck) {
		List<MessageData> messages = new ArrayList<MessageData>();

		try {
			// get copy
			EList<Resource> resources = toCheck.getResources();
			if (resources != null) {

				for (Resource res : resources) {
					TreeIterator<EObject> allContents = res.getAllContents();
					if (!allContents.hasNext())
						continue;

					EObject rootObject = allContents.next();
					messages.addAll(ecoreValidation(rootObject));
				}
			}
		}
		catch (Exception e) {
			String erMes = e.getLocalizedMessage();
			if (erMes == null) {
				erMes = e.toString();
			}
			messages.add(new MessageData(":(", "An Error occured during checking: " + erMes, null,
					IMessageProvider.WARNING));
		}
		return messages;
	}

	private List<MessageData> ecoreValidation(EObject rootObject) {
		int status = IMessageProvider.INFORMATION;
		// Clear Marker
		if (eclipseResourcesUtil != null) {
			eclipseResourcesUtil.deleteMarkers(rootObject);
		}

		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(rootObject);

		switch (diagnostic.getSeverity()) {
			case Diagnostic.ERROR:
				status = IMessageProvider.ERROR;
				break;
			case Diagnostic.WARNING:
				status = IMessageProvider.WARNING;
				break;
			case Diagnostic.INFO:
				status = IMessageProvider.INFORMATION;
			default:
				break;
		}
		return createMessagesFromDiagnostic(rootObject, diagnostic, status);
	}

	/**
	 * @param rootObject
	 * @param diagnostic
	 */
	private List<MessageData> createMessagesFromDiagnostic(EObject rootObject, Diagnostic diagnostic, int status) {

		List<MessageData> mds = new ArrayList<MessageData>();
		for (Iterator<Diagnostic> i = diagnostic.getChildren().iterator(); i.hasNext();) {
			Diagnostic childDiagnostic = i.next();
			if (eclipseResourcesUtil != null)
				eclipseResourcesUtil.createMarkers(rootObject.eResource(), childDiagnostic);
			String message = childDiagnostic.getMessage();
			MessageData md = new MessageData(childDiagnostic, message, childDiagnostic.getData(), status);
			mds.add(md);
		}
		return mds;
	}
}