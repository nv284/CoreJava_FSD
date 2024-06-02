package com.sim.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class ProductManager_Solution {
	ArrayList<Product> products = new ArrayList<Product>();
	
	 // Add a new product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Added: " + product.getName());
    }

    // Remove a product by ID
    public void removeProduct(int productId) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == productId) {
                iterator.remove();
                System.out.println("Removed product with ID: " + productId);
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }
	
    
    // List all products
    public void listProducts() {
        System.out.println("Listing all products:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    // Update product details
    public void updateProduct(int productId, String name, double price) {
        for (Product product : products) {
            if (product.getId() == productId) {
                // Since the product object is mutable, we can directly modify it
                product = new Product(productId, name, price);
                System.out.println("Updated product with ID: " + productId);
                return;
            }
        }
        System.out.println("Product with ID " + productId + " not found.");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ProductManager_Solution manager = new ProductManager_Solution();
		while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. List Products");
            System.out.println("4. Update Product");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
            case 1:
                System.out.print("Enter product ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                System.out.print("Enter product price: ");
                double price = scanner.nextDouble();
                manager.addProduct(new Product(id, name, price));
                break;
            case 2:
                System.out.print("Enter product ID to remove: ");
                int removeId = scanner.nextInt();
                manager.removeProduct(removeId);
                break;
            case 3:
            	manager.listProducts();
                break;
            case 4:
                System.out.print("Enter product ID to update: ");
                int updateId = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new product name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new product price: ");
                double newPrice = scanner.nextDouble();
                manager.updateProduct(updateId, newName, newPrice);
                break;
            case 5:
                System.out.println("Exiting...");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
	}

}
}
}