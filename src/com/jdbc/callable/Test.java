package com.jdbc.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

//using oracal database call callable statment 

public class Test {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		String q="{call sai(?,?,?)}";
		CallableStatement cst=con.prepareCall(q);
		cst.setInt(1, 20);
		cst.setInt(2, 400);
		cst.registerOutParameter(3,Types.INTEGER);
     cst.execute();
     System.out.println("Result="+cst.getInt(3));
	}

}
