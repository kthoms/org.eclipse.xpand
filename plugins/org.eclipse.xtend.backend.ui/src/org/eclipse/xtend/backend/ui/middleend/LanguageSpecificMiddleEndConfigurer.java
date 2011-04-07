package org.eclipse.xtend.backend.ui.middleend;

import java.util.Map;
import java.util.Set;

import org.eclipse.jdt.core.IJavaProject;

public interface LanguageSpecificMiddleEndConfigurer {
	
	public Map<Class<?>, Object> getSpecificParams (IJavaProject jp);
	
	public String getMiddleEndName ();
	
	public Set<String> getConfiguredTypeSystems (IJavaProject project);

}
