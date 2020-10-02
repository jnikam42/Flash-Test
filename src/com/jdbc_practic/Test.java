package com.jdbc_practic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test {
	
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/test";
		String uname="root";
		String pass="root";
		String quary="insert into student value(3,'rahul','abad')";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement smt=con.createStatement();
	smt.execute(quary);
	System.out.println("done");
	
	
		/*
		 * while(rs.next()) {
		 * 
		 * System.out.println(rs.getInt(1)); System.out.println(rs.getString(2));
		 * System.out.println(rs.getString(3));
		 * 
		 * }
		 */
	smt.close();
	con.close();
	}

} 
