package com.sim.demo4;

import java.util.Scanner;

public class ExceptionHandling {

	int getData(int x ,int y ) {
		int z = 0;
		try {
		 z = x/y;}
		catch (Exception e) {
			// TODO: handle exception
			//System.out.println(" Please do not enter zero for second paramenter ");
			e.printStackTrace();
		}
		return z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling e1 = new ExceptionHandling();
		int p = e1.getData(20, 0);
		System.out.println(" Result ->"+p);
		
     System.out.println(" cashbacks App statred ");
     
     int [] cashBacks = {100,20,30,80,90,66,75,45,25};
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter your lucky number between 0 to 9 ");
     
     int luckynumber = sc.nextInt();
     sc.close();
     int cashbackeraned = 0;
     try {
     cashbackeraned = cashBacks[luckynumber];
     }catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
    	// System.out.println("Sorry ....something went wrong !!!");
    	 System.out.println("Message : "+ e.getMessage());
	}
     
     System.out.println("Thank you for participation , you entered a cashback of "+cashbackeraned);
     
     System.out.println("Cashbacks App finished ");
     
	}

}
