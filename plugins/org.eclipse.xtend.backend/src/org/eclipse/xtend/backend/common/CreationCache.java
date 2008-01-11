package org.eclipse.xtend.backend.common;

import java.util.List;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public interface CreationCache {
    Object createRaw (BackendType t, List<Object> idParams);
}
