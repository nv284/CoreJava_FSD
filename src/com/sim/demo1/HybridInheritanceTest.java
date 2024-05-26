package com.sim.demo1;

class GrandFather{
	public void printGrandFather()
	 {
	   System.out.println("GrandFather's class");
	 }
}

class Father extends GrandFather{
	public void printFather() {
		System.out.println("Father class has inherited GrandFather class");
	}
}

class Son extends Father{
	Son(){
		System.out.println("Inside the Son class");
	}
	public void printSon()
	 {
	   System.out.println("Son class has inherited Father class");
	 }
}
class Daughter extends Father{
	public Daughter() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside the Daughter class");
	}
	public void printDaughter()
	 {
	   System.out.println("Son class has inherited Father class");
	 }
}
public class HybridInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Son obj = new Son();
		obj.printSon();
		obj.printFather();
		obj.printGrandFather();
		
		Daughter obj2 = new Daughter();
		obj2.printFather();
		obj2.printGrandFather();
		obj2.printDaughter();
		
	}

}
