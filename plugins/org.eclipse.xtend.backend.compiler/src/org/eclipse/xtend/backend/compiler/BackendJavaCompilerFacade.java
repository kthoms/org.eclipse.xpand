package org.eclipse.xtend.backend.compiler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.middleend.xpand.XpandBackendFacade;
import org.eclipse.xtend.typesystem.MetaModel;

public class BackendJavaCompilerFacade extends AbstractBackendCompilerFacade {
	

	protected void compileInternal (FdcHolder fdcs, String contributorNamespace, String contributorName, String outputDir) {
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("fdcs", fdcs);
		variables.put("contributorNamespace", contributorNamespace);
		variables.put("contributorName", contributorName);
		
		Collection<Outlet> outlets = new ArrayList<Outlet>();
		outlets.add (new Outlet (outputDir));
		Collection<MetaModel> metamodels = new ArrayList<MetaModel>();
		
		XpandBackendFacade.executeStatement("EXPAND org::eclipse::xtend::backend::compiler::templates::Java5Compiler::compile (contributorNamespace, contributorName) FOR fdcs", metamodels, variables, null, null);
	}
	

}
