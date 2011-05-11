package org.eclipse.xtend.backend.compiler.templates.java5;

import java.util.ArrayList;
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
import org.eclipse.xtend.backend.compiler.AbstractBackendResourceCompilerFacade;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.plugins.ParsedResource;
import org.eclipse.xtend.type.impl.java.JavaBeansMetaModel;
import org.eclipse.xtend.typesystem.MetaModel;

public class Java5CompilerFacade extends AbstractBackendResourceCompilerFacade {
    private static final Log _log = LogFactory.getLog (Java5CompilerFacade.class);

	
	public Java5CompilerFacade (BackendTypesystem typeSystem) {
		super(typeSystem);
	}

	@Override
	protected void compileInternal(String resourceName, ParsedResource parsedResource, MiddleEnd me, BackendTypesystem bts, String outputDir, String fileEncoding) {
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("resource", parsedResource);
		variables.put("resourceName", resourceName);
		variables.put("typesystem", bts);
		
		Collection<Outlet> outlets = new ArrayList<Outlet>();
		outlets.add (new Outlet (outputDir));
		Collection<MetaModel> metamodels = new ArrayList<MetaModel>();
		metamodels.add(new JavaBeansMetaModel());
		_log.info("Compiling resource " + resourceName + " to " + outputDir);
		
		Generator gen = new Generator();
		gen.addMetaModel(new JavaBeansMetaModel());
		Outlet out = new Outlet (outputDir);
		JavaBeautifier javaBeautifier = new JavaBeautifier();
		out.addPostprocessor(javaBeautifier);
		gen.addOutlet (out);
		gen.setFileEncoding (fileEncoding);
		gen.setExpand ("org::eclipse::xtend::backend::compiler::templates::java5::ResourceCompiler::compile (typesystem, resourceName) FOR resource");
//		gen.setBeautifier(Arrays.asList(org.eclipse.xpand2.output.JavaBeautifier.class));

		WorkflowContext ctx = new WorkflowContextDefaultImpl();
		ctx.set ("resource", parsedResource);
		ctx.set ("resourceName", resourceName);
		ctx.set ("typesystem", bts);
		ctx.set ("middleend", me);
		Issues issues = new IssuesImpl();

		gen.invoke(ctx, new NullProgressMonitor(), issues);
		
		//XpandBackendFacade.executeStatement(XpandTokens.LT + "EXPAND org::eclipse::xtend::backend::compiler::templates::Java5Compiler::compile (contributorNamespace, contributorName) FOR fdcs" + XpandTokens.RT, fileEncoding, metamodels, variables, outlets, null);
	}

}
