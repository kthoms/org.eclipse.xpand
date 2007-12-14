/*******************************************************************************
 * Copyright (c) 2005, 2007 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *******************************************************************************/
package org.eclipse.xtend.util.uml2ecore;

import java.util.List;

public class AnnotationBodyCreator {

	public static String createBody( String className, String opName, List<String> parameters ) {
		StringBuilder b = new StringBuilder("return ");
		b.append( className+"Ext" );
		b.append( "." );
		b.append( opName );
		b.append( "( this " );
		int count = parameters.size();
		int i = 0;
		while (i < count) {
			String s = parameters.get(i);
			b.append( ", "+s );
			i++;
		}
		b.append( ")" );
		b.append( ";" );
		return b.toString();
	}
	
}
