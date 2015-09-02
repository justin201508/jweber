package com.hexin.jweber.core;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Service")
public class Service {
	
	private Connector connector;
	private Engine engine;
	
	public Connector getConnector() {
		return connector;
	}
	public void setConnector(Connector connector) {
		this.connector = connector;
	}
	
	public Engine getEngine() {
		return engine;
	}
	@XmlElement(name="Engine")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

}
