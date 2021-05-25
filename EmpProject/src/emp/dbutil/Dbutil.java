package emp.dbutil;

import java.sql.DriverManager;

import java.sql.Connection;

public class Dbutil {
	
	String driverClass="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/sai";
	String user="root";
	String pass = "admin";
	Connection con = null;
	
	public  Connection getConnection() {
		try {
			//database logic
			Class.forName(driverClass);  
			 con=(Connection) DriverManager.getConnection(url,user,pass);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return con;
		
	}
	
	
}
