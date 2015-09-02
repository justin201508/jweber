package com.hexin.jweber.core;

public enum StartUpCommand {
	
	start("startup"),
	stop("stop");
	
	private String name;
	
	private StartUpCommand(String name) {
		this.name = name;
	}
	
	public boolean equals(String name) {
		if(name != null && !name.isEmpty()) {
			return name.equals(this.toString());
		}
		return false;
	}
	

	
//	public static void main(String[] args) {
//		StartUpCommand command = StartUpCommand.startup;
//		System.out.println(command.equals("startup1"));
//	}
	
}
