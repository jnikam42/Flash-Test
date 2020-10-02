package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Abc {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/statment";
		String uname="root";
		String pass="root";
		//String quary="select * from student";
		String sq="insert into student values(4,'deva','pune')";
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			
			Connection con=DriverManager.getConnection(url,uname,pass);	
			Statement smt=con.createStatement();
			//ResultSet rs=smt.executeQuery(quary);
					smt.execute(sq);
					System.out.println("done");
			
			/*
			 * { while(rs.next()) { System.out.println(rs.getInt(1));
			 * System.out.println(rs.getString(2)); System.out.println(rs.getString(3)); } }
			 */
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
