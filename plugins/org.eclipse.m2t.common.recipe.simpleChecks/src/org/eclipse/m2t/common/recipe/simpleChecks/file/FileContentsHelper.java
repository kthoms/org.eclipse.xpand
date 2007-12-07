/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Markus Voelter and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Markus Voelter - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.m2t.common.recipe.simpleChecks.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.m2t.common.recipe.core.AtomicCheck;

public class FileContentsHelper {
	
	public static void checkContent( AtomicCheck c, String filename, String substring ) {
		StringBuffer b = new StringBuffer();
		BufferedReader r;
		try {
			r = new BufferedReader(new FileReader(filename));
			while ( r.ready() ) {
				b.append( r.readLine() );
			}
			if ( b.toString().indexOf(substring) >= 0 ) c.ok();
			else c.fail( "file does not contain '"+substring+"'");
		} catch (FileNotFoundException e) {
			c.fail( "cannot read file: "+filename);
		} catch (IOException e) {
			c.fail( "cannot read file: "+filename);
		}
	}
}
