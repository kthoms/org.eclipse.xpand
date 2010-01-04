package org.eclipse.xtend.profiler.templates;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Extensions {
	
	private static final Map<String, Object> globalState = new HashMap<String, Object>();
	
	public static Object setGlobal(Object value, String name) {
		globalState.put(name, value);
		return value;
	}
	
	public static Object getGlobal(String name) {
		return globalState.get(name);
	}
	
	public static String format(String format, Object param1) {
		// Numbers must be formatted with '.' as decimal separator, 
		// therefore set current Locale temporarely to English
		Locale currentLocale = Locale.getDefault();
		try {
			Locale.setDefault(Locale.ENGLISH);
			return String.format(format, param1);
		} finally {
			Locale.setDefault(currentLocale);
		}
	}

	public static String format(String format, Object param1, Object param2) {
		// Numbers must be formatted with '.' as decimal separator, 
		// therefore set current Locale temporarely to English
		Locale currentLocale = Locale.getDefault();
		try {
			Locale.setDefault(Locale.ENGLISH);
			return String.format(format, param1, param2);
		} finally {
			Locale.setDefault(currentLocale);
		}
	}
	
	public static String getFormFeed() {
		return "\f";
	}
	
	public static String anchorFragment(String value) {
		// TODO find real way without loosing information
		return value.replaceAll("[^a-zA-Z_-]", "_");
	}
	
	
	private static String bytesToMb(long bytes) {
		// Numbers must be formatted with '.' as decimal separator, 
		// therefore set current Locale temporarely to English
		Locale currentLocale = Locale.getDefault();
		try {
			Locale.setDefault(Locale.ENGLISH);
			return String.format("%d MB", bytes / (1024 * 1024));
		} finally {
			Locale.setDefault(currentLocale);
		}
	}
	
	public static String totalMemory() {
		return bytesToMb(Runtime.getRuntime().totalMemory());
	}

	public static String maxMemory() {
		return bytesToMb(Runtime.getRuntime().maxMemory());
	}
}
