package org.eclipse.xtend.backend;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtend.backend.common.GlobalVarContext;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class GlobalVarContextImpl implements GlobalVarContext {
	private final Map<String, Object> _globalVars = new HashMap<String, Object> ();

	public Map<String, Object> getGlobalVars() {
		return _globalVars;
	}
}
