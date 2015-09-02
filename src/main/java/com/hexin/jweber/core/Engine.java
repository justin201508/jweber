package com.hexin.jweber.core;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Engine")
public class Engine {
	
	private Host host;

	public Host getHost() {
		return host;
	}

	@XmlElement(name="Host")
	public void setHost(Host host) {
		this.host = host;
	}
	
	
}
