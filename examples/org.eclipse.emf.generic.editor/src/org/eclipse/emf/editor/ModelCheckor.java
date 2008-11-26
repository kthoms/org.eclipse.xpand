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
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.action.ValidateAction.EclipseResourcesUtil;
import org.eclipse.emf.editor.extxpt.ExtXptFacade;
import org.eclipse.emf.editor.extxpt.ExtXptHelper;
import org.eclipse.emf.editor.provider.ExtendedReflectiveItemProviderAdapterFactory.ExtendedReflectiveItemProvider;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.jface.dialogs.IMessageProvider;

/**
 * @author Dennis Huebner
 * 
 */
public class ModelCheckor {
	private MarkerHandler markerHandler = new MarkerHandler();

	private EclipseResourcesUtil eclipseResourcesUtil = EMFPlugin.IS_RESOURCES_BUNDLE_AVAILABLE ? new EclipseResourcesUtil()
			: null;
	private final ExtXptFacade facade;

	public ModelCheckor(ExtXptFacade facade) {
		super();
		this.facade = facade;
	}

	public List<MessageData> check(ExtendedReflectiveItemProvider extendedReflectiveItemProvider, EditingDomain ed,
			IFile file) {
		ResourceSet toCheck = ed.getResourceSet();
		List<MessageData> messages = new ArrayList<MessageData>();
		markerHandler.deleteMarkers(file, new NullProgressMonitor());

		try {
			// get copy
			EList<Resource> resources = toCheck.getResources();
			if (resources != null) {
				for (Resource res : resources) {
					// Clear Marker
					if (eclipseResourcesUtil != null) {
						eclipseResourcesUtil.deleteMarkers(res);
					}
					TreeIterator<EObject> allContents = res.getAllContents();
					if (!allContents.hasNext())
						continue;
					EObject rootObject = allContents.next();
					// xtend checks
					List<MessageData> checkValidation = checkValidation(rootObject);
					for (MessageData md : checkValidation) {
						List<?> data = md.getData();
						String location = null;
						Iterator<?> iterator = data.iterator();
						Object o = iterator.next();// object index 0
						if (o instanceof EObject) {
							EObject eO = (EObject) o;
							location = extendedReflectiveItemProvider.getText(eO);
							Object obj = iterator.next();// feature index 1
							// TODO get location using Element and Feature
							// from
							// md.getData()
							if (obj instanceof EStructuralFeature) {
								EStructuralFeature f = (EStructuralFeature) obj;
								location += ("#" + f.getName());
							}
						}
						markerHandler.addMarker(file, md.getMessage(), md.getStatus(), location);
					}
					// ecore
					messages.addAll(checkValidation);
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

	private List<MessageData> checkValidation(EObject root) {
		List<MessageData> messages = new ArrayList<MessageData>();
		Issues issues = facade.check(root);
		for (MWEDiagnostic issue : issues.getErrors()) {
			messages.add(createMessageFromIssue(issue, IMessageProvider.ERROR));
		}
		for (MWEDiagnostic issue : issues.getWarnings()) {
			messages.add(createMessageFromIssue(issue, IMessageProvider.WARNING));
		}
		return messages;
	}

	private List<MessageData> ecoreValidation(EObject rootObject) {
		int status = IMessageProvider.INFORMATION;
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

	/**
	 * @param issue
	 * @return
	 */
	private MessageData createMessageFromIssue(MWEDiagnostic issue, int type) {
		String message = issue.getMessage();
		Object element = issue.getElement();
		MessageData md = new MessageData(element, message, issue.getData(), type);
		List<Object> data = new ArrayList<Object>();
		if (element instanceof EObject) {
			EObject eObject = (EObject) element;
			data.add(0, element);
			EStructuralFeature feature = null;
			// read fetureName stored in the data
			if (issue.getData() != null && issue.getData().size() > 1
					&& String.class.isInstance(issue.getData().get(1))) {
				feature = eObject.eClass().getEStructuralFeature((String) issue.getData().get(1));
			}
			// if nothing found try old extract from message way
			else {
				feature = ExtXptHelper.extractFeatureFromMessage(eObject, md);
			}
			if (feature != null) {
				data.add(1, feature);
			}
		}
		md.setData(Collections.unmodifiableList(data));
		return md;
	}

}