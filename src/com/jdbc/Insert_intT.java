package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_intT 
{
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/statment","root","root");
		  Statement smt=con.createStatement();	
		  String sql="insert into student values(2,'jalinder','pune')";
		  smt.execute(sql);
		  System.out.println("done");
			
				
				
				
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}


