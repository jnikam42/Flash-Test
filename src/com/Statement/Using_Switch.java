package com.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Using_Switch {
	
	public void insertData()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/statment","root","root");
			  Statement smt=con.createStatement();	
			 String sql="insert into student values(3,'deva','pune')";
			  smt.execute(sql);
			/*
			 * String s="insert into student value(3,'jalindar','pune')"; smt.execute(s);
			 */
			  System.out.println("done");
				
					
					
					
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
	public void Updatedata() 
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/statment","root","root");
		String sql2="update student set name='cjc'where rollno =5";
		String sq3="update student set address='mumbai'where rollno=5";
		Statement smt=con.createStatement();
	int x=smt.executeUpdate(sql2);
	int y=	smt.executeUpdate(sq3);
		if(x!=0&&y!=0)
		{
		System.out.println("done");
		}
		else {
			System.out.println("recorde not fount");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void delete() 
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/statment","root","root");
		String sql="delete from student where rollno =3";
		Statement smt=con.createStatement();
		smt.executeUpdate(sql);
		System.out.println("done");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void selectdata()
	{

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
	
	
	public static void main(String[] args)  {
		Using_Switch us=new Using_Switch();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("1.Insert Data\n2.Update data\n3.Delet Data\n4.select data");
		System.out.println("Enter the choise");
		int x=sc.nextInt();
		
		switch(x)
		{
		case 1:
			us.insertData();
			break;
		case 2:
			us.Updatedata();
			break;
		case 3:
			us.delete();
			break;
		case 4:
			us.selectdata();
			break;
		}
		
		}
	
		
	}
	}


