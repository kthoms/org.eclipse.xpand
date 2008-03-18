package org.eclipse.xpand3.util;

import java.io.InputStream;

public class Xpand3FileUtil {

	public static final String CHECK_EXTENSION = ".chk";
	public static final String XPAND_EXTENSION = ".xpt";
	public static final String XTEND_EXTENSION = ".ext";

	public static final String[] SUPPORTED_EXTENSIONS = new String[] {
			XTEND_EXTENSION, XPAND_EXTENSION, CHECK_EXTENSION };

	public static InputStream getXpand3FileAsStream(String xpandFileName,
			Object context) {
		if (xpandFileName == null || "".equals(xpandFileName)) {
			return null;
		}
		xpandFileName = xpandFileName.replace(SyntaxConstants.NS_DELIM, "/");
		Loader classLoader = LoaderFactory.getClassLoader(context);
		InputStream resourceAsStream = classLoader
				.getResourceAsStream(xpandFileName);
		int index = 0;
		while (resourceAsStream == null && index < SUPPORTED_EXTENSIONS.length) {
			resourceAsStream = classLoader.getResourceAsStream(xpandFileName
					+ SUPPORTED_EXTENSIONS[index++]);
		}
		return resourceAsStream;
	}
}
