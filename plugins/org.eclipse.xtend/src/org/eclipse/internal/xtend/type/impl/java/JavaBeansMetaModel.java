package org.eclipse.internal.xtend.type.impl.java;

import org.eclipse.internal.xtend.type.impl.java.beans.JavaBeansStrategy;


public class JavaBeansMetaModel extends JavaMetaModel {
    public JavaBeansMetaModel () {
        setTypeStrategy(new JavaBeansStrategy ());
    }
}
