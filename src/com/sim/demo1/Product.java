package com.sim.demo1;

public class Product {
	String name; 
	String ratings; String description; double price;


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, String ratings, String description, double price) {
		super();
		this.name = name;
		this.ratings = ratings;
		this.description = description;
		this.price = price;
	}
	void setProductData(String name , String ratings , String description ,double price ) {
	this.name = name ; this.ratings = ratings ; this.description = description ; this.price = price ;
	}
	void showProductData() {
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Product "+name +"has "+ ratings );
		System.out.println("Product "+ name +" is priced"+ price );
		
		System.out.println("------------------------------------------------------------------");
	}

}
