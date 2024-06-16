package com.sim.jdbc;


import java.sql.SQLException;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
/*
 *  for mongo db database connectivity download - https://jar-download.com/artifacts/org.mongodb/mongo-java-driver/2.12.2/source-code
 *  
 *   then install it into project 
 *   
 *   1) right click on project name / build path / configure build path / under lib / select module path / add external jar 
 * */

public class MongoDbConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		  try {
			  MongoClient mongoClient = new MongoClient("localhost",27017); // establishing a server connection in localhost 
	            DB db = mongoClient.getDB("blog"); // creating database called student 
	            System.out.println("connection established"); // prints connection established if database created 
	            DBCollection coll = db.getCollection("posts"); 
	            System.out.println(coll.getDB());
	            System.out.println(coll.getCollection("posts"));
	           
	          
	            }
	                          
	         catch (Exception ex) {
	            ex.printStackTrace();
	        }
		  System.out.println("server ready");
		
			
}
}