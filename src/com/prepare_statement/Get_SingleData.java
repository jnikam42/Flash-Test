package com.prepare_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Get_SingleData {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prepare","root","root");
		String sql="select * from student where rollno=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 3);
		 ResultSet rs=ps.executeQuery();
		 if(rs.next()) {
		 System.out.println(rs.getInt(1));
		 System.out.println(rs.getString(2));
		 System.out.println(rs.getString(3));
	}

}
}