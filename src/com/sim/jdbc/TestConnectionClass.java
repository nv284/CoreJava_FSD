package com.sim.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// driver class , connection url , username , password , myconnector jar 
		
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loading .....");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo" , "root","pass");
			System.out.println("connected with database");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getInt("Id")+"   "+"   " +rs.getString("Name") +"  "+ rs.getInt("Marks") );
			}
			con.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
