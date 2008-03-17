package org.eclipse.xpand3.util;

public class Xpand3Util {

	public static final String TEMPLATE_EXTENSION = null;

	public static String normalizeXpandResourceName(String xpandName) {
		if (xpandName == null)
			return null;

		if (!xpandName.endsWith("." + TEMPLATE_EXTENSION))
			xpandName += "." + TEMPLATE_EXTENSION;

		xpandName = xpandName.replace(SyntaxConstants.NS_DELIM, "/");

		return xpandName;
	}

}
