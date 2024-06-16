package com.sim.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    description VARCHAR(255),
    price DECIMAL(10, 2)
);
 * */
public class BatchProcess_demo {
	
	 private static final String INSERT_PRODUCTS_SQL = "INSERT INTO products (name, description, price) VALUES (?, ?, ?)";
	 
	 public static void main(String[] args) {
	        try (Connection connection = JDBCExample.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCTS_SQL)) {

	            // Create an array of product data
	            String[][] products = {
	                {"Laptop", "Dell Inspiron", "75000.00"},
	                {"Smartphone", "Samsung Galaxy", "30000.00"},
	                {"Tablet", "Apple iPad", "50000.00"},
	                {"Smartwatch", "Apple Watch", "20000.00"},
	                {"Headphones", "Bose QuietComfort", "15000.00"}
	            };

	            // Add SQL statements to the batch
	            for (String[] product : products) {
	                preparedStatement.setString(1, product[0]);
	                preparedStatement.setString(2, product[1]);
	                preparedStatement.setBigDecimal(3, new BigDecimal(product[2]));
	                preparedStatement.addBatch();
	            }
	         // Execute the batch of SQL statements
	            int[] result = preparedStatement.executeBatch();

	            System.out.println("Inserted " + result.length + " records successfully!");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

}
