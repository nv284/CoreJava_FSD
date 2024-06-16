package com.sim.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_crud_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
	    	   System.out.println("Driver loaded ....");
	    	   //step 2 
	    	   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb" , "root","pass");
	    	  System.out.println("Conneted...");
	    	  //step 3 
	    	  PreparedStatement ps = con.prepareStatement(" insert into Persons values (?,?,?)");
	    	  
	    	  //step 4
	    	  BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
	    	  
	    	  do {
	    		  System.out.println("Enter person id :");
	    		  int id = Integer.parseInt(br.readLine());
	    		  System.out.println("Enter the person Name :");
	    		  String name = br.readLine();
	    		  System.out.println("Enter the proper Address");
	    		  String address = br.readLine();
	    		  
	    		  ps.setInt(1, id);
	    		  ps.setString(2, name);
	    		  ps.setString(3, address);
	    		  int i = ps.executeUpdate();
	    		  System.out.println(i+" records affected"); 
	    		  
	    		  System.out.println("Do you want to continue: y/n"); 
	    		  String s = br.readLine();
	    		  if(s.startsWith("n")) {
	    			  break;
	    		  }
	    		  
	    		  
	    	  }while(true);
	    	  
	    	  con.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
