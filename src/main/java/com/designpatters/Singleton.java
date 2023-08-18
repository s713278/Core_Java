package com.designpatters;

class DBConnection{
	
	private static DBConnection connection= null;
	
	// private constructor to avoid client applications using the constructor
	private DBConnection() {
		
	}
	public  DBConnection getConnection() {
		if(connection == null) {
			connection= new DBConnection();
		}
		return connection;
	}
}
public class Singleton {

	public Singleton() {
	}

}
