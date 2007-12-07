package org.eclipse.xtend.util.stdlib;

import java.util.Properties;
import java.util.Map.Entry;

public class PropertiesExtension {

	private static final Properties p = new Properties();
	
	public static void setProperties(Properties p) {
		for (Entry<Object, Object> entry : p.entrySet()) {
			PropertiesExtension.p.put(entry.getKey(), entry.getValue());
		}
	}

	public static String getProperty(String key) {
		if (key == null) {
			key = "";
		}
		return p.getProperty(key);
	}
	
	public static Properties getProperties() {
		return p;
	}

}
