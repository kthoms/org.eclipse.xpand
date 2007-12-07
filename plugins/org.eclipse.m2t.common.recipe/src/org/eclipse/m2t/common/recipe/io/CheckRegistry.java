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
package org.eclipse.m2t.common.recipe.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.m2t.common.recipe.core.Check;
import org.eclipse.m2t.common.recipe.core.CheckSet;

public class CheckRegistry {
	
	private static Log logger = LogFactory.getLog( CheckRegistry.class );
	
	private static String checksFileName = null;
	private static CheckSet checks = null;
	
	public static boolean hasChecksFile() {
		return checksFileName != null;
	}
	
	public static void addCheck( Check c ) {
		if ( checks == null ) {
			checks = new CheckSet();
		}
		checks.add( c );
	}
	
	public static CheckSet getChecks() {
		return checks;
	}
	
	public static void setChecksFileName( String n ) {
		checksFileName = n;
	}
	
	public static void dumpToFile() {
		if ( hasChecksFile() ) {
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			try {
				fos = new FileOutputStream( checksFileName );
				oos = new ObjectOutputStream(fos);
				oos.writeObject( checks );
				oos.flush();
			} catch ( Exception ex ) {
				logger.warn("cannot write checks output to: "+checksFileName);
				ex.printStackTrace();
			} finally {
				try {
					if ( oos != null ) oos.close();
					if ( fos != null ) fos.close();
				} catch (IOException ignore) {}
			}
		}
	}

	public static void loadFromFile() throws CannotLoadChecksException {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream( checksFileName );
			ois = new ObjectInputStream(fis);
			checks = (CheckSet)ois.readObject();
		} catch ( Exception ex ) {
			ex.printStackTrace();
			throw new CannotLoadChecksException( ex );
		} finally {
			try {
				if ( ois != null ) ois.close();
				if ( fis != null ) fis.close();
			} catch (IOException ignore) {}
		}
	}
	
	public static boolean shouldCreateChecksFile() {
		return checksFileName != null;
	}
	
}
