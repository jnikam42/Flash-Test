package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connectivity {
	private static String url="jdbc:mysql://localhost:3306/test";
	private static String user="root";
	private static String pass="root";
	private static String driver="com.mysql.jdbc.Drivar";
	
	
	
	public static Connection getconnectivity() throws Exception 
	{
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,user,pass);
		 return con;
		
	}

}
