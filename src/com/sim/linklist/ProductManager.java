package com.sim.linklist;

import java.util.LinkedList;

//This class will use a `LinkedList` to manage products, including methods to add, remove, find, and display products.
public class ProductManager {
	 private LinkedList<Product> productList;

	    public ProductManager() {
	        this.productList = new LinkedList<>();
	    }

	    public void addProduct(Product product) {
	        productList.add(product);
	    }

	    public void removeProductById(int productId) {
	        Product productToRemove = null;
	        for (Product product : productList) {
	            if (product.getId() == productId) {
	                productToRemove = product;
	                break;
	            }
	        }

	        if (productToRemove != null) {
	            productList.remove(productToRemove);
	            System.out.println("Product with id " + productId + " removed");
	        } else {
	            System.out.println("Product not found");
	        }
	    }

	    public Product findProductById(int productId) {
	        for (Product product : productList) {
	            if (product.getId() == productId) {
	                return product;
	            }
	        }
	        return null;
	    }

	    public void displayProducts() {
	        for (Product product : productList) {
	            System.out.println(product);
	        }
	    }
}
