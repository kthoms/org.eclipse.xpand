package org.eclipse.xtend.backend.compiler.templates.backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowContextDefaultImpl;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.issues.IssuesImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.xpand2.Generator;
import org.eclipse.xpand2.output.JavaBeautifier;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.compiler.AbstractBackendCompilerFacade;
import org.eclipse.xtend.backend.compiler.FdcHolder;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.typesystem.MetaModel;

public class BackendJavaCompilerFacade extends AbstractBackendCompilerFacade {
	
	private final static Log _log = LogFactory.getLog (BackendJavaCompilerFacade.class);

	public BackendJavaCompilerFacade(BackendTypesystem typeSystem) {
		super(typeSystem);
	}

	protected void compileInternal (FdcHolder fdcs, BackendTypesystem bts, String contributorNamespace, String contributorName, String outputDir, String fileEncoding) {
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("fdcs", fdcs);
		variables.put("contributorNamespace", contributorNamespace);
		variables.put("contributorName", contributorName);
		variables.put("typesystem", bts);
		
		Collection<Outlet> outlets = new ArrayList<Outlet>();
		outlets.add (new Outlet (outputDir));
		Collection<MetaModel> metamodels = new ArrayList<MetaModel>();
		metamodels.add(new JavaBeansMetaModel());
		_log.info("Compiling resources " + fdcs.getResources().toString() + " to " + outputDir);
		
		Generator gen = new Generator();
		gen.addMetaModel(new JavaBeansMetaModel());
		Outlet out = new Outlet (outputDir);
		out.addPostprocessor(new JavaBeautifier());
		gen.addOutlet (out);
		gen.setFileEncoding (fileEncoding);
		gen.setExpand ("org::eclipse::xtend::backend::compiler::templates::backend::Java5Compiler::compile (typesystem, contributorNamespace, contributorName) FOR fdcs");
		gen.setBeautifier(Arrays.asList(org.eclipse.xpand2.output.JavaBeautifier.class));

		WorkflowContext ctx = new WorkflowContextDefaultImpl();
		ctx.set ("fdcs", fdcs);
		ctx.set ("contributorNamespace", contributorNamespace);
		ctx.set ("contributorName", contributorName);
		ctx.set ("typesystem", bts);
		Issues issues = new IssuesImpl();

		gen.invoke(ctx, new NullProgressMonitor(), issues);
		
		//XpandBackendFacade.executeStatement(XpandTokens.LT + "EXPAND org::eclipse::xtend::backend::compiler::templates::Java5Compiler::compile (contributorNamespace, contributorName) FOR fdcs" + XpandTokens.RT, fileEncoding, metamodels, variables, outlets, null);
	}
	

}
