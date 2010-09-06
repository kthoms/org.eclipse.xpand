package org.eclipse.xtend.backend.compiler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.backend.common.FunctionDefContext;
import org.eclipse.xtend.middleend.xpand.XpandBackendFacade;
import org.eclipse.xtend.middleend.xpand.internal.xpandlib.pr.XpandProtectedRegionResolver;
import org.eclipse.xtend.typesystem.MetaModel;

public class BackendJavaCompilerFacade implements BackendCompilerFacade {

	public void compile(FunctionDefContext fdc, String resourceName) {
		// TODO Auto-generated method stub
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("resource", resourceName);
		variables.put("fdc", fdc);
		Collection<Outlet> outlets = new ArrayList<Outlet>();
		outlets.add(new Outlet());
		Collection<MetaModel> metamodels = new ArrayList<MetaModel>();
		XpandBackendFacade.executeStatement("EXPAND org::eclipse::xtend::backend::compiler::templates::Java5Compiler::compile(resource) FOR fdc", metamodels, variables, null, null);
	}

}
