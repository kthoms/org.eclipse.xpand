/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xpand2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.internal.xpand2.ast.Definition;
import org.eclipse.internal.xpand2.ast.ExpandStatement;
import org.eclipse.internal.xpand2.ast.Template;
import org.eclipse.internal.xpand2.codeassist.XpandTokens;
import org.eclipse.internal.xpand2.parser.XpandParseFacade;
import org.eclipse.internal.xpand2.pr.ProtectedRegionResolverImpl;
import org.eclipse.internal.xtend.util.ProfileCollector;
import org.eclipse.internal.xtend.xtend.parser.ParseException;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xpand2.output.PostProcessor;
import org.eclipse.xtend.expression.AbstractExpressionsUsingWorkflowComponent;
import org.eclipse.xtend.expression.ExceptionHandler;
import org.eclipse.xtend.expression.Variable;
import org.eclipse.xtend.typesystem.MetaModel;

public class Generator extends AbstractExpressionsUsingWorkflowComponent {

    private String genPath = null;

    private String srcPath = null;

    private String prSrcPaths = null;

    private String prExcludes = null;

    private boolean prDefaultExcludes = true;

    private String expand = null;

    private String fileEncoding = null;

    private List<?> beautifier = new ArrayList<Object>();

    private List<String> advices = new ArrayList<String>();

    private List<String> extensionAdvices = new ArrayList<String>();
    
    private boolean automaticHyphens = false;
    
    private ExceptionHandler exceptionHandler = null;

    private String collectProfileSummary = null;
    private String verboseProfileFilename = null;
    
    private Output output = null;
    
    public void setCollectProfileSummary (String c) {
        collectProfileSummary = c;
    }
    
    public void setVerboseProfileFilename (String f) {
        verboseProfileFilename = f;
    }
     
    public void setAutomaticHyphens(boolean automaticHyphens) {
        this.automaticHyphens = automaticHyphens;
    }

    @Override
	public String getLogMessage() {
    	return "generating '"+expand+"' => directory '"+genPath+"'";
    }
    
    public void addAdvices(final String advice) {
        if ( !this.advices.contains(advice) ) this.advices.add( advice );
    }
    
    public void addAdvice(final String advice) {
    	if ( !this.advices.contains(advice) ) this.advices.add( advice );
    }
    
    public void addExtensionAdvices(String extensionAdvices) {
    	if ( !this.extensionAdvices.contains(extensionAdvices) ) 
    		this.extensionAdvices.add( extensionAdvices );
	}

    public void addExtensionAdvice(String extensionAdvice) {
    	if ( !this.extensionAdvices.contains(extensionAdvice) ) 
		this.extensionAdvices.add( extensionAdvice );
	}

    public List<?> getBeautifier() {
        return beautifier;
    }

    public void setBeautifier(final List<?> beautifiers) {
        beautifier = beautifiers;
    }

    public void setFileEncoding(final String fileEncoding) {
        this.fileEncoding = fileEncoding;
    }
    
	public String getFileEncoding() {
		return fileEncoding;
	}

    /**
     * 
     * @deprecated use outlets instead
     */
    @Deprecated
    public void setGenPath(final String genPath) {
        this.genPath = fixPath(genPath);
    }

    public void setExpand(final String invoke) {
        expand = invoke;
    }

    public void setPrDefaultExcludes(final boolean prDefaultExcludes) {
        this.prDefaultExcludes = prDefaultExcludes;
    }

    public void setPrExcludes(final String prExcludes) {
        this.prExcludes = prExcludes;
    }

    public void setPrSrcPaths(final String prSrcPathes) {
        this.prSrcPaths = prSrcPathes;
    }
    
    public void setExceptionHandler(final ExceptionHandler exceptionHandler) {
		this.exceptionHandler = exceptionHandler;
	}

	/**
     * 
     * @deprecated use outlets instead
     */
    @Deprecated
    public void setSrcPath(final String srcPath) {
        this.srcPath = fixPath(srcPath);
    }

    private String fixPath(final String p) {
        if (p.endsWith("\\"))
            return p.replace('\\', '/');
        if (p.endsWith("/"))
            return p;
        return p + "/";
    }
    
    @Override
    protected void invokeInternal2(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
        OutputStream verboseProfileOutputStream = null;

        if (verboseProfileFilename != null) {
            try {
                verboseProfileOutputStream = new BufferedOutputStream (new FileOutputStream (verboseProfileFilename));
                ProfileCollector.getInstance().setDetailedLoggingWriter(verboseProfileOutputStream);
            }
            catch (IOException exc) {
                log.warn("could nto open profiling log file", exc);
            }
        }

        final Output out = getOutput();
        final List<Outlet> outlets = getInitializedOutlets();
        for (final Iterator<Outlet> iter = outlets.iterator(); iter.hasNext();) {
            out.addOutlet(iter.next());
        }

        ProtectedRegionResolverImpl prs = null;
        if (prSrcPaths != null) {
            prs = new ProtectedRegionResolverImpl();
            prs.setDefaultExcludes(prDefaultExcludes);
            prs.setIgnoreList(prExcludes);
            prs.setSrcPathes(prSrcPaths);
            prs.setFileEncoding(fileEncoding);
        }
        
        XpandExecutionContextImpl executionContext = new XpandExecutionContextImpl(out, prs, getGlobalVars(ctx), exceptionHandler,getNullEvaluationHandler());
        if (monitor!=null) {
        	executionContext.setMonitor(monitor);
        }
        
        
        if (fileEncoding != null) {
            executionContext.setFileEncoding(fileEncoding);
        }
        
        for (MetaModel mm : metaModels) {
            executionContext.registerMetaModel(mm);
        }

        final ExpandStatement es = getStatement();
        if (es == null)
            throw new ConfigurationException("property 'expand' has wrong syntax!");

        final String[] names = ctx.getSlotNames();
        for (int i = 0; i < names.length; i++) {
            final String name = names[i];
            executionContext = (XpandExecutionContextImpl) executionContext.cloneWithVariable(new Variable(name, ctx
                    .get(name)));
        }

        for (String advice : advices) {
            final String[] allAdvices = advice.split(",");
            for (int i = 0; i < allAdvices.length; i++) {
                final String string = allAdvices[i];
                executionContext.registerAdvices(string.trim());
            }
		}
        
        for (String advice : extensionAdvices) {
        	final String[] allAdvices = advice.split(",");
        	for (int i = 0; i < allAdvices.length; i++) {
        		final String string = allAdvices[i];
        		executionContext.registerExtensionAdvices(string.trim());
        	}
        }
        
        	es.evaluate(executionContext);
        
        for (final Iterator<Outlet> iter = outlets.iterator(); iter.hasNext();) {
            final Outlet element = iter.next();
            final String name = (element.getName() == null ? "[default]" : element.getName()) + "(" + element.getPath()
                    + ")";
            if (element.getFilesWrittenAndClosed() > 0) {
                log.info("Written " + element.getFilesWrittenAndClosed() + " files to outlet " + name);
            }
            if (element.getFilesCreated() > element.getFilesWrittenAndClosed()) {
                log.info("Skipped writing of " + (element.getFilesCreated() - element.getFilesWrittenAndClosed())
                        + " files to outlet " + name);
            }
        }
        
        ProfileCollector.getInstance().finish();
        if ("true".equalsIgnoreCase(this.collectProfileSummary)) {
            log.info ("profiling info: \n" + ProfileCollector.getInstance().toString());
        }
        
        if (verboseProfileOutputStream != null) {
            try {
                verboseProfileOutputStream.close ();
            }
            catch (IOException exc) {
                log.warn("problem closing profile log file", exc);
            }
        }
    }

    private final List<Outlet> outlets = new ArrayList<Outlet>();

    public void addOutlet(final Outlet outlet) {
        outlets.add(outlet);
    }
    
    public void setOutput (final Output output) {
    	this.output = output;
    }
    
    private Output getOutput () {
    	if (output==null) {
    		// lazy initialization
    		OutputImpl out = new OutputImpl();
    		out.setAutomaticHyphens(automaticHyphens);
    		this.output = out;
    	} 
    	return output;
    }

    private List<Outlet> initializedOutlets = null;

    private List<Outlet> getInitializedOutlets() {
        if (initializedOutlets == null) {
            final List<Outlet> result = new ArrayList<Outlet>(outlets);
            if (result.isEmpty()) {
                if (genPath != null) { // backward compatibility
                    Outlet o = new Outlet();
                    o.setAppend(false);
                    o.setFileEncoding(fileEncoding);
                    o.setOverwrite(true);
                    o.setPath(genPath);
                    result.add(o);

                    o = new Outlet();
                    o.setAppend(true);
                    o.setFileEncoding(fileEncoding);
                    o.setName("APPEND");
                    o.setOverwrite(true);
                    o.setPath(genPath);
                    result.add(o);
                }
                if (srcPath != null) {
                    final Outlet o = new Outlet();
                    o.setAppend(false);
                    o.setFileEncoding(fileEncoding);
                    o.setName("ONCE");
                    o.setOverwrite(false);
                    o.setPath(srcPath);

                    result.add(o);
                }
            }
            for (final Iterator<Outlet> iter = result.iterator(); iter.hasNext();) {
                final Outlet o = iter.next();
                if (o.postprocessors.isEmpty()) {
                    for (final Iterator<?> iterator = beautifier.iterator(); iterator.hasNext();) {
                        final PostProcessor element = (PostProcessor) iterator.next();
                        o.addPostprocessor(element);
                    }
                }
                // Initialize file encoding for outlets. If it is not set then take the Generator
                // default encoding. If this not set also then take System default.
                if (o.hasDefaultEncoding() && fileEncoding!=null) {
                    o.setFileEncoding(fileEncoding);
                }
            }
            initializedOutlets = result;
        }
        return initializedOutlets;
    }

    /**
     * Retrieves the configured and initialized outlets of the generator.
     * @since 4.2
     */
    public final List<Outlet> getOutlets () {
    	return Collections.unmodifiableList(getInitializedOutlets());
    }
    
    private ExpandStatement getStatement() {
        Template tpl = XpandParseFacade.file(new StringReader(XpandTokens.LT + "DEFINE test FOR test" + XpandTokens.RT
                + XpandTokens.LT + "EXPAND " + expand + XpandTokens.RT + XpandTokens.LT + "ENDDEFINE" + XpandTokens.RT),null);
        ExpandStatement es = null;
        try {
            es = (ExpandStatement) ((Definition) tpl.getDefinitions()[0]).getBody()[1];
        } catch (final Exception e) {
            log.error(e);
        }
        return es;
    }

    @Override
    public void checkConfiguration(final Issues issues) {
        super.checkConfiguration(issues);
        if (genPath == null && getInitializedOutlets().isEmpty()) {
            issues.addError(this, "You need to configure at least one outlet!");
        }
        if ((genPath != null || srcPath != null) && !outlets.isEmpty()) {
            issues.addWarning(this, "'genPath' and 'srcPath' properties are ignored since you have specified outlets!");
        }
        int defaultOutlets = 0;
        for (final Iterator<Outlet> iter = getInitializedOutlets().iterator(); iter.hasNext();) {
            final Outlet o = iter.next();
            if (o.getName() == null)
                defaultOutlets++;
        }
        if (defaultOutlets > 1) {
            issues.addError(this,
                    "Only one outlet can be the default outlet. Please specifiy a name for the other outlets!");
        } else if (defaultOutlets == 0) {
            issues.addWarning(this, "No default outlet configured!");
        }
        if (expand == null) {
            issues.addError(this, "property 'expand' not configured!");
        } else {
        	try {
				final ExpandStatement es = getStatement();
				if (es == null) {
					issues.addError(this, "property 'expand' has wrong syntax!");
				}
			} catch (ParseException e) {
				issues.addError(this, "property 'expand' has wrong syntax : "+e.getMessage());
			}
        }
    }

}
