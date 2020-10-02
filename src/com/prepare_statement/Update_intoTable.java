package com.prepare_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_intoTable {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/prepare","root","root");
		
		String sql="update student set name=? where rollno=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, "jalu");
		ps.setInt(2,1);
		ps.executeUpdate();
		System.out.println("done");
		ps.close();
		con.close();
				
	}

}
