package org.eclipse.xtend.shared.ui.editor.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.xtend.shared.ui.Activator;

public class UiPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public UiPreferencePage() {
		super();
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
	}

	@Override
	protected void createFieldEditors() {
		addField(new TokenListFieldEditor(getFieldEditorParent(), getPreferenceStore()));
		initialize();
	}

	public void init(IWorkbench workbench) {
		/* NO-OP */
	}

}
