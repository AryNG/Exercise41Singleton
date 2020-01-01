package com.designpattern.app;
import com.designpattern.model.MySingle;
public class SingletonApp {

	public static void main(String[] args) {
		
		String urlServer = "jdbc:mysql://localhost3306/tienda";
		String userName = "root";
		String password = "admin";
		
		MySingle objMySingleton = MySingle.getInstance(urlServer, userName, password);
		

	}

}
