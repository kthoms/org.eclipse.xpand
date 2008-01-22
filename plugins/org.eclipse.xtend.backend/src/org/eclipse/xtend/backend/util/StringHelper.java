/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.util;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;


/**
 * This class is a collection of helper functions for string handling.
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class StringHelper {
    private static final NumberFormat _numFormat = NumberFormat.getNumberInstance();

    /**
     * formats a number using the default locale settings.
     */
    public static String prettyPrint(long num) {
        return _numFormat.format(num);
    }

    /**
     * formats a number using the default locale settings.
     */
    public static String prettyPrint(Number num) {
        return _numFormat.format(num);
    }

    /**
     * formats a date using the default locale settings.
     */
    public static String prettyPrint(Date date) {
        return DateFormat.getDateTimeInstance().format(date);
    }

    /**
     * returns a new string in which one search string is replaced by another.
     */
    public static String replace(String src, String search, String replace) {
        if (src == null)
            return src;
        if (search == null || search.length() == 0)
            throw new IllegalArgumentException("Search string must not be empty");

        String result = src;
        int ind = 0;
        while ((ind = result.indexOf(search, ind)) >= 0) {
            result = result.substring(0, ind) + replace + result.substring(ind + search.length());
            ind += replace.length();
        }

        return result;
    }

    /**
     * replaces special characters that affect formatting with non-formatting
     * character sequences.
     * <ul>
     * <li> \ -> \\
     * <li> &lt;tab&gt; -> \t
     * <li> &lt;CR&gt; -> \r
     * <li> &lt;Newline&gt; -> \n
     * </ul>
     */
    public static String escape(String src) {
        String result = replace(src, "\\", "\\\\");
        result = replace(result, "\t", "\\t");
        result = replace(result, "\r", "\\r");
        result = replace(result, "\n", "\\n");
        result = replace(result, "\"", "\\\"");

        return result;
    }

    /**
     * undoes the operations of <code>escape</code>
     */
    public static String unescape(String src) {
        if (src == null)
            return null;

        final StringBuffer result = new StringBuffer();
        for (int i = 0; i < src.length(); i++) {
            final char curChar = src.charAt(i);

            if (curChar != '\\') {
                result.append(curChar);
                continue;
            }
            // increment i to skip to the character after '\\'
            i++;
            if (i >= src.length())
                throw new IllegalArgumentException("String ends with '\\'");

            result.append(unescapeChar(src.charAt(i)));
        }

        return result.toString();
    }

    private static char unescapeChar(char escapedChar) {
        switch (escapedChar) {
        case '\\':
            return '\\';
        case 'n':
            return '\n';
        case 'r':
            return '\r';
        case 't':
            return '\t';
        case '"':
            return '"';
        }
        throw new IllegalArgumentException("unsupported string format: '\\" + escapedChar + "' is not supported.");
    }

    /**
     * truncates a string regardless of its length. This method is a workaround
     * for a shortcoming of String.substring (int, int) that is unable to handle
     * the case where the number of characters would extend beyond the end of
     * the string.
     */
    public static String truncate(String str, int maxLen) {
        if (str == null || str.length() < maxLen)
            return str;
        if (maxLen < 0)
            return "";
        return str.substring(0, maxLen);
    }

    /**
     * same as String.substring, except that this version handles the case
     * robustly when the index is out of bounds.
     */
    public static String substring(String str, int beginIndex) {
        if (str == null)
            return null;
        if (beginIndex < 0)
            return str;
        if (beginIndex >= str.length())
            return "";

        return str.substring(beginIndex);
    }

    /**
     * same as String.substring, except that this version handles the case
     * robustly when one or both of the indexes is out of bounds.
     */
    public static String substring(String str, int beginIndex, int endIndex) {
        if (str == null)
            return null;
        if (beginIndex > endIndex)
            return "";
        if (beginIndex < 0)
            beginIndex = 0;
        if (endIndex > str.length())
            endIndex = str.length();

        return str.substring(beginIndex, endIndex);
    }

    /**
     * removes a number of characters from the beginning and the end of a string
     */
    public static String strip(String s, int numStart, int numEnd) {
        if (s == null)
            return s;

        return substring(s, numStart, s.length() - numEnd);
    }

    /**
     * returns the number of occurrences of a character in a string
     */
    public static int numMatches(String s, char ch) {
        if (s == null)
            return 0;

        int result = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ch)
                result++;

        return result;
    }

    /**
     * returns the number of occurrences of a substring in a string
     */
    public static int numMatches(String s, String search) {
        if (s == null || search == null || "".equals(s) || "".equals(search))
            return 0;

        int result = 0;
        int curIndex = 0;
        while (true) {
            curIndex = s.indexOf(search, curIndex);
            if (curIndex == -1)
                break;

            curIndex++;
            result++;
        }
        return result;
    }

    /**
     * tests if a string starts with any one of a collection of prefixes
     */
    public static boolean startsWithAny(String str, Collection<String> prefixes) {
        if (str == null)
            return false;

        for (Iterator<String> iter = prefixes.iterator(); iter.hasNext();) {
            if (str.startsWith(iter.next()))
                return true;
        }
        return false;
    }

    /**
     * tests if a string starts with any one of a collection of prefixes
     */
    public static boolean startsWithAny(String str, String[] prefixes) {
        if (str == null)
            return false;

        for (int i = 0; i < prefixes.length; i++) {
            if (str.startsWith(prefixes[i]))
                return true;
        }
        return false;
    }

    /**
     * tests if a string ends with any one of a collection of prefixes
     */
    public static boolean endsWithAny(String str, Collection<String> prefixes) {
        if (str == null)
            return false;

        for (Iterator<String> iter = prefixes.iterator(); iter.hasNext();) {
            if (str.endsWith(iter.next()))
                return true;
        }
        return false;
    }

    /**
     * tests if a string ends with any one of a collection of prefixes
     */
    public static boolean endsWithAny(String str, String[] prefixes) {
        if (str == null)
            return false;

        for (int i = 0; i < prefixes.length; i++) {
            if (str.endsWith(prefixes[i]))
                return true;
        }
        return false;
    }

    public static String firstUpper(String str) {
        return str.substring(0, 1).toUpperCase().concat(str.substring(1));
    }

    public static String firstLower(String str) {
        return str.substring(0, 1).toLowerCase().concat(str.substring(1));
    }
}
