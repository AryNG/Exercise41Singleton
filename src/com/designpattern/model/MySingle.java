package com.designpattern.model;

public class MySingle {
	
	//2. Static private instance
	private static MySingle mySingleton = null;
	private static String urlServer;
	private static String userName;
	private static String password;
	
	
	//1.Private Constructor
	private MySingle() {
		
	}
	
	//3.Static public getInstance Method
	public static MySingle getInstance(String urlServer, String userName, String password) {
		if(mySingleton == null) {
			mySingleton = new MySingle();
		}
		else {
			System.out.println("Object can not be created because it is already instanciated");
			System.out.println("URL:"+urlServer);
			System.out.println("User Name: "+userName);
			System.out.println("Password: "+password);
		}
		return mySingleton;
	} 
}
