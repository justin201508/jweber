package com.hexin.jweber.core;

import javax.xml.bind.annotation.XmlAttribute;


public class Valve {

//	@XmlAttribute
	private String className;
	private String directory;

	public String getClassName() {
		return className;
	}
	@XmlAttribute
	public void setClassName(String className) {
		this.className = className;
	}
	public String getDirectory() {
		return directory;
	}
	@XmlAttribute
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
	
}
