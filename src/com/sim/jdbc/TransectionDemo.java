package com.sim.jdbc;
/* create table 
 * 
 * CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    department VARCHAR(100),
    salary DECIMAL(10, 2)
);

INSERT INTO employee (name, email, department, salary) VALUES
('John Doe', 'john.doe@example.com', 'HR', 50000.00),
('Jane Smith', 'jane.smith@example.com', 'Finance', 60000.00),
('Mike Johnson', 'mike.johnson@example.com', 'IT', 75000.00),
('Emily Davis', 'emily.davis@example.com', 'Marketing', 65000.00);
 * */

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransectionDemo {
	

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root",  "pass");
            connection.setAutoCommit(false); // Disable auto-commit mode

            // Prepare SQL statements
            String withdrawSQL = "UPDATE employee SET salary = salary - ? WHERE name = ?";
            String depositSQL = "UPDATE employee SET salary = salary + ? WHERE name = ?";
            try (PreparedStatement withdrawStmt = connection.prepareStatement(withdrawSQL);
                    PreparedStatement depositStmt = connection.prepareStatement(depositSQL)) {

                   // Withdraw money from John Doe
                   withdrawStmt.setBigDecimal(1, new BigDecimal("5000.00"));
                   withdrawStmt.setString(2, "John Doe");
                   withdrawStmt.executeUpdate();

                   // Simulate an error
                   // int x = 1 / 0;

                   // Deposit money to Jane Smith
                   depositStmt.setBigDecimal(1, new BigDecimal("5000.00"));
                   depositStmt.setString(2, "Jane Smith");
                   depositStmt.executeUpdate();

                   // Commit the transaction
                   connection.commit();
                   System.out.println("Transaction committed successfully.");
            } catch (SQLException ex) {
                // Roll back the transaction in case of an error
                if (connection != null) {
                    try {
                        connection.rollback();
                        System.out.println("Transaction rolled back.");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                ex.printStackTrace();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

