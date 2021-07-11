package miniproj.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbutil {
	
	String driverClass="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/sai";
	String user="root";
	String pass = "admin";
	Connection con = null;
	
	public  Connection getConnection() {
		try {
			//database logic
			Class.forName(driverClass);  
			 con=DriverManager.getConnection(url,user,pass);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return con;
		 
	}
	
	
	

}
