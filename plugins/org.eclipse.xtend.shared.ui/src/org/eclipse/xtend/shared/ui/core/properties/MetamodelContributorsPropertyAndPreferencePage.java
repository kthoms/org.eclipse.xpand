/*******************************************************************************
 * Copyright (c) 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.shared.ui.core.properties;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jdt.internal.ui.preferences.PropertyAndPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.metamodel.Contributor;
import org.eclipse.xtend.shared.ui.core.metamodel.MetamodelContributorRegistry;
import org.eclipse.xtend.shared.ui.core.preferences.PreferenceConstants;
import org.eclipse.xtend.shared.ui.internal.XtendLog;

/**
 * This class displays a property page or a preference page and lets the user
 * select the meta model contributors that should be enabled for the specific
 * scope.
 * 
 * @author Peter Friese
 */
public class MetamodelContributorsPropertyAndPreferencePage extends PropertyAndPreferencePage {

	private Button downButton;
	private Button upButton;

	/**
	 * Renders a human readable representation of the meta model contributors.
	 */
	class TableLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object element, int columnIndex) {
			if (element instanceof Contributor) {
				Contributor contributor = (Contributor) element;
				return contributor.getDisplayName();
			}
			return element.toString();
		}

		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}
	}

	private CheckboxTableViewer checkboxTableViewer;

	private IPreferenceStore prefStore;

	private LinkedList<Contributor> availableMetamodelContributors;
	private Table table;

	private Collection<Contributor> getEnabledMetamodelContributors() {
		Map<String, Contributor> availableMetamodelContributors = MetamodelContributorRegistry
				.getRegisteredMetamodelContributors();

		// retrieve all configured metamodels
		prefStore = getPreferenceStore();
		fixMetamodelContributorPreferences(prefStore);
		String rawString = prefStore.getString(PreferenceConstants.METAMODELCONTRIBUTORS);

		LinkedList<Contributor> result = new LinkedList<Contributor>();

		// first, get all enabled contributors
		if (isNotEmpty(rawString)) {
			String[] selected = rawString.split(",");

			for (String metaModelContributorClassName : selected) {
				Contributor contributor = availableMetamodelContributors.get(metaModelContributorClassName);
				result.add(contributor);
			}
		}

		return result;
	}
	
	private LinkedList<Contributor> getMetamodelContributors() {
		Map<String, Contributor> availableMetamodelContributors = MetamodelContributorRegistry
				.getRegisteredMetamodelContributors();

		// retrieve all configured metamodels
		prefStore = getPreferenceStore();
		fixMetamodelContributorPreferences(prefStore);
		String rawString = prefStore.getString(PreferenceConstants.METAMODELCONTRIBUTORS);

		LinkedList<Contributor> result = new LinkedList<Contributor>();

		// first, get all enabled contributors
		if (isNotEmpty(rawString)) {
			String[] selected = rawString.split(",");

			for (String metaModelContributorClassName : selected) {
				Contributor contributor = availableMetamodelContributors.get(metaModelContributorClassName);
				result.add(contributor);
			}
		}

		// now, get disabled contributors
		for (Contributor contributor : availableMetamodelContributors.values()) {
			if (!result.contains(contributor)) {
				result.add(contributor);
			}
		}

		return result;
	}

	/**
	 * fix: package name from UML2MetamodelContributor was wrong. For compatibility
	 * reasons we fix this name here on the fly. Later we could offer a migration path.
	 */
	private static void fixMetamodelContributorPreferences(IPreferenceStore prefStore) {
		String metamodelContr = prefStore.getString(PreferenceConstants.METAMODELCONTRIBUTORS);
		if (metamodelContr.indexOf("openarchitecturware")>0) {
			metamodelContr = metamodelContr.replace("openarchitecturware", "openarchitectureware");
			prefStore.setValue(PreferenceConstants.METAMODELCONTRIBUTORS, metamodelContr);
		}
	}

	private boolean isNotEmpty(String rawString) {
		return rawString != null && !rawString.equals("");
	}

	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		IPreferenceStore store;
		if (isProjectPreferencePage()) {
			// get java project
			IProject project = getProject();
			store = new ScopedPreferenceStore(new ProjectScope(project), Activator.getId());
		} else {
			store = new ScopedPreferenceStore(new InstanceScope(), Activator.getId());
		}
		return store;
	}
	
	private void updateButtonStates() {
		int index = table.getSelectionIndex();
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
	}

	@Override
	protected Control createPreferenceContent(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.marginHeight = 0;
		gridLayout.horizontalSpacing = 0;
		gridLayout.marginWidth = 0;
		container.setLayout(gridLayout);

		final Label activatedMetamodelContributorsLabel = new Label(container, SWT.NONE);
		activatedMetamodelContributorsLabel.setText("&Activated metamodel contributors:");
		new Label(container, SWT.NONE);

		checkboxTableViewer = CheckboxTableViewer.newCheckList(container, SWT.BORDER);
		checkboxTableViewer.setLabelProvider(new TableLabelProvider());
		checkboxTableViewer.setContentProvider(new ArrayContentProvider());
		table = checkboxTableViewer.getTable();
		table.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				updateButtonStates();
			}

		});
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		final Composite composite = new Composite(container, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, false));
		final GridLayout gridLayout_1 = new GridLayout();
		composite.setLayout(gridLayout_1);

		upButton = new Button(composite, SWT.NONE);
		upButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				ISelection selection = checkboxTableViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					Object firstElement = structuredSelection.getFirstElement();
					if (firstElement instanceof Contributor) {
						Contributor contributor = (Contributor) firstElement;
						int index = availableMetamodelContributors.indexOf(contributor);
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
		upButton.setText("&Up");

		downButton = new Button(composite, SWT.NONE);
		downButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				ISelection selection = checkboxTableViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection structuredSelection = (IStructuredSelection) selection;
					Object firstElement = structuredSelection.getFirstElement();
					if (firstElement instanceof Contributor) {
						Contributor contributor = (Contributor) firstElement;
						int index = availableMetamodelContributors.indexOf(contributor);
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
		downButton.setText("&Down");
		//
		setupData();
		return container;
	}

	/**
	 * Fills the table viewer with a list of available metamodel contributors
	 * and visually checks the ones that are enabled.
	 */
	private void setupData() {
		availableMetamodelContributors = getMetamodelContributors();
		checkboxTableViewer.setInput(availableMetamodelContributors);

		Collection<Contributor> enabledMetamodelContributors = getEnabledMetamodelContributors();
		checkboxTableViewer.setCheckedElements(enabledMetamodelContributors.toArray());
	}

	@Override
	protected String getPreferencePageID() {
		return "org.eclipse.xtend.shared.ui.properties.MetamodelContributorsPropertyPage";
	}

	@Override
	protected String getPropertyPageID() {
		return "org.eclipse.xtend.shared.ui.properties.MetamodelContributorsPropertyPage";
	}

	@Override
	protected boolean hasProjectSpecificOptions(IProject project) {
		IPreferenceStore preferenceStore = getPreferenceStore();
		return preferenceStore.getBoolean(PreferenceConstants.PROJECT_SPECIFIC_METAMODEL);
	}

	@Override
	public boolean performOk() {
		if (isProjectPreferencePage()) {
			prefStore.setValue(PreferenceConstants.PROJECT_SPECIFIC_METAMODEL, useProjectSettings());
		}
		prefStore.setValue(PreferenceConstants.METAMODELCONTRIBUTORS, createStoreString());
		try {
			((ScopedPreferenceStore) prefStore).save();
		} catch (IOException e1) {
			XtendLog.logError(e1);
		}

		if (isProjectPreferencePage()) {
			final IProject project = getProject();
			final Job job = new Job("Analyzing " + project.getName() + " ...") {
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					try {
						new WorkspaceModifyOperation() {
							@Override
							protected void execute(IProgressMonitor monitor) throws CoreException,
									java.lang.reflect.InvocationTargetException, InterruptedException {
								IXtendXpandProject p = Activator.getExtXptModelManager().findProject(project);
								if (p != null) {
									monitor.beginTask("...", p.getRegisteredResources().length);
									p.analyze(monitor);
									monitor.done();
								}
							}
						}.run(monitor);
					} catch (InvocationTargetException e) {
						XtendLog.logError(e);
					} catch (InterruptedException e) {
						XtendLog.logError(e);
					}
					return Status.OK_STATUS;
				}
			};
			job.schedule();
		} else {
			final Job job = new Job("Analyzing all oAW projects...") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {
					Activator.getExtXptModelManager().analyze(monitor);
					return Status.OK_STATUS;
				}

			};
			job.schedule();
		}

		return super.performOk();
	}

	/**
	 * @return
	 */
	private String createStoreString() {
		Object[] checkedElements = checkboxTableViewer.getCheckedElements();
		String result = "";
		for (int i = 0; i < checkedElements.length; i++) {
			Object object = checkedElements[i];
			if (object instanceof Contributor) {
				Contributor contributor = (Contributor) object;
				String className = contributor.getClassName();
				result += className;
			}
			if (i < checkedElements.length - 1) {
				result += ",";
			}
		}
		return result;
	}
}