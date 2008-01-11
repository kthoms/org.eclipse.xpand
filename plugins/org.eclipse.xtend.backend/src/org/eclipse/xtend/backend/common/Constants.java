package org.eclipse.xtend.backend.common;

import org.eclipse.xtend.backend.BackendFacade;


/**
 *
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface Constants {
    String THIS_NAME = "this";
    
    String LOG_NULL_DEREF = BackendFacade.class.getPackage().getName() + ".NULL_DEREF";
}
