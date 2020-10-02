package com.prepare_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Switch_set {
	
	public void addrecord() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prepare","root","root");
		
		String sql="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		try {
		ps.setInt(1, 3);
		ps.setString(2, "ram");
		ps.setString(3, "pune");
		ps.execute();
		System.out.println("done");
		ps.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println("Record already exist");
		}
		
		
	}
	
	public void viewrecord() throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prepare","root","root");
		String sql="select * from student";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		 while(rs.next())
		 {
			 System.out.println(rs.getInt(1));
			 System.out.println(rs.getString(2));
			 System.out.println(rs.getString(3));
		 }
		 con.close();
		 ps.close();
		 
	}
	public void updaterecord() throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prepare","root","root");
		String sql="update student set name=?,address=? where rollno=?";
		 PreparedStatement ps=con.prepareStatement(sql);
		 ps.setString(1, "sai");
		 ps.setString(2, "pune");
		 ps.setInt(3, 2);
		 ps.executeUpdate();
		 System.out.println("done");
		 con.close();
		 ps.close();
	
	}
	
	public void deleterecord() throws Exception
	{
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prepare","root","root");
		String sql="delete from student where rollno=?";
		PreparedStatement ps=con.prepareStatement(sql);
		
		  ps.setInt(1, 2);
		  int i=ps.executeUpdate();
		  if(i!=0) {
		  
		  System.out.println("done");
		  }
		else {
		System.out.println("record empty");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
