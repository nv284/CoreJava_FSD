package com.sim.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemoClass {

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
    	  //step 3
    	  Statement stm = con.createStatement();
    	  //step 4
    	  ResultSet rs =  stm.executeQuery("select * from persons");
    	  while(rs.next())
    		  System.out.println(rs.getInt(1) +"   "+rs.getString(2)+ "   "+rs.getString(3));
    	   //step 5
    	   con.close();
    	   
       }catch (Exception e) {
		// TODO: handle exception
    	   System.out.println(e);
	}
	}

}
