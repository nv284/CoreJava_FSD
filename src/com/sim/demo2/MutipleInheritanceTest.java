package com.sim.demo2;
//super class
/*class Test1{
	public void showTest() {
		System.out.println("This is test1 class");
	}
}

// super class 
class Test2{
	public void showTest() {
		System.out.println("This is test2 class");
	}
}

//super class
class Test3{
	public void showTest() {
		System.out.println("This is test3 class");
	}
}*/

interface Test1{
	public void show();
}
interface Test2{
	public void disp();
} 
interface Test3{
	public void demo();
}
//child class
class HDFC implements Test1 , Test2 , Test3{

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println("Demo method ");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Disp method ");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show method ");
	}
	
}
class SBI implements Test1 , Test2 , Test3{

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println(" Open the account in SBI Bank with 10,000 Rs");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println(" SBI presenting many employee benefit policies ");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("SBI providing Home loan @9% , education loan @5% , Car loan @6%");
	}
	
}

class Axis implements Test1 , Test2 , Test3{

	@Override
	public void demo() {
		// TODO Auto-generated method stub
		System.out.println(" Open the account in Axis Bank with 20,000 Rs");
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println(" SBI presenting many employee benefit SIP and Stock ");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("SBI providing Home loan @8.6% , education loan @4.3% , Car loan @7%");
	}
	
}
public class MutipleInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HDFC h1 = new HDFC();
        h1.demo();h1.show();h1.disp();
        SBI s1 = new SBI();
        s1.demo();s1.disp();s1.show();
	}

}
