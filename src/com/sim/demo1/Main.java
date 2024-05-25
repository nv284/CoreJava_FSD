package com.sim.demo1;
//base class
class Vehicle{
	String brand;
    String Repo;
	Vehicle(String brand , String Repo) {
		super();
		this.brand = brand;
		this.Repo = Repo;
	}
	void honk() {
		System.out.println("honk honk");
	}
	
}
//subclass 
class Car extends Vehicle{
	String model;

	 Car(String brand, String model  ,String Repo) {
		super(brand , Repo);
		this.model = model;
		
	}
	 void drive() {
		 System.out.println(" Driving to "+ brand + "   "+model +"  have repo "+Repo);
	 }
	
}
//subclass
class Bicycle extends Vehicle{

	public Bicycle(String brand, String Repo) {
		super(brand, Repo);
		// TODO Auto-generated constructor stub
	}
	void pedal() {
		System.out.println("Pedaling the " + brand + " bicycle");
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Car mycar = new Car("Toyota", "corolla", "4 star");
    Bicycle mybike = new Bicycle("Honda", "5 Star");
    mycar.drive();
    mybike.pedal();
    
    mycar.honk();// super class method
    mybike.honk();// super class method 
		
	}

}
