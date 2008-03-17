package org.eclipse.xpand3.middlend;

import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEndFactory;

public class Xpand3MiddleEndFactory implements LanguageSpecificMiddleEndFactory {

	private static final String XPAND3_MIDDLE_END = "Xpand3MiddleEnd";

	public LanguageSpecificMiddleEnd create(Object specificData) {
		return new Xpand3MiddleEnd();
	}

	public String getName() {
		return XPAND3_MIDDLE_END;
	}

	public int getPriority() {
		return 0;
	}

}
