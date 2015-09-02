package com.hexin.jweber.core;

import com.hexin.jweber.core.startup.Catalina;

/**
 * BootStrap for jweber java web server
 * 
 * first ,do some server initilzation works:
 * - this class will construct a classloader for use in load server internal classes.
 * - set some default environments 
 * - 
 * 
 * second,init the startup class: Catalina
 * 
 * 
 * @author suntao@myhexin.com
 *
 */
public class BootStrap {
	
	// singleton object used by main
	private static BootStrap daemon = null;
	
	private Catalina catalina = null;

	private ClassLoader commonloader;

	private ClassLoader sharedloader;

	private ClassLoader catalinaloader;
	
	
	
	// some init codes during the class loading...
	static {
		
	}
	
	
	public void init() {
		// init classloader
		initClassloaders();
		
		// init start class:Catalina
		initCatalina();
		
	}
	
	
	private void initCatalina() {
		catalina = new Catalina();
		catalina.setParentClassloader(sharedloader);
	}

	/**
	 * init classloaders by settings
	 * support common.loader,shared.loader,server.loader
	 * by default,the common classloader is the context classloader:
	 */
	private void initClassloaders() {
		this.commonloader = createClassloader("common",null);
		this.sharedloader = createClassloader("shared", commonloader);
		this.catalinaloader = createClassloader("server", commonloader);
	}


	private ClassLoader createClassloader(String name, ClassLoader parent) {
		String classloaderName = CatalinaProperties.getProperty(name + ".loader");
		if(classloaderName == null || classloaderName.isEmpty()) {
			return parent;
		}
		
		// to do
		// create classloader by config here
		return null;
	}


	public static void main(String[] args) {
		if(daemon == null) {
			// do not set daemon unitl init method completed
			BootStrap bootstrap = new BootStrap();
			ClassLoader cl = bootstrap.catalinaloader;
			try {
				//init bootstrap here!
				bootstrap.init();
			}
			finally {
			}
			
			daemon = bootstrap;
		}
		else {
			// why?
			Thread.currentThread().setContextClassLoader(daemon.catalinaloader);
		}
		
		String command = "start";
		try {
			if (args.length > 1) {
				command = args[args.length-1];
			}
			
			//execute jweber commands
			if(StartUpCommand.start.equals(command)) {
				// start server
				daemon.start();
			}
			else if(StartUpCommand.stop.equals(command)) {
				// stop server
				daemon.stop();
			}
		}
		catch(Throwable t ) {
			
		}
		
	}


	private void stop() {
	}


	private void start() {
	}
	

}
