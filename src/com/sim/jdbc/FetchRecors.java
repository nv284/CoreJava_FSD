package com.sim.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FetchRecors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		 try {
	    	   //step 1 
	    	   Class.forName("com.mysql.cj.jdbc.Driver");
	    	   System.out.println("Driver loaded ....");
	    	   //step 2 
	    	   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb" , "root","pass");
	    	  System.out.println("Conneted...");
	    	  // it will make the transaction temp
	    	  con.setAutoCommit(false);  
	    	  
	    	  //step 3
	    	  Statement stm = con.createStatement();
	    	  stm.executeUpdate("insert into persons values(201,'Deepak','Mumbai')");
	    	  stm.executeUpdate("insert into persons values(203,'Maya','Mumbai')");
	    	  stm.executeUpdate("insert into persons values(205,'Rounak','Mumbai')");
	    	  stm.executeUpdate("insert into persons values(210,'Daya','Mumbai')");
	    	  
	    	  // to make insertion permanent 
	    	  con.commit();
	    	  con.close();
	    	  
		 }catch (Exception e) {
			// TODO: handle exception
		}
	}

}
