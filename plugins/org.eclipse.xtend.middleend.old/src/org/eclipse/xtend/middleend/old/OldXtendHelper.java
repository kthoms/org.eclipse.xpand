package org.eclipse.xtend.middleend.old;

import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;
import org.eclipse.internal.xtend.xtend.XtendFile;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
final class OldXtendHelper {
    public static String normalizeXtendResourceName (String xtendName) {
        xtendName = xtendName.replace (SyntaxConstants.NS_DELIM, "/");
        if (xtendName.endsWith ("." + XtendFile.FILE_EXTENSION))
            xtendName = xtendName.substring (0, xtendName.length() - (XtendFile.FILE_EXTENSION.length() + 1));

        return xtendName;
    }
}
