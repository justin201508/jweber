package com.hexin.jweber.core;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Host")
public class Host {
	
	
	private String name;
	
	private Valve valve;
	
	public String getName() {
		return name;
	}
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
	public Valve getValue() {
		return valve;
	}
	
	@XmlElement(name="Valve")
	public void setValue(Valve valve) {
		this.valve = valve;
	}

	
	
}
