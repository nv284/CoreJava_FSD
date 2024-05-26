package com.sim.demo2;
class CA{
	void show() {
		System.out.println("This is show of CA");
	}
}

class CB extends CA{
	void show() {
		System.out.println("This is show of CB");
	}
	void hello () {
		System.out.println("This is hello from CB ");
	}
}
public class PolymorphicStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CA caRef = null;
    caRef = new CB();
    // CA caRef = new CB();
    caRef.show(); //execute the show method on CA 
    CB cbRef =  (CB)caRef;  //Downcasting 
    cbRef.hello();
	}

}
