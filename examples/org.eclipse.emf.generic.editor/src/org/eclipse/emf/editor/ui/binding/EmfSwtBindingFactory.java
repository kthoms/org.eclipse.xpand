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
package org.eclipse.emf.editor.ui.binding;

import java.util.List;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.edit.EMFEditObservables;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EEnumImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.editor.EEPlugin;
import org.eclipse.emf.editor.extxpt.ExtXptFacade;
import org.eclipse.emf.editor.ui.ProposalCreator;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.databinding.viewers.ViewersObservables;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author Dennis Huebner
 * 
 */
public class EmfSwtBindingFactory {
	private Composite parent = null;
	private FormToolkit toolkit = null;
	private final EObject owner;
	private final EditingDomain domain;
	private final EMFDataBindingContext edbc;
	private final AdapterFactory adapterFactory;
	private final ProposalCreator proposalcreator;
	public static final String EOBJECT_KEY = EcorePackage.Literals.EOBJECT.getName();
	public static final String ESTRUCTURALFEATURE_KEY = EcorePackage.Literals.ESTRUCTURAL_FEATURE.getName();

	public EmfSwtBindingFactory(AdapterFactory adapterFactory, EditingDomain domain, EObject owner, Composite parent,
			FormToolkit toolkit, ExtXptFacade facade) {
		this.adapterFactory = adapterFactory;
		this.edbc = new EMFDataBindingContext();
		this.domain = domain;
		this.proposalcreator = new ProposalCreator(domain, facade);
		this.owner = owner;
		this.parent = parent;
		this.toolkit = toolkit;
	}

	public Control create(EObject eObject) {
		Control retVal = null;
		if (eObject instanceof EStructuralFeature) {
			retVal = createForEStructuralFeature((EStructuralFeature) eObject);
		}
		return retVal;
	}

	private Control createForEStructuralFeature(EStructuralFeature feature) {
		Control retVal = null;
		if (feature.isMany()) {
			retVal = bindList(feature);
		}
		else {
			retVal = bindValue(feature);
		}
		setupControl(feature, retVal);
		return retVal;
	}

	private Control bindList(EStructuralFeature feature) {
		IObservableList source = EMFEditObservables.observeList(domain, owner, feature);

		List<?> choice = proposalcreator.proposals(owner, feature);
		MultipleFeatureControl mfc = new MultipleFeatureControl(parent, toolkit, new AdapterFactoryLabelProvider(
				adapterFactory), owner, feature, choice);

		IObservableList target = ViewersObservables.observeMultiSelection(mfc.getInternalSelectionProvider());
		Binding binding = edbc.bindList(target, source, null, null);
		binding.updateModelToTarget();
		return mfc;
	}

	private Control bindValue(EStructuralFeature feature) {
		Control retVal = null;
		IObservableValue source = EMFEditObservables.observeValue(domain, owner, feature);
		IObservableValue target = null;
		if (feature.getEType().equals(EcorePackage.Literals.EBOOLEAN)
				|| feature.getEType().equals(EcorePackage.Literals.EBOOLEAN_OBJECT)
				|| (feature.getEType() instanceof EDataType && (feature.getEType().getInstanceClass() == Boolean.class || feature
						.getEType().getInstanceClass() == Boolean.TYPE))) {
			Button b = toolkit.createButton(parent, "", SWT.CHECK);
			target = SWTObservables.observeSelection(b);
			retVal = b;
		}
		else if (feature instanceof EReference || feature.getEType() instanceof EEnumImpl) {
			ComboViewer combo = new ComboViewer(parent, SWT.READ_ONLY);
			toolkit.adapt(combo.getCombo());
			combo.setContentProvider(new ArrayContentProvider());
			combo.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
			combo.setInput(proposalcreator.proposals(owner, feature));
			target = ViewersObservables.observeSingleSelection(combo);
			retVal = combo.getCombo();
		}
		else {
			Text t = toolkit.createText(parent, "");
			t.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
			List<?> proposals = proposalcreator.proposals(owner, feature);
			if (proposals != null && !proposals.isEmpty()) {
				// TODO prevent adding null to a list, for example a Collection
				// Type
				while (proposals.remove(null)) {
					// clear null entries
				}
				ControlDecoration field = new ControlDecoration(t, SWT.BORDER);
				FieldDecoration requiredFieldIndicator = FieldDecorationRegistry.getDefault().getFieldDecoration(
						FieldDecorationRegistry.DEC_CONTENT_PROPOSAL);
				field.setImage(requiredFieldIndicator.getImage());
				field.setDescriptionText(requiredFieldIndicator.getDescription());
				KeyStroke keyStroke = null;
				String string = "Ctrl+Space";
				try {
					keyStroke = KeyStroke.getInstance(string);
				}
				catch (ParseException e) {
					EEPlugin.getDefault().getLog().log(
							new Status(IStatus.ERROR, EEPlugin.PLUGIN_ID, "Error while parse: " + string, e));
				}
				new ContentProposalAdapter(t, new TextContentAdapter(), new SimpleContentProposalProvider(proposals
						.toArray(new String[] {})), keyStroke, null);
			}
			target = SWTObservables.observeText(t, SWT.Modify);
			retVal = t;

		}
		edbc.bindValue(target, source, null, null);
		return retVal;
	}

	private void setupControl(EStructuralFeature f, Control c) {
		// disable unchangeable and unserializable
		c.setEnabled(f.isChangeable()
				&& (!(f.getEType() instanceof EDataType && !((EDataType) f.getEType()).isSerializable())));
		c.setData(EmfSwtBindingFactory.ESTRUCTURALFEATURE_KEY, f);
		c.setData(EmfSwtBindingFactory.EOBJECT_KEY, owner);
		c.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	public void dispose() {
		edbc.dispose();
		parent.dispose();
		// toolkit.dispose();
	}

}
