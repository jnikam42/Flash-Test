package com.prepare_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertintoTable {
	
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/prepare","root","root");
		
		String sql="insert into student values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		for(int i=0;i<=4;i++)
		{
			try {
			System.out.println("enter the record");
			System.out.println("Enter the id");
			int x=sc.nextInt();
			System.out.println("Enter the name");
			String y=sc.next();
			System.out.println("Enter the address");
			String z=sc.next();
			ps.setInt(1, x);
			ps.setString(2, y);
			ps.setString(3, z);
			ps.execute();
			System.out.println("done");
			}
			catch(Exception e)
			{
				System.out.println("record already exist");
			}
			
			
		}
	
		con.close();
		ps.close();
				
		
		
	}

}
