package org.eclipse.xtend.util.stdlib.tracing;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

public class M2CTraceElement extends TraceElement {

	private String fileName;
	private String token;

	public M2CTraceElement( String kind, EObject from, String fileName, String token) {
		super( from, kind );
		this.fileName = fileName;
		this.token = token;
	}
	
	public M2CTraceElement( String kind, Collection<EObject> from, String fileName,String token ) {
		super( from, kind );
		this.fileName = fileName;
		this.token = token;
	}

	public String getFileName() {
		return fileName;
	}

	public String getToken() {
		return token;
	}
	
}
