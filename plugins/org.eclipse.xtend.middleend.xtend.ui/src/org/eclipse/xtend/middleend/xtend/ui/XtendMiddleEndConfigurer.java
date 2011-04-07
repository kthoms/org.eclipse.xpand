package org.eclipse.xtend.middleend.xtend.ui;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend.backend.types.CompositeTypesystemFactory;
import org.eclipse.xtend.backend.ui.middleend.LanguageSpecificMiddleEndConfigurer;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.middleend.xtend.OldHelper;
import org.eclipse.xtend.middleend.xtend.plugin.OldCheckRegistryFactory;
import org.eclipse.xtend.middleend.xtend.plugin.OldXtendRegistryFactory;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.MetamodelContributor;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.metamodel.MetamodelContributorRegistry;
import org.eclipse.xtend.shared.ui.expression.XpandPluginExecutionContext;
import org.eclipse.xtend.typesystem.MetaModel;

public class XtendMiddleEndConfigurer implements LanguageSpecificMiddleEndConfigurer {
	
	private static final Log _log = LogFactory.getLog (XtendMiddleEndConfigurer.class);
	
	protected Set<MetaModel> _metaModels = new HashSet<MetaModel>();
	protected Class<?> _emfMetaModelClass;
	protected Class<?> _emfRegistryMetaModelClass; 
	private Class<?> _umlMetaModelClass;
	private Class<?> _xsdMetaModelClass; 
	
	public XtendMiddleEndConfigurer() {
		try {
			_emfMetaModelClass = Class.forName("org.eclipse.xtend.typesystem.emf.EmfMetaModel");
			_emfRegistryMetaModelClass = Class.forName("org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel");
		} catch (ClassNotFoundException e) {
			_log.debug("EMF Typesystem is not installed");
		}
		try {
			_umlMetaModelClass = Class.forName("org.eclipse.xtend.typesystem.uml2.UML2MetaModelBase");
		} catch (ClassNotFoundException e) {
			_log.debug("UML2 Typesystem is not installed");
		}
		try {
			_xsdMetaModelClass = Class.forName("org.eclipse.xtend.typesystem.xsd.XSDMetaModel");
		} catch (ClassNotFoundException e) {
			_log.debug("XSD Typesystem is not installed");
		}
	}

	public Map<Class<?>, Object> getSpecificParams(IJavaProject project) {
		final IXtendXpandProject xp = Activator.getExtXptModelManager().findProject(project.getPath());
		final ExecutionContextImpl ctx = new XpandPluginExecutionContext(xp);

		List<? extends MetamodelContributor> mmContribs = MetamodelContributorRegistry.getActiveMetamodelContributors (project);
		for (MetamodelContributor mmc : mmContribs) {
			MetaModel[] mms = mmc.getMetamodels(project, ctx);
			for (MetaModel mm : mms) {
				_metaModels.add (mm);
			}
		}

		Map<Class<?>, Object> specificParams = new HashMap<Class<?>, Object>();
		try {
			specificParams = createSpecificParameters (project.getProject().getDefaultCharset());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return specificParams;
	}

	public String getMiddleEndName() {
		return "Xtend";
	}
    
    private Map<Class<?>, Object> createSpecificParameters (String fileEncoding) {
        fileEncoding = OldHelper.normalizedFileEncoding (fileEncoding);

        final ExecutionContextImpl ctx = new ExecutionContextImpl ();
        ctx.getResourceManager().setFileEncoding (fileEncoding);
        for (MetaModel mm: _metaModels)
            ctx.registerMetaModel (mm);
        
        final Map<Class<?>, Object> result = new HashMap<Class<?>, Object> ();
        result.put (OldXtendRegistryFactory.class, ctx);
        result.put (OldCheckRegistryFactory.class, ctx);
        return result;
    }

	public Set<String> getConfiguredTypeSystems(IJavaProject project) {
		Set<String> btsQualifiers = new HashSet<String> ();
		if (_metaModels.isEmpty()) {
			final IXtendXpandProject xp = Activator.getExtXptModelManager().findProject (project.getPath());
			final ExecutionContextImpl ctx = new XpandPluginExecutionContext(xp);
			
			List<? extends MetamodelContributor> mmContribs = MetamodelContributorRegistry.getActiveMetamodelContributors (project);
			for (MetamodelContributor mmc : mmContribs) {
				MetaModel[] mms = mmc.getMetamodels(project, ctx);
				for (MetaModel mm : mms) {
					_metaModels.add (mm);
				}
			}
		}

		for (MetaModel mm : _metaModels) {
			if (_xsdMetaModelClass.isAssignableFrom (mm.getClass()) ) {
				btsQualifiers.add (CompositeTypesystemFactory.XSD_TYPESYSTEM_QUALIFIER);
			} else if (_umlMetaModelClass.isAssignableFrom (mm.getClass())) {
				btsQualifiers.add (CompositeTypesystemFactory.UML_TYPESYSTEM_QUALIFIER);
			} else if (_emfMetaModelClass.isAssignableFrom (mm.getClass())) {
				btsQualifiers.add (CompositeTypesystemFactory.EMF_TYPESYSTEM_QUALIFIER);
			} else if (_emfRegistryMetaModelClass.isAssignableFrom (mm.getClass())) {
				btsQualifiers.add (CompositeTypesystemFactory.EMF_TYPESYSTEM_QUALIFIER);
			}
		}
		return btsQualifiers;
	}

}
