package com.sim.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;

try {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loading .....");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb" , "root","pass");
	System.out.println("connected with database");
	con.setAutoCommit(false);  
	
	String s1 = "insert into persons values(222 , 'Radha' ,'Mumbai')";
	String s2 = "insert into persons values(221 , 'Rita' ,'Mumbai')";
	String s3 = "insert into persons values(223 , 'rama' ,'Mumbai')";
	
	Statement stm = con.createStatement();
	stm.addBatch(s1);stm.addBatch(s2);stm.addBatch(s3);
	System.out.println("data loaded");
	
	stm.executeBatch();
	con.commit();
	con.close();
	
	
	
	
}catch (Exception e) {
	// TODO: handle exception
}
	}

}
