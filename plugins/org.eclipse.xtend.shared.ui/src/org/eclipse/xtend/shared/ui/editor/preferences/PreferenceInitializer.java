package org.eclipse.xtend.shared.ui.editor.preferences;

import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.COMMENT;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.DEFINE;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.FGCOLOR;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.FONTSTYLE;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.KEYWORDS;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.OTHER;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.STRING;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.TERMINALS;
import static org.eclipse.xtend.shared.ui.editor.preferences.UiPreferenceConstants.TEXT;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtend.shared.ui.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	private static final RGB DEFAULT_KEYWORD_FGCOLOR = new RGB(127, 0, 85); 

	private static final RGB DEFAULT_TERMINAL_FGCOLOR = new RGB(163, 163, 163); 

	private static final RGB DEFAULT_STRING_FGCOLOR = new RGB(42, 0, 255); 

	private static final RGB DEFAULT_COMMENT_FGCOLOR = new RGB(63, 127, 95); 

	private static final RGB DEFAULT_OTHER_FGCOLOR = new RGB(45, 45, 45); 

	private static final RGB DEFAULT_TEXT_FGCOLOR = new RGB(0, 0, 0);

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		configure(store, KEYWORDS, DEFAULT_KEYWORD_FGCOLOR, 0);
		configure(store, DEFINE, DEFAULT_KEYWORD_FGCOLOR, SWT.BOLD);
		configure(store, TERMINALS, DEFAULT_TERMINAL_FGCOLOR, 0);
		configure(store, STRING, DEFAULT_STRING_FGCOLOR, 0);
		configure(store, COMMENT, DEFAULT_COMMENT_FGCOLOR, 0);
		configure(store, OTHER, DEFAULT_OTHER_FGCOLOR, 0);
		configure(store, TEXT, DEFAULT_TEXT_FGCOLOR, SWT.BOLD);
	}

	private void configure(IPreferenceStore store, String element, RGB fgColor, int style) {
		store.setDefault(element + FGCOLOR, StringConverter.asString(fgColor));
		store.setDefault(element + FONTSTYLE, Integer.toString(style));
	}

}
