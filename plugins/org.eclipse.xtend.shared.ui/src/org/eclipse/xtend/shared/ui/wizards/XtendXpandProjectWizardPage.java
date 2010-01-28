/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtend.shared.ui.Messages;
import org.eclipse.xtend.shared.ui.core.metamodel.Contributor;
import org.eclipse.xtend.shared.ui.core.metamodel.MetamodelContributorRegistry;
import org.eclipse.xtend.shared.ui.core.properties.MetamodelContributorsPropertyAndPreferencePage;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xtxt).
 */
public class XtendXpandProjectWizardPage extends WizardPage {
	private Text projectText;

	private Button generateSimpleExample;
	private Button useWorkspaceDefinedMetaModels;
	private Button useProjectSpecificMetaModels;
	
	private Button downButton;
	private Button upButton;
	private List<Contributor> availableMetamodelContributors;
	private Table table;
	private Composite tableContainer;
	private CheckboxTableViewer checkboxTableViewer;
	private String storeString;

	public String getStoreString() {
		return storeString;
	}
	
	/**
	 * Renders a human readable representation of the meta model contributors.
	 */
	class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(final Object element, final int columnIndex) {
			if (element instanceof Contributor) {
				final Contributor contributor = (Contributor) element;
				return contributor.getDisplayName();
			}
			return element.toString();
		}

		public Image getColumnImage(final Object element, final int columnIndex) {
			return null;
		}
	}
	
	private List<Contributor> getMetamodelContributors(final boolean includeDisabled) {
		final Map<String, Contributor> availableMetamodelContributors = MetamodelContributorRegistry
				.getRegisteredMetamodelContributors();

		final List<Contributor> result = new ArrayList<Contributor>();

		if (includeDisabled) {
			for (final Contributor contributor : availableMetamodelContributors.values()) {
				if (!result.contains(contributor)) {
					result.add(contributor);
				}
			}
		}

		return result;
	}
	
	private void updateButtonStates() {
		final int index = table.getSelectionIndex();
		if (index == 0) {
			upButton.setEnabled(false);
		}
		else {
			upButton.setEnabled(true);
		}
		if (index >= checkboxTableViewer.getTable().getItemCount() - 1) {
			downButton.setEnabled(false);
		}
		else {
			downButton.setEnabled(true);
		}
		storeString = MetamodelContributorsPropertyAndPreferencePage.createStoreString(checkboxTableViewer.getCheckedElements());
	}
	
	private void enableMetamodelContributorTable(final boolean enabled) {
		checkboxTableViewer.setAllGrayed(!enabled);
		checkboxTableViewer.getTable().deselectAll();
		tableContainer.setEnabled(enabled);
		upButton.setEnabled(enabled);
		downButton.setEnabled(enabled);
		if (enabled) updateButtonStates();
	}

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public XtendXpandProjectWizardPage() {
		super(Messages.XtendXpandProjectWizardPage_Name);
		setTitle(Messages.XtendXpandProjectWizardPage_Title);
		setDescription(Messages.XtendXpandProjectWizardPage_Description);
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		
		Label label = new Label(container, SWT.NULL);
		label.setText(Messages.XtendXpandProjectWizardPage_ProjectLabel);

		projectText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		projectText.setLayoutData(gd);
		projectText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		final Group mm_list = new Group(container, SWT.SHADOW_IN); 
		layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = 0;
		layout.horizontalSpacing = 0;
		layout.marginWidth = 0;
		mm_list.setLayout(layout);
		gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalAlignment = SWT.FILL;
		gd.grabExcessHorizontalSpace = true;
		gd.verticalAlignment = SWT.FILL;
		gd.grabExcessVerticalSpace = true;
		mm_list.setLayoutData(gd);
		mm_list.setText("Meta Models");
		
		
		useWorkspaceDefinedMetaModels = new Button(mm_list, SWT.RADIO);
		label = new Label(mm_list, SWT.NULL);
		label.setText("Use workspace defaults");
		
		useProjectSpecificMetaModels = new Button (mm_list, SWT.RADIO);
		label = new Label(mm_list, SWT.NULL);
		label.setText("Use project specific metamodels:");
		
		tableContainer = new Composite(mm_list, SWT.NULL);
		gd = new GridData();
		gd.horizontalSpan = 2;
		gd.horizontalIndent = 22;
		layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginHeight = 0;
		layout.horizontalSpacing = 0;
		layout.marginWidth = 0;
		tableContainer.setLayoutData(gd);
		tableContainer.setLayout(layout);
		
		checkboxTableViewer = CheckboxTableViewer.newCheckList(tableContainer, SWT.BORDER);
		checkboxTableViewer.setLabelProvider(new TableLabelProvider());
		checkboxTableViewer.setContentProvider(new ArrayContentProvider());
		table = checkboxTableViewer.getTable();
		table.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				updateButtonStates();
				dialogChanged();
			}

		});
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		final Composite composite = new Composite(tableContainer, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, false));
		final GridLayout gridLayout_1 = new GridLayout();
		composite.setLayout(gridLayout_1);

		upButton = new Button(composite, SWT.NONE);
		upButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ISelection selection = checkboxTableViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					final Object firstElement = structuredSelection.getFirstElement();
					if (firstElement instanceof Contributor) {
						final Contributor contributor = (Contributor) firstElement;
						final int index = availableMetamodelContributors.indexOf(contributor);
						availableMetamodelContributors.remove(contributor);
						availableMetamodelContributors.add(index - 1, contributor);
						checkboxTableViewer.refresh();
					}
				}
				updateButtonStates();
			}
		});
		final GridData gridData_1 = new GridData(SWT.FILL, SWT.CENTER, false, false);
		gridData_1.widthHint = 75;
		upButton.setLayoutData(gridData_1);
		upButton.setText(Messages.MetamodelContributorsPropertyAndPreferencePage_UpButton);

		downButton = new Button(composite, SWT.NONE);
		downButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final ISelection selection = checkboxTableViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					final IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					final Object firstElement = structuredSelection.getFirstElement();
					if (firstElement instanceof Contributor) {
						final Contributor contributor = (Contributor) firstElement;
						final int index = availableMetamodelContributors.indexOf(contributor);
						availableMetamodelContributors.remove(contributor);
						availableMetamodelContributors.add(index + 1, contributor);
						checkboxTableViewer.refresh();
					}
				}
				updateButtonStates();
			}
		});
		final GridData gridData = new GridData(SWT.FILL, SWT.CENTER, false, false);
		gridData.widthHint = 75;
		downButton.setLayoutData(gridData);
		downButton.setText(Messages.MetamodelContributorsPropertyAndPreferencePage_DownButton);
		
		generateSimpleExample = new Button(mm_list, SWT.RADIO);
		label = new Label(mm_list, SWT.NULL);
		label.setText("Generate a sample EMF based Xpand project");
		
		generateSimpleExample.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
				dialogChanged();
				enableMetamodelContributorTable(false);
			}

			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
				enableMetamodelContributorTable(false);
			}

		});
		
		useWorkspaceDefinedMetaModels.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
				dialogChanged();
				enableMetamodelContributorTable(false);
			}

			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
				enableMetamodelContributorTable(false);
			}

		});
		
		useProjectSpecificMetaModels.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
				dialogChanged();
				enableMetamodelContributorTable(true);
			}

			public void widgetSelected(SelectionEvent e) {
				dialogChanged();
				enableMetamodelContributorTable(true);
			}

		});

		setupData();
		initialize();
		dialogChanged();
		setControl(container);
	}
	
	/**
	 * Fills the table viewer with a list of available metamodel contributors
	 * and visually checks the ones that are enabled.
	 */
	private void setupData() {
		availableMetamodelContributors = getMetamodelContributors(true);
		checkboxTableViewer.setInput(availableMetamodelContributors);

		final Collection<Contributor> enabledMetamodelContributors = getMetamodelContributors(false);
		checkboxTableViewer.setCheckedElements(enabledMetamodelContributors.toArray());

	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		projectText.setText(Messages.XtendXpandProjectWizardPage_DefaultFileName);
		tableContainer.setEnabled(false);
		useWorkspaceDefinedMetaModels.setSelection(true);
	}

	/**
	 * Ensures that both text fields are set.
	 */
	void dialogChanged() {

		if (projectText.getText().trim().length() == 0) {
			setErrorMessage(Messages.XtendXpandProjectWizardPage_ProjectName_Error);
			return;
		}
		if (useProjectSpecificMetaModels.getSelection() && checkboxTableViewer.getCheckedElements().length == 0) {
			setErrorMessage(Messages.XtendXpandProjectWizardPage_NoMMSelected_Error);
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
	}

	public String getProjectName() {
		return projectText.getText();
	}

	public boolean isCreateExample() {
		return generateSimpleExample.getSelection();
	}
	
	public boolean isUseWorkspaceDefinedMM() {
		return useWorkspaceDefinedMetaModels.getSelection();
	}
	public boolean isProjectSpecificMM() {
		return useProjectSpecificMetaModels.getSelection();
	}
}