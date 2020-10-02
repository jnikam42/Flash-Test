package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class Delete_From_Table {
	public static void main(String[] args) throws Exception {
		
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			String sql="delete from student where rollno =4";
			Statement smt=con.createStatement();
			smt.executeUpdate(sql);
			
			String sql2="update student set name='jalindar'where rollno =2";
			smt.executeUpdate(sql2);
			System.out.println("done");
			smt.close();
			con.close();
			
		
	}

}
