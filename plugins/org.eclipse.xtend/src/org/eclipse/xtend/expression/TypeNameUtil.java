/*
 * <copyright>
 *
 * Copyright (c) 2005-2006 Sven Efftinge (http://www.efftinge.de) and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sven Efftinge (http://www.efftinge.de) - Initial API and implementation
 *
 * </copyright>
 */
package org.eclipse.xtend.expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.internal.xtend.expression.parser.SyntaxConstants;

/**
 * Utility class for retrieving information from various type name presentations
 * used within oAW's type system.
 * <p>
 * The following type formats can occur:
 * <ul>
 * <li> <code>&lt;typename&gt;</code>
 * <li> <code>&lt;collectionTypeName&gt;[&lt;typename&gt;]</code>
 * <li>
 * <code>&lt;collectionTypeName&gt;[&lt;metamodelname&gt;!&lt;typename&gt;]</code>
 * </ul>
 * Examples:
 * <ul>
 * <li> <code>entities::Account</code>
 * <li> <code>List[entities::Account]</code>
 * </ul>
 * <p> '<code>&lt;typename&gt;</code>' is the fully qualified name
 * <code>namespace1::namespace2::name</code>
 * 
 * @author Sven Efftinge (http://www.efftinge.de) - Initial implementation
 * @author Arno Haase - Initial implementation
 * @author Karsten Thoms - Documentation
 * @since 4.0
 */
public class TypeNameUtil {
	/**
	 * This pattern is used to find the type name within possible query strings
	 */
	private final static Pattern TYPE_PATTERN = Pattern.compile("\\A(?:(\\w+)\\[)?(?:(\\w+)!)?([\\w:]*\\w+)(?:\\])?\\z");

	/**
	 * Retrieves the collection type.
	 * 
	 * @param name
	 *            Qualified type string
	 * @return The name of the collection type if present ('List', 'Set'),
	 *         otherwise <code>null</code>
	 */
	public static String getCollectionTypeName(final String name) {
		return getGroup(name, 1);
	}

	/**
	 * Retrieves the type name
	 * 
	 * @param name
	 *            Qualified type string
	 * @return The type's name
	 */
	public static String getTypeName(final String name) {
		String group = getGroup(name, 3);
		if (group == null) {
			group = "";
		}
		return group;
	}

	private static String getGroup(final String input, final int group) {
	    final Matcher m = TYPE_PATTERN.matcher(input);
	    
		if (m.matches() && m.groupCount() >= group) {
			return m.group(group);
		}
		return null;
	}

	/**
	 * Gets the internal representation of a class name.
	 * 
	 * @param class1
	 *            A class instance for which the name should be retrieved
	 * @return oAW's classname representation (<code>package1::package2::TheClassname</code>)
	 */
	public static String getName(final Class<?> class1) {
		return class1.getName().replaceAll("\\.", SyntaxConstants.NS_DELIM);
	}

	/**
	 * Cuts the last segment from a qualified type name.
	 * 
	 * @param fqn
	 *            Qualified type name
	 * @return
	 * 
	 * <pre>
	 * ns1::ns2::name   -&gt; ns1::ns2
	 * name             -&gt; &lt;null&gt;
	 * </pre>
	 */
	public static String withoutLastSegment(final String fqn) {
		if (fqn.lastIndexOf(SyntaxConstants.NS_DELIM) == -1) {
			return null;
		}
		return fqn.substring(0, fqn.lastIndexOf(SyntaxConstants.NS_DELIM));
	}

	/**
	 * Retrieves only the last segment of a qualified name and therefore cuts
	 * the namespace part
	 * 
	 * @param fqn
	 *            Qualified type name
	 * @return
	 * 
	 * <pre>
	 * ns1::ns2::name   -&gt; name
	 * name             -&gt; name
	 * </pre>
	 */
	public static String getLastSegment(final String fqn) {
		if (fqn.lastIndexOf(SyntaxConstants.NS_DELIM) == -1) {
			return fqn;
		}
		return fqn.substring(fqn.lastIndexOf(SyntaxConstants.NS_DELIM) + SyntaxConstants.NS_DELIM.length());
	}

	/**
	 * Cuts the namespace qualification from the type string.
	 * 
	 * @param fqn
	 *            Qualified type string
	 * @return
	 * 
	 * <pre>
	 * ns1::ns2::type             -&gt; type
	 * List[type]                 -&gt; List[type]
	 * List[Metamodel!ns1::type]  -&gt; List[Metamodel!type]
	 * </pre>
	 */
	public static String getSimpleName(final String fqn) {
		final String ct = getCollectionTypeName(fqn);
		final String inner = getLastSegment(getTypeName(fqn));
		final StringBuffer sb = new StringBuffer();
		if (ct != null) {
			sb.append(ct).append("[");
		}
		sb.append(inner);
		if (ct != null) {
			sb.append("]");
		}
		return sb.toString();
	}

	public static Object getPackage(String insertString) {
		if (insertString == null || insertString.trim().length() == 0)
			return null;
		int index = insertString.indexOf(SyntaxConstants.NS_DELIM);
		if (index != -1) {
			return insertString.substring(0, index);
		}
		return null;
	}
}
