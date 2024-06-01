package com.sim.demo4;
public class ThrowTest1 {
	public static void main(String[] args) {

		// Declaring a try-catch block.
		try
		{
		// Creating an object of ArithmeticException class. 
		   ArithmeticException a = new ArithmeticException("Hello from throw"); // Line 7
		   throw a; // Exception thrown explicitly. // Line 8

		
		}
		catch(ArithmeticException ae)
		{
		   System.out.println("ArithmeticException caught: \n" +ae);
		   System.out.println(ae.getMessage());
		  }
		 }
}
/*In the main() method of class ThrowTest1, the try block creates an object of 
 * ArithmeticException class with reference variable a and passing an argument of String type to its constructor. 
 * The exception object is then thrown by the statement: throw a;
 */

/*The thrown exception object is caught by corresponding catch block and stored in ae. 
 * The ae.getMessage() displays a string message append along with the internally generated message.*/
 