package org.eclipse.xtend.shared.ui.editor.preferences;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class FontstyleFieldEditor extends FieldEditor {
	private final class StyleButtonSelectionAdapter extends SelectionAdapter {

		private final Button control;

		private final int flag;

		public StyleButtonSelectionAdapter(Button control, int flag) {
			this.control = control;
			this.flag = flag;
		}

		@Override
		public void widgetSelected(SelectionEvent event) {
			if (control.getSelection() != ((value & flag) > 0)) {
				int oldValue = value;
				value ^= flag; // toggle
				changed = true;
				setPresentsDefaultValue(false);
				fireValueChanged(VALUE, (oldValue > -1) ? Integer.toString(oldValue) : null, Integer.toString(value));
			}
		}
	}

	private boolean changed = false;

	private int value = 0;

	private Button boldButton, italicButton, underlineButton;

	private Composite cbPanel;

	public FontstyleFieldEditor(String name, String labeltext, Composite fieldEditorParent) {
		init(name, labeltext);
		createControl(fieldEditorParent);
	}

	@Override
	protected void adjustForNumColumns(int numColumns) {
		Label labelControl = getLabelControl();
		if (labelControl != null && labelControl.getLayoutData() instanceof GridData) {
			GridData data = (GridData) labelControl.getLayoutData();
			data.horizontalSpan = numColumns;
		}
		if (cbPanel.getLayoutData() instanceof GridData) {
			GridData layoutData = (GridData) cbPanel.getLayoutData();
			layoutData.horizontalSpan = numColumns;

		}
	}

	@Override
	protected void doFillIntoGrid(Composite parent, int numColumns) {
		cbPanel = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(numColumns, true);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.horizontalSpacing = FieldEditor.HORIZONTAL_GAP;
		cbPanel.setLayout(layout);
		cbPanel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, numColumns, 1));

		boldButton = new Button(cbPanel, SWT.CHECK | SWT.LEAD);
		boldButton.setText(Messages.xtendxpanduipref_bold);
		boldButton.addSelectionListener(new StyleButtonSelectionAdapter(boldButton, SWT.BOLD));

		italicButton = new Button(cbPanel, SWT.CHECK | SWT.LEAD);
		italicButton.setText(Messages.xtendxpanduipref_italic);
		italicButton.addSelectionListener(new StyleButtonSelectionAdapter(italicButton, SWT.ITALIC));

		underlineButton = new Button(cbPanel, SWT.CHECK | SWT.LEAD);
		underlineButton.setText(Messages.xtendxpanduipref_underline);
		underlineButton.addSelectionListener(new StyleButtonSelectionAdapter(underlineButton, TextAttribute.UNDERLINE));
	}

	@Override
	protected void doLoad() {
		String value = getPreferenceStore().getString(getPreferenceName());
		doLoadInternal(value);
	}

	@Override
	protected void doLoadDefault() {
		String value = getPreferenceStore().getDefaultString(getPreferenceName());
		doLoadInternal(value);
	}

	private void doLoadInternal(String valueString) {
		changed = false;
		if (valueString != null) {
			try {
				value = Integer.parseInt(valueString);
				boldButton.setSelection((value & SWT.BOLD) > 0);
				italicButton.setSelection((value & SWT.ITALIC) > 0);
				underlineButton.setSelection((value & TextAttribute.UNDERLINE) > 0);
				return;
			}
			catch (NumberFormatException e) {
				/* ignore, use defaults */
			}
		}
		value = 0;
		boldButton.setSelection(false);
		italicButton.setSelection(false);
		underlineButton.setSelection(false);
	}

	@Override
	protected void doStore() {
		if (!changed) {
			getPreferenceStore().setToDefault(getPreferenceName());
		}
		else {
			getPreferenceStore().setValue(getPreferenceName(), Integer.toString(value));
		}
	}

	@Override
	public int getNumberOfControls() {
		return 3;
	}

}
