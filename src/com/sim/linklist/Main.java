package com.sim.linklist;
//Here's how you can use the `ProductManager` class to manage products:
public class Main {
	
	 public static void main(String[] args) {
	        // Create the product manager
	        ProductManager productManager = new ProductManager();

	        // Add some products
	        productManager.addProduct(new Product(1, "Laptop", 1500.00, 10));
	        productManager.addProduct(new Product(2, "Smartphone", 800.00, 25));
	        productManager.addProduct(new Product(3, "Headphones", 150.00, 50));

	        // Display all products
	        System.out.println("Displaying all products:");
	        productManager.displayProducts();

	        // Find a product by ID
	        System.out.println("\nFinding product with ID 2:");
	        Product foundProduct = productManager.findProductById(2);
	        if (foundProduct != null) {
	            System.out.println(foundProduct);
	        } else {
	            System.out.println("Product not found");
	        }

	        // Remove a product by ID
	        System.out.println("\nRemoving product with ID 1:");
	        productManager.removeProductById(1);

	        // Display all products after removal
	        System.out.println("\nDisplaying all products after removal:");
	        productManager.displayProducts();
	 }
}



/*
 * ### Output
The code will provide output similar to:

```
Displaying all products:
Product{id=1, name='Laptop', price=1500.0, quantity=10}
Product{id=2, name='Smartphone', price=800.0, quantity=25}
Product{id=3, name='Headphones', price=150.0, quantity=50}

Finding product with ID 2:
Product{id=2, name='Smartphone', price=800.0, quantity=25}

Removing product with ID 1:
Product with id 1 removed

Displaying all products after removal:
Product{id=2, name='Smartphone', price=800.0, quantity=25}
Product{id=3, name='Headphones', price=150.0, quantity=50}
```
 * */
 