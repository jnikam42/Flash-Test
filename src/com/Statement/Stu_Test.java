package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Stu_Test {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		try(	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/statment","root","root");
			Statement smt=con.createStatement();
			ResultSet rs=smt.executeQuery("select * from student");)
			{
				while(rs.next())
				{
					Student s=new Student();
					s.setSid(rs.getInt(1));
					s.setSname(rs.getString(2));
					s.setSaddr(rs.getString(3));
					System.out.println(s.getSid());
					System.out.println(s.getSname());
					System.out.println(s.getSaddr());
					//System.out.println("done");
				}
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
