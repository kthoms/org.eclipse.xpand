package org.eclipse.xtend.shared.ui.editor.preferences;

import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.COMMENT;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.DEFINE;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.KEYWORDS;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.OTHER;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.STRING;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.TERMINALS;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.TEXT;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.List;

public class TokenListFieldEditor extends FieldEditor {
	/* preference key / description mapping */
	private static final String[][] PREFERENCES = new String[][] { { Messages.xtendxpanduipref_keywords, KEYWORDS },
			{ Messages.xtendxpanduipref_terminals, TERMINALS }, { Messages.xtendxpanduipref_definitions, DEFINE },
			{ Messages.xtendxpanduipref_strings, STRING }, { Messages.xtendxpanduipref_comments, COMMENT },
			{ Messages.xtendxpanduipref_text, TEXT }, { Messages.xtendxpanduipref_other, OTHER } };

	private UiDetailsPreferencePage detailsPage = new UiDetailsPreferencePage();

	private List tokenList;

	public TokenListFieldEditor(Composite fieldEditorParent, IPreferenceStore preferenceStore) {
		setPreferenceStore(preferenceStore);
		createControl(fieldEditorParent);
		init("tokenStyles", Messages.xtendxpanduipref_tokenStyles); //$NON-NLS-1$
	}

	@Override
	protected void adjustForNumColumns(int numColumns) {
		Control control = getLabelControl();
		((GridData) control.getLayoutData()).horizontalSpan = numColumns;
		((GridData) tokenList.getLayoutData()).horizontalSpan = numColumns - 1;
	}

	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		Control control = getLabelControl(parent);
		control.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false, numColumns, 1));

		tokenList = new List(parent, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL | SWT.H_SCROLL);
		tokenList.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, false, false, numColumns - 1, 1));
		for (String[] pref : PREFERENCES) {
			tokenList.add(pref[0]);
		}
		tokenList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				doLoad();
			}
		});
		tokenList.setSelection(0);

		detailsPage.createControl(parent);
		detailsPage.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
	}

	@Override
	protected void doLoad() {
		String token = getSelectedTokenName();
		if (token != null) {
			detailsPage.load(token);
		}
	}

	@Override
	protected void doLoadDefault() {
		detailsPage.loadDefaults(getSelectedTokenName());
	}

	@Override
	protected void doStore() {
		detailsPage.performOk();
	}

	@Override
	public void store() {
		doStore(); // always store on details page
	}

	@Override
	public int getNumberOfControls() {
		return 2;
	}

	private String getSelectedTokenName() {
		if (tokenList == null) {
			return null;
		}
		int ind = tokenList.getSelectionIndex();
		if (ind < 0) {
			return null;
		}
		return PREFERENCES[ind][1];
	}

}
