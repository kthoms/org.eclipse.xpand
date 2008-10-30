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
package org.eclipse.emf.editor.ui;

import org.eclipse.emf.editor.EEPlugin;
import org.eclipse.emf.editor.EEditor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IDetailsPageProvider;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

/**
 * @author Dennis Huebner
 * 
 */
public class EEMasterDetailsBlock extends MasterDetailsBlock {

	private SectionPart masterSectionPart;
	private IDetailsPageProvider pageProvider;

	public EEMasterDetailsBlock(IDetailsPageProvider pageProvider) {
		this.pageProvider = pageProvider;
	}

	public SectionPart getMasterSectionPart() {
		return this.masterSectionPart;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.forms.MasterDetailsBlock#createMasterPart(org.eclipse.
	 * ui.forms.IManagedForm, org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected void createMasterPart(IManagedForm managedForm, Composite parent) {
		Composite container = managedForm.getToolkit().createComposite(parent);
		container.setLayout(new GridLayout());
		// container.setLayoutData(new GridData(GridData.FILL_VERTICAL));
		Section section = managedForm.getToolkit().createSection(container, ExpandableComposite.TITLE_BAR);
		section.setLayout(new FillLayout());
		section.setLayoutData(new GridData(GridData.FILL_BOTH));
		section.setText("Model");
		Composite mastersClientArea = managedForm.getToolkit().createComposite(section);
		section.setClient(mastersClientArea);
		masterSectionPart = new SectionPart(section);
		managedForm.addPart(masterSectionPart);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.forms.MasterDetailsBlock#createToolBarActions(org.eclipse
	 * .ui.forms.IManagedForm)
	 */
	@Override
	protected void createToolBarActions(IManagedForm managedForm) {
		sashForm.setOrientation(EEditor.formularOrientation());
		final ScrolledForm form = managedForm.getForm();

		Action haction = new Action("hor", IAction.AS_RADIO_BUTTON) {
			@Override
			public void run() {
				sashForm.setOrientation(SWT.VERTICAL);
				persistOrientation(SWT.VERTICAL);
			}
		};
		haction.setChecked(sashForm.getOrientation() == SWT.VERTICAL);

		haction.setToolTipText("Horizontal orientation");
		haction.setImageDescriptor(EEPlugin.getDefault().getImageDescriptor("/icons/det_pane_under.gif"));
		Action vaction = new Action("ver", IAction.AS_RADIO_BUTTON) {
			@Override
			public void run() {
				sashForm.setOrientation(SWT.HORIZONTAL);
				persistOrientation(SWT.HORIZONTAL);
			}
		};
		vaction.setChecked(sashForm.getOrientation() == SWT.HORIZONTAL);

		vaction.setToolTipText("Vertical orientation");
		vaction.setImageDescriptor(EEPlugin.getDefault().getImageDescriptor("/icons/det_pane_right.gif"));
		form.getToolBarManager().add(haction);
		form.getToolBarManager().add(vaction);
		createMoreToolBarActions(form.getToolBarManager());
		form.getToolBarManager().update(true);

	}

	protected void persistOrientation(int orientation) {
		IPreferenceStore store = EEPlugin.getDefault().getPreferenceStore();
		store.setValue(IPreferenceConstants.FORMULAR_ORIENTATION, orientation);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.forms.MasterDetailsBlock#registerPages(org.eclipse.ui.
	 * forms.DetailsPart)
	 */
	@Override
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.setPageProvider(this.pageProvider);
		detailsPart.setPageLimit(1);// cache off!
	}

	public Control findControl(String key, Object data) {
		if (detailsPart.getCurrentPage() instanceof GenericDetailsPage) {
			return ((GenericDetailsPage) detailsPart.getCurrentPage()).locateControl(key, data);
		}
		return null;
	}

	protected void createMoreToolBarActions(IToolBarManager toolBarManager) {
		// does nothing
	}

}
