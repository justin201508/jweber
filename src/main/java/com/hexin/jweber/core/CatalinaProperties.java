package com.hexin.jweber.core;

import java.util.HashMap;
import java.util.Map;

public class CatalinaProperties {

	private static Map<String,String> properties = new HashMap<String,String>();
	
	static {
		//load catalina properties
		loadProperties();
	}
	
	public static String getProperty(String key) {
		return properties.get(key);
	}

	private static void loadProperties() {
		//load properties here
	}

}
