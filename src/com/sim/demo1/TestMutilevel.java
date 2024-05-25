package com.sim.demo1;

class Box{
	   private  double width;
	   private  double height;
	   private  double depth;
	 Box(double width, double height, double depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	   double volume() {
		   return width*height*depth;
	   }
}

class BoxWeight extends Box {
	double weight;

	public BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}
	
	
}

class Shipment extends BoxWeight{
	double cost;

	public Shipment(double width, double height, double depth, double weight, double cost) {
		super(width, height, depth, weight);
		this.cost = cost;
	}
	
	
}


public class TestMutilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shipment ship1 = new Shipment(1, 2, 3, 5, 3.41);
Shipment ship2 = new Shipment(2, 4, 6, 10, 1.28);
double vol ; 
vol = ship1.volume();
System.out.println("The volume of ship1 : "+ vol);
System.out.println("the Weight of ship1 : "+ ship1.weight);
System.out.println("Shiiping cost "+ship2.cost);
	}

}
