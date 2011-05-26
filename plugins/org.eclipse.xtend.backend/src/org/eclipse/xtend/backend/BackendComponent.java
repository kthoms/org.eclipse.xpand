/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtend.backend;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.syslib.FileIoOperations;
import org.eclipse.xtend.backend.syslib.FileOutlet;
import org.eclipse.xtend.backend.syslib.SysLibNames;
import org.eclipse.xtend.backend.syslib.UriBasedPostprocessor;
import org.eclipse.xtend.backend.types.CompositeTypesystemFactory;
import org.eclipse.xtend.middleend.LanguageContributor;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.MiddleEndFactory;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;

/**
 * @author aarnold - Initial contribution and API
 */
public class BackendComponent extends AbstractWorkflowComponent2 {
	protected final Log log = LogFactory.getLog(getClass());
	
	protected String _invoke;
	protected List<String> _parameters;
	protected final List<String> _advice = new ArrayList<String>();
	protected String _middleEndClass;
	protected Set<String> _typeSystemClasses;
	protected Collection<Outlet> _outlets;

	@Override
	protected void invokeInternal(WorkflowContext workflowCtx, ProgressMonitor monitor, Issues issues) {
		// TODO Auto-generated method stub
		BackendTypesystem ts = createTypesystem();
		MiddleEnd me = MiddleEndFactory.create(ts, createMiddleEnds());
		ExecutionContext execCtx = BackendFacade.createExecutionContext(me.createEmptyFdc(), ts, false);
        final Map<String, Object> variables = new HashMap<String, Object> ();        
        for (String name: workflowCtx.getSlotNames())
            execCtx.getLocalVarContext().getLocalVars().put (name, workflowCtx.get (name));
		List<Object> params = retrieveParams (execCtx);
		registerOutlets(execCtx, _outlets);
		BackendFacade.invoke (execCtx, new QualifiedName (_invoke), params);
	}
	
	public String getInvoke() {
		return _invoke;
	}

	public void setInvoke(String invoke) {
		this._invoke = invoke;
	}

	public List<String> getParameters() {
		return _parameters;
	}

	public void addParameters(String parameter) {
		this._parameters.add (parameter);
	}

	public Collection<Outlet> getOutlets() {
		return _outlets;
	}

	public void addOutlets(Outlet outlet) {
		_outlets.add (outlet);
	}

	public List<String> get_advice() {
		return _advice;
	}

	protected BackendTypesystem createTypesystem () {
		
		return CompositeTypesystemFactory.INSTANCE.createTypesystemFromClassNames(_typeSystemClasses);
	}
	
	protected List<LanguageSpecificMiddleEnd> createMiddleEnds () {
		List<LanguageSpecificMiddleEnd> me = null;
		try {
			Class<? extends LanguageSpecificMiddleEnd> middleEndClass = (Class<? extends LanguageSpecificMiddleEnd>)Class.forName(_middleEndClass);
			me = LanguageContributor.INSTANCE.getFreshMiddleEnds (createSpecificParams());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return me;
	}
	
	protected Map<Class<?>, Object> createSpecificParams () {
		return null;
		
	}
	
	protected List<Object> retrieveParams (ExecutionContext execCtx) {
		List<Object> params = new ArrayList<Object>();
		Map<String, Object> localVars = execCtx.getLocalVarContext().getLocalVars();
		for (String paramExpr : _parameters) {
			params.add(localVars.get (paramExpr));
		}
		return params;
	}
	
    private void registerOutlets (ExecutionContext ctx, Collection<Outlet> outlets) {
        for (Outlet oldOutlet: outlets) {
            final FileOutlet newOutlet = new FileOutlet ();
            newOutlet.setAppend (oldOutlet.isAppend());
            newOutlet.setBaseDir (new File (oldOutlet.getPath()));
            if (oldOutlet.getFileEncoding() != null)
                newOutlet.setFileEncoding (oldOutlet.getFileEncoding());
            newOutlet.setOverwrite (oldOutlet.isOverwrite());
            
            final String outletName = (oldOutlet.getName() != null) ? oldOutlet.getName() : FileIoOperations.DEFAULT_OUTLET_NAME;
            ctx.getFunctionDefContext ().invoke (ctx, new QualifiedName (SysLibNames.REGISTER_OUTLET), Arrays.asList (outletName, newOutlet));
        }
    }
	
    
	public class Outlet {
		
		private String _name;
		
		private String _path;
		
		private String _fileEncoding;
		
		private boolean _append;
		
		private boolean _overwrite;
		
		private List<UriBasedPostprocessor> _postProcessor;

		public String getName () {
			return _name;
		}

		public void setName (String name) {
			_name = name;
		}

		public String getPath() {
			return _path;
		}

		public void setPath (String path) {
			_path = path;
		}

		public String getFileEncoding () {
			return _fileEncoding;
		}

		public void setFileEncoding(String fileEncoding) {
			_fileEncoding = fileEncoding;
		}

		public boolean isAppend () {
			return _append;
		}

		public void setAppend (boolean append) {
			_append = append;
		}
		
		public boolean isOverwrite() {
			return _overwrite;
		}

		public void setOverwrite(boolean overwrite) {
			_overwrite = overwrite;
		}

		public List<UriBasedPostprocessor> getPostProcessor() {
			return _postProcessor;
		}

		public void addPostProcessor(UriBasedPostprocessor postProcessor) {
			_postProcessor.add (postProcessor);
		}
		
	}

}
