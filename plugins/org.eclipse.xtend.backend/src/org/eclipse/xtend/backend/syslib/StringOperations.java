/*
Copyright (c) 2008 Arno Haase.
All rights reserved. This program and the accompanying materials
are made available under the terms of the Eclipse Public License v1.0
which accompanies this distribution, and is available at
http://www.eclipse.org/legal/epl-v10.html

Contributors:
    Arno Haase - initial API and implementation
 */
package org.eclipse.xtend.backend.syslib;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtend.backend.common.EfficientLazyString;
import org.eclipse.xtend.backend.common.ExecutionContext;
import org.eclipse.xtend.backend.common.Helpers;
import org.eclipse.xtend.backend.functions.java.AbstractExecutionContextAware;
import org.eclipse.xtend.backend.functions.java.M2tHidden;


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class StringOperations extends AbstractExecutionContextAware {
    
    public String toString (Object o) {
        if (o == null) 
            return "";
        
        return String.valueOf (o);
    }
    
    public boolean startsWith (String s1, String s2) {
        if (s1 == null || s2 == null) {
            _ctx.logNullDeRef (null);
            return false;
        }
        
        return s1.startsWith (s2);
    }
    
    public boolean endsWith (String s1, String s2) {
        if (s1 == null || s2 == null) {
            _ctx.logNullDeRef (null);
            return false;
        }
        
        return s1.endsWith (s2);
    }
    
    public boolean contains (String s1, String s2) {
        if (s1 == null || s2 == null) {
            _ctx.logNullDeRef (null);
            return false;
        }
        
        return s1.contains (s2);
    }

    public String substring (String s, int indexFrom) {
        if (s == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        return s.substring (indexFrom);
    }
    
    public CharSequence substring (CharSequence s, int indexFrom, int indexTo) {
        if (s == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        return s.subSequence (indexFrom, indexTo);
    }

    public String toUpperCase (String s) {
        if (s == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        return s.toUpperCase(); 
    }
    
    public String toLowerCase (String s) {
        if (s == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        return s.toLowerCase(); 
    }
    
    public String toFirstUpper (String s) {
        if (s == null) {
            _ctx.logNullDeRef (null);
            return null;
        }

        if (s.length() < 2)
            return s.toUpperCase();
        
        return s.substring (0, 1).toUpperCase() + s.substring (1);
    }
    
    public String toFirstLower (String s) {
        if (s == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        if (s.length() < 2)
            return s.toLowerCase();
        
        return s.substring (0, 1).toLowerCase() + s.substring (1);
    }

    public List<String> toCharList (String s) {
        final List<String> result = new ArrayList<String> ();
        
        if (s == null) {
            _ctx.logNullDeRef (null);
            return result;
        }
        
        for (char ch: s.toCharArray())
            result.add ("" + ch);
        
        return result;
    }

    public String replace (String s, CharSequence searchString, CharSequence replaceString) {
        if (s == null || searchString == null || replaceString == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        return s.replace (searchString, replaceString);
    }
    
    public String replaceFirstUsingRegex (String s, String searchString, String replaceString) {
        if (s == null || searchString == null || replaceString == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        return s.replaceFirst (searchString, replaceString);
    }
    
    public String replaceAllUsingRegex (String s, String searchString, String replaceString) {
        if (s == null || searchString == null || replaceString == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        
        return s.replaceAll (searchString, replaceString);
    }
    
    public String[] split (String s, String regex) {
        if (s == null || regex == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
        return s.split (regex);
    }
    
    public Boolean matches (String s, String regex) {
        if (s == null || regex == null) {
            _ctx.logNullDeRef (null);
            return null;
        }
            
        return s.matches (regex);
    }
    
    public String trim (String s) {
        if (s == null)
            return null;
        
        return s.trim ();
    }
    
    public Long asInteger (String s) {
        if (s == null)
            return null;
        
        return Long.valueOf (s);
    }
    
    
    public CharSequence operatorPlus (Object o1, Object o2) {
        return concat (o1, o2);
    }

    /**
     * This method is duplicated with a different name so as to allow explicit concatenation
     *  even if '+' is defined for the concrete types.
     */
    public CharSequence concat (Object o1, Object o2) {
        if (o1 instanceof EfficientLazyString) 
            return EfficientLazyString.createAppendedString ((EfficientLazyString) o1, overridableToString (_ctx, o2));
        
        EfficientLazyString result = new EfficientLazyString ();

        result = EfficientLazyString.createAppendedString (result, overridableToString (_ctx, o1));
        result = EfficientLazyString.createAppendedString (result, overridableToString (_ctx, o2));
        
        return result;
    }

    /**
     * This method is public static so as to be available as a helper method for all code that needs to call "toString".
     *  It calls "toString" on an object, taking into account all potential overriding extensions.<br>
     *  
     * This method is however not itself intended to be published as an extension. It is a helper function, intended to
     *  be used by other extensions.
     */
    @M2tHidden
    public static CharSequence overridableToString (ExecutionContext ctx, Object o) {
        return Helpers.overridableToString (ctx, o);
    }
}
