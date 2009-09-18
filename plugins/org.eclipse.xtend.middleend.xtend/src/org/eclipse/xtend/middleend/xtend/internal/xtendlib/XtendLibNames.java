/*
Copyright (c) 2008 Arno Haase, André Arnold.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
    André Arnold
 */
package org.eclipse.xtend.middleend.xtend.internal.xtendlib;

import org.eclipse.xtend.backend.common.QualifiedName;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 * @author André Arnold
 */
public interface XtendLibNames {
    String FOREACH_WITHOUT_ITERATOR = "XpandForEach";
    String FOREACH_WITH_ITERATOR = "XpandForEachWithIterator";
    
    String DELETE_LINE_INIT = "XpandInitNewScope";
    String DELETE_LINE_REGISTER = "XpandRegisterDeleteLine";
    String DELETE_LINE_POSTPROCESS = "XpandPostprocess";
    
    String GLOBAL_VAR_VALUE = "XtendGlobalVar";
    
    String ADD = "XtendAdd";
    String ADD_ALL = "XtendAddAll";
    String REMOVE = "XtendRemove";
    String REMOVE_ALL = "XtendRemoveAll";
    
    String OBJECT_META_TYPE = "XtendMetaType";
    String TYPE_ALL_STATIC_PROPERTIES = "XtendTypeAllStaticProperties";
    String TYPE_ALL_FEATURES = "XtendTypeAllFeatures";
    String TYPE_ALL_OPERATIONS = "XtendTypeAllOperations";
    String TYPE_ALL_PROPERTIES = "XtendTypeAllProperties";
    String TYPE_SUPER_TYPES = "XtendTypeSuperTypes";
    String TYPE_DOCUMENTATION = "XtendTypeDocumentation";
    String TYPE_GET_FEATURE = "XtendTypeGetFeature";
    String TYPE_GET_PROPERTY = "XtendTypeGetProperty";
    String TYPE_GET_OPERATION = "XtendTypeGetOperation";
    
    String OPREATION_GET_PARAMETER_TYPES = "XtendOperationGetParameterTypes";
    String OPERATION_EVALUATE = "XtendOperationEvaluate";
    String OPERATION_NAME = "XtendName";
    
    String STRING_REPLACE_FIRST = "XtendStringReplaceFirst";
    
    String UPTO = "XtendUpto";
    String COMPARE_TO = "xtendCompareTo";
    
    String ITERATOR_ELEMENTS = "XpandIteratorElements";
	String FEATURE_RETURNTYPE = "XtendFeatureReturnType";
	String FEATURE_OWNER = "XtendFeatureOwner";
	
	String ADVICE_CTX_PARAM_TYPES = "adviceCtxParamTypes";
	String ADVICE_CTX_PARAM_NAMES = "adviceCtxParamNames";
	String ADVICE_CTX_PARAM_VALUES = "adviceCtxParamValues";
	String ADVICE_CTX_NAME = "adviceCtxName";
	String ADVICE_CTX_TARGET_TYPE = "adviceCtxTargetType";
	String DEFINITION_PARAM_TYPES = "xtendDefinitionParamTypes";
	String DEFINITION_PARAM_NAMES = "xtendDefinitionParamNames";
	String DEFINITION_NAME = "xtendDefinitionName";
	String DEFINITION_TOSTRING = "xtendDefinitionToString";
}
