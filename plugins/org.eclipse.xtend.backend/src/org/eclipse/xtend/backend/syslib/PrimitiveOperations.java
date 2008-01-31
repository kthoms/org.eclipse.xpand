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


/**
 * 
 * @author Arno Haase (http://www.haase-consulting.com)
 */
public final class PrimitiveOperations {
    
    ////////////////////////////////////////////////////
    // arithmetic operations
    ////////////////////////////////////////////////////

    public Long operatorPlus (Long l1, Long l2) {
        if (l1 == null || l2 == null)
            return null;
        
        return l1 + l2;
    }
    public Double operatorPlus (Double d1, Double d2) {
        if (d1 == null || d2 == null)
            return null;
        
        return d1 + d2;
    }
    public Double operatorPlus (Double d, Long l) {
        if (d == null || l == null)
            return null;
        
        return d + l;
    }
    public Double operatorPlus (Long l, Double d) {
        if (d == null || l == null)
            return null;
        
        return d + l;
    }
    
    
    public Long operatorMinus (Long l1, Long l2) {
        if (l1 == null || l2 == null)
            return null;
        
        return l1 - l2;
    }
    public Double operatorMinus (Double d1, Double d2) {
        if (d1 == null || d2 == null)
            return null;
        
        return d1 - d2;
    }
    public Double operatorMinus (Double d, Long l) {
        if (d == null || l == null)
            return null;
        
        return d - l;
    }
    public Double operatorMinus (Long l, Double d) {
        if (d == null || l == null)
            return null;
        
        return d - l;
    }
    
    
    public Long operatorMult (Long l1, Long l2) {
        if (l1 == null || l2 == null)
            return null;
        
        return l1 * l2;
    }
    public Double operatorMult (Double d1, Double d2) {
        if (d1 == null || d2 == null)
            return null;
        
        return d1 * d2;
    }
    public Double operatorMult (Double d, Long l) {
        if (d == null || l == null)
            return null;
        
        return d * l;
    }
    public Double operatorMult (Long l, Double d) {
        if (d == null || l == null)
            return null;
        
        return d * l;
    }

    
    public Long operatorDiv (Long l1, Long l2) {
        if (l1 == null || l2 == null)
            return null;
        
        return l1 / l2;
    }
    public Double operatorDiv (Double d1, Double d2) {
        if (d1 == null || d2 == null)
            return null;
        
        return d1 / d2;
    }
    public Double operatorDiv (Double d, Long l) {
        if (d == null || l == null)
            return null;
        
        return d / l;
    }
    public Double operatorDiv (Long l, Double d) {
        if (d == null || l == null)
            return null;
        
        return d / l;
    }
    
    
    public Long operatorMod (Long l1, Long l2) {
        if (l1 == null || l2 == null)
            return null;
        
        return l1 % l2;
    }
    public Double operatorMod (Double d1, Double d2) {
        if (d1 == null || d2 == null)
            return null;
        
        return d1 % d2;
    }
    public Double operatorMod (Double d, Long l) {
        if (d == null || l == null)
            return null;
        
        return d % l;
    }
    public Double operatorMod (Long l, Double d) {
        if (d == null || l == null)
            return null;
        
        return d % l;
    }
    
    //////////////////////////////////////////
    // comparison
    //////////////////////////////////////////

    public boolean operatorEquals (Object o1, Object o2) {
        if (o1 == null || o2 == null)
            return o1 == o2;
        
        return o1.equals (o2);
    }
    
    public boolean operatorNotEquals (Object o1, Object o2) {
        return ! operatorEquals (o1, o2);
    }

    @SuppressWarnings("unchecked")
    public Boolean operatorLess (Object o1, Object o2) {
        if (o1 == null || o2 == null)
            return null;
        
        if (! (o1 instanceof Comparable))
            throw new IllegalArgumentException ("Object " + o1 + " of type " + o1.getClass().getName() + " is not Comparable");
        
        return ((Comparable) o1).compareTo(o2) < 0;
    }

    @SuppressWarnings("unchecked")
    public Boolean operatorLessOrEquals (Object o1, Object o2) {
        if (o1 == null || o2 == null)
            return null;
        
        if (! (o1 instanceof Comparable))
            throw new IllegalArgumentException ("Object " + o1 + " of type " + o1.getClass().getName() + " is not Comparable");
        
        return ((Comparable) o1).compareTo(o2) <= 0;
    }
    
    @SuppressWarnings("unchecked")
    public Boolean operatorGreaterOrEquals (Object o1, Object o2) {
        if (o1 == null || o2 == null)
            return null;
        
        if (! (o1 instanceof Comparable))
            throw new IllegalArgumentException ("Object " + o1 + " of type " + o1.getClass().getName() + " is not Comparable");
        
        return ((Comparable) o1).compareTo(o2) >= 0;
    }
    
    @SuppressWarnings("unchecked")
    public Boolean operatorGreater (Object o1, Object o2) {
        if (o1 == null || o2 == null)
            return null;
        
        if (! (o1 instanceof Comparable))
            throw new IllegalArgumentException ("Object " + o1 + " of type " + o1.getClass().getName() + " is not Comparable");
        
        return ((Comparable) o1).compareTo(o2) > 0;
    }
    
    
    //////////////////////////////////////////
    // unary minus
    //////////////////////////////////////////
    
    public Long operatorMinus (Long l) {
        if (l == null)
            return null;
        
        return -l;
    }
    
    public Double operatorMinus (Double d) {
        if (d == null)
            return null;
        
        return -d;
    }
    
    //////////////////////////////////////////
    // misc
    //////////////////////////////////////////
    
    public Boolean operatorNot (Boolean b) {
        if (b == null)
            return null;
        return !b;
    }
    
    public Boolean implies (Boolean b1, Boolean b2) {
        if (b1 == null || b2 == null)
            return null;
        
        return ! (b1 && !b2);
    }
}















