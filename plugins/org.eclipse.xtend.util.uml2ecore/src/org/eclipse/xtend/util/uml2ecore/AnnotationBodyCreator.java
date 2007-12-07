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
