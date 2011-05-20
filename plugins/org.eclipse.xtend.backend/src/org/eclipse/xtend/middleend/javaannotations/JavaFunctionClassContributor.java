/*
Copyright (c) 2008 2009 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.middleend.javaannotations;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.xtend.backend.aop.AdviceParamType;
import org.eclipse.xtend.backend.aop.AroundAdvice;
import org.eclipse.xtend.backend.aop.ExecutionPointcut;
import org.eclipse.xtend.backend.common.ExpressionBase;
import org.eclipse.xtend.backend.common.Function;
import org.eclipse.xtend.backend.common.NamedFunction;
import org.eclipse.xtend.backend.common.QualifiedName;
import org.eclipse.xtend.backend.common.SyntaxConstants;
import org.eclipse.xtend.backend.expr.LocalVarEvalExpression;
import org.eclipse.xtend.backend.expr.MethodInvocationExpression;
import org.eclipse.xtend.backend.types.builtin.ObjectType;
import org.eclipse.xtend.backend.util.Pair;
import org.eclipse.xtend.middleend.MiddleEnd;
import org.eclipse.xtend.middleend.javaannotations.internal.JavaDefinedFunction;
import org.eclipse.xtend.middleend.plugins.ImportedResource;
import org.eclipse.xtend.middleend.plugins.LanguageSpecificMiddleEnd;
import org.eclipse.xtend.middleend.plugins.ParsedResource;


/**
 * This class contributes no types, but all public methods in a Java class as functions, both static and
 *  non-static. Non-static methods share an instance of the providing class *per Contributor instance*.
 *  For more global sharing of the instance, Contributor instances must be shared. 
 *  
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public final class JavaFunctionClassContributor implements LanguageSpecificMiddleEnd {
    public static final String MIDDLE_END_NAME = "JavaAnnotations";
    
    private ResourceLoader _resourceLoader = null;
    private MiddleEnd _middleEnd = null;
    
    private ResourceLoader getResourceLoader () {
        if (_resourceLoader == null)
            _resourceLoader = ResourceLoaderFactory.createResourceLoader();
        
        return _resourceLoader;
    }
    
    public boolean canHandle (String resourceName) {
        return getCls (resourceName) != null;
    }

	public boolean mayHandle(String resourceName) {
		return resourceName.endsWith (".class");
	}

    private Class<?> getCls (String resourceName) {
        try {
            return getResourceLoader().loadClass (resourceName.replace('/', '.').replace("::", "."));
        } catch (Throwable e) {
            return null;
        }
    }
    
    public ParsedResource parseResource (String resourceName) {
        final ParsedResource result = new ParsedResource ();
        
        if (classAsResource (Object.class).equals (resourceName))
            return result;
        
        //TODO test imports
        //TODO test advice
        //TODO guards

        final Class<?> cls = getCls (resourceName);
        
        for (Method mtd: cls.getDeclaredMethods()) {
            // register only public methods
            if (! isPublic (mtd))
                continue;

            if(isInfrastructureMethod (mtd, cls))
                continue;
            
            if (mtd.getAnnotation (M2tNoFunction.class) != null)
                continue;
         
            final boolean isPublicFunction = (mtd.getAnnotation (M2tPrivateFunction.class) == null && mtd.getAnnotation (M2tAroundAdvice.class) == null) ;
            final boolean isAroundAdvice = (mtd.getAnnotation (M2tAroundAdvice.class) != null) ;
            final QualifiedName functionName = (mtd.getAnnotation (M2tQualifiedName.class) != null) ? 
               		new QualifiedName (cls.getCanonicalName ().replaceAll (".", SyntaxConstants.NS_DELIM), mtd.getName()) 
             	: 
               		new QualifiedName (mtd.getName());
            final NamedFunction f = new NamedFunction (functionName, new JavaDefinedFunction (mtd, null, _middleEnd.getTypesystem()));
            
            if (isPublicFunction) {
                result.getPublicFunctions ().add (f);
            } else if (isAroundAdvice) {
              	result.getAdvice().add (createAdvice (f, mtd));
            } else {
                result.getPrivateFunctions ().add (f);
            }
        }
        
        final M2tImports importsAnn = cls.getAnnotation (M2tImports.class);
        if (importsAnn != null) {
	        for (M2tImport imp: importsAnn.imports()) {
	        	String impResPath = imp.resource ().replaceAll ("\\.", SyntaxConstants.NS_DELIM);
	        	impResPath.replaceAll ("/", SyntaxConstants.NS_DELIM);
	        	result.getImports ().add (new ImportedResource (impResPath, imp.reexport()));
	        }
        }

        return result;
    }

    private boolean isPublic (Method mtd) {
        return (mtd.getModifiers() & Modifier.PUBLIC) != 0;
    }
    
    private boolean isInfrastructureMethod (Method mtd, Class<?> cls) {
        if (ExecutionContextAware.class.isAssignableFrom (cls)) {
            try {
                ExecutionContextAware.class.getMethod (mtd.getName(), mtd.getParameterTypes());
                return true;
            }
            catch (NoSuchMethodException e) {
            }
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
	private AroundAdvice createAdvice (NamedFunction f, Method mtd) {
    	Function inner = f.getFunction();
    	if (inner instanceof JavaDefinedFunction) {
	    	final M2tAroundAdvice adviceAnn = mtd.getAnnotation (M2tAroundAdvice.class);
	    	final M2tPointcut pointcutAnn = adviceAnn.pointcut();
	    	
	    	List<NamedFunction> adviceBodyJavaFunctions = null;
	    	if ((adviceBodyJavaFunctions = (List<NamedFunction>) _middleEnd.getExecutionContext().getContributionStateContext().retrieveState ("AdviceBodyJavaDefinedFunctions")) == null) {
	    		adviceBodyJavaFunctions = new ArrayList<NamedFunction> ();
	    		_middleEnd.getExecutionContext().getContributionStateContext().storeState("AdviceBodyJavaDefinedFunctions", adviceBodyJavaFunctions);
	    	}
	    	adviceBodyJavaFunctions.add(f);
			String[] paramTypeNames = pointcutAnn.paramTypeNames();
			List<Pair<String, AdviceParamType>> paramTypes = new ArrayList<Pair<String, AdviceParamType>>();
			for (int i = 0; i < paramTypeNames.length; i++) {
				String paramTypeName = paramTypeNames[i];
				//TODO make subtype inclusion configurable
				if (!paramTypeName.equals("*")) {
					final AdviceParamType paramType = new AdviceParamType (_middleEnd.getTypesystem().findType(paramTypeName), true);
					final Pair<String, AdviceParamType> paramTypePair = new Pair<String, AdviceParamType> ("o"+ i + 1, paramType);
					paramTypes.add(paramTypePair);
				}
			}
			AdviceParamType varArgsAdvParamType = new AdviceParamType (_middleEnd.getTypesystem().findType(ObjectType.INSTANCE.getUniqueRepresentation()), true);
	    	
	    	final ExecutionPointcut pointcut = new ExecutionPointcut (pointcutAnn.namePattern(), paramTypes, pointcutAnn.hasVarArgs(), null);
	    	ExpressionBase body =  new MethodInvocationExpression (mtd, Arrays.asList (new LocalVarEvalExpression (SyntaxConstants.THIS_JOINPOINT, null)), false, null);
	    	
	    	final AroundAdvice adv = new AroundAdvice ( body, pointcut, true);
	    	
	    	return adv;
    	} else {
    		throw new IllegalArgumentException ("Advice definition " + f.getName() + " is not a JavaDefinedFunction");
    	}
    }
    
    public String getName () {
        return MIDDLE_END_NAME;
    }
 
    public void setMiddleEnd (MiddleEnd middleEnd) {
        _middleEnd = middleEnd;
    }
    
    public static String classAsResource (Class<?> cls) {
        return cls.getName().replace('.', '/');
    }
}
