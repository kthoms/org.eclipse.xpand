package org.eclipse.xtend.shared.ui.editor.preferences;

import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.FGCOLOR;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.FONTSTYLE;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.texteditor.ChainedPreferenceStore;
import org.eclipse.xtend.shared.ui.Activator;

public class UiDetailsPreferencePage extends FieldEditorPreferencePage {

	private PreferenceStore bufferStore = new PreferenceStore();

	private Map<FieldEditor, String> editors;

	private IPreferenceStore preferenceStore;

	private String currentToken;

	public UiDetailsPreferencePage() {
		super(Messages.xtendxpanduipref_lookfeel, GRID);
		preferenceStore = Activator.getDefault().getPreferenceStore();
	}

	@SuppressWarnings("nls")
	@Override
	protected void createFieldEditors() {
		Composite parent = getFieldEditorParent();

		FontstyleFieldEditor fontstyleEditor = new FontstyleFieldEditor("", Messages.xtendxpanduipref_fontstyle, parent);
		addField(fontstyleEditor); // bold, italic, underline

		ColorFieldEditor fgcolorEditor = new ColorFieldEditor("", Messages.xtendxpanduipref_textcolor, parent);
		addField(fgcolorEditor); // foreground color

		editors = new HashMap<FieldEditor, String>();
		editors.put(fgcolorEditor, FGCOLOR);
		editors.put(fontstyleEditor, FONTSTYLE);
	}

	@Override
	protected Control createContents(Composite parent) {
		noDefaultAndApplyButton(); // handled in surrounding page
		return super.createContents(parent);
	}

	@Override
	protected IPreferenceStore doGetPreferenceStore() {
		return new ChainedPreferenceStore(new IPreferenceStore[] { bufferStore, preferenceStore });
	}

	protected void load(String tokenName) {
		setCurrentTokenName(tokenName);
		initialize();
	}

	protected void loadDefaults(String tokenName) {
		setCurrentTokenName(tokenName);
		performDefaults();
		for (FieldEditor fe : editors.keySet()) {
			if (fe.presentsDefaultValue()) {
				bufferStore
						.setDefault(fe.getPreferenceName(), preferenceStore.getDefaultString(fe.getPreferenceName()));
			}
		}
	}

	@Override
	public final boolean performOk() {
		boolean changed = false;
		for (String name : bufferStore.preferenceNames()) {
			if (!bufferStore.isDefault(name)) {
				preferenceStore.putValue(name, bufferStore.getString(name));
				changed = true;
			}
			else {
				preferenceStore.setToDefault(name);

			}
		}
		if (changed) {
			preferenceStore.firePropertyChangeEvent(currentToken, null, null);
		}
		bufferStore = new PreferenceStore();
		setPreferenceStore(null); // re-query new chainstore
		return true;
	}

	@Override
	public final void propertyChange(PropertyChangeEvent event) {
		if (event.getSource() instanceof FieldEditor) {
			FieldEditor fe = (FieldEditor) event.getSource();
			fe.setPreferenceStore(bufferStore);
			fe.store();
		}
		super.propertyChange(event);
	}

	private void setCurrentTokenName(String currentTokenName) {
		this.currentToken = currentTokenName;
		for (Entry<FieldEditor, String> e : editors.entrySet()) {
			FieldEditor fieldEditor = e.getKey();
			fieldEditor.setPreferenceName(currentTokenName + e.getValue());
		}
	}
}
