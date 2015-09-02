package com.hexin.jweber.core;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Server")
public class Server {
	

	private Service service;

	public Service getService() {
		return service;
	}
	
	@XmlElement(name="Service")
	public void setService(Service service) {
		this.service = service;
	}
	
	
	public static void main(String[] args) {
		try {
			InputStream userInput = Server.class.getClassLoader().getResourceAsStream("conf/server.xml");
			JAXBContext ctx = JAXBContext.newInstance(Server.class);
			Unmarshaller unmarshaller = ctx.createUnmarshaller();  
//			User user = (User)unmarshaller.unmarshal(new StringReader(xmlCnt));  
			Server server = (Server)unmarshaller.unmarshal(userInput);  
			System.out.println(server);
			System.out.println(server.getService());
			System.out.println(server.getService().getEngine());
			System.out.println(server.getService().getEngine().getHost().getName());
			
			System.out.println(server.getService().getEngine().getHost().getValue().getClassName());
			System.out.println(server.getService().getEngine().getHost().getValue().getDirectory());

		} catch (Exception e) {
			e.printStackTrace();
		}  
	}

}
