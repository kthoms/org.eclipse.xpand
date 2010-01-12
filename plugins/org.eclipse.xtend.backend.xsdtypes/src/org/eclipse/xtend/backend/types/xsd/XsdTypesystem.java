package org.eclipse.xtend.backend.types.xsd;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.xtend.backend.common.BackendType;
import org.eclipse.xtend.backend.common.BackendTypesystem;
import org.eclipse.xtend.backend.types.builtin.ListType;
import org.eclipse.xtend.backend.types.emf.EmfTypesystem;
import org.eclipse.xtend.backend.types.xsd.internal.EFeatureMapEntryType;
import org.eclipse.xtend.backend.types.xsd.internal.EFeatureType;
import org.eclipse.xtend.backend.types.xsd.internal.EMapEntryType;
import org.eclipse.xtend.backend.types.xsd.internal.EMapType;
import org.eclipse.xtend.backend.types.xsd.internal.QNameType;
import org.eclipse.xtend.backend.types.xsd.internal.XMLEClassType;
import org.eclipse.xtend.backend.types.xsd.internal.XMLFeatureMapType;
import org.eclipse.xtend.backend.util.Cache;

public class XsdTypesystem implements BackendTypesystem {

	private BackendTypesystem _rootTs;

    private final EmfTypesystem _emfTypesystem = new EmfTypesystem ();
    
    public final static String EFEATURE_MAP_ENTRY = "EFeatureMapEntry";
    public final static String EFEATURE_MAP = "EFeatureMap";
    public final static String EFEATURE = "EFeature";
    public final static String EMAP = "EMap";
    public final static String EMAP_ENTRY = "EMapEntry";
    public final static String QNAME = "QName";
    public final static String XSD_TYPE_PREFIX = "{xsd}";

	private EFeatureMapEntryType featureMapEntry;
	private EFeatureType featureType;
	private QNameType qnameType;

    private final Map<EClassifier, BackendType> _cache = new HashMap<EClassifier, BackendType>();

    private Cache<EClassifier, EMapEntryType> mapEntryCache = new Cache<EClassifier, EMapEntryType>() {
		@Override
		protected EMapEntryType create(EClassifier key) {
			return new EMapEntryType(EMAP_ENTRY, XsdTypesystem.this, key);
		}
	};

	private Cache<EClassifier, EMapType> eMapCache = new Cache<EClassifier, EMapType>() {
		protected EMapType create (EClassifier c) {
			return new EMapType(EMAP, XsdTypesystem.this, c);
		}
	};

	private Cache<EClass, XMLFeatureMapType> featueMapCache = new Cache<EClass, XMLFeatureMapType>() {
		protected XMLFeatureMapType create (EClass c) {
			return new XMLFeatureMapType (EFEATURE_MAP, XsdTypesystem.this, c);
		}
	};


	public static String getFullyQualifiedName(EClass clazz) {
		return EmfTypesystem.getFullyQualifiedName (clazz);
	}
    
    public static String getUniqueIdentifier (EClassifier cls) {
        return XSD_TYPE_PREFIX + "{" + cls.getEPackage().getNsURI() + "}" + cls.getName();
    }

    public BackendType findType(Object o) {
		BackendType r = null;
		if (o instanceof FeatureMap) {
			FeatureMap m = (FeatureMap) o;
			EClass c = ((Setting) m).getEObject().eClass();
			r = getEFeatureMapType(c);
		} else if (o instanceof FeatureMap.Entry) {
			r = getEFeatureMapEntryType();
		} else if (o instanceof EStructuralFeature) {
			r = getEFeatureType();
		} else if (EMapType.isEMapObject(o)) {
			EClassifier c = ((Setting) o).getEStructuralFeature().getEType();
			r = getEMapType(c);
		} else if (EMapEntryType.isEMapEntryObject(o)) {
			EClassifier i = (o instanceof EObject) ? ((EObject) o).eClass()
					: null;
			r = getEMapEntryType (i);
		} else if (o instanceof QName) {
			r = getQNameType();
		} else if (o instanceof EClass) {
			EClass eCls = (EClass) o;
			EList<EAnnotation> anns = eCls.getEAnnotations ();
			for (EAnnotation eAnn : anns) {
				EMap<String, String> details = eAnn.getDetails ();
				String kind = details.get ("kind");
				if (eAnn.getSource ().endsWith ("ExtendedMetaData") && kind != null) {
					return getTypeForEClassifier (eCls);
				}
			}
		} 
		r = _emfTypesystem.findType(o);
		return r;
	}

	public BackendType findType(Class<?> cls) {
		// TODO Auto-generated method stub
		if (cls.isAssignableFrom (FeatureMap.class)) {
			//TODO No EClass available
			return getEFeatureMapType (null);
		}
		if (cls.isAssignableFrom(FeatureMap.Entry.class))
			return getEFeatureMapEntryType();
		if (cls.isAssignableFrom (EStructuralFeature.class))
			return new EFeatureType(EFEATURE, this);
		if (cls.isAssignableFrom(EMap.class))
			//TODO Not safely qualified to be a relevant EMap
			//TODO No EClassifier available
			return getEMapType(null);
		if (cls.isAssignableFrom(Entry.class))
			//TODO Not safely qualified to be a relevant EMap Entry
			//TODO No EClassifier available
			return getEMapEntryType(null);
		if (cls.isAssignableFrom(QName.class))
			return getQNameType();
		return _rootTs.findType(cls);
	}

	public BackendType findType(String uniqueRepresentation) {
        if (! uniqueRepresentation.startsWith (XSD_TYPE_PREFIX))
            return null;

        uniqueRepresentation = uniqueRepresentation.substring (XSD_TYPE_PREFIX.length());
        
        if (EFEATURE_MAP.equals(uniqueRepresentation))
			return getEFeatureMapType (null);
		if (EFEATURE_MAP_ENTRY.equals(uniqueRepresentation))
			return getEFeatureMapEntryType();
		if (EFEATURE.equals (uniqueRepresentation))
			return new EFeatureType(EFEATURE, this);
		if (EMAP.equals (uniqueRepresentation))
			//TODO Not safely qualified to be a relevant EMap
			//TODO No EClassifier available
			return getEMapType(null);
		if (EMAP_ENTRY.equals (uniqueRepresentation))
			//TODO Not safely qualified to be a relevant EMap Entry
			//TODO No EClassifier available
			return getEMapEntryType(null);
		if (QNAME.equals (uniqueRepresentation))
			return getQNameType();
		return _rootTs.findType (uniqueRepresentation);
	}

	public BackendTypesystem getRootTypesystem () {
		return _rootTs;
	}

	public void setRootTypesystem (BackendTypesystem ts) {
		_rootTs = ts;
	}

	public BackendType getTypeForEClassifier (EClass cls) {
		// TODO Auto-generated method stub
		return _emfTypesystem.getTypeForEClassifier(cls);
	}
	
	public EFeatureMapEntryType getEFeatureMapEntryType() {
		if (featureMapEntry == null)
			featureMapEntry = new EFeatureMapEntryType (EFEATURE_MAP_ENTRY, this);
		return featureMapEntry;
	}

	public XMLFeatureMapType getEFeatureMapType (EClass aClass) {
		return featueMapCache.get(aClass);
	}

	public EFeatureType getEFeatureType() {
		if (featureType == null)
			featureType = new EFeatureType(EFEATURE, this);
		return featureType;
	}

	public EMapEntryType getEMapEntryType (EClassifier innerType) {
		return mapEntryCache.get (innerType);
	}

	public EMapType getEMapType (EClassifier innerType) {
		return eMapCache.get(innerType);
	}


	public QNameType getQNameType () {
		// TODO: resolve the package name dynamically
		if (qnameType == null)
			qnameType = new QNameType (QNAME, this);
		return qnameType;
	}

	public BackendType getTypeForEClassifier (EClassifier cls) {
        if (cls instanceof EClass) {
            final XMLEClassType result = new XMLEClassType ((EClass) cls, this);
            
            // first putting the type into the cache and then initializing it avoids endless recursion
            _cache.put (cls, result);
            result.init (this);
            return result;
        }
		return _emfTypesystem.getTypeForEClassifier (cls);
	}

    public BackendType getTypeForETypedElement (ETypedElement typedElement) {
        if (typedElement.getUpperBound() != 1)
            return ListType.INSTANCE;
        
        return getTypeForEClassifier (typedElement.getEType());
    }
	
}
