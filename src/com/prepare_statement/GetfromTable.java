package com.prepare_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetfromTable {
	
	public static void main(String[] args) throws Exception {
		

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/practic","root","root");
		
		//String sql="select dept,count(*) from employee group by dept";
		//String sql="select * from employee where salary in (select max(salary) from employee where salary<>(select Max(salary)from employee))";
		//String sql=" select * from employee order by salary desc "; 
		String sql="select max(salary)from employee where salary<(select max(salary)from employee)";
		//String sql="select Max(salary)from employee where salary Not In (select Max(salary) from employee)";
		//String sql="select Max(salary) from employee";
		//String sql="select ename from employee where salary=(select Max(salary) from employee)";
		//String sql="select salary from (select salary from employee order by salary desc limit 2)as employee order by salary limit 1";
		PreparedStatement ps=con.prepareStatement(sql);
    	ResultSet rs= ps.executeQuery();
    	
        while(rs.next())
       {
        	System.out.println("dept  \t count");	
		System.out.println(rs.getString(1)+"           "+rs.getString(2));
		
			/*
			 * System.out.println(rs.getString(2)); System.out.println(rs.getString(3));
			 * System.out.println(rs.getString(4));
			 */
			
        }
     ps.close();
		con.close();
	}

}
