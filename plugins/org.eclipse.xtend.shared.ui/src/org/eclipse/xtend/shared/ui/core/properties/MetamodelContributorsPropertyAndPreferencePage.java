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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.Messages;
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
 * @author Dennis Huebner
 */
@SuppressWarnings("restriction")
public class MetamodelContributorsPropertyAndPreferencePage extends PropertyAndPreferencePage {

	private Button downButton;
	private Button upButton;

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

	private CheckboxTableViewer checkboxTableViewer;

	private IPreferenceStore prefStore;

	private List<Contributor> availableMetamodelContributors;
	private Table table;
	private Combo analyzerCombobox;

	private List<Contributor> getMetamodelContributors(final boolean includeDisabled) {
		final Map<String, Contributor> availableMetamodelContributors = MetamodelContributorRegistry
				.getRegisteredMetamodelContributors();

		// retrieve all configured metamodels
		prefStore = getPreferenceStore();
		fixMetamodelContributorPreferences(prefStore);
		final String rawString = prefStore.getString(PreferenceConstants.METAMODELCONTRIBUTORS);

		final List<Contributor> result = new ArrayList<Contributor>();

		// first, get all enabled contributors
		if (isNotEmpty(rawString)) {
			final String[] selected = rawString.split(",");

			for (final String metaModelContributorClassName : selected) {
				final Contributor contributor = availableMetamodelContributors.get(metaModelContributorClassName);
				if (contributor != null) {
					result.add(contributor);
				}
			}
		}
		if (includeDisabled) {
			// now, get disabled contributors
			for (final Contributor contributor : availableMetamodelContributors.values()) {
				if (!result.contains(contributor)) {
					result.add(contributor);
				}
			}
		}

		return result;
	}

	/**
	 * fix: package name from UML2MetamodelContributor was wrong. For
	 * compatibility reasons we fix this name here on the fly. Later we could
	 * offer a migration path.
	 */
	private static void fixMetamodelContributorPreferences(final IPreferenceStore prefStore) {
		String metamodelContr = prefStore.getString(PreferenceConstants.METAMODELCONTRIBUTORS);
		if (metamodelContr.indexOf("openarchitecturware") > 0) {
			metamodelContr = metamodelContr.replace("openarchitecturware", "openarchitectureware");
			prefStore.setValue(PreferenceConstants.METAMODELCONTRIBUTORS, metamodelContr);
		}
	}

	private boolean isNotEmpty(final String rawString) {
		return rawString != null && !rawString.equals("");
	}

	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		IPreferenceStore store;
		if (isProjectPreferencePage()) {
			// get java project
			final IProject project = getProject();
			store = new ScopedPreferenceStore(new ProjectScope(project), Activator.getId());
		}
		else {
			store = new ScopedPreferenceStore(new InstanceScope(), Activator.getId());
		}
		return store;
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
	}

	@Override
	protected Control createPreferenceContent(final Composite parent) {
		final Composite container = new Composite(parent, SWT.NULL);
		final GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		gridLayout.marginHeight = 0;
		gridLayout.horizontalSpacing = 0;
		gridLayout.marginWidth = 0;
		container.setLayout(gridLayout);

		final Label activatedMetamodelContributorsLabel = new Label(container, SWT.NONE);
		activatedMetamodelContributorsLabel.setText(Messages.MetamodelContributorsPropertyAndPreferencePage_ContributorsLabel);
		new Label(container, SWT.NONE);

		checkboxTableViewer = CheckboxTableViewer.newCheckList(container, SWT.BORDER);
		checkboxTableViewer.setLabelProvider(new TableLabelProvider());
		checkboxTableViewer.setContentProvider(new ArrayContentProvider());
		table = checkboxTableViewer.getTable();
		table.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
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
		
		if(!isProjectPreferencePage()) {
			Label analyzerLabel = new Label(container, SWT.NONE);
			analyzerLabel.setText(Messages.MetamodelContributorsPropertyAndPreferencePage_IncrementalAnalysisLabel);
			new Label(container, SWT.NONE);
			analyzerCombobox = new Combo(container, SWT.READ_ONLY);
			analyzerCombobox.setItems(new String[] {
					Messages.MetamodelContributorsPropertyAndPreferencePage_CurrentAndDependentProjects,
					Messages.MetamodelContributorsPropertyAndPreferencePage_WholeProject,
					Messages.MetamodelContributorsPropertyAndPreferencePage_FileOnly,
					Messages.MetamodelContributorsPropertyAndPreferencePage_FileOnlyReverseReference});
			new Label(container, SWT.NONE);
		}
		
		setupData();
		return container;
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
		
		if(!isProjectPreferencePage())
			analyzerCombobox.select(getPreferenceStore().getInt(PreferenceConstants.INCREMENTAL_ANALYZER_STRATEGY));
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
	protected boolean hasProjectSpecificOptions(final IProject project) {
		final IPreferenceStore preferenceStore = getPreferenceStore();
		return preferenceStore.getBoolean(PreferenceConstants.PROJECT_SPECIFIC_METAMODEL);
	}

	@Override
	public boolean performOk() {
		if (isProjectPreferencePage()) {
			prefStore.setValue(PreferenceConstants.PROJECT_SPECIFIC_METAMODEL, useProjectSettings());
		} else {
			prefStore.setValue(PreferenceConstants.INCREMENTAL_ANALYZER_STRATEGY, analyzerCombobox.getSelectionIndex());
		}
		prefStore.setValue(PreferenceConstants.METAMODELCONTRIBUTORS, createStoreString(checkboxTableViewer.getCheckedElements()));
		try {
			((ScopedPreferenceStore) prefStore).save();
		}
		catch (final IOException e1) {
			XtendLog.logError(e1);
		}

		if (isProjectPreferencePage()) {
			final IProject project = getProject();
			final Job job = new Job(Messages.MetamodelContributorsPropertyAndPreferencePage_Analyzing + project.getName() + " ...") {
				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					try {
						new WorkspaceModifyOperation() {
							@Override
							protected void execute(final IProgressMonitor monitor) throws CoreException,
									java.lang.reflect.InvocationTargetException, InterruptedException {
								final IXtendXpandProject p = Activator.getExtXptModelManager().findProject(project);
								if (p != null) {
									monitor.beginTask("...", p.getRegisteredResources().length);
									p.analyze(monitor, Activator.getExecutionContext(p.getProject()));
									monitor.done();
								}
							}
						}.run(monitor);
					}
					catch (final InvocationTargetException e) {
						XtendLog.logError(e);
					}
					catch (final InterruptedException e) {
						XtendLog.logError(e);
					}
					return Status.OK_STATUS;
				}
			};
			job.schedule();
		}
		else {
			final Job job = new Job(Messages.MetamodelContributorsPropertyAndPreferencePage_JobName) {

				@Override
				protected IStatus run(final IProgressMonitor monitor) {
					Activator.getExtXptModelManager().analyze(monitor);
					return Status.OK_STATUS;
				}

			};
			job.schedule();
		}

		return super.performOk();
	}


	public static String createStoreString(final Object[] checkedElements) {
		String result = "";
		for (int i = 0; i < checkedElements.length; i++) {
			final Object object = checkedElements[i];
			if (object instanceof Contributor) {
				final Contributor contributor = (Contributor) object;
				final String className = contributor.getClassName();
				result += className;
			}
			if (i < checkedElements.length - 1) {
				result += Messages.MetamodelContributorsPropertyAndPreferencePage_19;
			}
		}
		return result;
	}
}