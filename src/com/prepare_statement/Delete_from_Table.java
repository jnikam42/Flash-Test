package com.prepare_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_from_Table {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prepare","root","root");
		String sql="delete from student where rollno=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 2);
		ps.executeUpdate();
		System.out.println("done");
	}

}
