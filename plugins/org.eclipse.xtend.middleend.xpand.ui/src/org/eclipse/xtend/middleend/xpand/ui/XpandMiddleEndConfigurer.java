package org.eclipse.xtend.middleend.xpand.ui;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xpand2.XpandExecutionContext;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.Output;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.backend.types.CompositeTypesystemFactory;
import org.eclipse.xtend.backend.ui.middleend.LanguageSpecificMiddleEndConfigurer;
import org.eclipse.xtend.expression.ExecutionContextImpl;
import org.eclipse.xtend.middleend.xpand.plugin.OldXpandRegistryFactory;
import org.eclipse.xtend.middleend.xtend.OldHelper;
import org.eclipse.xtend.middleend.xtend.plugin.OldXtendRegistryFactory;
import org.eclipse.xtend.shared.ui.Activator;
import org.eclipse.xtend.shared.ui.MetamodelContributor;
import org.eclipse.xtend.shared.ui.core.IXtendXpandProject;
import org.eclipse.xtend.shared.ui.core.metamodel.MetamodelContributorRegistry;
import org.eclipse.xtend.shared.ui.expression.XpandPluginExecutionContext;
import org.eclipse.xtend.typesystem.MetaModel;

public class XpandMiddleEndConfigurer implements
		LanguageSpecificMiddleEndConfigurer {

	private static final Log _log = LogFactory.getLog (XpandMiddleEndConfigurer.class);
	
	protected Set<MetaModel> _metaModels = new HashSet<MetaModel>();
	protected Class<?> _emfRegistryMetaModelClass; 
	protected Class<?> _emfMetaModelClass;
	protected Class<?> _umlMetaModelClass;
	protected Class<?> _xsdMetaModelClass;

	public XpandMiddleEndConfigurer() {
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
			
		_metaModels = new HashSet<MetaModel> ();
		final IXtendXpandProject xp = Activator.getExtXptModelManager().findProject (project.getPath());
		final ExecutionContextImpl ctx = new XpandPluginExecutionContext(xp);
		
		List<? extends MetamodelContributor> mmContribs = MetamodelContributorRegistry.getActiveMetamodelContributors (project);
		for (MetamodelContributor mmc : mmContribs) {
			MetaModel[] mms = mmc.getMetamodels(project, ctx);
			for (MetaModel mm : mms) {
				_metaModels.add (mm);
			}
		}
		
		Outlet out = new Outlet("src-gen");
		Collection<Outlet> outlets = Arrays.asList(out);
		Map<Class<?>, Object> specificParams = new HashMap<Class<?>, Object>();
		try {
			specificParams = createSpecificParameters (project.getProject().getDefaultCharset(), _metaModels, outlets);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return specificParams;
	}

	public String getMiddleEndName() {
		return "Xpand";
	}
    
    private Map<Class<?>, Object> createSpecificParameters (String fileEncoding, Collection<MetaModel> mms, Collection<Outlet> outlets) {
        final XpandExecutionContext ctx = createXpandExecutionContext (fileEncoding, mms, outlets);

        final Map<Class<?>, Object> result = new HashMap<Class<?>, Object> ();
        result.put (OldXtendRegistryFactory.class, ctx);
        result.put (OldXpandRegistryFactory.class, ctx);
        return result;
    }

    private XpandExecutionContext createXpandExecutionContext (String fileEncoding, Collection<MetaModel> mms, Collection<Outlet> outlets) {
        fileEncoding = OldHelper.normalizedFileEncoding (fileEncoding);
        
        final Output output = new OutputImpl ();
        for (Outlet outlet: outlets)
            output.addOutlet (outlet);
        //TODO ProtectedRegionResolver
        
        final XpandExecutionContextImpl ctx = new XpandExecutionContextImpl (output, null);
        for (MetaModel mm: mms)
            ctx.registerMetaModel (mm);
        ctx.getResourceManager().setFileEncoding (fileEncoding);

        return ctx;
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
